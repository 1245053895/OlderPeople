package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.OrderListMapper;
import com.xh.po.Favorites;
import com.xh.po.vo.FavoritesCustom;
import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.ProductCustom;
import com.xh.po.vo.ShopCarCustom;
import com.xh.service.customerService.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    private OrderListMapper orderListMapper;

    @Override
    public List<OrderCustom> selectOrderList(OrderCustom oc) {
        return orderListMapper.selectOrderList(oc);
    }

    @Override
    public List<ProductCustom> selectOrderDetails(Integer orderid) {
        return orderListMapper.selectOrderDetails(orderid);
    }

    @Override
    public List<ShopCarCustom> selectShopcarList(ShopCarCustom scc) {
        return orderListMapper.selectShopcarList(scc);
    }

    @Override
    public List<FavoritesCustom> selectFavoritesList(FavoritesCustom fc) {
        return orderListMapper.selectFavoritesList(fc);
    }

    @Override
    public boolean deleteShopCarById(int id) {
        orderListMapper.deleteShopCarById(id);
        if(orderListMapper.selectShopcarById(id)==null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean insertShiftToFavorites(Favorites favorites) {
        orderListMapper.insertShiftToFavorites(favorites);
        if(orderListMapper.selectFavoritesById(favorites)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean delectFavorites(Favorites favorites) {
        orderListMapper.delectFavorites(favorites);
        if(orderListMapper.selectFavoritesById(favorites)==null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean insertShiftToCart(ShopCarCustom shopCarCustom) {
        orderListMapper.insertShiftToCart(shopCarCustom);
        shopCarCustom.setStart(0);
        shopCarCustom.setCount(9999);
        if(orderListMapper.selectShopcarList(shopCarCustom)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public List<ProductCustom> queryProductByOrderId(int id) {
        return orderListMapper.queryProductByOrderId(id);
    }

    @Override
    public boolean updateCommentByids(ProductCustom productCustom) {
        orderListMapper.updateCommentByids(productCustom);
        ProductCustom pc =orderListMapper.selectCommentByids(productCustom);
        if(!pc.getComment().equals(productCustom.getComment())){
            return false;
        }else{
            return true;
        }
    }
}
