<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
<jsp:include page="/jsp/users/head.jsp"></jsp:include>
<div style="width: 100%;height: 620px">
    <div class="member-head" style="margin: 0px auto;text-align: center">
        <form id="wancheng" action="/jifenWanCheng.action" method="post">
            <div class="pay_lc2">
                <span class="sp01">确认订单</span>
                <span class="sp02">在线支付</span>
                <span class="sp03">支付成功</span>
            </div>
            <div class="zfbody">
                <div class="zfxq">
                    <div class="yxzffs">
                        <img src="${pageContext.request.contextPath}/jsp/users/images/zfjg.png" height="30px" width="30px">
                        <div style="margin-left:95px;margin-top: -55px;">
                            <span>您正在使用***进行支付</span>
                            <p style="margin-top: -15px;">
                                <c:if test="${productname[0]}!=null">
                                    <span style="font-weight: 600;">${productname[0]}</span>
                                </c:if>
                                <span style="font-weight: 600;">${myshopcarList[0].shopcarA} ${myshopcarList[1].shopcarA} ${myshopcarList[2].shopcarA}.......</span>
                                <i style="margin-left: 40px;">订单编号：${orderid}</i>
                                <span class="red" style="font-size: 16px;margin-left: 350px">￥<span>${realpay}</span></span>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="zfxqs">
                    <p>支付人姓名：${sessionScope.user.username}</p>
                    <input type="hidden" class="ace" name="realpay" value="${realpay}" />
                    <input type="hidden" class="ace" name="totalcredit" value="${totalcredit}" />
                    <p>支付总金额：<span class="red">￥<span>${realpay}</span></span></p>

                    <p>支付方式 ：

                        <c:forEach items="${pays}" var="pay">
                    <div class="zzfs">
                        <input type="radio" value="支付宝" name="zffs">
                        <img src="${pay.paypicture}" height="50px" width="110px">
                    </div>
                    </c:forEach>

                    </p>
                    <p>支付密码    ：<input type="text" placeholder="请输入支付密码" height="5px" style="margin-left: 12px;margin-top: 30px;"></p>
                    <div class="qrzf">
                        <%--付款成功 将 shopcar 的 C变为0   代表已付款--%>

                        <input name="shenyuCredits" value="${shenyuCredits}" type="hidden">
                        <input type="hidden" class="ace" name="orderid" value="${orderid}" />
                        <input type="submit" value="确认支付"  class="qrzfbtn">
                        <%--<a href="javascript:jiesuan('<%=basePath%>');" class="qrzfbtn">确认支付</a>--%>
                        <input type="button" onclick="houTui()" value="取消支付" class="qxzfbtn">
                    </div>
                </div>

            </div>
        </form>
    </div>
</div>

<jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>

<<script type="text/javascript">
    function houTui(){
        window.history.back(-1);
    }
 </script>
</body>
</html>
