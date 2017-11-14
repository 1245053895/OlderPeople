package com.xh.controller;

import com.xh.mapper.pojo.UserCsdMapper;
import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class UserMessageController {

    @Autowired
    UserMessageService userMessageService;
    @Autowired
    UserCsdMapper userCsdMapper;
    /*
    * 对用户全部查询输出到页面上
    * */
    @RequestMapping(value = "/UserMessageController.action")
    public String UseMessage(Model model){
        List<User> userList=userMessageService.qullyAllUser();
       TotalMessage totalMessage= userMessageService.totalUserInfor();
       model.addAttribute("totalMessage",totalMessage);
        model.addAttribute("userList",userList);
        return "jsp/admin/user_list.jsp";
    }
    /*
    * 实现单个删除查询
    * */
    @RequestMapping(value = "/DelectUserById.action",method ={RequestMethod.POST,RequestMethod.GET})
    public String DelectUserById(Integer Userid, Model model){

        userMessageService.deleteByPrimaryKey(Userid);

        return "redirect:/UserMessageController.action";
    }
    /*
    * 实现模糊查询
    * */
    @RequestMapping(value = "/QueryUserConfuse.action",method = {RequestMethod.POST,RequestMethod.GET})
    public String QueryUserConfuse(StringAndString stringAndString ,Model model ){
        model.addAttribute("stringAndString",stringAndString);
        List<User> userList=userMessageService.QueryUserConfuse(stringAndString);
        model.addAttribute("userList",userList);
        return "/jsp/admin/user_list.jsp";
    }

    /*
    * 添加用户
    * */
    @RequestMapping(value = "/insertSelective.action",method = {RequestMethod.POST,RequestMethod.GET})
    public  String insertSelective(User user,Model model){
        user.setUserinputdate(new Date());
        userMessageService.insertSelective(user);
        return "redirect:/UserMessageController.action";
    }
    /*
    * 批量删除用户
    * */
    @RequestMapping(value = "/DelectUserArray.action" ,method = {RequestMethod.POST,RequestMethod.GET})
    public String DelectUserArray( String[] ids) {
        if (ids != null) {
            for (String id : ids) {
                userMessageService.deleteByPrimaryKey(Integer.parseInt(id));
            }
            return "redirect:/UserMessageController.action";
        }else
        return  "redirect:/UserMessageController.action";
    }
    /*
    * 启用用户
    * */

    @RequestMapping(value = "/UpdateStatusStart.action",method = {RequestMethod.POST,RequestMethod.GET})
    public  String UpdateStatusStart(Integer userid){
        User user=new User();
        user.setUserid(userid);
        user.setUserA("1");
        userMessageService.updateByPrimaryKeySelective(user);
        return "redirect:/UserMessageController.action";
    }
    /*
    * 禁用用户
    * */
    @RequestMapping(value = "/UpdateStatusStop.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String UpdateStatusStop(Integer userid){
        User user=new User();
        user.setUserid(userid);
        user.setUserB(new Date());
        user.setUserA("0");
        userMessageService.updateByPrimaryKeySelective(user);
        return "redirect:/UserMessageController.action";
    }

}
