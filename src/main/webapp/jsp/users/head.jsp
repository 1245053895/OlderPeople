<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KAIRUN
  Date: 2017/11/17
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <div class="pc-header-nav">
        <div class="pc-header-con">
            <c:if test="${empty user.userid}">
                <div class="fl pc-header-link" >您好！欢迎来孝和集团电子商城
                    <a href="${pageContext.request.contextPath}/LoginPage.action" target="_blank">请登录</a>
                    <a href="${pageContext.request.contextPath}/jsp/users/register.jsp" target="_blank"> 免费注册</a>
                </div>
            </c:if>
            <c:if test="${not empty user.userid}">
                <div class="fl pc-header-link" >${user.username}您好！欢迎来孝和集团电子商城
                    <a target="_self" href="${pageContext.request.contextPath}/ExitLogin.action" target="_blank"> 退出登录</a>
                </div>
            </c:if>

            <div class="fr pc-header-list top-nav">
                <ul>

                        <li><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=1">收藏夹</a></li>
                        <!-- flag=0 表示跳到订单页面; flag=1 表示跳到收藏页面;flag=2 表示跳到购物车页面; ...-->
                        <li><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=0">我的订单</a></li>
                        <li><a href="${pageContext.request.contextPath}/CustomerInformation.action">个人中心</a></li>

                    <li><a href="${pageContext.request.contextPath}/ShopFrontPage.action">返回首页</a></li>
                    <li>
                        <div class="nav"><i class="pc-top-icon"></i><a href="#">帮助中心</a></div>
                        <div class="con">
                            <dl>
                                <dt><a href="/CreditsMean.action">积分说明</a></dt>
                                <dd><a href="/LoginServlet?username=${sessionScope.user.username}">联系客服</a></dd>
                            </dl>
                        </div>
                    </li>

                </ul>
            </div>
        </div>
    </div>

    <div class="pc-header-logo clearfix">
        <div class="pc-fl-logo fl">
            <h1>
                <a href="index.jsp"></a>
            </h1>
        </div>
        <div class="head-form fl">
            <form class="clearfix">
                <input class="search-text" accesskey="" id="key" autocomplete="off" placeholder="请输入关键词" type="text">
                <button class="button" onclick="search('key');return false;">搜索</button>
            </form>
            <div class="words-text clearfix">
                <a href="#">制氧机</a>
                <a href="#">代步车</a>
                <a href="#">电动轮椅</a>
                <a href="#">血糖仪</a>
                <a href="#">血压计</a>
                <a href="#">木制拐杖</a>
                <a href="#">足浴盆</a>
            </div>
        </div>
        <div class="fr pc-head-car">
            <i class="icon-car"></i>
            <a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=2" target="_blank">我的购物车</a>
            <em>10</em>
        </div>
    </div>
</head>
<body>

</body>
</html>
