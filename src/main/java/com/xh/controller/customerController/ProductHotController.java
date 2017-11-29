package com.xh.controller.customerController;

import com.xh.controller.page.Pagination;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductHotService;
import com.xh.service.customerService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductHotController {
    @Autowired
    private ProductHotService productHotService;
    @RequestMapping(value = "/ProductHot.action")
    public String ProductHot(Model model,Integer pageNo ){
        Pagination pagination=productHotService.selectPaginationByQuery(pageNo);
        model.addAttribute("pagination",pagination);
        return "/jsp/users/my-rx.jsp";
    }
}
