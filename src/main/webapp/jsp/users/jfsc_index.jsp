<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <li>
                            <a href="#" class="tra">
                                出  行
                                <br>
                                <span class="en">
                                        Travel
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="edu">
                                健  康
                                <br>
                                <span class="en">
                                        Healthy
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="spe">
                                生  活
                                <br>
                                <span class="en">
                                        Life
                                    </span>
                            </a>
                        </li>
                    </ul>
                </aside>
                <ul id="nav">
                    <li>
                        <a href="#">
                            商城首页
                        </a>
                    </li>
                    <li>
                        <a href="#" class="active">
                            积分商城
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            热销专区
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            好评专区
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            新品专区
                        </a>
                    </li>
                    <li>
                        <a href="#">
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
                <li>
                    <div class="spe_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14582691498974.jpg" data-original="" width="360" height="225"
                                 style="display: inline;">
                        </a>
                    </div>
                    <div class="spe_box">
                        <div class="spe_title">
                            <p class="font20 font_b">
                                步步高xplay5
                            </p>
                            曲屛·金属 xplay5 震撼发售·12内期免息，审核通过后两天发货！
                            <br>
                        </div>
                        <p class="al_center font14">
                                <span class="font_orange font20">
                                    ￥3698
                                </span>
                            <span class="font_del font12">
                                    ￥3698
                                </span>
                            <br/>
                            <br/>
                            <span class="font_redd font20">所需积分： 345分</span>
                        </p>
                    </div>
                    <div class="clear">
                    </div>
                </li>
                <li>
                    <div class="spe_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14576734279883.jpg" data-original="#" width="360" height="225"
                                 style="display: inline;">
                        </a>
                    </div>
                    <div class="spe_box">
                        <div class="spe_title">
                            <p class="font20 font_b">
                                亚马逊Kindle
                            </p>
                            护眼健康、超长续航！给你喧嚣中的一片安宁，kindle便携电子书阅读器！
                            <br>
                        </div>
                        <p class="al_center font14">
                                <span class="font_orange font20">
                                    ￥3698
                                </span>
                            <span class="font_del font12">
                                    ￥3698
                                </span>
                            <br/>
                            <br/>
                            <span class="font_redd font20">所需积分： 345分</span>
                        </p>
                    </div>
                    <div class="clear">
                    </div>
                </li>
                <li>
                    <div class="spe_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14568221702470.jpg" data-original="images/14568221702470.jpg"
                                 width="360" height="225" style="display: inline;">
                        </a>
                    </div>
                    <div class="spe_box">
                        <div class="spe_title">
                            <p class="font20 font_b">
                                三星 Note5
                            </p>
                            提笔 出新 点击一下 写您所爱。
                            <br>
                        </div>
                        <p class="al_center font14">
                                <span class="font_orange font20">
                                    ￥3698
                                </span>
                            <span class="font_del font12">
                                    ￥3698
                                </span>
                            <br/>
                            <br/>
                            <span class="font_redd font20">所需积分： 345分</span>
                        </p>
                    </div>
                    <div class="clear">
                    </div>
                </li>
                <li>
                    <div class="spe_pic">
                        <a href="#" target="_blank">
                            <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14576821418640.jpg" data-original="" width="360" height="225"
                                 style="display: inline;">
                        </a>
                    </div>
                    <div class="spe_box">
                        <div class="spe_title">
                            <p class="font20 font_b">
                                独角仙 鼠标垫
                            </p>
                            一款柔软纤薄的游戏鼠标垫，如果玩家时常奔波在外，却又要求精准度和便携性，那么
                            <br>
                        </div>
                        <p class="al_center font14">
                                <span class="font_orange font20">
                                    ￥3698
                                </span>
                            <span class="font_del font12">
                                    ￥3698
                                </span>
                            <br/>
                            <br/>
                            <span class="font_redd font20">所需积分： 345分</span>
                        </p>
                    </div>
                    <div class="clear">
                    </div>
                </li>
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
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14582871146524.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="OPPO R9 全网通 手机">
                                OPPO R9 全网通 手机
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14582919735882.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="魅族 MEIZU  魅蓝note2 联通版 手机">
                                魅族 MEIZU 魅蓝note2
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14579430349421.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="魅族 MEIZU  MX5 PRO 公开版 手机">
                                魅族 MEIZU MX5 PRO
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14532555542421.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="华为 HUAWEI 荣耀X2 移动联通版 平板电脑">
                                华为 HUAWEI 荣耀X2 移动联
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14579352009317.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="华为 HUAWEI 荣耀 7I   移动版 手机">
                                华为 HUAWEI 荣耀 7I
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14579240697697.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="【桔瓣精品游】经典东南亚-魅力 新马泰玩乐10日游 ">
                                【桔瓣精品游】经典东南亚-魅力 新马
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14581858216138.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="【桔瓣精品游】【欢购东京4+2】 东京、富士山、奥特莱斯6日欢购之旅">
                                【桔瓣精品游】【欢购东京4+2】 东
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="rec_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14582049911134.jpg" data-original="#" width="220" height="220">
                            </a>
                        </div>
                        <div class="rec_title2">
                            <a href="#" target="_blank" title="【桔瓣精品游】皇家加勒比海洋神话号豪华游轮4晚5日（8.3-8.7）">
                                【桔瓣精品游】皇家加勒比海洋神话号豪
                            </a>
                        </div>
                        <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥151.95</span>
                        <div class="rec_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <div class="clear">
                    </div>
                </ul>
            </div>
        </section>
        <!-- 积分爆款推荐 end -->

        <section class="row clearfix">
            <div id="local">
                <!-- 老年出行 -->
                <h3 class="top_title">
                        <span class="link">
                            <span class="font_blue ml15">
                                <a href="#" style="font-size: 14px;">
                                    查看全部 &gt;
                                </a>
                            </span>
                        </span>
                    <span class="cn">
                            老年出行
                        </span>
                    <span class="en">
                            Elderly travel
                        </span>
                </h3>
                <ul class="wares_list">
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14472206401499.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣主题游】韩国首尔一地五日自由行
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14485062857773.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣主题游】华东五市 南山竹海 三国情 乌镇二飞六日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14483566137628.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣精品游】厦门 鼓浪屿、曾厝垵双飞四日
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14483522201412.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣主题游】曼谷、芭堤雅浪漫双岛五星六日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <div class="clear">
                    </div>
                </ul>
                <!-- 老年出行 end -->
                <!-- 老年健康 -->
                <h3 class="top_title">
                        <span class="link">
                            <span class="font_blue ml15">
                                <a href="#" style="font-size: 14px;">
                                    查看全部 &gt;
                                </a>
                            </span>
                        </span>
                    <span class="cn">
                            老年健康
                        </span>
                    <span class="en">
                            Elderly health
                        </span>
                </h3>
                <ul class="wares_list">
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14519778619298.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣周边游】成都→九寨沟往返套餐三日自由游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14520499639804.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣周边游】成都—峨眉山往返套餐二日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14519832141189.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣周边游】成都--西岭雪山往返套餐一日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14486133295565.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣周边游】成都牛背山三日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <div class="clear">
                    </div>
                </ul>
                <!-- 老年健康 end -->
                <!-- 老年生活 -->
                <h3 class="top_title">
                        <span class="link">
                            <span class="font_blue ml15">
                                <a href="#" style="font-size: 14px;">
                                    查看全部 &gt;
                                </a>
                            </span>
                        </span>
                    <span class="cn">
                            老年生活
                        </span>
                    <span class="en">
                           Elderly life
                        </span>
                </h3>
                <ul class="wares_list">
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14580332488602.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣精品游】云景无限《旅游护照》
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14579219397152.png" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣精品游】泰国·普吉岛+曼 谷+芭提雅·全景十日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14579203033420.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣精品游】【致海南】遇见小 月湾6日游（三亚）
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <li>
                        <div class="wares_pic">
                            <a href="#" target="_blank">
                                <img src="${pageContext.request.contextPath}/jsp/users/jfsc/images/14484379589527.jpg" data-original="#" width="298" height="298">
                            </a>
                        </div>
                        <div class="wares_title">
                            <a href="#">
                                【桔瓣主题游】其乐蜈琼·遇见蜈支洲六日游
                            </a>
                        </div>
                        <div class="wares_price">
                            <span style="font-size: 14px; font-weight: 500; color: #ee4644;margin-left: 8px;">售价：￥121.09</span>
                        </div>
                        <div class="wares_tag">
                            所需积分 2999
                        </div>
                    </li>
                    <div class="clear">
                    </div>
                </ul>
                <!-- 老年生活 end -->
            </div>
        </section>
    </div>

    <!-- 右侧浮动 -->
    <div id="float">
        <a href="#" class="consult" target="_blank"></a>
        <a href="#" class="cart"></a>
        <a href="#" class="cart1"></a>
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