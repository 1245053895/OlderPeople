<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>新品专区</title>
    <link href="${pageContext.request.contextPath}/jsp/users/css/jfscstyle.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/jsp/users/css/top.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/jsp/users/css/rexiao.css" type="text/css" rel="stylesheet" />
</head>
<body>
<header id="pc-header">

    <jsp:include page="/jsp/users/head.jsp"></jsp:include>
    <!--  顶部    start-->
    <div class="yHeader">
        <!-- 导航   start  -->
        <div class="yNavIndex">
            <ul class="yMenuIndex">
                <li><a href="${pageContext.request.contextPath}/ShopFrontPage.action"  title="首页">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/ProductHot.action" target="_blank" title="热销专区">热销专区</a></li>
                <li><a href="${pageContext.request.contextPath}/SelectNewProduct.action" target="_blank" title="新品专区">新品专区</a></li>
                <li><a href="${pageContext.request.contextPath}/SelectProducCredits.action" target="_blank" title="积分商城">积分商城</a></li>
                <li><a href="${pageContext.request.contextPath}/queryTotalCommentshop.action" target="_blank" title="好评专区">好评专区</a></li>
                <li><a href="${pageContext.request.contextPath}/jsp/users/aboutus.jsp" target="_blank" title="关于我们">关于我们</a></li>
            </ul>
        </div>
        <!-- 导航   end  -->
    </div>

</header>
<div style="height: 30px;background-color: #f5f5f5"></div>
<div id="wrap" class="clearfix">

    <section class="row clearfix">
        <div id="local">
            <!-- 新品专区 -->
            <h3 class="top_title">
                        <span class="cn">
                           新品专区
                        </span>
                <span class="en">
                            New Product Zone
                        </span>
            </h3>

            <ul class="wares_list">
                <c:forEach items="${pagination.list}" var="totalCreditsByIdNew1">
                    <li style="margin-top:30px">
                        <div class="wares_pic">
                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIdNew1.productid}" target="_blank">
                                <img src="  ${totalCreditsByIdNew1.productpicture}" data-original="#" >
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIdNew1.productid}">
                               ${totalCreditsByIdNew1.productname}
                            </a>
                        </div>
                        <div class="wares_price">
                            原价 <span style="text-decoration: line-through"><fmt:formatNumber value="${totalCreditsByIdNew1.productprice* 1.2 }"  pattern="￥.00"/></span>
                        </div>
                        <div class="wares_tag">
                            预售价： <a>${totalCreditsByIdNew1.productprice}</a>
                        </div>
                    </li>
                </c:forEach>
            </ul>
            <!-- 新品专区 end -->
        </div>
        <div class="page">
            <c:forEach items="${pagination.pageView }" var="page">
                ${page }
            </c:forEach>
        </div>
    </section>
</div>
<div style="margin-top: 50px"></div>
<jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>
</body>
</html>
