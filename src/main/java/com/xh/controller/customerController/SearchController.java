package com.xh.controller.customerController;

import com.thoughtworks.xstream.core.BaseException;
import com.xh.po.Product;
import com.xh.po.vo.ProductCustom;
import com.xh.po.vo.SearchProduct;
import com.xh.po.vo.SearchRectangle;
import com.xh.po.vo.SearchResult;
import com.xh.service.customerService.SearchService;
import com.xh.util.FingerPrint;
import com.xh.util.HttpUtils;
import com.xh.util.Img2Base64Util;
import com.xh.util.cnn.*;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xh.util.cnn.DataUtil.zoomImage;

@Controller
public class SearchController {
    CNN cnn;
    @Autowired
    private SearchService searchService;
    /**
     * 上传图片 搜索匹配类似商品
     * @param request
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "/uploadSearchImage.action",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody SearchResult uploadSearchImage(HttpServletRequest request, HttpSession session, Model model){
        // 转型为MultipartHttpRequest(重点的所在)这个就是上面ajax中提到如果直接访问此接口而不加"/"，此转型就会报错
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        //MultipartFile file = multipartRequest.getFiles("errPic");//获取文件集合  对应  jquery $("#imageFile").get(0).files
        // 获得第1张图片（根据前台的name名称得到上传的文件）
        MultipartFile img = multipartRequest.getFile("mypic"); //对应  jquery $("#imageFile").get(0).files[index]
        //File fileImage= (File) img;
        Map<String,SearchResult> map = new HashMap<String,SearchResult>();
        //List<Product> products=searchService.queryProductAll();
        String sqlPath = null;
        try {
            //在这里进行文件保存操作
            //传进去的是一个路径，返回的也是一个路径
            String path = session.getServletContext().getRealPath("/jsp/users/img/upload");
            String realName = img.getOriginalFilename();
            String realFilePath = path + File.separator + realName;
            File file = new File(realFilePath);
            img.transferTo(file);
            //sqlPath = "jsp/users/img/upload/"+realName;
            //String taobao=Img2Base64Util.getImgStr(realFilePath);

            /**
             * 图片识别
             */
            //taobao=getJson(taobao);

            String modelPath = session.getServletContext().getRealPath(Constant.modelName);
            File modelFile=new File(modelPath);
            if(modelFile.exists()){
                cnn=CNN.loadModel(modelPath);
            }else{
                cnn= CreateCNN.getCNN(1);
            }
            BufferedImage bSmallImage=zoomImage(new File(realFilePath),28,28);
            DataUtil dataUtil2=DataUtil.load(bSmallImage);
            double out[]=cnn.analysis2(dataUtil2);
            for(int i=0;i<out.length;i++){
                System.out.println(i+"的概率:"+out[i]*100+" %");
            }
            //System.out.println(" 这是最可能是"+ Util.getMaxIndex(out));
            int productId[]=Util.getMaxTen(out);
            List<ProductCustom> product =searchService.queryProductByProductIds(productId);

