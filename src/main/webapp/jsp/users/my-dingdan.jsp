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
	<meta charset="UTF-8">
	<meta name="Generator" content="EditPlus®">
	<meta name="Author" content="">
	<meta name="Keywords" content="">
	<meta name="Description" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta name="renderer" content="webkit">
	<title>购物商城-我的订单</title>
	<link rel="shortcut icon" type="image/x-icon" href="img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/home.css">
	<link rel="stylesheet" type="text/css" href="css/member.css">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript" src="js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
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
<!--
	<div class="pc-header-nav">
		<div class="pc-header-con">
			<div class="fl pc-header-link" >您好！，欢迎来云购物 <a href="login.html" target="_blank">请登录</a> <a href="register.html" target="_blank"> 免费注册</a></div>
			<div class="fr pc-header-list top-nav">
				<ul>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">我的订单</a></div>
						<div class="con">
							<dl>
								<dt><a href="">批发进货</a></dt>
								<dd><a href="">已买到货品</a></dd>
								<dd><a href="">优惠券</a></dd>
								<dd><a href="">店铺动态</a></dd>
							</dl>
						</div>
					</li>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">我的商城</a></div>
						<div class="con">
							<dl>
								<dt><a href="">批发进货</a></dt>
								<dd><a href="">已买到货品</a></dd>
								<dd><a href="">优惠券</a></dd>
								<dd><a href="">店铺动态</a></dd>
							</dl>
						</div>
					</li>
					<li><a href="#">我的云购</a></li>
					<li><a href="#">我的收藏</a></li>
					<li><a href="#">会员中心</a></li>
					<li><a href="#">客户服务</a></li>
					<li><a href="#">帮助中心</a></li>
				</ul>
			</div>
		</div>
	</div>
