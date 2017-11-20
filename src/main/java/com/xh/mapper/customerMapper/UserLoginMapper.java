package com.xh.mapper.customerMapper;

import com.xh.po.*;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface UserLoginMapper {

    //查询出所有登录用户的用户名和密码
    public User selectAllNameAndPwd(String username);

    //注册后插入一个新用户的账号，电话和密码
    public void insertNewUser(User user);


    //根据登录用户的id向用户日志表中插入用户开始登录的时间，用户的登录ip
    public void insertStartTimeAndIp(Userlog userlog);

    //根据用户id插入用户的结束登录时间
    public void updateEndLoginTime(Userlog userlog);

    //个人资料中修改登录密码，根据登录用户的id修改密码
    public void updataPwdById(User user);

    //个人中心里修改登录密码，根据登录用户的id修改电话
    public void updataLoginPhone(User user);

    //个人中心我的积分显示
    public List<TotalCreditsById> queryAllById(Integer userid);

    //每一个用户所购买的所有商品的总积分
    public TotalCreditsById queryTotalCriditsById(Integer userid);

     //查询出商品的图片，名称，描述，价格，展示在商城的首页selectproduct
     public List<Product> selectproduct();

     //查询出热销商品的图片，名称，描述，价格，展示在商城的首页
     public List<TotalCreditsById> hotSaleProduct();

    //查询出热评出行(评论数最多的前八)商品的图片，名称，描述，价格，展示在商城的首页
    public List<TotalCreditsById> Max10Comment();

    //查询出热评健康
    public List<TotalCreditsById> selectjiangkang();
    //查询出热评居家
    public List<TotalCreditsById> selectjujia();

    //查询出热评娱乐
    public List<TotalCreditsById> selectyule();


    //查询出可用积分兑换的商品的图片，名称，描述，价格，展示在商城的首页
    public List<TotalCreditsById> IsCredExchange();

    //店家推荐，推荐商品类型为医疗保健中得到商品好评度最多的商品
    public List<TotalCreditsById> StoreRecommendation();

    //加入购物车
    public void ShopCarInsert(Shopcar shopcar);

    //查询是否成功插入
    public Shopcar IsSuccessInsert(Shopcar shopcar);

    //将商品添加到收藏表中
    public void InsertFavorites(Favorites favorites);
    //查询所有用户
    public List<User> SelectAllQuerry();

}
