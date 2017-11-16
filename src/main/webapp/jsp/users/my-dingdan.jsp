<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="Generator" content="EditPlus®">
	<meta name="Author" content="">
	<meta name="Keywords" content="">
	<meta name="Description" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta name="renderer" content="webkit">
	<title>购物商城-我的订单</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
	<%--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/admin/assets/*">--%>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.SuperSlide.js"></script>
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>

	<script>
        $(function(){
            $("#dingdan ul li").click(function(){
                $("#dingdan ul li a").removeClass("dingdans");
                $(this).find("a").addClass("dingdans");
            });
        });
        function change(i){

        }
	</script>
	<script>
        $(function(){
            $("#leftinfo dl dd").click(function(){
                $("#leftinfo dl dd a").removeClass("leftinfos");
                $(this).find("a").addClass("leftinfos");
            });
        });
        function change(i){

        }
	</script>
	<script type="text/javascript">

        var intDiff = parseInt(90000);//倒计时总秒数量

        function timer(intDiff){
            window.setInterval(function(){
                var day=0,
                    hour=0,
                    minute=0,
                    second=0;//时间默认值
                if(intDiff > 0){
                    day = Math.floor(intDiff / (60 * 60 * 24));
                    hour = Math.floor(intDiff / (60 * 60)) - (day * 24);
                    minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
                    second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
                }
                if (minute <= 9) minute = '0' + minute;
                if (second <= 9) second = '0' + second;
                $('#day_show').html(day+"天");
                $('#hour_show').html('<s id="h"></s>'+hour+'时');
                $('#minute_show').html('<s></s>'+minute+'分');
                $('#second_show').html('<s></s>'+second+'秒');
                intDiff--;
            }, 1000);
        }

        $(function(){
            timer(intDiff);
        });//倒计时结束

        $(function(){
	        /*======右按钮======*/
            $(".you").click(function(){
                nextscroll();
            });
            function nextscroll(){
                var vcon = $(".v_cont");
                var offset = ($(".v_cont li").width())*-1;
                vcon.stop().animate({marginLeft:offset},"slow",function(){
                    var firstItem = $(".v_cont ul li").first();
                    vcon.find(".flder").append(firstItem);
                    $(this).css("margin-left","0px");
                });
            };
	        /*========左按钮=========*/
            $(".zuo").click(function(){
                var vcon = $(".v_cont");
                var offset = ($(".v_cont li").width()*-1);
                var lastItem = $(".v_cont ul li").last();
                vcon.find(".flder").prepend(lastItem);
                vcon.css("margin-left",offset);
                vcon.animate({marginLeft:"0px"},"slow")
            });
        });

	</script>
	<script type="text/javascript">
        $(document).ready(function(){
            var $miaobian=$('.Xcontent08>div');
            var $huantu=$('.Xcontent06>img');
            var $miaobian1=$('.Xcontent26>div');
            $miaobian.mousemove(function(){miaobian(this);});
            $miaobian1.click(function(){miaobian1(this);});
            function miaobian(thisMb){
                for(var i=0; i<$miaobian.length; i++){
                    $miaobian[i].style.borderColor = '#dedede';
                }
                thisMb.style.borderColor = '#cd2426';

                $huantu[0].src = thisMb.children[0].src;
            }
            function miaobian1(thisMb1){
                for(var i=0; i<$miaobian1.length; i++){
                    $miaobian1[i].style.borderColor = '#dedede';
                }
//		thisMb.style.borderColor = '#cd2426';
                $miaobian.css('border-color','#dedede');
                thisMb1.style.borderColor = '#cd2426';
                $huantu[0].src = thisMb1.children[0].src;
            }
            $(".Xcontent33").click(function(){
                var value=parseInt($('.input').val())+1;
                $('.input').val(value);
            })

            $(".Xcontent32").click(function(){
                var num = $(".input").val()
                if(num>0){
                    $(".input").val(num-1);
                }

            })

        })
	</script>

