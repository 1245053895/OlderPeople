<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/19
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
    <meta name="renderer" content="webkit">
    <title>购物商城-支付</title>
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/apy.css">
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/car/base.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/car/home.css">
</head>

<body>
    <div class="member-head" style="margin-top: 30px; margin-left: 200px;text-align: center">
        <div class="member-heels" style="font-size: 18px;">在线支付</div>
        <div class="zfbody">
            <div class="zfxq">
                <div class="yxzffs">
                    <img src="${pageContext.request.contextPath}/jsp/users/images/zfjg.png" height="30px" width="30px">
                    <div style="margin-left:95px;margin-top: -55px;">
                        <span>您正在使用***进行支付</span>
                        <p style="margin-top: -15px;">
                            <span style="font-weight: 600;">老年代步车防滑折叠方便轻便好用</span>
                            <i style="margin-left: 40px;">订单编号：123456</i>
                            <span class="red" style="font-size: 16px;margin-left: 350px">￥<span>69.00</span></span>
                        </p>
                    </div>
                </div>
            </div>
            <div class="zfxqs">
                <p>支付人姓名：陈思顶</p>
                <p>支付总金额：<span class="red">￥<span>69.00</span></span></p>
                <p>支付方式 ：
                   <div class="zzfs">
                       <input type="radio" value="支付宝" name="zffs">
                       <img src="${pageContext.request.contextPath}/jsp/admin/images/zfb.png" height="50px" width="110px">
                   </div>
                   <div class="zzfs">
                       <input type="radio" value="微信支付" name="zffs">
                       <img src="${pageContext.request.contextPath}/jsp/admin/images/zfb.png" height="50px" width="110px">
                   </div>
                   <div class="zzfs">
                       <input type="radio" value="微信支付" name="zffs">
                       <img src="${pageContext.request.contextPath}/jsp/admin/images/zfb.png" height="50px" width="110px">
                   </div>
                   <div class="zzfs">
                       <input type="radio" value="微信支付" name="zffs">
                       <img src="${pageContext.request.contextPath}/jsp/admin/images/zfb.png" height="50px" width="110px">
                   </div>
                </p>
                <p>支付密码    ：<input type="text" placeholder="请输入支付密码" height="5px" style="margin-left: 12px;margin-top: 30px;"></p>
                <div class="qrzf">
                    <input type="button" value="确认支付" class="qrzfbtn">
                    <input type="button" value="取消支付" class="qxzfbtn">
                </div>
            </div>

        </div>
    </div>
</body>
</html>
