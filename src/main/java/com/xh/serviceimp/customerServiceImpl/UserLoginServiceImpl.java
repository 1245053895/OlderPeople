package com.xh.serviceimp.customerServiceImpl;

import com.xh.controller.page.Pagination;
import com.xh.mapper.customerMapper.UserLoginMapper;
import com.xh.po.*;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.UserLoginService;
import org.apdplat.word.vector.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        User user = userLoginMapper.selectAllNameAndPwd(username);
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
        List<TotalCreditsById> totalCreditsByIds = userLoginMapper.queryAllById(userid);
        return totalCreditsByIds;
    }

    @Override
    public TotalCreditsById queryTotalCriditsById(Integer userid) {
        TotalCreditsById totalCreditsById = userLoginMapper.queryTotalCriditsById(userid);
        return totalCreditsById;
    }

    @Override
    public List<Product> selectproduct() {
        List<Product> products = userLoginMapper.selectproduct();
        return products;
    }

    @Override
    public List<TotalCreditsById> hotSaleProduct() {
        List<TotalCreditsById> hotsaleproducts = userLoginMapper.hotSaleProduct();
        return hotsaleproducts;
    }

    @Override
    public List<TotalCreditsById> Max10Comment() {
        List<TotalCreditsById> top10products = userLoginMapper.Max10Comment();
        return top10products;
    }

    @Override
    public List<TotalCreditsById> selectjiangkang() {
        List<TotalCreditsById> jiangkang = userLoginMapper.selectjiangkang();
        return jiangkang;
    }

    @Override
    public List<TotalCreditsById> selectjujia() {
        List<TotalCreditsById> jujia = userLoginMapper.selectjujia();
        return jujia;
    }

    @Override
    public List<TotalCreditsById> selectyule() {
        List<TotalCreditsById> yule = userLoginMapper.selectyule();
        return yule;
    }

    @Override
    public List<TotalCreditsById> IsCredExchange() {
        List<TotalCreditsById> creditproducts = userLoginMapper.IsCredExchange();
        return creditproducts;
    }

    @Override
    public List<TotalCreditsById> StoreRecommendation() {
        List<TotalCreditsById> Recommendations = userLoginMapper.StoreRecommendation();
        return Recommendations;
    }

    @Override
    public void ShopCarInsert(Shopcar shopcar) {
        userLoginMapper.ShopCarInsert(shopcar);
    }

    @Override
    public Shopcar IsSuccessInsert(Shopcar shopcar) {
        Shopcar shopcar1 = userLoginMapper.IsSuccessInsert(shopcar);
        return shopcar1;
    }

    @Override
    public void InsertFavorites(Favorites favorites) {
        userLoginMapper.InsertFavorites(favorites);
    }

    @Override
    public Shopcar queryShopCar(Shopcar shopcar) {
        Shopcar shopcar1 = userLoginMapper.queryShopCar(shopcar);
        return shopcar1;
    }

    @Override
    public Favorites queryFavorite(Favorites favorites) {
        Favorites favorites1 = userLoginMapper.queryFavorite(favorites);
        return favorites1;
    }

    @Override
    public Favorites IsSuccess(Favorites favorites) {
        Favorites favorites2 = userLoginMapper.IsSuccess(favorites);
        return favorites2;
    }

    @Override
    public Integer queryLookcount(Integer productid) {
        Integer ProductLookCount = userLoginMapper.queryLookcount(productid);
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


    //查询分页对象
    public Pagination selectPaginationByQuery( Integer pageNo) {
        int pageSize =15;
        TotalCreditsById totalCreditsById = new TotalCreditsById();
        List<TotalCreditsById> totalCreditsByIds = userLoginMapper.queryTotalCommentshop1(totalCreditsById);
        List<TotalCreditsById> pageTemp = new ArrayList<TotalCreditsById>();
        int count= userLoginMapper.SelectCount(totalCreditsById);
        if(pageNo*pageSize<=count) {
            for (int i = (pageNo - 1) * pageSize; i <pageNo * pageSize; i++) {
                Integer negood = userLoginMapper.EveryShopGoodComment(totalCreditsByIds.get(i).getProductid());
                totalCreditsByIds.get(i).setTotalgoodcomment(negood);
                pageTemp.add(totalCreditsByIds.get(i));
            }
        }
//        for (TotalCreditsById totalCreditsById1 : totalCreditsByIds) {
//            Integer onegood = userLoginMapper.EveryShopGoodComment(totalCreditsById1.getProductid());
//            totalCreditsById1.setTotalgoodcomment(onegood);
//           int r= totalCreditsById1.getTotalgoodcomment();
//           totalCreditsById.setTotalcomment(r);
//        }

        totalCreditsById.setPageNo(Pagination.cpn(pageNo));
        totalCreditsById.setPageSize(pageSize);
        int a = totalCreditsById.getPageNo();
        StringBuilder params = new StringBuilder();

        Pagination pagination = new Pagination(totalCreditsById.getPageNo(),
                totalCreditsById.getPageSize(),
                userLoginMapper.SelectCount(totalCreditsById));

        //设置结果集
        //   pagination.setList(userLoginMapper.queryTotalCommentshop(totalCreditsById));
       /* pagination.setList(userLoginMapper.queryTotalCommentshop(totalCreditsById));*/
        pagination.setList(pageTemp);
        //分页展示
        String url = "/queryTotalCommentshop.action";
        pagination.pageView(url, params.toString());
        return pagination;
    }

    @Override
    public List<TotalCreditsById> queryTotalCommentshop1(TotalCreditsById totalCreditsById) {
        List<TotalCreditsById> totalCreditsByIds = userLoginMapper.queryTotalCommentshop1(totalCreditsById);
        return totalCreditsByIds;
    }

  /*  @Override
    public List<TotalCreditsById> queryTotalCommentshop(TotalCreditsById totalCreditsById) {
      List<TotalCreditsById> ShoptotalCreditsByIds= userLoginMapper.queryTotalCommentshop(totalCreditsById);
        return ShoptotalCreditsByIds;
    }*/

    @Override
    public Integer EveryShopGoodComment(Integer productid) {
        Integer totalgood = userLoginMapper.EveryShopGoodComment(productid);
        return totalgood;
    }

    @Override
    public void UpdateUserLoginTimeById(User user) {
        userLoginMapper.UpdateUserLoginTimeById(user);
    }

    @Override
    public Integer IsUserLoginNull(Integer userid) {
        Integer userlogincount = userLoginMapper.IsUserLoginNull(userid);
        return userlogincount;
    }

    @Override
    public void LoginCountOne(Integer userid) {
        userLoginMapper.LoginCountOne(userid);

    }

    @Override
    public void AutoIncreaeOne(Integer userid) {
        userLoginMapper.AutoIncreaeOne(userid);

    }

    @Override
    public List<Pay> queryPayMethod() {
        List<Pay> pays = userLoginMapper.queryPayMethod();
        return pays;
    }

    @Override
    public void updateUserPic(User user) {
        userLoginMapper.updateUserPic(user);
    }

    @Override
    public User queryUserPic(User user) {
        User user1 = userLoginMapper.queryUserPic(user);
        return user1;
    }

    @Override
    public List<Gainaddres> selectGainAddressByUserId(Integer userid) {
        List<Gainaddres> gainaddres = userLoginMapper.selectGainAddressByUserId(userid);
        return gainaddres;
    }

    @Override
    public Product jifenPage(Integer productid) {
       Product product= userLoginMapper.jifenPage(productid);
        return product;
    }

    @Override
    public void updateCreditsCore(Integer userid) {
        userLoginMapper.updateCreditsCore(userid);
    }

    @Override
    public Integer queryCreditsCore(Integer userid) {
      Integer CreditsCores=  userLoginMapper.queryCreditsCore(userid);
        return CreditsCores;
    }

    @Override
    public void shenyuCreditsCore(Integer shenyuCredits, Integer userid) {
        userLoginMapper.shenyuCreditsCore(shenyuCredits,userid);
    }

    @Override
    public List<User> SelectAllQuerry() {
        List<User> userList1 = userLoginMapper.SelectAllQuerry();
        return userList1;
    }


}
