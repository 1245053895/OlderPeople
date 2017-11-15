package com.xh.service.customerService;

import com.xh.po.Product;
import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.ProductCustom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderListService {

    public List<OrderCustom> selectOrderList(OrderCustom oc);

    public List<ProductCustom> selectOrderDetails(Integer orderid);
}
