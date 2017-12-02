package com.xh.controller.customerController;

import com.xh.mapper.customerMapper.RecommendMapper;
import com.xh.po.User;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecommendController {
    @Autowired
    private RecommendService recommendService;
    @RequestMapping(value = "/SelectRecommed.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String SelectRecommed(HttpServletRequest request, Model model){
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user");
        List<TotalCreditsById> Recomend=recommendService.SelectRecommed();
        model.addAttribute("Recomend",Recomend);
        return "jsp/users/index.jsp";
    }

}