</head>
<body>

<header id="pc-header">
	<div class="pc-header-nav">
		<div class="pc-header-con">
			<div class="fl pc-header-link" >您好！，欢迎来孝和集团电子商城 
				<a href="login.html" target="_blank">请登录</a> 
				<a href="register.html" target="_blank"> 免费注册</a>
			</div>
			<div class="fr pc-header-list top-nav">
				<ul>
					<li><a href="#">收藏夹</a></li>
					<li><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp">我的订单</a></li>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">个人中心</a></div>
						<div class="con">
							<dl>
								<dt><a href="">个人资料</a></dt>
								<dd><a href="">收货地址</a></dd>
								<dd><a href="">修改登录密码</a></dd>
								<dd><a href="">我的积分</a></dd>
							</dl>
						</div>
					</li>
										
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">帮助中心</a></div>
						<div class="con">
							<dl>
								<dt><a href="">积分说明</a></dt>
								<dd><a href="">联系客服</a></dd>
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
				<input class="search-text" accesskey="" id="key" autocomplete="off" placeholder="洗衣机" type="text">
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
			<a href="#">我的购物车</a>
			<em>10</em>
		</div>
	</div>
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

<!--
<div class="containers center"><div class="pc-nav-item"><a href="#">首页</a> &gt; <a href="#">会员中心 </a> &gt; <a href="#">商城快讯</a></div></div>
-->

<section id="member">
	<div class="member-center clearfix">
		<div class="member-left fl">
			<div class="member-apart clearfix">
				<div class="fl"><a href="#"><img src="img/mem.png"></a></div>
				<div class="fl">
					<p>用户名：</p>
					<p><a href="#">${user.userrealname}</a></p>
					<p>账号：</p>
					<p>${user.username}</p>
				</div>
			</div>
			<div class="member-lists" id="leftinfo">
				<dl  onclick = "change(this);">
					<dt>我的商城</dt>
					<dd><a href="javascript:check('0');">我的订单</a></dd>
					<dd><a href="javascript:check('2');">我的购物车</a></dd>
					<dd><a href="${pageContext.request.contextPath}/jsp/users/my-car.jsp">我的收藏</a></dd>
					<dd><a href="${pageContext.request.contextPath}/jsp/users/my-pingjia.jsp">我的评价</a></dd>
					<%--<dd><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=0">我的订单</a></dd>
					<dd><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=2">我的购物车</a></dd>
					<dd><a href="${pageContext.request.contextPath}/jsp/users/my-car.jsp">我的收藏</a></dd>
					<dd><a href="${pageContext.request.contextPath}/jsp/users/my-pingjia.jsp">我的评价</a></dd>--%>
				</dl>
				<dl  onclick = "change(this);">
					<dt>客户服务</dt>
					<dd><a href="#">退货订单</a></dd>
					<dd><a href="#">退货/退款记录</a></dd>
				</dl>
			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"></div>
				<div class="member-backs member-icons fr"><a href="#">搜索</a></div>
				<div class="member-about fr"><input placeholder="商品名称/商品编号/订单编号" type="text"></div>
			</div>
			<%--<div class="member-whole clearfix" id="dingdan">
				<ul id="H-table" class="H-table">
					<li class="cur"><a href="javascript:queryOrderByUserId(0,5,-1);">全部订单</a></li>
					<li><a href="javascript:queryOrderByUserId(0,5,1);">待发货</a></li>
					<li><a href="javascript:queryOrderByUserId(0,5,2);">已发货</a></li>
					<li><a href="javascript:queryOrderByUserId(0,5,3);">已签收</a></li>
					<li><a href="javascript:queryOrderByUserId(0,5,4);">已完成</a></li>
					<li><a href="javascript:queryOrderByUserId(0,5,6);">退货订单<em></em></a></li>
				</ul>
			</div>
			<div class="member-border">
				<div class="member-return H-over">
					<div class="member-cancel clearfix" id="tb_haed">
						<span class="be1">订单信息</span>
						<span class="be2">收货人</span>
						<span class="be2">订单金额</span>
						<span class="be2">订单时间</span>
						<span class="be2">订单状态</span>
						<span class="be2">订单操作</span>
					</div>
					<div class="loading">
						<div></div>
						<img src="${pageContext.request.contextPath}/jsp/users/images/loading1.gif"/>
					</div>
					<div id="order" class="member-sheet clearfix"><ul></ul></div>
				</div>
				<div class="member-return H-over" style="display:none;">
					<div class="member-cancel clearfix">
						<span class="be1">订单信息</span>
						<span class="be2">收货人</span>
						<span class="be2">订单金额</span>
						<span class="be2">订单时间</span>
						<span class="be2">订单状态</span>
						<span class="be2">订单操作</span>
					</div>
					<div class="member-sheet clearfix">
						<ul>

						</ul>
					</div>
				</div>

				<div class="clearfix" style="padding:30px 20px;">
					<div class="fr pc-search-g pc-search-gs">
						<a style="display:none" class="fl " href="javascript:void(0);">上一页</a>
						<a href="javascript:queryOrderByUserId(0,5);" class="current">1</a>
						<a href="javascript:queryOrderByUserId(6,5);">2</a>
						<a href="javascript:queryOrderByUserId(11,5);">3</a>
						<a href="javascript:queryOrderByUserId(16,5);">4</a>
						<a href="javascript:queryOrderByUserId(21,5);">5</a>
						<a href="javascript:queryOrderByUserId(26,5);">6</a>
						<a href="javascript:queryOrderByUserId(31,5);">7</a>
						<span class="pc-search-di">…</span>
						<a href="javascript:;">1088</a>
						<a title="使用方向键右键也可翻到下一页哦！" class="" href="javascript:;">下一页</a>
					</div>
				</div>

			</div>--%>
		</div>
	</div>
