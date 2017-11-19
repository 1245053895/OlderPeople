package com.xh.controller;

import com.xh.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class expressApiController {
    @RequestMapping(value="queryExpress.action",method={RequestMethod.POST,RequestMethod.GET})
    public String queryExpress(String code,String name,Model model) throws UnsupportedEncodingException {
        name=new String(name.getBytes("iso8859-1"),"utf-8");
        //String express="{\"status\":\"0\",\"msg\":\"ok\",\"result\":{\"number\":\"462587770684\",\"type\":\"zto\",\"list\":[{\"time\":\"2017-11-11 18:31:23\",\"status\":\"[重庆市] [重庆璧山]的派件已签收 感谢使用中通快递,期待再次为您服务!\"},{\"time\":\"2017-11-11 14:00:33\",\"status\":\"[重庆市] [重庆璧山]的温泉王志兴正在第1次派件 电话:13678462816 请保持电话畅通、耐心等待\"},{\"time\":\"2017-11-11 13:50:53\",\"status\":\"[重庆市] 快件到达 [重庆璧山]\"},{\"time\":\"2017-11-11 05:33:05\",\"status\":\"[重庆市] 快件离开 [重庆]已发往[重庆璧山]\"},{\"time\":\"2017-11-11 05:10:37\",\"status\":\"[重庆市] 快件到达 [重庆]\"},{\"time\":\"2017-11-10 00:51:09\",\"status\":\"[深圳市] 快件离开 [深圳中心]已发往[重庆]\"},{\"time\":\"2017-11-10 00:47:58\",\"status\":\"[深圳市] 快件到达 [深圳中心]\"},{\"time\":\"2017-11-09 22:48:38\",\"status\":\"[深圳市] 快件离开 [福田华强]已发往[重庆]\"},{\"time\":\"2017-11-09 20:53:07\",\"status\":\"[深圳市] [福田华强]的小菜已收件 电话:13000000000\"}],\"deliverystatus\":\"3\",\"issign\":\"1\"}}";
        String express=null;
        String host = "http://wuliu.market.alicloudapi.com";
        String path = "/kdi";
        String method = "GET";
        String appcode = "685bae52043442348e056aec5ca7b919";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("no", code);
        //querys.put("no", "462587770684");
        //querys.put("type", "zto");


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
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            express=EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("name",name);
        model.addAttribute("express",express);
        return "/jsp/admin/express.jsp";
    }
}
