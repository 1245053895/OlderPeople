<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/19
  Time: 17:02
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
    <title>支付成功</title>
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

<header id="pc-header">

    <jsp:include page="/jsp/users/head.jsp"></jsp:include>
    <!--  顶部    start-->
    <div class="yHeader">
        <!-- 导航   start  -->
        <div class="yNavIndex">
            <ul class="yMenuIndex">
                <li><a href="" target="_blank" title="首页">首页</a></li>
                <li><a href="" target="_blank" title="热销专区">热销专区</a></li>
                <li><a href="" target="_blank" title="新品专区">新品专区</a></li>
                <li><a href="" target="_blank" title="积分商城">积分商城</a></li>
                <li><a href="" target="_blank" title="合伙人">合伙人</a></li>
                <li><a href="" target="_blank" title="关于我们">关于我们</a></li>
            </ul>
        </div>
        <!-- 导航   end  -->
    </div>

</header>
<section>
    <div class="zfcg">
        <div style="margin-top: 50px;height: 500px;">
            <img src="${pageContext.request.contextPath}/jsp/users/images/zfcg.png" height="60px" width="60px;" style="margin-left: 320px;">
            <div class="fk">
                <span style="font-size: 18px;font-weight: 600;">您已成功付款</span>
                <span class="red" style="font-size: 16px;">￥<span>69.00</span></span>
            </div>
            <div class="fsdd">
                <span style="font-size: 16px;font-weight: 400">货物寄送至：</span>
                <span style="font-size: 14px">贵州省 贵阳市 花溪区 贵州大学</span>
            </div>
            <div class="dd" style="">
                <a href="#">已购买的商品</a>
                <a href="#">订单详情</a>
                <span>获得积分  <a href="#" class="red" style="border-right: 1px transparent solid">330</a>分</span>
            </div>
        </div>
    </div>
</section>
</body>
</html>