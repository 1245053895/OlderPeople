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
    <title>购买成功</title>
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

</header>
<section>
    <div style="margin: 50px auto; width: 1050px;">
        <div class="pay_lc" style="margin: 0px!important;">
            <span class="sp01">确认订单</span>
            <span class="sp02">在线支付</span>
            <span class="sp03">支付成功</span>
        </div>
        <div class="zfcg" style="margin: 0px!important;">
            <div style="margin-top: 50px;height: 500px;">
                <img src="${pageContext.request.contextPath}/jsp/users/images/zfcg.png" height="60px" width="60px" style="margin-left: 320px;">
                <div class="fk">
                    <span style="font-size: 18px;font-weight: 600;">您已兑换成功</span>
                    <%--<span class="red" style="font-size: 16px;">￥<span>69.00</span></span>--%>
                </div>
                <%-- <div class="fsdd">
                     不需要 货物自取没有地址
                     <span style="font-size: 16px;font-weight: 400">货物寄送至：</span>
                     <span style="font-size: 14px">贵州省 贵阳市 花溪区 贵州大学</span>
                 </div>--%>
                <div class="dd" style="">
                    <%-- 已购买： 从数据库 购物车表中读出 C字段不为0--%>
                    <a href="/jsp/users/my-dingdan.jsp?flag=0">已兑换的商品</a>
                    <span>剩余积分  <a href="#" class="red" style="border-right: 1px transparent solid">${shenyuCredits}</a><span style="border-right: 1px #e0e0e0 solid;padding-right: 8px;">分</span></span>
                    <a href="#" style="border-right: 1px transparent solid">积分商城</a>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>