-->
	<div class="pc-header-nav">
		<div class="pc-header-con">
			<div class="fl pc-header-link" >您好！，欢迎来孝和集团电子商城 
				<a href="login.html" target="_blank">请登录</a> 
				<a href="register.html" target="_blank"> 免费注册</a>
			</div>
			<div class="fr pc-header-list top-nav">
				<ul>
					<li><a href="#">我的收藏</a></li>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">个人中心</a></div>
						<div class="con">
							<dl>
								<dt><a href="">个人资料</a></dt>
								<dd><a href="">收货地址</a></dd>
								<dd><a href="">修改登录密码</a></dd>
								<dd><a href="">我的积分</a></dd>
								<dd><a href="">已购买的宝贝</a></dd>
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
					<p><a href="#">亚里士多德</a></p>
					<p>账号：</p>
					<p>389323080</p>
				</div>
			</div>
			<div class="member-lists" id="leftinfo">
				<dl  onclick = "change(this);">
					<dt>我的商城</dt>
					<dd><a href="#">我的订单</a></dd>
					<dd><a href="#">我的收藏</a></dd>
					<dd><a href="#">账户安全</a></dd>
					<dd><a href="#">我的评价</a></dd>
					<dd><a href="#">地址管理</a></dd>
				</dl>
				<dl  onclick = "change(this);">
					<dt>客户服务</dt>
					<dd><a href="#">退货申请</a></dd>
					<dd><a href="#">退货/退款记录</a></dd>
				</dl>
			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"><h2>我的订单</h2></div>
				<div class="member-backs member-icons fr"><a href="#">搜索</a></div>
				<div class="member-about fr"><input placeholder="商品名称/商品编号/订单编号" type="text"></div>
			</div>
			<div class="member-whole clearfix" id="dingdan">
				<ul id="H-table" class="H-table">
					<li class="cur"><a href="#">全部订单</a></li>
					<li><a href="#">待发货</a></li>
					<li><a href="#">已发货</a></li>
					<li><a href="#">已签收</a></li>
					<li><a href="#">确认收货</a></li>
					<li><a href="#">待付款<em>(44)</em></a></li>
					<li><a href="#">交易完成</a></li>
				</ul>
			</div>
			<div class="member-border">
				<div class="member-return H-over">
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
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><p class="red">￥<span>69.00</span></p><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>等待付款</p> <p><a href="#">物流跟踪</a></p> <p><a href="#">订单详情</a></p></div>
									<div class="ci5 ci8"><p>剩余15时20分</p> <p><a href="#" class="member-touch">立即支付</a> </p> <p><a href="#">取消订单</a> </p></div>
								</div>
							</li>
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><p class="red">￥<span>69.00</span></p><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>等待卖家发货 </p> <p><a href="#">订单详情</a></p></div>
									<div class="ci5 ci8"><p><a href="#" class="member-touch">提醒发货</a> </p> <p><a href="#">取消订单</a> </p><p><a href="#">申请退款</a> </p></div>
								</div>
							</li>
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><p class="red">￥<span>69.00</span></p><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>已完成</p> <p><a href="#">订单详情</a></p></div>
									<div class="ci5 ci8"><p><a href="#" class="member-touch">确认收货</a></p><p><a href="#" class="member-touch">评论</a></p><p><a href="#">申请退货</a></p> <p></p></div>
								</div>
							</li>
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><p class="red">￥<span>69.00</span></p><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>交易关闭</p> <p><a href="#">订单详情</a></p></div>
								</div>
							</li>
						</ul>
					</div>
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
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span><a href="#">以纯甲醇旗舰店</a></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="../theme/img/pd/m1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="../theme/img/pd/m2.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><b>￥120.00</b><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>已申请退货</p> <p><a href="#">退货日志</a></p></div>
									<div class="ci6"><p><a href="#">取消退货</a> </p></div>
								</div>
							</li>
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span><a href="#">以纯甲醇旗舰店</a></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="../theme/img/pd/m1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="../theme/img/pd/m2.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><b>￥120.00</b><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>已完成</p> <p><a href="#">订单详情</a></p></div>
									<div class="ci6"><p><a href="#">取消退货</a> </p></div>
								</div>
							</li>
							<li>
								<div class="member-minute clearfix">
									<span>2015-09-22 18:22:33</span>
									<span>订单号：<em>98653056821</em></span>
									<span><a href="#">以纯甲醇旗舰店</a></span>
									<span class="member-custom">客服电话：<em>010-6544-0986</em></span>
								</div>
								<div class="member-circle clearfix">
									<div class="ci1">
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="../theme/img/pd/m1.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
											<span class="gr3">X1</span>
										</div>
										<div class="ci7 clearfix">
											<span class="gr1"><a href="#"><img src="../theme/img/pd/m2.png" title="" about="" width="60" height="60"></a></span>
											<span class="gr2"><a href="#">AXON天机mini NBA限量版</a></span>
											<span class="gr3">X9</span>
										</div>
									</div>
									<div class="ci2">张子琪</div>
									<div class="ci3"><b>￥120.00</b><p>货到付款</p><p class="iphone">手机订单</p></div>
									<div class="ci4"><p>2015-09-22</p></div>
									<div class="ci5"><p>已完成</p> <p><a href="#">订单详情</a></p></div>
									<div class="ci6"><p><a href="#">取消退货</a> </p></div>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="H-over member-over" style="display:none;"><h2>待发货</h2></div>
				<div class="H-over member-over" style="display:none;"><h2>待收货</h2></div>
				<div class="H-over member-over" style="display:none;"><h2>交易完成</h2></div>
				<div class="H-over member-over" style="display:none;"><h2>订单信息</h2></div>

				<div class="clearfix" style="padding:30px 20px;">
					<div class="fr pc-search-g pc-search-gs">
						<a style="display:none" class="fl " href="#">上一页</a>
						<a href="#" class="current">1</a>
						<a href="javascript:;">2</a>
						<a href="javascript:;">3</a>
						<a href="javascript:;">4</a>
						<a href="javascript:;">5</a>
						<a href="javascript:;">6</a>
						<a href="javascript:;">7</a>
						<span class="pc-search-di">…</span>
						<a href="javascript:;">1088</a>
						<a title="使用方向键右键也可翻到下一页哦！" class="" href="javascript:;">下一页</a>
					</div>
				</div>

			</div>
		</div>
	</div>
</section>


<div style="height:100px"></div>

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
<script type="text/javascript">
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
    })
</script>
</body>
</html>