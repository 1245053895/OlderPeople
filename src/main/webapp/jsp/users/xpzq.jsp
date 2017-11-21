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
<div style="height: 30px;"></div>
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
                <li>
                    <div class="wares_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/images/jfscs/14472206401499.jpg" data-original="#" width="298" height="298">
                        </a>
                    </div>
                    <div class="wares_title">
                        <a href="#">
                            【桔瓣主题游】韩国首尔一地五日自由行
                        </a>
                    </div>
                    <div class="wares_price">
                        原价 <span style="text-decoration: line-through">¥2390</span>
                    </div>
                    <div class="wares_tag">
                        预售价：￥121.09
                    </div>
                </li>
                <li>
                    <div class="wares_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/images/jfscs/14485062857773.jpg" data-original="#" width="298" height="298">
                        </a>
                    </div>
                    <div class="wares_title">
                        <a href="#">
                            【桔瓣主题游】华东五市 南山竹海 三国情 乌镇二飞六日游
                        </a>
                    </div>
                    <div class="wares_price">
                        原价 <span style="text-decoration: line-through">¥2390</span>
                    </div>
                    <div class="wares_tag">
                        预售价：￥121.09
                    </div>
                </li>
                <li>
                    <div class="wares_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/images/jfscs/14483566137628.jpg" data-original="#" width="298" height="298">
                        </a>
                    </div>
                    <div class="wares_title">
                        <a href="#">
                            【桔瓣精品游】厦门 鼓浪屿、曾厝垵双飞四日
                        </a>
                    </div>
                    <div class="wares_price">
                        原价 <span style="text-decoration: line-through">¥2390</span>
                    </div>
                    <div class="wares_tag">
                        预售价：￥121.09
                    </div>
                </li>
                <li>
                    <div class="wares_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/images/jfscs/14483522201412.jpg" data-original="#" width="298" height="298">
                        </a>
                    </div>
                    <div class="wares_title">
                        <a href="#">
                            【桔瓣主题游】曼谷、芭堤雅浪漫双岛五星六日游
                        </a>
                    </div>
                    <div class="wares_price">
                        原价 <span style="text-decoration: line-through">¥2390</span>
                    </div>
                    <div class="wares_tag">
                        预售价：￥121.09
                    </div>
                </li>
                <div class="clear">
                </div>
            </ul>
            <!-- 新品专区 end -->
        </div>
    </section>

</div>
</body>
</html>
