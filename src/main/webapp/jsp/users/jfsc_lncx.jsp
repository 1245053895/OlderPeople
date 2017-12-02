<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>积分商城-老年出行</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/style.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/content.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/common.css" rel="stylesheet" type="text/css" />
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
        <div id="wrap" class="clearfix" style="width:100%;background-color: #f5f5f5;padding-top: 40px;">
            <section id="contents">

                <h3 class="travel_title">
                    <i class="travel_icon tjy">
                    </i>
                    <c:forEach items="${productTypeExtends}" var="productTypeExtends1" varStatus="status">
                       <c:if test="${status.index==0}">
                         ${productTypeExtends.get(0).producttypename}爆款
                       </c:if>
                    </c:forEach>
                </h3>


                <ul class="rec_list">
                    <c:forEach items="${allHCproductList}"  var="allHCproductLists">
                        <li>
                            <div class="rec_pic">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${allHCproductLists.productid}" target="_blank">
                                    <img src="${allHCproductLists.productpicture}" data-original="" width="360" height="225">
                                </a>
                            </div>
                            <div class="rec_box">
                                <div class="rec_title">
                                    <p class="font18" style="margin-bottom: 8px;">
                                        <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${allHCproductLists.productid}" target="_blank">
                                           ${allHCproductLists.productname}
                                        </a>
                                    </p>
                                   ${allHCproductLists.productdescribe}
                                </div>
                                <p class="al_center font14">
                                    <span class="font_orange font16">
                                           销量:${allHCproductLists.totalhotsale}
                                    </span>
                                </p>


                                <p class="al_center font14" style="margin-top: 4px">
                                    ￥
                                    <span class="font_orange font16">
                                        ${allHCproductLists.productprice}
                                    </span>
                                </p>
                                <p class="al_center font16" style="margin-top: 10px;">
                                    所需积分：
                                    <b class="font_redd font20">
                                       ${allHCproductLists.productdisabled}
                                    </b>
                                </p>
                            </div>
                            <div class="clear">
                            </div>
                        </li>
                    </c:forEach>

                    <div class="clear">
                    </div>
                </ul>
                <ul class="goods_list2 h320 clearfix">
                </ul>


                  <h3 class="travel_title">
                      <c:forEach items="${productTypeExtends}" var="productTypeExtends1" varStatus="status">
                      <c:if test="${status.index==0}">
                          ${productTypeExtends.get(0).producttypename}
                      </c:if>
                      </c:forEach>
                 </h3>

                <ul class="goods_list2 h320 clearfix">
                    <c:forEach items="${pagination.list}" var="allproductLists">
                    <li>
                        <div class="goods_pic2">
                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${allproductLists.productid}" target="_blank">
                                <img src="${allproductLists.productpicture}" data-original="" width="280" height="280">
                            </a>
                        </div>

                        <div class="goods_title2">
                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${allproductLists.productid}" target="_blank">
                                【${allproductLists.productname}】${allproductLists.productdescribe}
                            </a>
                            <p class="al_center font14">
                                ￥  ${allproductLists.productprice}
                            </p>
                            <p class="al_center font14">
                                所需积分：
                                <b class="font_redd font16">
                                    ${allproductLists.productdisabled}
                                </b>
                            </p>
                        </div>
                    </li>
                    </c:forEach>
                </ul>
                <div class="page">
                    <c:forEach items="${pagination.pageView }" var="page">
                        ${page }
                    </c:forEach>
                </div>
            </section>

        </div>

        <jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>

    </body>

</html>