</section>

<footer>
	<div class="pc-footer-top">
		<div class="center">
			<ul class="clearfix">
				<li>
					<span>关于我们</span>
					<a href="#">关于我们</a>
					<a href="#">诚聘英才</a>
					<a href="#">用户服务协议</a>
					<a href="#">网站服务条款</a>
					<a href="#">联系我们</a>
				</li>
				<li class="lw">
					<span>购物指南</span>
					<a href="#">新手上路</a>
					<a href="#">订单查询</a>
					<a href="#">会员介绍</a>
					<a href="#">网站服务条款</a>
					<a href="#">帮助中心</a>
				</li>
				<li class="lw">
					<span>消费者保障</span>
					<a href="#">人工验货</a>
					<a href="#">退货退款政策</a>
					<a href="#">运费补贴卡</a>
					<a href="#">无忧售后</a>
					<a href="#">先行赔付</a>
				</li>
				<li class="lw">
					<span>商务合作</span>
					<a href="#">人工验货</a>
					<a href="#">退货退款政策</a>
					<a href="#">运费补贴卡</a>
					<a href="#">无忧售后</a>
					<a href="#">先行赔付</a>
				</li>
				<li class="lss">
					<span>下载手机版</span>
					<div class="clearfix lss-pa">
						<div class="fl lss-img"><img src="img/icon/code.png" alt=""></div>
						<div class="fl" style="padding-left:20px">
							<h4>扫描下载云购APP</h4>
							<p>把优惠握在手心</p>
							<P>把潮流带在身边</P>
							<P></P>
						</div>
					</div>
				</li>
			</ul>
		</div>
		<div class="pc-footer-lin">
			<div class="center">
				<p>友情链接：
					卡宝宝信用卡
					梦芭莎网上购物
					手游交易平台
					法律咨询
					深圳地图
					P2P网贷导航
					名鞋库
					万表网
					叮当音乐网
					114票务网
					儿歌视频大全
				</p>
				<p>
					京ICP证1900075号  京ICP备20051110号-5  京公网安备110104734773474323  统一社会信用代码 91113443434371298269B  食品流通许可证SP1101435445645645640352397
				</p>
				<p style="padding-bottom:30px">版物经营许可证 新出发京零字第朝160018号  Copyright©2011-2015 版权所有 ZHE800.COM </p>
			</div>
		</div>
	</div>
