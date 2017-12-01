package com.xh.controller.customerController;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xh.po.Favorites;
import com.xh.po.User;
import com.xh.po.vo.FavoritesCustom;
import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.ProductCustom;
import com.xh.po.vo.ShopCarCustom;
import com.xh.service.customerService.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderListController  {
    @Autowired
    private OrderListService orderListService;

    /**
     * 通过用户id 获取订单
     * @param para
     * @return
     */
    @RequestMapping(value = "/selectOrderList", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody List<OrderCustom> selectOrderList(String[] para){
        OrderCustom oc=new OrderCustom();
        oc.setStart(Integer.parseInt(para[0]));
        oc.setCount(Integer.parseInt(para[1]));
        oc.setUserid(Integer.parseInt(para[2]));
        if(Integer.parseInt(para[3])!=-1&&!para[3].equals("")) oc.setStatus(Integer.parseInt(para[3]));
        if(!para[4].equals("-1")) oc.setConditions(para[4]);
        List<OrderCustom> orderCustoms= orderListService.selectOrderList(oc);
        for(OrderCustom orderCustom:orderCustoms) {
            List<ProductCustom> productCustoms=orderListService.selectOrderDetails(orderCustom.getOrderid());
            orderCustom.setProductCustoms(productCustoms);
        }
        if(orderCustoms.size()!=0)
            return orderCustoms;
        else
            return null;
    }

    /**
     * 通过用户id获取购物车
     * @param para
     * @return
     */
    @RequestMapping(value = "/selectShopcarList", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody List<ShopCarCustom> selectShopcarList(String[] para){
        int countNumb[]=new int[5];
        ShopCarCustom scc=new ShopCarCustom();
        scc.setStart(Integer.parseInt(para[0]));
        scc.setCount(Integer.parseInt(para[1]));
        scc.setUserid(Integer.parseInt(para[2]));
        if(Integer.parseInt(para[3])!=-1&&!para[3].equals("")){
            if(para[3].equals("0")){
                scc.setProducthotsale(1); //查询热销商品
            }else if(para[3].equals("1")){
                scc.setProductnew(1);  //查询新品
            }else if(para[3].equals("2")){
                scc.setProductA("0");  //查询下架商品
            }
        }
        if(!para[4].equals("-1")) scc.setConditions(para[4]);  //用于条件查询
        List<ShopCarCustom> shopCarCustoms= orderListService.selectShopcarList(scc);

        //以下用于找出已经在收藏夹中的商品,并将其是否在收藏夹中的信息记录在属性 IsOnFavorites 中
        FavoritesCustom favoritesCustom=new FavoritesCustom();
        for(ShopCarCustom shopCarCustom:shopCarCustoms){
            favoritesCustom.setProductid(shopCarCustom.getProductid());
            favoritesCustom.setUserid(shopCarCustom.getUserid());
            favoritesCustom.setStart(0);
            favoritesCustom.setCount(10);
            List<FavoritesCustom> f= orderListService.selectFavoritesList(favoritesCustom);
            if(f.size()==0){
                shopCarCustom.setIsOnFavorites(0); //设置为0 表示不在收藏夹中
            }else {
                shopCarCustom.setIsOnFavorites(1); //设置为1 表示在收藏夹中
            }
        }

        //以下用于统计购物车中各类商品数量
        int countAll=0;  //所有商品数
        int countHot=0; //热销商品数
        int countNew=0; //新品数
        int countdown=0;  //下架商品数
        ShopCarCustom scc1=new ShopCarCustom();
        scc1.setStart(0);
        scc1.setCount(999999);
        scc1.setUserid(Integer.parseInt(para[2]));
        List<ShopCarCustom> shopCarCustoms1= orderListService.selectShopcarList(scc1);
        for(ShopCarCustom s:shopCarCustoms1){
            if(s.getProducthotsale()==1){
                countHot++;
            }
            if(s.getProductnew()==1){
                countNew++;
            }
            if(s.getProductA().equals("0")){
                countdown++;
            }
            countAll++;
        }
        countNumb[0]=countAll;
        countNumb[1]=countHot;
        countNumb[2]=countNew;
        countNumb[3]=countdown;
        shopCarCustoms.get(0).setCountNumb(countNumb); //将统计结果存入第一个对象中
        return shopCarCustoms;
    }

    /**
     * 获取收藏夹
     * @param para
     * @return
     */
    @RequestMapping(value = "/selectFavoritesList", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody List<FavoritesCustom> selectFavoritesList(String[] para){
        FavoritesCustom fc=new FavoritesCustom();
        int[] countNumb=new int[5];
        fc.setStart(Integer.parseInt(para[0]));
        fc.setCount(Integer.parseInt(para[1]));
        fc.setUserid(Integer.parseInt(para[2]));
        if(Integer.parseInt(para[3])!=-1&&!para[3].equals("")){
            if(para[3].equals("0")){
                fc.setProducthotsale(1); //查询热销商品
            }else if(para[3].equals("1")){
                fc.setProductnew(1);  //查询新品
            }else if(para[3].equals("2")){
                fc.setProductA("0");  //查询下架商品
            }
            else if(para[3].equals("3")){
                fc.setProductdisabled(Integer.parseInt(para[3]));  //查询可用积分兑换的商品
            }
        }
        if(!para[4].equals("-1")) fc.setConditions(para[4]);  //用于条件查询
        List<FavoritesCustom> favoritesCustoms= orderListService.selectFavoritesList(fc);

        //以下用于找出已经在购物车中的商品,并将其是否在购物车中的信息记录在属性  IsOnShopcar 中
        ShopCarCustom shopCarCustom=new ShopCarCustom();
        for (FavoritesCustom favoritesCustom:favoritesCustoms){
            shopCarCustom.setStart(Integer.parseInt(para[0]));
            shopCarCustom.setCount(Integer.parseInt(para[1]));
            shopCarCustom.setProductid(favoritesCustom.getProductid());
            shopCarCustom.setUserid(favoritesCustom.getUserid());
            List<ShopCarCustom> o=orderListService.selectShopcarList(shopCarCustom);
            if (o.size()==0){
                favoritesCustom.setIsOnShopcar(0); //设置购物车中没有
            }else{
                favoritesCustom.setIsOnShopcar(1); //设置购物车中有
            }
        }

        //以下用于统计各类商品数
        int countAll=0;  //所有商品数
        int countHot=0; //热销商品数
        int countNew=0; //新品数
        int countdown=0;  //下架商品数
        int countdisabled=0;  //可用积分兑换
        FavoritesCustom favoritesCustom=new FavoritesCustom();
        favoritesCustom.setStart(0);
        favoritesCustom.setCount(9999);
        favoritesCustom.setUserid(Integer.parseInt(para[2]));
        List<FavoritesCustom> favoritesCustomsAll= orderListService.selectFavoritesList(favoritesCustom);
        for (FavoritesCustom f:favoritesCustomsAll){
            if(f.getProducthotsale()==1){
                countHot++;
            }
            if(f.getProductnew()==1){
                countNew++;
            }
            if(f.getProductA().equals("0")){
                countdown++;
            }
            if(f.getProductdisabled()==1){
                countdisabled++;
            }
            countAll++;
        }
        countNumb[0]=countAll;
        countNumb[1]=countHot;
        countNumb[2]=countNew;
        countNumb[3]=countdown;
        countNumb[4]=countdisabled;
        if(favoritesCustoms.size()==0){
            return null;
        }else{
            favoritesCustoms.get(0).setCountNumb(countNumb);  //将统计结果存入第一个对象中
        }
        return favoritesCustoms;
    }

    /**
     * 通过购物车id 删除购物车内商品
     * @param id
     * @return
     */
    @RequestMapping(value = "/delectShopCarById", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map delectShopCarById(int id){
        Map map=new HashMap();
        if(orderListService.deleteShopCarById(id)){
            map.put("d",true);
            //new Gson().toJson(map);
        }else {
            map.put("d",false);
        }
        return map;
    }

    /**
     * 批量删除购物车内商品
     * @param id
     * @return
     */
    @RequestMapping(value = "/delectBatchDeleteShopCar", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map delectBatchDeleteShopCar(int[] id){

        Map map=new HashMap();
        boolean flag=true;
        for(int i=0;i<id.length;i++){
            flag=flag&&orderListService.deleteShopCarById(id[i]);
            //new Gson().toJson(map);
        }
        map.put("d",flag);
        return map;
    }

    /**
     * 通过商品id,将商品从购物车移入收藏夹
     * @param id
     * @return
     */
    @RequestMapping(value = "/insertShiftToFavorites", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map insertShiftToFavorites(HttpSession session , int id){
        User user= (User) session.getAttribute("user");
        Favorites favorites=new Favorites();
        favorites.setUserid(user.getUserid());
        favorites.setProductid(id);
        Map map=new HashMap();
        if(orderListService.insertShiftToFavorites(favorites)){
            map.put("d",true);
            //new Gson().toJson(map);
        }else {
            map.put("d",false);
        }
        return map;
    }

    /**
     * 通过id将商品从收藏夹移除
     * @param session
     * @param id
     * @return
     */
    @RequestMapping(value = "/delectFavorites", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map delectFavorites(HttpSession session ,int id){
        User user= (User) session.getAttribute("user");
        Favorites favorites=new Favorites();
        favorites.setUserid(user.getUserid());
        favorites.setProductid(id);
        Map map=new HashMap();
        boolean flag=true;
        flag=flag&&orderListService.delectFavorites(favorites);
        map.put("d",flag);
        return map;
    }

    /**
     * 通过商品id 和用户id将一定数量商品放入购物车
     * @param session
     * @param id
     * @return
     */
    @RequestMapping(value = "/insertShiftToCart", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map insertShiftToCart(HttpSession session , int[] id){
        User user= (User) session.getAttribute("user");
        ShopCarCustom shopCarCustom=new ShopCarCustom();
        shopCarCustom.setUserid(user.getUserid());
        shopCarCustom.setProductid(id[0]);//设置商品id
        shopCarCustom.setOrderamount(id[1]);//设置购买数量
        Map map=new HashMap();
        if(orderListService.insertShiftToCart(shopCarCustom)){
            map.put("d",true);
            //new Gson().toJson(map);
        }else {
            map.put("d",false);
        }
        return map;
    }

    /**
     * 通过订单id查询商品及其评论
     * @param session
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryProductByOrderId", method ={ RequestMethod.GET,RequestMethod.POST})
    public String queryProductByOrderId(HttpSession session , Model model, int id){
        User user= (User) session.getAttribute("user");
        List<ProductCustom> productCustoms=orderListService.queryProductByOrderId(id);
        model.addAttribute("productCustoms",productCustoms);
        return "/jsp/users/my-pingjia.jsp";
    }

    /**
     * 更新评论通过id
     * @param session
     * @param model
     * @param data
     * @return
     */
    @RequestMapping(value = "/updateCommentByids", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map updateCommentByids(HttpSession session , Model model, String[] data){
        User user= (User) session.getAttribute("user");
        Map map=new HashMap();
        ProductCustom productCustom=new ProductCustom();
        productCustom.setCommentid(Integer.valueOf(data[0]));
        productCustom.setGoodcomment(Integer.valueOf(data[1]));
        productCustom.setComment(data[2]);
        productCustom.setCommenttime(new Date());
        boolean red=orderListService.updateCommentByids(productCustom);
        map.put("red",red);
        return map;
    }

    /**
     * 取消订单
     * @param session
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/updataOrderStatusZero", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map updataOrderStatusZero(HttpSession session , Model model, int id){
        Map map=new HashMap();
        Boolean flag=orderListService.updataOrderStatusZero(id,0);//将对应订单状态变为0 （关闭）
        map.put("d",flag);
        return map;
    }


    @RequestMapping(value = "/updataRefuseByOrderId", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Map updataRefuseByOrderId(HttpSession session , Model model, String[] id){
        Map map=new HashMap();
        Boolean flag=orderListService.updataRefuseByOrderId(Integer.valueOf(id[0]),id[1]);//将对应订单状态变为0 （关闭）
        map.put("d",flag);
        return map;
    }



}
