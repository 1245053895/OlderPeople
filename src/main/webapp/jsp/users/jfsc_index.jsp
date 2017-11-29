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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <title>
            孝和集团-积分商城
        </title>
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/index/style.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/index/top.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/index/common.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/index/banner.css" rel="stylesheet" type="text/css">

		<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/jfsc/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/jfsc/js/jquery.cookie.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/jfsc/js/juzi.js"></script>
    </head>
<body>
    <header id="pc-header">


        <c:if test="${productLists==null}">
            <jsp:forward page="${pageContext.request.contextPath}/SelectProductDiscont.action"></jsp:forward>
        </c:if>
        <c:if test="${totalCreditsByIds==null}">
            <jsp:forward page="${pageContext.request.contextPath}/SelectProductHotDiscont.action"></jsp:forward>
        </c:if>

        <jsp:include page="/jsp/users/head.jsp"></jsp:include>
    </header>
    <div id="wrap" class="clearfix" style="width:100%;background-color: #f5f5f5;">
        <header id="header">

            <nav id="navi">
                <aside class="aside">
                    <div class="aside_title">
                        积分商品分类
                    </div>
                    <ul class="aside_list">
                        <c:forEach items="${productTypeExtendsTraver}" var="productTypeExtendsTravers">
                            <li>
                                <a href="${pageContext.request.contextPath}/SelectCreditsProductQuerry.action?productTypeId=${productTypeExtendsTravers.producttypeid}" class="tra">
                                   出行/${productTypeExtendsTravers.producttypename}...
                                    <br>
                                    <span class="en">
                                            Travel
                                        </span>
                                </a>
                            </li>
                        </c:forEach>


                        <li>

                            <a href="#" class="edu">
                                <c:forEach items="${productTypeExtendsHealth}" var="productTypeExtendsHealths" varStatus="status">

                                       <a href="${pageContext.request.contextPath}/SelectCreditsProductQuerry.action?productTypeId=${productTypeExtendsHealths.producttypeid}" style="float: left">
                                           ${productTypeExtendsHealths.producttypename}...
                                       </a>

                                </c:forEach>
                                <br>
                                <span class="en">

                                    </span>
                            </a>
                        </li>


                        <li>
                            <a href="#" class="spe">
                                <c:forEach items="${productTypeExtendsLife}" var="productTypeExtendsLifes" varStatus="status">
                                    <a href="${pageContext.request.contextPath}/SelectCreditsProductQuerry.action?productTypeId=${productTypeExtendsLifes.producttypeid}" style="float:left">
                                        ${productTypeExtendsLifes.producttypename}...
                                    </a>
                                </c:forEach>
                                <br>
                                <span class="en">

                                </span>
                            </a>
                        </li>

                    </ul>
                </aside>
                <ul id="nav">
                    <li>
                        <a href="${pageContext.request.contextPath}/ShopFrontPage.action">
                            商城首页
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/SelectProducCredits.action" class="active">
                            积分商城
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ProductHot.action">
                            热销专区
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/queryTotalCommentshop.action">
                            好评专区
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/SelectNewProduct.action">
                            新品专区
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/jsp/users/aboutus.jsp">
                            关于我们
                        </a>
                    </li>
                    <div class="clear">
                    </div>
                </ul><!--
                    <div class="tel">
                        400-8383-517
                    </div>-->
            </nav>
        </header>
        <!-- banner -->
        <section id="banner">
            <div class="yx-rotaion" style="position: relative; overflow: hidden;">
                <ul class="rotaion_list">
                    <li style="position: absolute; left: 0px; top: 0px; display: none;">
                        <a href="#" target="_blank" style=background-image:url(${pageContext.request.contextPath}/jsp/users/jfsc/images/lb2.jpg);background-repeat:no-repeat;">
                        </a>
                    </li>
                    <li style="position: absolute; left: 0px; top: 0px; display: none;">
                        <a href="#" target="_blank" style="background-image:url(${pageContext.request.contextPath}/jsp/users/jfsc/images/lb4.jpg);background-repeat: no-repeat">
                        </a>
                    </li>
                    <li style="position: absolute; left: 0px; top: 0px; display: none;">
                        <a href="#" target="_blank" style="background-image:url(${pageContext.request.contextPath}/jsp/users/jfsc/images/lb1.jpg);background-repeat: no-repeat">
                        </a>
                    </li>
                    <li style="position: absolute; left: 0px; top: 0px; display: list-item;">
                        <a href="" target="_blank" style="background-image:url(${pageContext.request.contextPath}/jsp/users/jfsc/images/lb2.jpg);background-repeat: no-repeat">
                        </a>
                    </li>
                </ul>
                <div class="yx-rotaion-btn">
                        <span class="left_btn">
                        </span>
                    <span class="right_btn">
                        </span>
                </div>
                <div class="yx-rotation-focus">
                        <span class="hover">

                        </span>

                </div>
            </div>
        </section>
        <!-- banner end -->

        <!-- 积分特惠 -->
        <section id="special">
            <h3 class="top_title">
                    <span class="cn">
                        积分特惠
                    </span>
                <span class="en">
                       Integral preference
                    </span>
            </h3>
            <ul class="spe_list">
                <c:forEach items="${productLists}" var="productLists1">
                    <li>
                        <div class="spe_pic">
                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${productLists1.productid}" target="_blank">
                                <img src="${productLists1.productpicture}" data-original="" width="200" height="225"
                                     style="display: inline;">
                            </a>
                        </div>
                        <div class="spe_box">
                            <div class="spe_title">
                                <p class="font20 font_b">
                                    <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${productLists1.productid}">${productLists1.productname}</a>
                                </p>
                                <br style="height: 5px">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${productLists1.productid}">${productLists1.productdescribe}</a>
                                <br>
                            </div>
                            <p class="al_center font14">
                                    <span class="font_orange font20">
                                     <fmt:formatNumber value="${productLists1.productprice* 1.2 }"  pattern="￥.0"/>
                                    </span>
                                <span class="font_del font12">
                                      <fmt:formatNumber value="${productLists1.productprice* 1.2 }"  pattern="￥.0"/>
                                    </span>
                                <br/>
                                <br/>
                                <span class="font_redd font20">所需积分：${productLists1.productdisabled}分</span>
                            </p>
                        </div>
                        <div class="clear">
                        </div>
                    </li>
                </c:forEach>
                <div class="clear">
                </div>
            </ul>
        </section>
        <!-- 积分特惠 end -->
        <!-- 积分爆款推荐 -->
        <section id="recommend">
            <div class="row">
                <div class="rec_title">
                    <span style="font-size: 35px;font-weight: 700;">积分爆款推荐</span>
                    <br>
                    best sales Recommend
                </div>
                <ul class="rec_list">
                    <c:forEach items="${totalCreditsByIds}" var="totalCreditsByIds1">
                        <li style="margin-top: 10px">
                            <div class="rec_pic">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}" target="_blank">
                                    <img src="${totalCreditsByIds1.productpicture}" data-original="#" width="220" height="220">
                                </a>
                            </div>
                            <div class="rec_title2">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${totalCreditsByIds1.productid}" target="_blank" title="OPPO R9 全网通 手机">
                                    ${totalCreditsByIds1.productname}
                                </a>
                            </div>
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">销量：${totalCreditsByIds1.totalhotsale}</span>
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥${totalCreditsByIds1.productprice}</span>
                            <div class="rec_tag">
                                所需积分 ${totalCreditsByIds1.productdisabled}
                            </div>
                        </li>
                    </c:forEach>

                    <div class="clear">
                    </div>
                </ul>
            </div>
        </section>
        <!-- 积分爆款推荐 end -->

        <section class="row clearfix">
            <div id="local">
                <!-- 老年出行 -->


                <c:forEach items="${productTypeExtendsTraver}" var="productTypeExtendsTravers">
                <h3 class="top_title">
                        <span class="link">
                            <span class="font_blue ml15">
                                <a href="#" style="font-size: 14px;">
                                    查看全部 &gt;
                                </a>
                            </span>
                        </span>
                        <span class="cn">
                            ${productTypeExtendsTraver.get(0).producttypename}
                        </span>
                    <span class="en">
                            Elderly travel
                    </span>
                </h3>

                <ul class="wares_list">
                    <c:forEach items="${productTypeExtendsTravers.product}" var="product">
                        <li style="margin-top: 20px">
                            <div class="wares_pic">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}" target="_blank">
                                    <img src="${product.productpicture}" data-original="#" width="298" height="298">
                                </a>
                            </div>
                            <div class="wares_title">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}">
                                    【${product.productname}】${product.productdescribe}
                                </a>
                            </div>
                            <div class="wares_price">
                                <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：${product.productprice}￥</span>
                            </div>
                            <div class="wares_tag">
                                所需积分${product.productdisabled}
                            </div>
                        </li>
                    </c:forEach>
                    <div class="clear">
                    </div>
                </ul>

                </c:forEach>

                <!-- 老年出行 end -->
                <!-- 老年健康 -->

                <c:forEach items="${productTypeExtendsHealth}" var="productTypeExtendsHealths">
                <h3 class="top_title">
                        <span class="link">
                            <span class="font_blue ml15">
                                <a href="#" style="font-size: 14px;">
                                    查看全部 &gt;
                                </a>
                            </span>
                        </span>
                    <span class="cn">
                            老年健康/${productTypeExtendsHealths.producttypename}
                        </span>
                    <span class="en">
                            Elderly health
                        </span>
                </h3>

                        <ul class="wares_list">


                                <c:forEach items="${productTypeExtendsHealths.product}" var="product">
                                    <li>
                                        <div class="wares_pic">
                                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}" target="_blank">
                                                <img src="${product.productpicture}" data-original="#" width="298" height="298">
                                            </a>
                                        </div>
                                        <div class="wares_title">
                                            <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}">
                                                【${product.productname}】${product.productdescribe}
                                            </a>
                                        </div>
                                        <div class="wares_price">
                                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：${product.productprice}￥</span>
                                        </div>
                                        <div class="wares_tag">
                                            所需积分 ${product.productdisabled}
                                        </div>
                                    </li>
                                </c:forEach>
                                <div class="clear">
                                </div>
                        </ul>
                </c:forEach>



                <!-- 老年健康 end -->
                <!-- 老年生活 -->
                <c:forEach items="${productTypeExtendsLife}" var="productTypeExtendsLifes">
                <h3 class="top_title">
                        <span class="link">
                            <span class="font_blue ml15">
                                <a href="#" style="font-size: 14px;">
                                    查看全部 &gt;
                                </a>
                            </span>
                        </span>
                    <span class="cn">
                            老年生活/${productTypeExtendsLifes.producttypename}
                        </span>
                    <span class="en">
                           Elderly life
                        </span>
                </h3>
                <ul class="wares_list">
                    <c:forEach items="${productTypeExtendsLifes.product}" var="product">
                        <li>
                            <div class="wares_pic">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}" target="_blank">
                                    <img src="${product.productpicture}" data-original="#" width="298" height="298">
                                </a>
                            </div>
                            <div class="wares_title">
                                <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}">
                                    【${product.productname}】${product.productdescribe}
                                </a>
                            </div>
                            <div class="wares_price">
                                <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥${product.productprice}</span>
                            </div>
                            <div class="wares_tag">
                                所需积分 ${product.productdisabled}
                            </div>
                        </li>
                    </c:forEach>
                    <div class="clear">
                    </div>
                </ul>
                </c:forEach>
                <!-- 老年生活 end -->
            </div>
        </section>
    </div>

    <!-- 右侧浮动 -->
    <div id="float">
        <a href="${pageContext.request.contextPath}/LoginServlet?username=${sessionScope.user.username}" class="consult" target="_blank"></a>
        <a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=2" class="cart"></a>
        <a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=1" class="cart1"></a>
        <a href="javascript:void(0)" class="btn_top" style="display: none;"></a>
    </div>

    <script>
        $(function(){
            //代码初始化
            var size=$('.rotaion_list li').size();
            for (var i = 2; i <= size; i++) {
                var li="<span>"+i+"</span >";
                $('.yx-rotation-focus').append(li);
            };
            //手动控制轮播图
            $('.rotaion_list li').eq(0).show();
            $('.yx-rotation-focus span').eq(0).addClass('hover');
            $('.yx-rotation-focus span').mouseover(function(){
                $(this).addClass('hover').siblings().removeClass('hover');
                var index=$(this).index();
                i=index;
                $('.rotaion_list li').eq(index).stop().fadeIn(300).siblings().stop().fadeOut(300);
            })
            //自动播放
            var i=0;
            var t=setInterval(move,1500);
            //自动播放核心函数
            function move(){
                i++;
                if(i==size){
                    i=0;
                }
                $('.yx-rotation-focus span').eq(i).addClass('hover').siblings().removeClass('hover');
                $('.rotaion_list li').eq(i).fadeIn(300).siblings().fadeOut(300);
            }

            //向右播放核心函数
            function moveL(){
                i--;
                if(i==-1){
                    i=size-1;
                }
                $('.yx-rotation-focus span').eq(i).addClass('hover').siblings().removeClass('hover');
                $('.rotaion_list li').eq(i).fadeIn(300).siblings().fadeOut(300);
            }
            $('.yx-rotaion .left').click(function(){
                moveL();
            })
            $('.yx-rotaion .right').click(function(){
                move();
            })
            //鼠标移入移除
            $('.yx-rotaion').hover(function(){
                clearInterval(t);
            },function(){
                t=setInterval(move,1500);
            })
        })
    </script>

    </body>
</html>