package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.OrderListMapper;
import com.xh.mapper.customerMapper.UserLoginMapper;
import com.xh.po.Product;
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
}
