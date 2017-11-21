package com.xh.controller.customerController;

import com.xh.po.*;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        //得到主页导航栏商品类型了所有商品
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
    public String CustomerLogin(String username, String password, HttpServletRequest request, HttpServletResponse response, Model model) {
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
                          if(userlogincount==null){
                              userLoginService.LoginCountOne(user.getUserid());
                          }else {
                              userLoginService.AutoIncreaeOne(user.getUserid());
                          }
                            return "redirect:/ShopFrontPage.action";//"/jsp/users/index.jsp";
                        } else {
                            model.addAttribute("error", "密码不正确");
                        }
                      }else {
                            model.addAttribute("error","该账号已被冻结");
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
    public String CustomerReginster(User user ,HttpServletRequest request,HttpServletResponse response,Model model) {
        user.setUserinputdate(new Date());
        String pwd = user.getUserpwd();
        user.setUserpwd(encodePassword(pwd));
        user.setUserA("1");
        String username=request.getParameter("username");
        List<User> userList1=userLoginService.SelectAllQuerry();
        for (User userList:userList1){
            String name=userList.getUsername();
            if (name.equals(username)){
                model.addAttribute("error", "用户名相同");
                return "/jsp/users/register.jsp";
            }else {
            }
        }
        userLoginService.insertNewUser(user);
        return "/jsp/users/login.jsp";
    }


    //个人中心里跳转到修改密码的页面
    @RequestMapping("/UpdataPwdPage.action")
    public String UpdataPwdPage() {
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
        List<TotalCreditsById> totalCreditsByIds = userLoginService.queryAllById(userid);
        TotalCreditsById totalCreditsById = userLoginService.queryTotalCriditsById(userid);
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
      Shopcar shopcar1=  userLoginService.queryShopCar(shopCat);
        if(shopcar1==null){
            userLoginService.ShopCarInsert(shopCat);
            Shopcar shopcar = userLoginService.IsSuccessInsert(shopCat);
            if (shopcar == null)
                map.put("red", false);
            else
                map.put("red", true);
            return map;

        }else{
            map.put("red",false);
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
    public @ResponseBody Map  ShouCangShop(HttpServletRequest request,Integer productid ) {
        Map map=new HashMap();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Favorites favorites=new Favorites();
        favorites.setUserid(user.getUserid());
        favorites.setProductid(productid);
        Favorites favorites1 = userLoginService.queryFavorite(favorites);
        if (favorites1 == null) {
            userLoginService.InsertFavorites(favorites);
          Favorites favorites2=  userLoginService.IsSuccess(favorites);
          if(favorites2==null){
              map.put("red",false);
          }else{
              map.put("red",true);
          }
            return map;
        }
        else {
            map.put("red",false);
            return map;
        }
    }


    //用户注册验证
    @RequestMapping("/customerReginsterCheck.action")
    public @ResponseBody Map customerReginsterCheck(User user , HttpServletRequest request, HttpServletResponse response, Model model, String data) {
        Map map=new HashMap();
        List<User> userList1=userLoginService.SelectAllQuerry();
        for (User userList:userList1){
            String name=userList.getUsername();
            if (data!=null&&name.equals(data)){
                map.put("result",false);
                return  map;
            }
        }
        map.put("result",true);
        return  map;

    }

//好评区
    @RequestMapping("/queryTotalCommentshop.action")
    public String queryTotalCommentshop(Model model,@RequestParam(defaultValue = "1") Integer currentpage){
        Integer startpage=(currentpage-1)*15;
      List<TotalCreditsById> totalCreditsByIds=  userLoginService.queryTotalCommentshop(startpage);
       for(TotalCreditsById totalCreditsById:totalCreditsByIds){
           Integer onegood=  userLoginService.EveryShopGoodComment(totalCreditsById.getProductid());
           totalCreditsById.setTotalgoodcomment(onegood);
           totalCreditsById.setStartpage(startpage);
       }
        model.addAttribute("totalCreditsByIds",totalCreditsByIds);
        return "/jsp/users/rpzq.jsp";
    }


}




