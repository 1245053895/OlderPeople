package com.xh.mapper.customerMapper;

import com.xh.po.Favorites;
import com.xh.po.Product;
import com.xh.po.vo.FavoritesCustom;
import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.ProductCustom;
import com.xh.po.vo.ShopCarCustom;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderListMapper {
    public List<OrderCustom> selectOrderList(OrderCustom oc);

    public List<ProductCustom> selectOrderDetails(@Param("orderid")Integer orderid);

    public List<ShopCarCustom> selectShopcarList(ShopCarCustom scc);

    public List<FavoritesCustom> selectFavoritesList(FavoritesCustom fc);

    public void deleteShopCarById(int id);

    public FavoritesCustom selectShopcarById(int id);

    public void insertShiftToFavorites(Favorites favorites);

    public Favorites selectFavoritesById(Favorites favorites);

    public void delectFavorites(Favorites favorites);

    public void insertShiftToCart(ShopCarCustom shopCarCustom);

    public List<ProductCustom> queryProductByOrderId(int id);

    public void updateCommentByids(ProductCustom productCustom);

    ProductCustom selectCommentByids(ProductCustom productCustom);
}
