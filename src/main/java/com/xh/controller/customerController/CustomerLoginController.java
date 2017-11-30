package com.xh.controller.customerController;

import com.xh.controller.page.Pagination;
import com.xh.po.*;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import com.xh.po.vo.UserAndBrithday;
import com.xh.service.OrderPayService;
import com.xh.service.customerService.CustomerInformationService;
import com.xh.service.customerService.ProductTypeService;
import com.xh.service.customerService.UserLoginService;
import com.xh.util.NetworkUtil;
import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Controller
public class CustomerLoginController {
    @Autowired
    private UserLoginService userLoginService;
    @Autowired
    private ProductTypeService productTypeService;

    @Autowired
    private CustomerInformationService customerInformationService;

    @Autowired
    private OrderPayService orderPayService;

    //通过该url进入到商城的首页面
    @RequestMapping(value = "/ShopFrontPage.action", method = RequestMethod.GET)
    public String login(Model model) {
        //得到主页导航栏商类型品和两个商品
        List<ProductTypeExtend> productTypeExtends = productTypeService.SelectProductType();
        for (ProductTypeExtend productTypeExtend : productTypeExtends) {
            int id = productTypeExtend.getProducttypeid();
            List<Product> products = productTypeService.SelectProductByTypeIdLimit(id);
            productTypeExtend.setProduct(products);
        }
        //得到主页导航栏商品类型所有商品
        List<ProductTypeExtend> productTypeExtends1 = productTypeService.SelectProductType();
        for (ProductTypeExtend productTypeExtend1 : productTypeExtends1) {
            int id = productTypeExtend1.getProducttypeid();
            List<Product> products1 = productTypeService.SelectProductByTypeId(id);
            productTypeExtend1.setProduct(products1);
        }
        model.addAttribute("productTypeExtends1", productTypeExtends1);
        model.addAttribute("productTypeExtends", productTypeExtends);
        return "/jsp/users/index.jsp";
    }

    //进入商城的登录页面
    @RequestMapping("/LoginPage.action")
    public String LoginPage() {
        return "/jsp/users/login.jsp";
    }

    //前端用户登录的验证
    @RequestMapping("/CustomerLogin.action")
    public String CustomerLogin(String username, String password, HttpServletRequest request, String returnUrl, HttpServletResponse response, Model model) {
        Userlog userlog = new Userlog();
        if (username != null) {
            if (password != null) {
                User user = userLoginService.selectAllNameAndPwd(username);
                if (user != null) {
                    if (user.getUserA().equals("1")) {
                        if (user.getUserpwd().equals(encodePassword(password))) {
                            HttpSession session = request.getSession();
                            session.setMaxInactiveInterval(600 * 60 * 60);
                            session.setAttribute("user", user);
                            userlog.setUserid(user.getUserid());
                            userlog.setStartlogintime(new Date());
                            try {
                                userlog.setUserip(NetworkUtil.getIpAddress(request));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            userLoginService.insertStartTimeAndIp(userlog);
                            user.setUserid(user.getUserid());
                            user.setUserlogintime(new Date());
                            userLoginService.UpdateUserLoginTimeById(user);
                            Integer userlogincount=  userLoginService.IsUserLoginNull(user.getUserid());
                            if (userlogincount==null) {
                                userLoginService.LoginCountOne(user.getUserid());
                            } else {
                                userLoginService.AutoIncreaeOne(user.getUserid());
                            }
                            return "redirect:" + returnUrl;//"/jsp/users/index.jsp";
                        } else {
                            model.addAttribute("error", "密码不正确");
                        }
                    } else {
                        model.addAttribute("error", "该账号已被冻结");
                    }
                } else {
                    model.addAttribute("error", "用户名不正确");
                }
            } else {
                model.addAttribute("error", "密码不能为空");
            }
        } else {
            model.addAttribute("error", "用户名不能为空");
        }
        return "/jsp/users/login.jsp";

    }

    //清空session中的值，使退出登录的用户能够调转到当前商城首页而没有用户名
    @RequestMapping("/ExitLogin.action")
    public String ExitLogin(HttpServletRequest request, HttpServletResponse response, Userlog userlog) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        userlog.setUserid(user.getUserid());
        userlog.setEndlogintime(new Date());
        userLoginService.updateEndLoginTime(userlog);
        session.removeAttribute("user");
        return "redirect:/ShopFrontPage.action";
    }

