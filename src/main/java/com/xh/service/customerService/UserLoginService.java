package com.xh.service.customerService;

import com.xh.controller.page.Pagination;
import com.xh.po.*;
import com.xh.po.vo.TotalCreditsById;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
public interface UserLoginService {
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

    //查询购物车是否已有此产品
    public Shopcar queryShopCar(Shopcar shopcar);

    //查看此商品是否已在收藏夹中
    public Favorites queryFavorite(Favorites favorites);

    //查看收藏是否已经成功
    public Favorites IsSuccess(Favorites favorites);

    //查询商品的浏览次数是否为空
    public Integer queryLookcount(Integer productid);

    //商品浏览次数当为空时，赋值为1
    public void setLookcount(Integer productid);

    //商品浏览次数当不为空时，让它自动加1
    public void AutoIncreaseOne(Integer productid);


    //查询分页对象
    public Pagination selectPaginationByQuery(Integer productid,Integer pageNo);
    //  //选出商品的图片，价格，名称，评论数
   /* public List<TotalCreditsById> queryTotalCommentshop(TotalCreditsById totalCreditsById);*/
    public List<TotalCreditsById> queryTotalCommentshop1(TotalCreditsById totalCreditsById);


    //根据商品的id,查询出每个商品对应的好评度个数
    public Integer EveryShopGoodComment(Integer productid );



    //向用户表中根据用户的id更新用户最近一次登录的时间
    public void UpdateUserLoginTimeById(User user);

    //根据用户的id查询用户登录的总次数是否为空
    public Integer IsUserLoginNull(Integer userid);

    //当用户登录的总次数为空时，就对它赋1的值
    public  void  LoginCountOne(Integer userid);

    //当用户登录的总次数为1时，让它自动加一
    public void AutoIncreaeOne(Integer userid);

    //支付方式的页面显示
    public List<Pay> queryPayMethod();

    //根据用户的id修改用户的头像
    public void updateUserPic(User user);

    //根据用户的id查询用户的头像
    public User queryUserPic(User user);

    //根据用户的id查询出该用户对应的收货地址
    public List<Gainaddres> selectGainAddressByUserId(Integer userid);


}
