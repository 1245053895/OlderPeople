package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.UserLoginMapper;
import com.xh.po.*;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Override
    public User selectAllNameAndPwd(String username) {
        User user= userLoginMapper.selectAllNameAndPwd(username);
        return user;
    }

    @Override
    public void insertNewUser(User user) {
        userLoginMapper.insertNewUser(user);
    }

    @Override
    public void insertStartTimeAndIp(Userlog userlog) {
        userLoginMapper.insertStartTimeAndIp(userlog);
    }

    @Override
    public void updateEndLoginTime(Userlog userlog) {
        userLoginMapper.updateEndLoginTime(userlog);
    }

    @Override
    public void updataPwdById(User user) {
        userLoginMapper.updataPwdById(user);
    }

    @Override
    public void updataLoginPhone(User user) {
        userLoginMapper.updataLoginPhone(user);
    }

    @Override
    public List<TotalCreditsById> queryAllById(Integer userid) {
      List<TotalCreditsById> totalCreditsByIds=  userLoginMapper.queryAllById(userid);
      return  totalCreditsByIds;
    }

    @Override
    public TotalCreditsById queryTotalCriditsById(Integer userid) {
       TotalCreditsById totalCreditsById= userLoginMapper.queryTotalCriditsById(userid);
        return totalCreditsById;
    }

    @Override
    public List<Product> selectproduct() {
      List<Product>  products= userLoginMapper.selectproduct();
        return products;
    }

    @Override
    public List<TotalCreditsById> hotSaleProduct() {
        List<TotalCreditsById> hotsaleproducts= userLoginMapper.hotSaleProduct();
        return hotsaleproducts;
    }

    @Override
    public List<TotalCreditsById> Max10Comment() {
     List<TotalCreditsById> top10products=  userLoginMapper.Max10Comment();
        return top10products;
    }

    @Override
    public List<TotalCreditsById> selectjiangkang() {
        List<TotalCreditsById> jiangkang=  userLoginMapper.selectjiangkang();
        return jiangkang;
    }

    @Override
    public List<TotalCreditsById> selectjujia() {
        List<TotalCreditsById> jujia=  userLoginMapper.selectjujia();
        return jujia;
    }

    @Override
    public List<TotalCreditsById> selectyule() {
        List<TotalCreditsById> yule=  userLoginMapper.selectyule();
        return yule;
    }

    @Override
    public List<TotalCreditsById> IsCredExchange() {
        List<TotalCreditsById>  creditproducts= userLoginMapper.IsCredExchange();
        return creditproducts;
    }

    @Override
    public List<TotalCreditsById> StoreRecommendation() {
        List<TotalCreditsById> Recommendations= userLoginMapper.StoreRecommendation();
        return Recommendations;
    }

    @Override
    public void ShopCarInsert(Shopcar shopcar) {
        userLoginMapper.ShopCarInsert(shopcar);
    }

    @Override
    public Shopcar IsSuccessInsert(Shopcar shopcar) {
      Shopcar shopcar1=  userLoginMapper.IsSuccessInsert(shopcar);
        return shopcar1;
    }

    @Override
    public void InsertFavorites(Favorites favorites) {
      userLoginMapper.InsertFavorites(favorites);
    }

    @Override
    public Shopcar queryShopCar(Shopcar shopcar) {
     Shopcar shopcar1=   userLoginMapper.queryShopCar(shopcar);
        return shopcar1;
    }

    @Override
    public Favorites queryFavorite(Favorites favorites) {
       Favorites favorites1= userLoginMapper.queryFavorite(favorites);
        return favorites1;
    }

    @Override
    public Favorites IsSuccess(Favorites favorites) {
       Favorites favorites2= userLoginMapper.IsSuccess(favorites);
        return favorites2;
    }

    @Override
    public Integer queryLookcount(Integer productid) {
      Integer ProductLookCount=  userLoginMapper.queryLookcount(productid);
        return ProductLookCount;
    }

    @Override
    public void setLookcount(Integer productid) {
        userLoginMapper.setLookcount(productid);
    }

    @Override
    public void AutoIncreaseOne(Integer productid) {
        userLoginMapper.AutoIncreaseOne(productid);
    }


}
