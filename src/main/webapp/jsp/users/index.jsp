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
	<title>孝和集团购物商城-为老年人设计的商城</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/style.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/media_index.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/mod.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
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

        $(document).ready(function(){

            $(".prev,.next").hover(function(){
                $(this).stop(true,false).fadeTo("show",0.9);
            },function(){
                $(this).stop(true,false).fadeTo("show",0.4);
            });

            $(".banner-box").slide({
                titCell:".hd ul",
                mainCell:".bd ul",
                effect:"fold",
                interTime:3500,
                delayTime:500,
                autoPlay:true,
                autoPage:true,
                trigger:"click"
            });

        });
	</script>
</head>
<body>

	
<header id="pc-header">
	<div class="pc-header-nav">
		<div class="pc-header-con">
			<div class="fl pc-header-link" >您好！欢迎来孝和集团电子商城
				<a href="login.jsp" target="_blank">请登录</a>
				<a href="register.jsp" target="_blank"> 免费注册</a>
			</div>
			<div class="fr pc-header-list top-nav">
				<ul>
					<li><a href="#">收藏夹</a></li>
					<li><a href="my-dingdan.jsp">我的订单</a></li>
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
			<a href="my-car.jsp" target="_blank">我的购物车</a>
			<em>10</em>
		</div>
	</div>
	<!--  顶部    start-->
	<div class="yHeader1">
		<!-- 导航   start  -->
		<div class="yNavIndex">
			<div class="pullDown">
				<h2 class="pullDownTitle"><i class="icon-class"></i>所有商品分类</h2>
				<ul class="pullDownList">
					<li>
						<div class="tx">
						<div class="tx1">
							<a href="#">
								<i> </i>
								<a href="#" target="_blank" style="font-size: 14px;">出行代步</a>
								<span></span>
							</a>
						</div>
						<dl class="one1">
							<dd>
								<a>电动轮椅 </a>
								<a>手动轮椅 </a>
								<a> . . .</a>
							</dd>
						</dl>
						</div>
					</li>
					<li>
						<div class="tx">
						<div class="tx2">
							<a href="#">
								<i> </i>
								<a href="#" target="_blank" style="font-size: 14px;">健康监测</a>
								<span></span>
							</a>
						</div>
						<dl class="one1">
							<dd>
								<a>血压血糖 </a>
								<a>运动监测 </a>
								<a> . . .</a>
							</dd>
						</dl>
						</div>
					</li>
					<li>
						<div class="tx">
							<div class="tx3">
								<a href="#">
									<i> </i>
									<a href="#" target="_blank" style="font-size: 14px;">康复护理</a>
									<span></span>
								</a>
							</div>
							<dl class="one1">
								<dd>
									<a>康复器材 </a>
									<a>护理器材 </a>
									<a> . . .</a>
								</dd>
							</dl>
						</div>
					</li>
					<li>
						<div class="tx">
							<div class="tx4">
								<a href="#">
									<i> </i>
									<a href="#" target="_blank" style="font-size: 14px;">生活日用</a>
									<span></span>
								</a>
							</div>
							<dl class="one1">
								<dd>
									<a>卫浴用品 </a>
									<a>饮食居家 </a>
									<a> . . .</a>
								</dd>
							</dl>
						</div>
					</li>
					<li>
						<div class="tx">
							<div class="tx5">
								<a href="#">
									<i> </i>
									<a href="#" target="_blank" style="font-size: 14px;">休闲娱乐</a>
									<span></span>
								</a>
							</div>
							<dl class="one1">
								<dd>
									<a>文房用具 </a>
									<a>健身用具 </a>
									<a> . . .</a>
								</dd>
							</dl>
						</div>
					</li>
					<li>
						<div class="tx">
							<div class="tx6">
								<a href="#">
									<i> </i>
									<a href="#" target="_blank" style="font-size: 14px;">医药保健</a>
									<span></span>
								</a>
							</div>
							<dl class="one1">
								<dd>
									<a>药品医疗 </a>
									<a>医药器材 </a>
									<a> . . .</a>
								</dd>
							</dl>
						</div>
					</li>
				</ul>

				<!-- 下拉详细列表具体分类 -->
				<div class="yMenuListCon">
					<div class="yMenuListConin">
						<div class="yMenuLCinList">
							<h3><a href="" class="yListName1">老年助行</a><a href="" class="yListMore">更多 ></a></h3>
							<dl>
								<dl>
									<%--<dt><a target="_blank" title="轮椅">轮椅 ></a></dt>--%>
									<dd>
										<a href="" target="_blank" title="轮椅">轮椅</a>
										<a href="" target="_blank" title="防滑拐杖">防滑拐杖</a>
										<a href="" target="_blank" title="代步车">代步车</a>
										<a href="" target="_blank" title="助行架">助行架</a>
										<a href="" target="_blank" title="老年购物车">老年购物车</a>
										<a href="" target="_blank" title="爬楼助行器">爬楼助行器 </a>
									</dd>
								</dl>
							</dl>
							<%--<dl>
								<dl>
									&lt;%&ndash;<dt><a href="" target="_blank" title="手动轮椅">手动轮椅 ></a></dt>&ndash;%&gt;
									<dd>
										<a href="" target="_blank" title="全躺轮椅">全躺轮椅</a>
										<a href="" target="_blank" title="半躺轮椅">半躺轮椅</a>
										<a href="" target="_blank" title="可折叠轮椅">可折叠轮椅</a>
										<a href="" target="_blank" title="带坐便轮椅">带坐便轮椅</a>
										<a href="" target="_blank" title="站立式轮椅">站立式轮椅</a>
										<a href="" target="_blank" title="站立式轮椅">爬楼电动轮椅</a>
									</dd>
								</dl>
							</dl>--%>
						</div>
					</div>

					<div class="yMenuListConin">
						<div class="yMenuLCinList">
							<h3><a href="" class="yListName2">老年健康</a><a href="" class="yListMore">更多 ></a></h3>
							<dl>
								<dl>
									<%--<dt><a href="" target="_blank" title="健康检查">保健器械 ></a></dt>--%>
									<dd>
										<a href="" target="_blank" title="血压计">血压计</a>
										<a href="" target="_blank" title="血糖仪">血糖仪</a>
										<a href="" target="_blank" title="助听器">助听器</a>
										<a href="" target="_blank" title="制氧机">制氧机</a>
										<a href="" target="_blank" title="呼吸机">呼吸机</a>
										<a href="" target="_blank" title="雾化机">雾化机</a>
									</dd>
								</dl>
							</dl>
						</div>
					</div>
					<div class="yMenuListConin">
						<div class="yMenuLCinList">
							<h3><a href="" class="yListName3">老年护理</a><a href="" class="yListMore">更多 ></a></h3>
							<dl>
								<dl>
									<%--<dt><a href="" target="_blank" title="电动轮椅">电动轮椅 ></a></dt>--%>
									<dd>
										<a href="" target="_blank" title="护理床">护理床</a>
										<a href="" target="_blank" title="理疗仪">理疗仪</a>
										<a href="" target="_blank" title="护理充气垫">可折叠轮椅</a>
										<a href="" target="_blank" title="老年尿不湿">老年尿不湿</a>
										<a href="" target="_blank" title="关节按摩器">关节按摩器</a>
										<a href="" target="_blank" title="护理坐垫">护理坐垫</a>
									</dd>
								</dl>
							</dl>
						</div>
					</div>
					<div class="yMenuListConin">
						<div class="yMenuLCinList">
							<h3><a href="" class="yListName4">老年居家</a><a href="" class="yListMore">更多 ></a></h3>
							<dl>
								<dl>
									<%--<dt><a href="" target="_blank" title="电动轮椅">电动轮椅 ></a></dt>--%>
									<dd>
										<a href="" target="_blank" title="扶手坐便器">扶手坐便器</a>
										<a href="" target="_blank" title="防滑浴室椅">防滑浴室椅</a>
										<a href="" target="_blank" title="便携坐厕椅">便携坐厕椅</a>
										<a href="" target="_blank" title="老年益齿盒">老年益齿盒</a>
										<a href="" target="_blank" title="软毛浴刷">软毛浴刷</a>
										<a href="" target="_blank" title="老年保健球">老年保健球</a>
									</dd>
								</dl>
							</dl>
						</div>
					</div>
					<div class="yMenuListConin">
						<div class="yMenuLCinList">
							<h3><a href="" class="yListName5">老年娱乐</a><a href="" class="yListMore">更多 ></a></h3>
							<dl>
								<dl>
									<%--<dt><a href="" target="_blank" title="电动轮椅">电动轮椅 ></a></dt>--%>
									<dd>
										<a href="" target="_blank" title="文房四宝">文房四宝</a>
										<a href="" target="_blank" title="全自动麻将桌">收音机</a>
										<a href="" target="_blank" title="中国象棋">中国象棋</a>
										<a href="" target="_blank" title="太空漫步机">太空漫步机</a>
										<a href="" target="_blank" title="转腰器">茶具</a>
										<a href="" target="_blank" title="纸牌">太极</a>
									</dd>
								</dl>
							</dl>
						</div>
					</div>
					<div class="yMenuListConin">
						<div class="yMenuLCinList">
							<h3><a href="" class="yListName6">老年保健</a><a href="" class="yListMore">更多 ></a></h3>
							<dl>
								<dl>
									<%--<dt><a href="" target="_blank" title="电动轮椅">电动轮椅 ></a></dt>--%>
									<dd>
										<a href="" target="_blank" title="老年奶粉">老年奶粉</a>
										<a href="" target="_blank" title="老年钙片">老年钙片</a>
										<a href="" target="_blank" title="燕窝">燕窝</a>
										<a href="" target="_blank" title="人参">人参</a>
										<a href="" target="_blank" title="助睡眠药品">助睡眠药品</a>
										<a href="" target="_blank" title="降三高药品">降三高药品</a>
									</dd>
								</dl>
							</dl>
						</div>
					</div>

				</div>

			</div>
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
	<section>
		<div class="wraper">
			<section id="main" class="site-main clear_bottom">
				<section class="main-right">
					<div class="slider">
						<ul class="contain">
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/index_slider_pic1.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/index_slider_pic2.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/index_slider_pic3.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/index_slider_pic4.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/index_slider_pic5.jpg"></a></li>
						</ul>
					</div>
				</section>
			</section>
		</div>

		<section id="adv" class="wraper site-adv m-box clear_bottom">
			<div class="span4">
				<ul class="rect6">
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
				</ul>
			</div>
			<div class="span16">
			</div>

		</section>
		<!--中部区域结束-->

		<!--上市新品开始-->
		<section id="sku" class="wraper m-box mi-sku">
			<input type="radio" id="sku-s1" class="sku-switch s1" name="sku-switch" hidden checked>
			<input type="radio" id="sku-s2" class="sku-switch s2" name="sku-switch" hidden>
			<header class="m-hd">
				<h2 class="m-hdL">上市新品</h2>
				<div class="m-hdR">
					<div class=" btns2">
						<a href="#" class="btn btn1 active"><label for="sku-s1">&lt;</label></a>
						<a href="#" class="btn btn2"><label for="sku-s2">&gt;</label></a>
					</div>
				</div>
			</header>
			<div class="m-box">
				<section class="span20 m-slide">
					<div class="m-slide-contain m-s2">
						<div class="m-slide-item">
							<ul class="m-cols m-col-5">
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single1.png"></dt>
										<dd class="name"><a href="page.jsp">小米电视3S 43英寸</a></dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single2.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single3.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single4.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single5.jpg"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
							</ul>
						</div>
						<div class="m-slide-item">
							<ul class="m-cols m-col-5">
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single6.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single10.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single7.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single8.png"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
								<li class="col sku-item ">
									<dl class="row">
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/single/single9.jpg"></dt>
										<dd class="name">小米电视3S 43英寸</dd>
										<dd class="desc">4GB内存+128GB闪存，陶瓷版</dd>
										<dd class="price">1499元</dd>
									</dl>
								</li>
							</ul>
						</div>
					</div>
				</section>
			</div>

		</section>
		<!--上市新品结束-->
		<div class="gray-section">
			<!--热销商品开始-->
			<section class="wraper mi-hard clear_bottom" id="hard">
				<header class="m-hd">
					<h2 class="m-hdL">热销商品</h2>
					<div class="m-hdR">
						<div class="scan">
							<span>查看全部</span>
							<a href="#" class="icon">&gt;</a>
						</div>
					</div>
				</header>
				<section class="m-box line2">
					<div class="span4">
						<div class="row main-pic">
							<img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/row2Img.jpg">
						</div>
					</div>
					<div class="span16">
						<ul class="m-cols m-col-4">
							<li class="col">
								<div class="row">
									<a href="page.jsp">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/lndbc1.png"></dt>
										<dd class="name">老年代步车</dd>
										<dd class="desc">老年人手推轻便购物代步车</dd>
										<dd class="price">1149元</dd>
									</dl>
									</a>
								</div>
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/fhgz1.1.png"></dt>
										<dd class="name">防滑拐杖</dd>
										<dd class="desc">老年出行更安全</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
							</li>
							<li class="col">
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/wfsb5.1.jpg"></dt>
										<dd class="name">笔墨纸砚</dd>
										<dd class="desc">文房四宝，老年娱乐</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/whj1.1.gif"></dt>
										<dd class="name">雾化器</dd>
										<dd class="desc">治疗各种呼吸系统疾病</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
							</li>
							<li class="col">
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/sdly1.1.gif"></dt>
										<dd class="name">手动轮椅</dd>
										<dd class="desc">残疾人轮椅代步</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/tkmbj1.1.png"></dt>
										<dd class="name">太空漫步机</dd>
										<dd class="desc">老年运动，活动关节腿脚</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
							</li>
							<li class="col">
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/zxq1.1.gif"></dt>
										<dd class="name">老年代步车</dd>
										<dd class="desc">半辅助老年行走，方便安全</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
								<div class="row">
									<span class="tip orange">月销1000</span>
									<dl>
										<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/xyj1.1.png"></dt>
										<dd class="name">血压计</dd>
										<dd class="desc">实时测量血压，了解血压高低</dd>
										<dd class="price">149元</dd>
									</dl>
								</div>
							</li>
						</ul>
					</div>
				</section>
			</section>
			<!--热销商品结束-->

			<!--热评商品开始-->
			<section class="wraper mi-match clear_bottom" id="match">
				<input type="radio" id="match-s1" class="match-switch s1" name="match-switch" hidden checked>
				<input type="radio" id="match-s2" class="match-switch s2" name="match-switch" hidden>
				<input type="radio" id="match-s3" class="match-switch s3" name="match-switch" hidden>
				<input type="radio" id="match-s4" class="match-switch s4" name="match-switch" hidden>
				<header class="m-hd">
					<h2 class="m-hdL">热评商品</h2>
					<div class="m-hdR">
						<ul class="tabs">
							<li class="item active tab tab1"><a href="#"><label for="match-s1">出行</label></a></li>
							<li class="item tab tab2"><a href="#"><label for="match-s2">健康</label></a></li>
							<li class="item tab tab3"><a href="#"><label for="match-s3">居家</label></a></li>
							<li class="item tab tab4"><a href="#"><label for="match-s4">娱乐</label></a></li>
						</ul>
					</div>
				</header>
				<section class="m-box line2  clear_top  clear_bottom">
					<div class="span4">
						<div class="row main-pic">
							<img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/row2Img.jpg">
						</div>
					</div>
					<div class="span16">
						<!--滑动切换的模块-->
						<div class="m-slide">
							<div class="m-slide-contain m-s4">
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
												<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/ly1.1.jpg"></dt>
													<dd class="name">电动轮椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/ly3.1.jpg"></dt>
													<dd class="name">电动轮椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>

												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/sdly2.1.gif"></dt>
													<dd class="name">手动轮椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/ly4.1.jpg"></dt>
													<dd class="name">轮椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/ly5.1.jpg"></dt>
													<dd class="name">轮椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/zxq2.1.gif"></dt>
													<dd class="name">助行器</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/dbc2.1.png"></dt>
													<dd class="name">代步车</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/fhgz2.1.png"></dt>
													<dd class="name">防滑拐杖</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
												<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/xty2.1.jpg"></dt>
													<dd class="name">血糖仪</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/xyj1.2.png"></dt>
													<dd class="name">血压计</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/zyj1.2.jpg"></dt>
													<dd class="name">制氧机</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/ztq1.2.png"></dt>
													<dd class="name">助听器</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/gjamq2.1.jfif"></dt>
													<dd class="name">关节按摩器</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/hlc2.3.jpg"></dt>
													<dd class="name">护理床</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/lnnbs2.2.gif"></dt>
													<dd class="name">老年尿不湿</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="简单易懂便携，十分适合老人" from="来自于chh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/lly2.1.gif"></dt>
													<dd class="name">理疗仪</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
												<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/fhyy2.1.png"></dt>
													<dd class="name">防滑浴椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/lnych1.1.jpg"></dt>
													<dd class="name">老年益齿盒</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/rmys3.1.jpg"></dt>
													<dd class="name">软毛浴刷</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/zcy1.1.jpg"></dt>
													<dd class="name">坐厕椅</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/jsq3.2.jpg"></dt>
													<dd class="name">老年保健球</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/rmys5.1.jpg"></dt>
													<dd class="name">软毛浴刷</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/fdj.JPG"></dt>
													<dd class="name">放大镜</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="在家使用安全方便，不占地方" from="来自于h的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/zlj.jpg"></dt>
													<dd class="name">足浴盆</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
												<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/syj2.5.gif"></dt>
													<dd class="name">收音机</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/tjj2.3.jpg"></dt>
													<dd class="name">太极剑</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/tkmbj1.1.png"></dt>
													<dd class="name">太空漫步机</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/wfsb6.1.jpg"></dt>
													<dd class="name">文房四宝</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/zgxq3.1.jpg"></dt>
													<dd class="name">中国象棋</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/ddch.jpg"></dt>
													<dd class="name">电动茶壶</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/gjxq.jpg"></dt>
													<dd class="name">国际象棋</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row" content="老人闲时娱乐，打发时间" from="来自于hhh的评价">
											<span class="tip blue">18.7万人评价</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rpsp/eh.jpg"></dt>
													<dd class="name">二胡</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</section>
			</section>
			<!--热评商品结束-->

			<!--积分商城开始-->
			<section class="wraper mi-parts" id="parts">
				<input type="radio" id="parts-s1" class="parts-switch s1" name="parts-switch" hidden checked>
				<input type="radio" id="parts-s2" class="parts-switch s2" name="parts-switch" hidden>
				<input type="radio" id="parts-s3" class="parts-switch s3" name="parts-switch" hidden>
				<input type="radio" id="parts-s4" class="parts-switch s4" name="parts-switch" hidden>
				<header class="m-hd">
					<h2 class="m-hdL">积分商品</h2>
					<div class="m-hdR">
						<ul class="tabs">
							<li class="item active tab tab1"><a href="#"><label for="parts-s1">积分兑换商品</label></a></li>
							<%--<li class="item tab tab2"><a href="#"><label for="parts-s2">保护膜</label></a></li>
							<li class="item tab tab3"><a href="#"><label for="parts-s3">贴膜</label></a></li>
							<li class="item tab tab4"><a href="#"><label for="parts-s4">其他配件</label></a></li>--%>
						</ul>
					</div>
				</header>
				<section class="m-box line2">
					<div class="span4">
						<div class="main-pic">
							<img src="./images/rxsp/row2Img.jpg">
						</div>
					</div>
					<div class="span16">
						<div class="m-slide">
							<div class="m-slide-contain m-s4">
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row">
												<span class="tip orange">需100积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/jsgyp1.1.jpg"></dt>
													<dd class="name">降三高药品</dd>
													<dd class="desc">降低血糖血压血脂</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">需1000积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/lnnf8.1.jpg"></dt>
													<dd class="name">老年奶粉</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">需100积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/hlzd3.1.jpg"></dt>
													<dd class="name">护理坐垫</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">需1000积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/xty3.2.jpg"></dt>
													<dd class="name">血糖仪</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">需100积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/wfsb6.1.jpg"></dt>
													<dd class="name">文房四宝</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">需1000积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/zsmyp4.1.jpg"></dt>
													<dd class="name">助睡眠药品</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">需100积分</span>
												<dl>
													<dt><img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/zxq2.1.gif"></dt>
													<dd class="name">助行器</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row row_half small-intro">
												<div class="small-introL">
													<b>折叠防滑拐杖</b>
													<small>79元</small>
												</div>
												<div class="small-introR">
													<img src="${pageContext.request.contextPath}/jsp/users/images/jfsc/fhgz2.2.png">
												</div>
											</div>
											<div class="row row_half scan-more">
												<div class="scan-moreL">
													<b>浏览更多</b>
													<small>兑换超值商品</small>
												</div>
												<div class="scan-moreR icon"></div>
											</div>
										</li>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row row_half small-intro">
												<div class="small-introL">
													<b>小米小钢炮</b>
													<small>79元</small>
												</div>
												<div class="small-introR">
													<img src="./images/smallpj/pj1.jpg">
												</div>
											</div>
											<div class="row row_half scan-more">
												<div class="scan-moreL">
													<b>浏览更多</b>
													<small>热门</small>
												</div>
												<div class="scan-moreR icon"></div>
											</div>
										</li>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row row_half small-intro">
												<div class="small-introL">
													<b>小米小钢炮</b>
													<small>79元</small>
												</div>
												<div class="small-introR">
													<img src="./images/smallpj/pj1.jpg">
												</div>
											</div>
											<div class="row row_half scan-more">
												<div class="scan-moreL">
													<b>浏览更多</b>
													<small>热门</small>
												</div>
												<div class="scan-moreR icon"></div>
											</div>
										</li>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row">
												<span class="tip blue">有赠品</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
										</li>
										<li class="col">
											<div class="row">
												<span class="tip orange">免邮件</span>
												<dl>
													<dt><img src="./images/pj/pj1.jpg"></dt>
													<dd class="name">小米路由器3</dd>
													<dd class="desc">四天线设计，更安全更稳定</dd>
													<dd class="price">149元</dd>
												</dl>
											</div>
											<div class="row row_half small-intro">
												<div class="small-introL">
													<b>小米小钢炮</b>
													<small>79元</small>
												</div>
												<div class="small-introR">
													<img src="./images/smallpj/pj1.jpg">
												</div>
											</div>
											<div class="row row_half scan-more">
												<div class="scan-moreL">
													<b>浏览更多</b>
													<small>热门</small>
												</div>
												<div class="scan-moreR icon"></div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</section>
			</section>
			<!--积分商城结束-->

			<!--为你推荐开始-->
			<section id="recommend" class="wraper mi-recommend">
				<input type="radio" id="recommend-s1" class="recommend-switch s1" name="recommend-switch" hidden checked>
				<input type="radio" id="recommend-s2" class="recommend-switch s2" name="recommend-switch" hidden>
				<header class="m-hd">
					<h2 class="m-hdL">为你推荐</h2>
					<div class="m-hdR btns2">
						<div class="btns2">
							<div href="#" class="btn btn1"><label for="recommend-s1">&lt;</label></div>
							<div href="#" class="btn btn2"><label for="recommend-s2">&gt;</label></div>
						</div>
					</div>
				</header>
				<section class="m-box">
					<div class="m-slide">
						<div class="m-slide-contain m-s2">
							<div class="m-slide-item">
								<ul class="m-cols m-col-5">
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/amy.jpg"></dt>
												<dd class="name">按摩椅</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/amz.jpg"></dt>
												<dd class="name">按摩枕</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/bjz.jpg"></dt>
												<dd class="name">保健枕</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/crllk.jpg"></dt>
												<dd class="name">成人拉拉裤</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/cy.jpg"></dt>
												<dd class="name">金黄嫩茶叶</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
								</ul>
							</div>
							<div class="m-slide-item">
								<ul class="m-cols m-col-5">
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/fhd.jpg"></dt>
												<dd class="name">防滑垫</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/jrcd.jpg"></dt>
												<dd class="name">加热床垫</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/pgzbq.jpg"></dt>
												<dd class="name">皮革坐便器</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/zlj.jpg"></dt>
												<dd class="name">足疗机</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/wntj/zyp.jpg"></dt>
												<dd class="name">足浴盆</dd>
												<dd class="price">149元</dd>
												<dd class="cmt">999人已购买</dd>
											</dl>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</section>
			</section>
			<!--为你推荐结束-->


			<!--店家推荐开始-->
			<section id="comment" class="wraper mi-hotCmtProd">
				<header class="m-hd">
					<h2 class="m-hdL">店家推荐</h2>
					<ul class="m-hdR">
						<li></li>
					</ul>
				</header>
				<section class="m-box">
					<ul class="m-cols m-col-4">
						<li class="col">
							<div class="row">
								<img src="${pageContext.request.contextPath}/jsp/users/images/djtj/djzbp.jpg">
								<div style="border-bottom: 1px #CCCCCC solid"></div>
								<div class="content">
									<div class="from">推荐理由</div>
									<div class="cmt">
										冬季滋补，把玉树冬虫夏草带给老年人，精美礼盒包装送礼佳品，品质保障
									</div>
									<a href="#" class="name">冬季滋补品</a>
									<a href="#" class="price">1699元</a>
								</div>
							</div>
						</li>
						<li class="col">
							<div class="row">
								<img src="${pageContext.request.contextPath}/jsp/users/images/djtj/yyllc.jpg">
								<div style="border-bottom: 1px #CCCCCC solid"></div>
								<div class="content">
									<div class="from">推荐理由</div>
									<div class="cmt">
										冬季滋补，把玉树冬虫夏草带给老年人，精美礼盒包装送礼佳品，品质保障
									</div>
									<a href="#" class="name">医用理疗车</a>
									<a href="#" class="price">1699元</a>
								</div>
							</div>
						</li>
						<li class="col">
							<div class="row">
								<img src="${pageContext.request.contextPath}/jsp/users/images/djtj/fdjzjq.jpg">
								<div style="border-bottom: 1px #CCCCCC solid"></div>
								<div class="content">
									<div class="from">推荐理由</div>
									<div class="cmt">
										冬季滋补，把玉树冬虫夏草带给老年人，精美礼盒包装送礼佳品，品质保障
									</div>
									<a href="#" class="name">放大镜指甲钳</a>
									<a href="#" class="price">1699元</a>
								</div>
							</div>
						</li>
						<li class="col">
							<div class="row">
								<img src="${pageContext.request.contextPath}/jsp/users/images/djtj/rs.jpg">
								<div style="border-bottom: 1px #CCCCCC solid"></div>
								<div class="content">
									<div class="from">推荐理由</div>
									<div class="cmt">
										冬季滋补，把玉树冬虫夏草带给老年人，精美礼盒包装送礼佳品，品质保障
									</div>
									<a href="#" class="name">人参</a>
									<a href="#" class="price">1699元</a>
								</div>
							</div>
						</li>
					</ul>
				</section>
			</section>
			<!--店家推荐结束-->

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
						<div class="fl lss-img"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/code.png" alt=""></div>
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
</header>
</body>
</html>