            String taobao="{\"product_list\": [{\"url\": \"http://s.click.taobao.com/t?e=m%3D2%26s%3DDgh3xzXj6X0cQipKwQzePOeEDrYVVa64XoO8tOebS%2BdRAdhuF14FMQE1lE8dcsXut4hWD5k2kjPwiP017568gzOsIWBC1%2FGLkv1fyWQFcE2Cl9%2BtimHVLFC8ZXVeV5VmpZO8DRG5kdtfoXZI%2BKguweVeUgohBJgZL0kmcwT7wQL8wDmv5Sgt1NAuDNEy7P9VGNBqq7iBgJikQ8bv%2B34v4KJn5AyUbPoV\", \"product_image\": \"http://dressimage.img-cn-beijing.aliyuncs.com/image/tb/d45b8d12-a625-11e5-a8d1-00163e0c04b5.jpeg\", \"price\": 419.0, \"product_name\": \"BONO\\u886c\\u886b\\u5b9a\\u5236\\u7537\\u58eb\\u767d\\u84dd\\u6761\\u5bbd\\u6761\\u5546\\u52a1\\u957f\\u8896\\u886c\\u886b\\u91cf\\u8eab\\u5b9a\\u5236\\u7ed3\\u5a5a\\u7537\\u58eb\\u886c\\u886b\"}, {\"url\": \"http://s.click.taobao.com/t?e=m%3D2%26s%3D9u4CrwNeDhccQipKwQzePOeEDrYVVa64XoO8tOebS%2BdRAdhuF14FMSjSQy20VL%2FyJ1gyddu7kN%2FwiP017568gzOsIWBC1%2FGLkv1fyWQFcE2Cl9%2BtimHVLFC8ZXVeV5VmpZO8DRG5kdtfoXZI%2BKguweVeUgohBJgZL0kmcwT7wQLzewZlo13yVqI2DBSATocV8DXkye2YSCVBsOgWTDVFvg%3D%3D\", \"product_image\": \"http://dressimage.img-cn-beijing.aliyuncs.com/images/2015/8/11/14392920588526972246.jpg\", \"price\": 1458.0, \"product_name\": \"\\u8fea\\u4ed5\\u683c\\u5c14\\u65b0\\u6b3e\\u7537\\u58eb\\u7f8a\\u7ed2\\u886b\\u5706\\u9886100%\\u7eaf\\u7f8a\\u7ed2\\u7eaf\\u8272\\u7537\\u88c5\\u7f8a\\u7ed2\\u886b\\u6b63\\u54c1\\u7f8a\\u6bdb\\u886b\"}, {\"url\": \"http://s.click.taobao.com/t?e=m%3D2%26s%3DbshXEi3kkAIcQipKwQzePOeEDrYVVa64XoO8tOebS%2BdRAdhuF14FMeq0tVhaik4MJ1gyddu7kN%2FwiP017568gzOsIWBC1%2FGLkv1fyWQFcE2Cl9%2BtimHVLFC8ZXVeV5VmpZO8DRG5kdtfoXZI%2BKguweVeUgohBJgZL0kmcwT7wQJRRhS3xDWTc%2FmFWkWvt4B7XKMzSqiRwnSKyXgrJ9jj86Jn5AyUbPoV\", \"product_image\": \"http://dressimage.img-cn-beijing.aliyuncs.com/image/tb/12e988ec-9edb-11e5-aa4a-00163e000509.jpeg\", \"price\": 55.0, \"product_name\": \"\\u5165\\u79cb\\u5047\\u4e24\\u4ef6\\u62fc\\u63a5\\u4e0a\\u8863 \\u6b27\\u7f8e\\u7b80\\u7ea6\\u78e8\\u6bdb\\u7eaf\\u8272\\u5f39\\u529b\\u4fee\\u8eab\\u62fc\\u8272\\u957f\\u8896\\u6253\\u5e95T\\u6064\\u5973\"}], \"rectangle\": {\"y\": 0.1425925925925926, \"x\": 0.0515625, \"height\": 0.762962962962963, \"width\": 0.4036458333333333}}";
            /*FingerPrint fingerPrint=new FingerPrint(ImageIO.read(file));
            FingerPrint name[]=null;
            int i=0;
            for (Product product:products){
                if(i<5){
                    String p=session.getServletContext().getRealPath(product.getProductpicture());
                    name[i]=new FingerPrint(ImageIO.read(new File(p)));
                }else {
                    break;
                }
                i++;
            }*/
            /*将json字符串转为java对象*/
            JSONObject jsonObject = JSONObject.fromObject(taobao);
            Map<String, Class> classMap = new HashMap<String, Class>();
            classMap.put("product_list", SearchProduct.class);
            classMap.put("rectangle", SearchRectangle.class);
            SearchResult searchResult = (SearchResult)JSONObject.toBean(jsonObject, SearchResult.class,classMap);
            searchResult.setProductCNN(product);
            for(SearchProduct searchProduct:searchResult.getProduct_list()){
                List<Word> words = WordSegmenter.seg(searchProduct.getProduct_name()); //对商品名进行分词处理
                List<String> w=new ArrayList<String>();
                for(Word word:words){
                    w.add(word.getText());
                }
                List<ProductCustom> productCustoms=searchService.queryProductBySearch(w);

                if (productCustoms!=null){
                    searchResult.setProductCustoms(productCustoms);
                    System.out.print(words);
                    break;
                }
            }

            //map.put("taobao",searchResult);
            return searchResult;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/getSameProducts.action",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody String getSameProducts(HttpServletRequest request, HttpSession session, Model model) {
        return null;
    }

    public String getJson(String image){
        String results=null;
        String host = "http://api-product-clothes-search.dressplus.cn";
        String path = "/product/clothes/search";
        String method = "POST";
        String appcode = "685bae52043442348e056aec5ca7b919";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("image", image);
        //bodys.put("image_url", "http://dressimage.img-cn-beijing.aliyuncs.com/uploads/57837ab53be16.jpg");


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            //System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            results=EntityUtils.toString(response.getEntity());
            return results;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
