<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>好评专区</title>
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
                <li><a href="" target="_blank" title="积分商城">积分商城</a></li>
                <li><a href="${pageContext.request.contextPath}/queryTotalCommentshop.action" target="_blank" title="好评专区">好评专区</a></li>
                <li><a href="" target="_blank" title="关于我们">关于我们</a></li>
            </ul>
        </div>
        <!-- 导航   end  -->
    </div>

</header>
<div class="w1200">
    <div class="pro_cont">
        <div class="idx02" id="idx05">
            <dl>
                <dt>好评专区</dt>
            </dl>
        </div>
<c:forEach items="${totalCreditsByIds}" var="totalCreditsById" varStatus="status">
    <div class="item <c:if test='${status.index%5==4}'>last</c:if>">
            <dl>
                <dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsById.productid}"><img src="${totalCreditsById.productpicture}"/></a></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>${totalCreditsById.productprice}</font></p>
            <p class="p02"><a href="#">${totalCreditsById.productname}</a></p>
            <p class="p03"><span class="sp01">评价数：<b>${totalCreditsById.shopComment}</b></span><span>好评数：<strong>${totalCreditsById.totalgoodcomment}</strong></span></p>
        </div>
</c:forEach>

       <%-- <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                   
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item last">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>
        <div class="item last">
            <dl>
                <dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/img39.jpg"/></dt>
                
            </dl>
            <p class="p01"><font>￥</font><font>1599.00</font></p>
            <p class="p02"><a href="#">进口天然乳胶床垫弹簧1.51.8米双人软硬席梦思 椰梦维棕垫</a></p>
            <p class="p03"><span class="sp01">评价数：<b>4523</b></span><span>好评数：<strong>3958</strong></span></p>
        </div>--%>


        <div class="clear"></div>
    </div>
    <div class="page">
        <a href="#" class="pre"> < 上一页 </a>
        <a href="/queryTotalCommentshop.action?currentpage=1" class="<c:if test='${totalCreditsByIds.get(0).startpage==0}'>on</c:if>">1</a>
        <a href="/queryTotalCommentshop.action?currentpage=2" class="<c:if test='${totalCreditsByIds.get(0).startpage==15}'>on</c:if>">2</a>
        <a href="/queryTotalCommentshop.action?currentpage=3" class="<c:if test='${totalCreditsByIds.get(0).startpage==30}'>on</c:if>">3</a>
        <a href="/queryTotalCommentshop.action?currentpage=4" class="<c:if test='${totalCreditsByIds.get(0).startpage==45}'>on</c:if>">4</a>
        <a href="#">5</a>
        <a href="#">6</a>
        <span>...</span>
        <a href="#" class="next">下一页></a>
        共50页 到第<input type="text" value="1" />页  <a href="#" class="sub">确定</a>
    </div>
</div>
</body>
</html>
