package com.xh.controller;


import com.xh.exception.CustomException;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.Allproduct;
import com.xh.po.vo.KindOfProduct;
import com.xh.po.vo.ProductAndTypeVo;
import com.xh.po.vo.StringAndString;
import com.xh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class ProducController {

    @Autowired
    private ProductService productService;
    //    查
    @RequestMapping("/ProducList.action")
    public String producList(String producname, Product product, Model model){
        //    得到总商品数  Allproduct productCount();
        product.setProductname(producname);
        Allproduct allproduct =  productService.productCount();
        List<ProductAndTypeVo> productAndTypeVos= productService.selectByProduct(product);
     /*  List<ProductAndTypeVo> productsTime=productService.moHuselectByTime(productstoretime);*/
      /*  model.addAttribute("productAndTypeVos",productstoretime);*/
        model.addAttribute("productAndTypeVos",productAndTypeVos);
        model.addAttribute("productname",producname);
        model.addAttribute("allproduct",allproduct);
        return "/jsp/admin/Products_List.jsp";
    }

    //删除
    @RequestMapping("/DeleteOneProduct.action")
    public String deleteOneProduct(int productid) throws Exception{
        //判断商品是否为空，根据id没有查询到商品，抛出异常，提示用户商品信息不存 在
        if(productid < 0){
            throw new CustomException("没有选择删除的数据!");
        }
        productService.deleteByPrimaryKey(productid);
        return "redirect:/ProducList.action";
    }
    //批量删除
    @RequestMapping("/DeleteBatchProduct.action")
    public String deleteBatchProduct(String[] productid) throws Exception{

        productService.deleteBatch(null);
        //重定向
        return "forward :/ProducList.action";
    }
    //添加
    @RequestMapping("/AddProduct.action")
    public String addProduct(Product product, Model model,HttpServletRequest request,MultipartFile product_pic) throws ParseException {
//       springmvc 没有办法去处理日期格式的字符串1990-01-01   1990/01/01     01/01 1990   Date
        //图片原始名称
        String originalFilename = product_pic.getOriginalFilename();
        //上传图片
        if(product_pic!=null && originalFilename!=null && originalFilename.length()>0){
            //存储图片的物理路径
            String pic_path = "E:\\IntelliJ IDEA\\images\\";
            //新的图片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path+newFileName);

            //将内存中的数据写入磁盘
            try {
                product_pic.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //将新图片名称写到itemsCustom中
            product.setProductpicture(newFileName);

        }


        // 调用service添加商品信息
        productService.insertSelective(product);

        // 重定向到商品查询列表
        // return "redirect:queryItems.action";
        // 页面请求转发，可带参数到转发的controller方法中（ProducList.action方法中能用本方法中的形参值）
        // return "forward:queryItems.action";

        return "redirect:/ProducList.action";
    }




/*  @RequestMapping("/AddProduct.action")
    public String addProduct(Product product, Model model, HttpSession session, MultipartFile product_pic)throws IllegalStateException, IOException {
      String sqlPath = null;
      if (product_pic != null && product_pic.getOriginalFilename() != null) {
          String path = session.getServletContext().getRealPath("/jsp/admin/images/upload");
          String realName = product_pic.getOriginalFilename();
          String realFilePath = path + File.separator + realName;
          File file = new File(realFilePath);
          product_pic.transferTo(file);
          product.setProductpicture(realFilePath);
          sqlPath = "jsp/admin/images/upload/" + realName;
          product.setProductpicture(sqlPath);
          product.setProductstoretime(new Date());
          productService.insertSelective(product);
          return "redirect:/ProducList.action";
      }
       return null;
  }*/



    //点击添加商品 得到商品类型列表  返回添加页面     Producttype producttype,Model model
    @RequestMapping("/AddToProductType.action")
    public String addToProductType(Model model){
        List<Producttype> producttypeList= productService.selectByNothing();
        model.addAttribute("producttypeList",producttypeList);
        return "/jsp/admin/picture-add.jsp";


    }

    //商品分类列表     Producttype producttype,Model model
    @RequestMapping("/ProductType.action")
    public String productType(Model model){
        List<KindOfProduct> kindOfProducts= productService.KindOfProduct();
        model.addAttribute("kindOfProducts",kindOfProducts);
        return "/jsp/admin/Product_Manage.jsp";
    }


    //显示各商品类型的商品
    @RequestMapping(value="typeProductType.action",method={RequestMethod.POST,RequestMethod.GET})
    public String typeProductType(String producttypeid,Model model){
        List<ProductAndTypeVo> productAndTypeVos=productService.typeProductType(producttypeid);
        List<KindOfProduct> kindOfProducts= productService.KindOfProduct();
        model.addAttribute("kindOfProducts",kindOfProducts);
        model.addAttribute("productAndTypeVos", productAndTypeVos);
        return "/jsp/admin/noname.jsp";
    }


    //商品分类增加     Producttype producttype,Model model
    @RequestMapping("/ProductTypeAdd.action")
    public String productTypeAdd(String producttypename,Producttype producttype,Model model){
        productService.TypeinsertSelective(producttype);
        List<KindOfProduct> kindOfProducts= productService.KindOfProduct();
        model.addAttribute("kindOfProducts",kindOfProducts);
        model.addAttribute("producttypename",producttypename);
        return "/jsp/admin/product-category-add.jsp";


    }
    //商品分类删除     Producttype producttype,Model model
    @RequestMapping("/ProductTypeDda.action")
    public String productTypeDda(String producttypename,Model model){
        productService.TypedeleteByName(producttypename);
        model.addAttribute("producttypename",producttypename);
        return "/jsp/admin/product-category-add.jsp";
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

    //根据商品的id更新商品的信息
    @RequestMapping("/updateById.action")
    public String updateById(ProductAndTypeVo productAndTypeVo){
        productService.updateById(productAndTypeVo);
        return "redirect:/ProducList.action";
    }

    @RequestMapping("/updateProductState.action")
    public String updateProductState(@RequestBody Product product){
        product.setProductA("d");
        productService.updateProductState(product);
        return "redirect:/ProducList.action";
    }

    /**
     * 根据商品的id更新商品的信息
     * @param product
     * @return
     */
    @RequestMapping(value = "/updateProductById.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String updateProductById(Product product){
        productService.updateProductById(product);
        return "redirect:/ProducList.action";
    }

}
