package com.xh.controller;

import com.xh.po.Admingroup;
import com.xh.po.Firstview;
import com.xh.po.Product;
import com.xh.po.vo.AdminRole;
import com.xh.po.vo.AdminRoleCustom;
import com.xh.po.vo.ProductAndTypeVo;
import com.xh.service.ProductService;
import com.xh.service.RoleManageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class ProducController {

    @Autowired
    private ProductService productService;
    @RequestMapping("/ProducList.action")
    public String producList(String productname, Product product, Model model){
        List<ProductAndTypeVo> productAndTypeVos= productService.selectByProduct(product);
        model.addAttribute("productAndTypeVos",productAndTypeVos);
        model.addAttribute("productname",productname);
        return "/jsp/admin/Products_List.jsp";
    }

    @RequestMapping("/DeleteOneProduct.action")
    public String deleteOneProduct(int productid){
        productService.deleteByPrimaryKey(productid);
        return "redirect:/ProducList.action";
    }

    @RequestMapping("/DeleteBatchProduct.action")
    public String deleteBatchProduct(String[] productid){
        productService.deleteBatch(productid);
        return "redirect:/ProducList.action";
    }
    /*
    * 启用状态
    * */
    @RequestMapping(value = "/UpdateStatusStartP.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String UpdateStatusStart(Integer productid){
        Product product=new Product();
        product.setProductid(productid);
        product.setProductA("1");
        productService.updateByPrimaryKeySelective(product);
        return "redirect:/ProducList.action";
    }
    /*
    * 停用状态
    * */
    @RequestMapping(value = "/UpdateStatusStopP.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String UpdateStatusStop(Integer productid){
       Product product=new Product();
       product.setProductid(productid);
       product.setProductA("0");
       productService.updateByPrimaryKeySelective(product);
        return "redirect:/ProducList.action";
    }

//    /**
//     * 获取所有一级菜单
//     * @param model
//     * @return
//     */
//    @RequestMapping("/getFirstview11")
//    public String getFirstview(Model model){
//        List<Firstview> firstviewList=roleManageServ.selectAllFirstview();
//        model.addAttribute("firstviewList",firstviewList);
//        return "/jsp/admin/Competence.jsp";
//    }
//
//    @RequestMapping("/addRloeAndView11")
//    public String addRloeAndView(AdminRoleCustom adminRoleCustom){
//        //首先将新增角色插入数据库
//        roleManageServ.insertRloe(adminRoleCustom);
//        //通过新插入的角色名查找到
//        Integer id=roleManageServ.selectRloeIdByName(adminRoleCustom.getAdmingroupname());
//        adminRoleCustom.setAdmingroupid(id);
//
//        //然后给角色分配权限
//        roleManageServ.insertRloeAndFirstView(adminRoleCustom);
//
//        return "/jsp/admin/admin_Competence.jsp";
//    }
//    /**
//     * 角色修改页面，只包括对角色表的查询
//     */
//    @RequestMapping("/queryAllRole11.action")
//    public String queryAllRole(Model model){
//        List<Admingroup> admingroups=roleManageServ.queryAllRole();
//        model.addAttribute("admingroups",admingroups);
//        return "/jsp/admin/Category_Manage.jsp";
//    }


}