</footer>
<style>

	.pc-shopping-tab{
		margin-top: -44px;
	}
	#tb_haed span{
		margin-top: 1px;
	}
	.loading div{
		display: none;
		line-height: 80px;
		text-align: center;
		position: relative;
		width: 200px;
		height: 80px;
		top:10px;
		left: 200px;
		font-size: 24px;
		border-radius: 50%;
		border: 1px #FFFFCC solid;
	}
	.loading img{
		display: none;
		width: 968px;
		max-width: 1980px;
	}
</style>

<script type="text/javascript">
	/*获取URL中的参数的方法*/
    (function($){
        $.getUrlParam = function(name) {
            var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r!=null) return unescape(r[2]); return null;
        }
    })(jQuery);

    $(document).ready(function(){
        var flag=$.getUrlParam('flag')
        console.log(flag);
        check(flag)
	});
    function check(flag) {
        switch(flag){
            case '0':
                $(".cur").find("a").addClass("dingdans"); //使全部订单按钮为选中状态
                queryOrderByUserId(0,5);
                break;
            case '1':
                queryFavoritesByUserId();
                break;
            case '2':
                queryShopCarByUserId(0,5);
                break;
            case '3':

                break;
            default:

                break;
        }
    }
    function queryOrderByUserId(start,count,status,conditions) {
        var order="<div class=\"member-whole clearfix\" id=\"dingdan\">\n" +
            "\t\t\t\t<ul id=\"H-table\" class=\"H-table\">\n" +
            "\t\t\t\t\t<li class=\"cur\"><a href=\"javascript:queryOrderByUserId(0,5,-1);\">全部订单</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryOrderByUserId(0,5,1);\">待发货</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryOrderByUserId(0,5,2);\">已发货</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryOrderByUserId(0,5,3);\">已签收</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryOrderByUserId(0,5,4);\">已完成</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryOrderByUserId(0,5,6);\">退货订单<em></em></a></li>\n" +
            "\t\t\t\t</ul>\n" +
            "\t\t\t</div>\n" +
            "\t\t\t<div class=\"member-border\">\n" +
            "\t\t\t\t<div class=\"member-return H-over\">\n" +
            "\t\t\t\t\t<div class=\"member-cancel clearfix\" id=\"tb_haed\">\n" +
            "\t\t\t\t\t\t<span class=\"be1\">订单信息</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">收货人</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单金额</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单时间</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单状态</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单操作</span>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t<div class=\"loading\">\n" +
            "\t\t\t\t\t\t<div></div>\n" +
            "\t\t\t\t\t\t<img style=\"margin-top: -150px;float: left;\" src=\"${pageContext.request.contextPath}/jsp/users/images/loading1.gif\"/>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t<div id=\"order\" class=\"member-sheet clearfix\"><ul></ul></div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<div class=\"member-return H-over\" style=\"display:none;\">\n" +
            "\t\t\t\t\t<div class=\"member-cancel clearfix\">\n" +
            "\t\t\t\t\t\t<span class=\"be1\">订单信息</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">收货人</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单金额</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单时间</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单状态</span>\n" +
            "\t\t\t\t\t\t<span class=\"be2\">订单操作</span>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t<div class=\"member-sheet clearfix\">\n" +
            "\t\t\t\t\t\t<ul>\n" +
            "\n" +
            "\t\t\t\t\t\t</ul>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t<div class=\"clearfix\" style=\"padding:30px 20px;\">\n" +
            "\t\t\t\t\t<div class=\"fr pc-search-g pc-search-gs\">\n" +
            "\t\t\t\t\t\t<a style=\"display:none\" class=\"fl \" href=\"javascript:void(0);\">上一页</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(0,5);\" class=\"current\">1</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(6,5);\">2</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(11,5);\">3</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(16,5);\">4</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(21,5);\">5</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(26,5);\">6</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(31,5);\">7</a>\n" +
            "\t\t\t\t\t\t<span class=\"pc-search-di\">…</span>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:;\">1088</a>\n" +
            "\t\t\t\t\t\t<a title=\"使用方向键右键也可翻到下一页哦！\" class=\"\" href=\"javascript:;\">下一页</a>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t</div>";

		$(".member-head").nextAll("div").remove();
        $(".member-heels").text("我的订单");
        $(".member-right").append(order);


        $(".member-heels").text("我的订单");
        console.log("这是订单"+${user.userid});
        var para=new Array();
        para.push(start);  //从第几条开始
        para.push(count);	//查询多少条
        para.push(${user.userid}); //用户id
        if(!status){
            para.push("-1");//订单状态 -1表示查询所有状态
        }else{
            para.push(status);
        }
		if(!conditions){
		    para.push("-1");	//任意条件
        }	else{
            para.push(conditions);
        }
		$.ajax({
			url:"${pageContext.request.contextPath}/selectOrderList.action",
            async:true,
            type: 'POST',
            data:{'para':para},
            traditional: true,
            timeout: 5000,
            cache: false,
            success: succFunction, //成功执行方法
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction  //错误执行方法
        });
        function LoadFunction() {
            $(".loading").find("img").css("display","block");
            $(".loading").find("div").css("display","block");
            //$(".loading").find("div").text("加载中...");
        }
        function erryFunction(){
            $(".loading").find("img").attr("src","${pageContext.request.contextPath}/jsp/users/images/loading.gif");
            $(".loading").find("div").text("加载失败!");
        }
        function succFunction(data){
			$(".loading").find("img").css("display", "none");
			$(".loading").find("div").css("display", "none");
            $("#order").find("ul").find("li").remove();
            $.each( data, function(index, content) {
                console.log(content.shoppingcount);
                var htmlStr1="";
                var htmlStr2="";
                var htmlStr3="";
                var productCount=0;

                htmlStr1="<li>\n" +
                    "\t\t\t\t\t\t\t\t<div class=\"member-minute clearfix\">\n" +
                    "\t\t\t\t\t\t\t\t\t<span>"+content.createtime+"</span>\n" +
                    "\t\t\t\t\t\t\t\t\t<span>订单号：<em>"+content.orderid+"</em></span>\n" +
                    "\t\t\t\t\t\t\t\t\t<span class=\"member-custom\">客服电话：<em>010-6544-0986</em></span>\n" +
                    "\t\t\t\t\t\t\t\t</div>\n" +
                    "\t\t\t\t\t\t\t\t<div class=\"member-circle clearfix\">\n" +
                    "\t\t\t\t\t\t\t\t\t<div class=\"ci1\">\n";

                console.log(content.productCustoms);
				$.each(content.productCustoms,function(i, productCustom) {
                    productCount++;
                    htmlStr2+="\t\t\t\t\t\t\t\t\t\t<div class=\"ci7 clearfix\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<span class=\"gr1\"><a href=\"#\"><img src=\"/"+productCustom.productpicture+"\" title=\"\" about=\"\" width=\"60\" height=\"60\"></a></span>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<span class=\"gr2\"><a href=\"#\">"+productCustom.productname+"</a></span>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<span class=\"gr3\">X"+productCustom.shoppingcount+"</span>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>\n";
                });

				htmlStr3="\t\t\t\t\t\t\t\t\t</div>\n" +
					"\t\t\t\t\t\t\t\t\t<div class=\"ci2 height"+index+"\">"+content.gainname+"</div>\n" +
					"\t\t\t\t\t\t\t\t\t<div class=\"ci3 height"+index+"\"><p class=\"red\">￥<span>"+content.amountpay+"</span></p><p>";
				if(content.paytype==0){
                    htmlStr3+="在线支付";
				}else{
                    htmlStr3+="货到付款"
				}
                htmlStr3+="</p></div>\n" +
					"\t\t\t\t\t\t\t\t\t<div class=\"ci4 height"+index+"\"><p>2015-09-22</p></div>\n" ;
				switch (content.status){
					case 0:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>交易关闭</p>"
						if(content.shippingcode!=null||content.shippingcode!=""){
                            htmlStr3+="<p><a href=\"#\">物流跟踪</a></p>"
						}
						htmlStr3+="<p><a href=\"#\">订单详情</a></p></div>\n";

                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">重新购买</a> </p></div>\n";
                        break;
                    case 1:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>待发货</p><p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">提醒发货</a> </p> <p><a href=\"#\">取消订单</a> </p></div>\n";
                        break;
                    case 2:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>已发货</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">确认收货</a> </p></p></div>\n";
                        break;
                    case 3:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>已签收</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">评价</a></p><p><a href=\"#\" class=\"member-touch\">售后服务</a></p></div>\n";
                        break;
                    case 4:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>已完成</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p>剩余15时20分</p><p><a href=\"#\" class=\"member-touch\">再次购买</a></p><p><a href=\"#\" class=\"member-touch\">售后服务</a></p></div>\n";
                        break;
                    case 5:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>拒收</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">拒收理由</a> </p></div>\n";
                        break;
                    case 6:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>申请退货</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">撤销申请</a> </p></div>\n";
                        break;
                    case 7:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>同意退货</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p>剩余15时20分</p><p><a href=\"#\" class=\"member-touch\">填写物流</a> </p><p><a href=\"#\" class=\"member-touch\">撤销申请</a> </p></div>\n";
                        break;
                        break;
                    case 8:
                        htmlStr3+="<div class=\"ci5 height"+index+"\"><p>拒绝退货</p><p><a href=\"#\">物流跟踪</a></p> <p><a href=\"#\">订单详情</a></p></div>\n";
                        htmlStr3+= "<div class=\"ci5 ci8 height"+index+"\"><p><a href=\"#\" class=\"member-touch\">查看原因</a> </p></div>\n";
                        break;
					default:
                        htmlStr3+="未获取到订单状态";
                        break;

				}
                htmlStr3+="</div></li>"
                $("#order").find("ul").append(htmlStr1+htmlStr2+htmlStr3);
                $(".height"+index).height(90*productCount-23);
                //console.log("++++"+htmlStr2);
            });
        }
    }
    function queryFavoritesByUserId() {
        console.log("这是收藏夹");
    }
    function queryShopCarByUserId(start,count,status,conditions) {
        var car="<div class=\"center \" id=\"dingdan\">\n" +
            "\t\t\t\t<ul class=\"pc-shopping-title clearfix\">\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryShopCarByUserId(0,5,-1);\">全部商品(10)</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryShopCarByUserId(0,5,2);\">已下架(0)</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryShopCarByUserId(0,5,0);\">热销商品(0)</a></li>\n" +
            "\t\t\t\t\t<li><a href=\"javascript:queryShopCarByUserId(0,5,1);\">新品(0)</a></li>\n" +
            "\t\t\t\t</ul>\n" +
            "\t\t\t</div>\n" +
            "\t\t\t<div class=\"pc-shopping-cart center\">\n" +
            "\t\t\t\t<div class=\"pc-shopping-tab\">\n" +
            "\t\t\t\t\t<table>\n" +
            "\t\t\t\t\t\t<thead>\n" +
			"<thead>\n" +
            "\t\t\t\t\t\t\t<tr id=\"id_head\" class=\"tab-0\">\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-1\">\n" +
            "\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"s_all\" class=\"s_all tr_checkmr\" id=\"s_all_h\">\n" +
            "\t\t\t\t\t\t\t\t\t<label style=\"margin-left: 20px;\"> 全选</label>\n" +
            "\t\t\t\t\t\t\t\t</th>\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-2\">商品</th>\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-3\">商品信息</th>\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-4\">金额</th>\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-5\">数量</th>\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-6\">小计</th>\n" +
            "\t\t\t\t\t\t\t\t<th class=\"tab-7\">操作</th>\n" +
            "\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t</thead>"+
			"\t\t\t\t\t\t\t<div class=\"loading\">\n" +
            "\t\t\t\t\t\t\t\t<div></div>\n" +
            "\t\t\t\t\t\t\t\t<img  style=\"margin-top: -80px;\" src=\"${pageContext.request.contextPath}/jsp/users/images/loading1.gif\"/>\n" +
            "\t\t\t\t\t\t\t</div>"+
            "\t\t\t\t\t\t</thead>\n" +
            "\t\t\t\t\t\t<tbody id='car'>\n" +
            "\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t</table>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t</div>\n" +
			"\t\t\t\t<div class=\"clearfix\" style=\"padding:30px 20px;\">\n" +
            "\t\t\t\t\t<div class=\"fr pc-search-g pc-search-gs\">\n" +
            "\t\t\t\t\t\t<a style=\"display:none\" class=\"fl \" href=\"javascript:void(0);\">上一页</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(0,5);\" class=\"current\">1</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(6,5);\">2</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(11,5);\">3</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(16,5);\">4</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(21,5);\">5</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(26,5);\">6</a>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:queryOrderByUserId(31,5);\">7</a>\n" +
            "\t\t\t\t\t\t<span class=\"pc-search-di\">…</span>\n" +
            "\t\t\t\t\t\t<a href=\"javascript:;\">1088</a>\n" +
            "\t\t\t\t\t\t<a title=\"使用方向键右键也可翻到下一页哦！\" class=\"\" href=\"javascript:;\">下一页</a>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>";

        $(".member-head").nextAll("div").remove();
        $(".member-heels").text("我的购物车");
        $(".member-right").append(car);
        $(".member-right").css("width","970px");

        console.log("这是购物车");
        var para=new Array();
        para.push(start);  //从第几条开始
        para.push(count);	//查询多少条
        para.push(${user.userid}); //用户id
        if(!status&&status!=0){
            para.push("-1");//商品状态 -1表示查询所有状态
        }else{
            para.push(status); //商品状态 0表示查询热销商品  1表示查询新品 2表示查询已下架商品
        }
        if(!conditions){
            para.push("-1");	//任意条件
        }	else{
            para.push(conditions);
        }

        $.ajax({
            url:"${pageContext.request.contextPath}/selectShopcarList.action",
            async:true,
            type: 'POST',
            data:{'para':para},
            traditional: true,
            timeout: 5000,
            cache: false,
            success: succFunction, //成功执行方法
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction  //错误执行方法
        });
        function LoadFunction() {
            $(".loading").find("img").css("display","block");
            $(".loading").find("div").css("display","block");
            $("#id_head").css("visibility","hidden");
            //$(".loading").find("div").text("加载中...");
        }
        function erryFunction(){
            $(".loading").find("img").attr("src","${pageContext.request.contextPath}/jsp/users/images/loading.gif");
            $(".loading").find("div").text("加载失败!");
            $("#id_head").css("visibility","hidden");
        }
        function succFunction(data) {
            $(".loading").find("img").css("display", "none");
            $(".loading").find("div").css("display", "none");
            $("#id_head").css("visibility","visible");
            $.each( data, function(index, content) {
                console.log(content.shoppingcount);
                var html="<tr>\n" +
                    "\t\t\t\t\t\t\t\t<th><input type=\"checkbox\"  style=\"margin-left:15px; float:left\"></th>\n" +
                    "\t\t\t\t\t\t\t\t<th class=\"tab-th-1\">\n" +
                    "\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"/"+content.productpicture+"\" width=\"100%\" alt=\"\"></a>\n" +
                    "\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"tab-title\">"+content.productname+"</a>\n" +
                    "\t\t\t\t\t\t\t\t</th>\n" +
                    "\t\t\t\t\t\t\t\t<th>\n" +
                    "\t\t\t\t\t\t\t\t\t<p>"+content.productdescribe+"</p>\n" +
                    "\t\t\t\t\t\t\t\t\t<p></p>\n" +
                    "\t\t\t\t\t\t\t\t</th>\n" +
                    "\t\t\t\t\t\t\t\t<th>\n" +
                    "\t\t\t\t\t\t\t\t\t<p>售价￥<span class=\"red\">"+content.productprice+"</span></p>\n" +
                    "\t\t\t\t\t\t\t\t\t<p>市场价￥<span style=\"text-decoration: line-through;\">"+content.marketprice+"</span></p>\n" +
                    "\t\t\t\t\t\t\t\t\t<br/>\n" +
                    "\t\t\t\t\t\t\t\t</th>\n" +
                    "\t\t\t\t\t\t\t\t<th class=\"tab-th-2\">\n" +
                    "\t\t\t\t\t\t\t\t\t<div onclick='minus(this)' class=\"Xcontent32\"><img src=\"images/shangpinxiangqing/X15.png\"></div>\n" +
                    "\t\t\t\t\t\t\t\t\t<input class=\"input\" value=\""+content.orderamount+"\">" +
                    "\t\t\t\t\t\t\t\t\t<div onclick='add(this)' class=\"Xcontent33\"><img src=\"images/shangpinxiangqing/16.png\"></div>\n" +
                    "\t\t\t\t\t\t\t\t</th>\n" +
                    "\t\t\t\t\t\t\t\t<th class=\"red\">￥<span>"+content.productprice*content.orderamount+"</span></th>\n" +
                    "\t\t\t\t\t\t\t\t<th>\n" +
                    "\t\t\t\t\t\t\t\t\t<p><a href=\"#\">删除</a></p>\n" +
                    "\t\t\t\t\t\t\t\t\t<br/>\n" +
                    "\t\t\t\t\t\t\t\t\t<p><a href=\"#\">移入收藏夹</a></p>\n" +
                    "\t\t\t\t\t\t\t\t</th>\n" +
                    "\t\t\t\t\t\t\t</tr>";

                $("#car").append(html);
            });
        }




    }


    function sleep(n) { //n表示的毫秒数
        var start = new Date().getTime();
        while (true) {

            if (new Date().getTime() - start > n) {
                break;
            }
        }
    }

    /**
	 * 转换时间格式
     * @param mydate
     * @returns {string}
     */
    function gettime(mydate){//将当前时间转换成yyyymmdd格式
        //var mydate = new Date();
        var str = "" + mydate.getFullYear();
        var mm = mydate.getMonth()+1
        if(mydate.getMonth()>9){
            str += mm;
        }
        else{
            str += "0" + mm;
        }
        if(mydate.getDate()>9){
            str += mydate.getDate();
        }
        else{
            str += "0" + mydate.getDate();
        }
        return str;
    }



    //hover 触发两个事件，鼠标移上去和移走
    //mousehover 只触发移上去事件
    $(".top-nav ul li").hover(function(){
        $(this).addClass("hover").siblings().removeClass("hover");
        $(this).find("li .nav a").addClass("hover");
        $(this).find(".con").show();
    },function(){
        //$(this).css("background-color","#f5f5f5");
        $(this).find(".con").hide();
        //$(this).find(".nav a").removeClass("hover");
        $(this).removeClass("hover");
        $(this).find(".nav a").removeClass("hover");
    });
    function add(obj){
        var value=parseInt($(obj).siblings("input").val())+1;
        $(obj).siblings("input").val(value);
    };

    function minus(obj){
        var num = $(obj).siblings("input").val()
        if(num>0){
            $(obj).siblings("input").val(num-1);
        }
    };
</script>
</body>
</html>