    //用户注册页
    @RequestMapping("/CustomerReginster.action")
    public String CustomerReginster(User user, HttpServletRequest request, HttpServletResponse response, Model model) {
        user.setUserinputdate(new Date());
        String pwd = user.getUserpwd();
        user.setUserpwd(encodePassword(pwd));
        user.setUserA("1");
        String username = request.getParameter("username");
        List<User> userList1 = userLoginService.SelectAllQuerry();
        for (User userList : userList1) {
            String name = userList.getUsername();
            if (name.equals(username)) {
                model.addAttribute("error", "用户名相同");
                return "/jsp/users/register.jsp";
            } else {
            }
        }
        userLoginService.insertNewUser(user);
        return "/jsp/users/login.jsp";
    }


    //个人中心里跳转到修改密码的页面
    @RequestMapping("/UpdataPwdPage.action")
    public String UpdataPwdPage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Integer id = user.getUserid();
        UserAndBrithday userAndBrithday = customerInformationService.SelectCustomerInformation(id);
        model.addAttribute("userAndBrithday", userAndBrithday);
        return "/jsp/users/my-user.jsp";
    }

    //个人中心里根据登录用户的id修改登录密码
    @RequestMapping("/updateLoginPassword.action")
    public String updateLoginPassword(HttpServletRequest request, User user) {
        HttpSession session = request.getSession();
        User user2 = (User) session.getAttribute("user");
        user.setUserid(user2.getUserid());
        user.getUserpwd();
        userLoginService.updataPwdById(user);
        return "/jsp/users/my-user.jsp";
    }

    //个人中心里根据登录用户的id修改电话
    @RequestMapping("/updataLoginPhone.action")
    public String updataLoginPhone(HttpServletRequest request, User user) {
        HttpSession session = request.getSession();
        User user1 = (User) session.getAttribute("user");
        user.setUserid(user1.getUserid());
        user.getUserphone();
        userLoginService.updataLoginPhone(user);
        return "/jsp/users/my-user.jsp";
    }

    //个人中心中我的积分页面的展示,以及每一个用户购买的所有商品的总积分
    @RequestMapping("/MyCredits.action")
    public String MyCredits(Model model, HttpServletRequest request, Integer userid) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        userid = user.getUserid();
        Integer id = user.getUserid();
        UserAndBrithday userAndBrithday = customerInformationService.SelectCustomerInformation(id);
        model.addAttribute("userAndBrithday", userAndBrithday);
        List<TotalCreditsById> totalCreditsByIds = userLoginService.queryAllById(userid);
        /*TotalCreditsById totalCreditsById = userLoginService.queryTotalCriditsById(userid)*/
        ;
        userLoginService.updateCreditsCore(userid);/*更新用户表中用户的总积分*/
        Integer totalCreditsById = userLoginService.queryCreditsCore(userid);/*查询用户表中用户的总积分*/
        model.addAttribute("totalCreditsByIds", totalCreditsByIds);
        model.addAttribute("totalCreditsById", totalCreditsById);
        return "/jsp/users/jifen.jsp";
    }

    //积分说明
    @RequestMapping("/CreditsMean.action")
    public String CreditsMean() {
        return "jsp/users/jifensm.jsp";
    }


    //查询出上市新品的商品的图片，名称，描述，价格，展示在商城的首页
    //查询出热销商品的图片，名称，描述，价格，展示在商城的首页
    //查询出热评(评论数最多的前十)商品的图片，名称，描述，价格，展示在商城的首页
    //查询出可用积分兑换的商品的图片，名称，描述，价格，展示在商城的首页
    //热销商品的销售量
    @RequestMapping("/selectproduct.action")
    public String selectproduct(Model model) {
        List<Product> products = userLoginService.selectproduct();
        List<TotalCreditsById> hotsaleproducts = userLoginService.hotSaleProduct();
        List<TotalCreditsById> top10products = userLoginService.Max10Comment();
        List<TotalCreditsById> jiankang = userLoginService.selectjiangkang();
        List<TotalCreditsById> jujia = userLoginService.selectjujia();
        List<TotalCreditsById> yule = userLoginService.selectyule();
        List<TotalCreditsById> creditproducts = userLoginService.IsCredExchange();
        List<TotalCreditsById> Recommendations = userLoginService.StoreRecommendation();
        model.addAttribute("products", products);
        model.addAttribute("hotsaleproducts", hotsaleproducts);
        model.addAttribute("top10products", top10products);
        model.addAttribute("jiankang", jiankang);
        model.addAttribute("jujia", jujia);
        model.addAttribute("yule", yule);
        model.addAttribute("creditproducts", creditproducts);
        model.addAttribute("Recommendations", Recommendations);
        return "jsp/users/index.jsp";
    }

    //page.jsp商品详情页面，点击加入购物车
    @RequestMapping("/ShopCat.action")
    public @ResponseBody
    Map ShopCat(HttpServletRequest request, float[] data) {
        Map map = new HashMap();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userid = user.getUserid();
        Shopcar shopCat = new Shopcar();
        shopCat.setUserid(userid);
        shopCat.setProductid((int) data[0]);
        shopCat.setOrderamount((int) data[1]);
        shopCat.setPrice((double) data[2]);
        Shopcar shopcar1 = userLoginService.queryShopCar(shopCat);
        if (shopcar1 == null) {
            userLoginService.ShopCarInsert(shopCat);
            Shopcar shopcar = userLoginService.IsSuccessInsert(shopCat);
            if (shopcar == null)
                map.put("red", false);
            else
                map.put("red", true);
            return map;

        } else {
            map.put("red", false);
            return map;
        }


    }


    //加密
    public String encodePassword(String password) {
        //
        //password = "gxzcwefxcbergfd123456errttyyytytrnfzeczxcvertwqqcxvxb";
        //1:MD5  算法
        String algorithm = "MD5";
        char[] encodeHex = null;
        try {
            //MD5加密
            MessageDigest instance = MessageDigest.getInstance(algorithm);
            //加密后
            byte[] digest = instance.digest(password.getBytes());
            //
            //2:十六进制

            encodeHex = Hex.encodeHex(digest);
        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        return new String(encodeHex);
    }

    //收藏宝贝
    @RequestMapping("/ShouCangShop.action")
    public @ResponseBody
    Map ShouCangShop(HttpServletRequest request, Integer productid) {
        Map map = new HashMap();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Favorites favorites = new Favorites();
        favorites.setUserid(user.getUserid());
        favorites.setProductid(productid);
        Favorites favorites1 = userLoginService.queryFavorite(favorites);
        if (favorites1 == null) {
            userLoginService.InsertFavorites(favorites);
            Favorites favorites2 = userLoginService.IsSuccess(favorites);
            if (favorites2 == null) {
                map.put("red", false);
            } else {
                map.put("red", true);
            }
            return map;
        } else {
            map.put("red", false);
            return map;
        }
    }


    //用户注册验证
    @RequestMapping("/customerReginsterCheck.action")
    public @ResponseBody
    Map customerReginsterCheck(User user, HttpServletRequest request, HttpServletResponse response, Model model, String data) {
        Map map = new HashMap();
        List<User> userList1 = userLoginService.SelectAllQuerry();
        for (User userList : userList1) {
            String name = userList.getUsername();
            if (data != null && name.equals(data)) {
                map.put("result", false);
                return map;
            }
        }
        map.put("result", true);
        return map;

    }

//好评专区
    @RequestMapping("/queryTotalCommentshop.action")
    public String queryTotalCommentshop( TotalCreditsById totalCreditsById,Model model,@RequestParam(defaultValue = "1") Integer pageNo,Integer productid){

        Pagination pagination=userLoginService.selectPaginationByQuery(pageNo);
        model.addAttribute("pagination",pagination);
        return "/jsp/users/rpzq.jsp";
    }

    //用户个人中心中个人资料头像的显示
    @RequestMapping("/HeadPictrueShow.action")
    public String HeadPictrueShow(Model model, HttpServletRequest request, MultipartFile userC) throws IllegalStateException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Integer id = user.getUserid();
        String sqlPath = null;
        if (userC != null && userC.getOriginalFilename() != null) {
            String path = session.getServletContext().getRealPath("/jsp/admin/images/upload");
            String realName = userC.getOriginalFilename();
            String realFilePath = path + File.separator + realName;
            File file = new File(realFilePath);
            userC.transferTo(file);
            user.setUserC(realFilePath);
            sqlPath = "jsp/admin/images/upload/" + realName;
            user.setUserC(sqlPath);
            user.setUserid(id);
            userLoginService.updateUserPic(user);/*得到登录用户的id，根据用户的id修改用户的头像*/
            UserAndBrithday userAndBrithday = customerInformationService.SelectCustomerInformation(id);
            // User user1=userLoginService.queryUserPic(user); /*根据用户的id查询用户的账号，用户名和头像*/
            model.addAttribute("userAndBrithday", userAndBrithday);
            return "redirect:/CustomerInformation.action";
        }
        return null;
    }


    //利用ajax实现查询积分是否足够兑换商品和用户的积分是否为空，给出提示。
    @RequestMapping("/isExchage.action")
    public @ResponseBody
    Map isExchage(HttpSession session, HttpServletRequest request, HttpServletResponse response, Model model, int data) {
        Map map = new HashMap();
        int productid = data;
        User user = (User) session.getAttribute("user");
        Product product = userLoginService.jifenPage(productid);
        TotalCreditsById totalCreditsById = userLoginService.queryTotalCriditsById(user.getUserid());
        if (totalCreditsById != null) {
            if (totalCreditsById.getTotalCredits() < product.getProductdisabled() || totalCreditsById.getTotalCredits() == null) {
                map.put("red", false);
            } else {
                map.put("red", true);
            }
        } else {
            map.put("red", false);
        }
        return map;

    }


    //立即兑换页面的订单确认页面的显示
    @RequestMapping("/jifenPage.action")
    public String jifenPage(HttpServletRequest request, Model model, Integer productid) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Integer userid = user.getUserid();
        List<Gainaddres> gainaddresList = userLoginService.selectGainAddressByUserId(userid); //*根据用户的id查询出该用户的收货地址*//*
        Product product = userLoginService.jifenPage(productid);
    /*    TotalCreditsById totalCreditsById = userLoginService.queryTotalCriditsById(userid);*/
        Integer totalCreditsById = userLoginService.queryCreditsCore(userid);/*得到用户的总积分*/
        Integer Productdisabled = product.getProductdisabled();/*得到兑换该商品需要多少积分*/
        Integer shenyuCredits = totalCreditsById - Productdisabled;/*得到兑换后还剩余多少积分*/
        model.addAttribute("shenyuCredits", shenyuCredits);
        model.addAttribute("gainaddresList", gainaddresList);//*保存用户的收货地址，在页面显示*//*
        model.addAttribute("product", product);
        model.addAttribute("totalCreditsById", totalCreditsById);
        return "/jsp/users/my-jfadd.jsp";
    }

    //兑换支付的页面显示
    @RequestMapping("/duihuan.action")
    public String duihuan(HttpSession session, HttpServletRequest request, Model model, Order order, Gainaddres gainaddres, Orderproduct orderproduct, Product product) {
        String gainname=gainaddres.getGainname().replaceAll(",", "");
        gainaddres.setGainname(gainname);
        String gainmobile=gainaddres.getGainmobile().replaceAll(",", "");
        gainaddres.setGainmobile(gainmobile);
        String gainaddress=gainaddres.getGainaddress().replaceAll(",", "");
        gainaddres.setGainaddress(gainaddress);


        User user = (User) session.getAttribute("user");
        Product product1=  userLoginService.jifenPage(product.getProductid());/*查询出该商品的信息，及兑换该商品需要多少积分*/
        Integer totalCreditsById = userLoginService.queryCreditsCore(user.getUserid());/*得到用户的总积分*/
        Integer Productdisabled=product1.getProductdisabled();/*得到兑换该商品需要多少积分*/
        Integer shenyuCredits = totalCreditsById - Productdisabled;/*得到兑换后还剩余多少积分*/
        model.addAttribute("shenyuCredits", shenyuCredits);
        Integer userid=user.getUserid();
         userLoginService.shenyuCreditsCore(shenyuCredits,userid); /*更新用户表中用户的积分为剩余的多少积分*/                                                       /*更新用户表中该用户现在的积分为多少*/
        List<Pay> pays = userLoginService.queryPayMethod();/*支付方式的页面显示*/
        model.addAttribute("pays", pays);
        gainaddres.setGainA("0");
        String result = orderPayService.insertSelective1(gainaddres);
        Integer gainid = gainaddres.getGainid();  /*数据库返回的主键*/
        order.setGainid(gainid);       /*主键是另外一张表的外键需要插入*/
        order.setUserid(user.getUserid());/*order表中的用户的id是外键*/
        if (result.equals("OK")) {
                                              /*实付金额与邮费*/
            if (order.getAmountpay() > 88) {
                order.setPostfee(0.0);
                order.setRealpay(0.0);
            } else {
                order.setPostfee(15.0);
                order.setRealpay(15.0);
            }
            order.setStatus(1);       /* 订单状态 订单新建时为1,表示该订单是待发货的订单*/
            order.setEndtime(new Date());/*插入订单的结束时间，个人中心中个人积分的显示所需要*/
          /*  order.setPaystatus(1);*//*设置支付状态为已支付*/
            order.setTotalcredit(-(product.getProductdisabled())); /*积分兑换后设置order表中订单的总积分为负的商品的积分*/
            String return2 = orderPayService.insertSelective2(order);
            Integer orderid = order.getOrderid();  /*数据库返回的主键*/
            orderproduct.setOrderid(orderid);       /*主键是另外一张表的外键需要插入*/
            model.addAttribute("orderid", orderid);
            model.addAttribute("realpay", order.getRealpay());  /*保存支付金额*/
            if (return2.equals("OK")) {
                orderproduct.setProductid(product.getProductid());
                orderproduct.setShoppingcount(1);
                if (order.getAmountpay() > 88) {
                    orderproduct.setTotalmoneycount(0.0);
                    orderproduct.setPayprice(0.0);
                } else {
                    orderproduct.setTotalmoneycount(15.0);
                    orderproduct.setPayprice(15.0);
                }
                orderPayService.insertSelective3(orderproduct);
                // 判断支付方式  0在线支付------返回付款页面  1货到付款------
                if (order.getPaytype() == 0) {
                    return "/jsp/users/my-jfapy.jsp";
                } else {
                    return "/jsp/users/my-jfapy-suc.jsp";
                }

            }
            return null;

        }
        return null;

    }


    //兑换成功后的页面显示
    //进行用户支付是否成功的处理   支付成功返回到 my-jfapy-suc
    @RequestMapping(value = "/jifenWanCheng.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String wanCheng(HttpSession session, Model model, Integer orderid, Order order,Integer shenyuCredits) {

        //  此处需要进行支付是否成功验证

        //下面是支付成功的继续 ,支付成功后将order表中paystatus（支付状态）为1表示已支付
        if (orderid != null) {
            orderPayService.updateOrderPayStatus(orderid);/*更新订单表中的支付状态为1，已支付。*/
        }
        model.addAttribute("shenyuCredits",shenyuCredits);

        return "/jsp/users/my-jfapy-suc.jsp";

    }
}



