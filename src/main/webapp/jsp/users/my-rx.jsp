<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>热销商品</title>
    <link href="${pageContext.request.contextPath}/jsp/users/css/rexiao.css" type="text/css" rel="stylesheet" />
</head>
<body class="index">
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
<div class="w1201">
    <a name="a04"></a>
    <div class="idx02" id="idx04">
        <dl>
            <dt>热销产品</dt>
            <dd style="width: 1220px">
                <c:forEach varStatus="status" items="${pagination.list}" var="totalCreditsByIds1" >
                    <div class="item <c:if test='${status.index%11==0}'>big</c:if>">

                        <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}" class="title">${totalCreditsByIds1.productname}</a>
                        <p style="font-size: 18px;font-weight:500;color: #0b6cbc;margin-top: 0px;"><font>销量</font>${totalCreditsByIds1.totalhotsale}</p>
                        <p><font>￥</font>${totalCreditsByIds1.productprice}<font>0</font></p>
                        <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}" class="buy"></a>
                        <a  href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}">
                            <img  style="width: 180px;height: 200px;" src="${totalCreditsByIds1.productpicture}"/>
                        </a>
                    </div>
                </c:forEach>
                <%-- <c:forEach items="${totalCreditsByIds}" var="totalCreditsByIds1" begin="2" end="7">
                     <div class="item">
                         <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}" class="title">${totalCreditsByIds1.productname}</a>
                         <p><font>销量</font>${totalCreditsByIds1.totalhotsale}<font></font></p>
                         <p><font>￥</font>${totalCreditsByIds1.productprice}<font>0</font></p>
                         <a href="#" class="buy"></a>
                         <a  href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}">
                             <img  style="width: 180px;height: 200px;" src="${totalCreditsByIds1.productpicture}"/>
                         </a>
                     </div>
                 </c:forEach>--%>
                <div class="clear"></div>
            </dd>
        </dl>
    </div>
    <div style="margin-top: 20px;font-size: 20px;float: right;" >
        <c:forEach items="${pagination.pageView }" var="page">
            ${page }
        </c:forEach>
    </div>
</div>

<div style="margin-top: 100px"></div>
<jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>

</body>
</html>
