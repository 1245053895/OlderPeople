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

<%--	<link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/index/style.css" rel="stylesheet" type="text/css">
	<link href="${pageContext.request.contextPath}/jsp/users/jfsc/css/index/top.css" rel="stylesheet" type="text/css">--%>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/jfsc/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/jfsc/js/jquery.cookie.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/jfsc/js/juzi.js"></script>
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
</head>
<body>

<header id="pc-header">

	<c:if test="${ products==null|| hotsaleproducts==null|| top10products==null|| creditproducts==null|| jiankang==null|| jujia==null|| yule==null||  Recommendations==null}">
		<jsp:forward page="${pageContext.request.contextPath}/selectproduct.action"></jsp:forward>
	</c:if>
	<c:if test="${ Recomend==null}">
		<jsp:forward page="${pageContext.request.contextPath}/SelectRecommed.action"></jsp:forward>
	</c:if>

	<%--<c:if test="${empty productTypeExtends1||empty productTypeExtends}">
		<jsp:forward page="${pageContext.request.contextPath}/ShopFrontPage.action"></jsp:forward>
	</c:if>--%>

	<jsp:include page="/jsp/users/head.jsp"></jsp:include>

	<!--  顶部    start-->
	<div class="yHeader1" style="margin:0px auto;">
		<!-- 导航   start  -->
		<div class="yNavIndex">
			<div class="pullDown">
				<h2 class="pullDownTitle"><i class="icon-class"></i>所有商品分类</h2>
				<ul class="pullDownList">

					<c:forEach items="${productTypeExtends}" var="productTypeExtend" varStatus="status">
						<li>
							<div class="tx">
								<div class="tx${status.count}">
									<a href="#">
										<i> </i>
											<a  href="${pageContext.request.contextPath}/SelectProductType.action?productTypeId=${productTypeExtend.producttypeid}"  style="font-size: 14px;">${productTypeExtend.producttypename}</a>
										<span></span>
									</a>
								</div>
								<dl class="one1">
									<dd>
										<c:forEach items="${productTypeExtend.product}" var="product">

											<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}">${product.productname}</a>
										</c:forEach>
									</dd>

								</dl>
							</div>
						</li>
					</c:forEach>
				</ul>
				<!-- 下拉详细列表具体分类 -->
				<div class="yMenuListCon">

					<c:forEach items="${productTypeExtends1}" var="productTypeExtendss1"  varStatus="status">
						<div class="yMenuListConin">
							<div class="yMenuLCinList" >
								<h3><a href="" class="yListName${status.count}">${productTypeExtendss1.producttypename}</a><a href="" class="yListMore">更多 ></a></h3>
								<dl>
									<dl>
										<%--<dt><a href="" target="_blank" title="健康检查">保健器械 ></a></dt>--%>
										<dd>
											<c:forEach items="${productTypeExtendss1.product}" var="product1">
												<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product1.productid}" target="_blank" >${product1.productname}</a>
											</c:forEach>
										</dd>
									</dl>
								</dl>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
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
	<section>
		<div class="wraper">
			<section id="main" class="site-main clear_bottom">
				<section class="main-right">
					<div class="slider">
						<ul class="contain">
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/lbztq.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/lbly.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/lbch.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/lbghl.jpg"></a></li>
							<li class="item"><a href="#" alt=""><img src="${pageContext.request.contextPath}/jsp/users/images/lbwfsb.jpg"></a></li>
						</ul>
					</div>
				</section>
			</section>
		</div>
		<section class="row1">
			<ul class="service1">
				<li class="s1">
					<div class="title">
						卓越品质
					</div>
					正品保障
					<br>
					放心购物
				</li>
				<li class="s2">
					<div class="title">
						积分兑换商品
					</div>
					有机会享受
					<br>
					0元购物
				</li>
				<li class="s3">
					<div class="title">
						专业配送
					</div>
					快速安全
					<br>
					保证商品完好
				</li>
				<li class="s4">
					<div class="title">
						金牌服务
					</div>
					为您呈现最优服务
					<br>
					售后无忧
				</li>
				<div class="clear">
				</div>
			</ul>
		</section>
		<%--<section id="adv" class="wraper site-adv m-box clear_bottom">
			&lt;%&ndash;<div class="span4">
				<ul class="rect6">
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
					<li class="item"></li>
				</ul>
			</div>&ndash;%&gt;

				<ul class="m-cols m-col-3">
					<li class="col"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuanchang1.jpg"></li>
					<li class="col"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuanchang2.jpg"></li>
					<li class="col"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuanchang3.jpg"></li>
					<li class="col"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuanchang4.jpg"></li>
				</ul>


		</section>--%>
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
			<div class="m-box" style="height:700px;">
				<section class="span20 m-slide"  style="height: 330px">
					<div class="m-slide-contain m-s2" >
						<div class="m-slide-item" >
							<ul class="m-cols m-col-5" >
								<c:forEach begin="0" end="4" step="1" items="${products}" var="product">
								<li class="col sku-item " >
									<dl class="row" >
										<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}"><img src="${product.productpicture}"></a></dt>
										<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}">${product.productname}</a></dd>
										<dd class="desc">${product.productdescribe}</dd>
										<dd class="price">${product.productprice}</dd>
									</dl>
								</li>
								</c:forEach>
							</ul>
						</div>
						<div class="m-slide-item">
							<ul class="m-cols m-col-5">
								<c:forEach begin="5" end="9" step="1" items="${products}" var="product">
									<li class="col sku-item ">
										<dl class="row">
											<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}"><img src="${product.productpicture}"></a></dt>
											<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}">${product.productname}</a></dd>
											<dd class="desc">${product.productdescribe}</dd>
											<dd class="price">${product.productprice}</dd>
										</dl>
									</li>
								</c:forEach>

							<%--
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
								</li>--%>

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
							<span><a href="${pageContext.request.contextPath}/ProductHot.action">查看全部</a></span>
							<a href="#" class="icon">&gt;</a>
						</div>
					</div>
				</header>
				<section class="m-box line2">
					<div class="span4">
						<div class="row main-pic">
							<img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/left2.jpg">
						</div>
					</div>
					<div class="span16">
						<ul class="m-cols m-col-4">
							<c:forEach items="${hotsaleproducts}" var="hotsaleproduct" varStatus="status">
								<c:if test="${status.index%2==0}">
									<li class="col">
										<div class="row">
											<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${hotsaleproduct.productid}">
												<span class="tip orange">销量${hotsaleproduct.totalhotsale}</span>
												<dl>
													<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${hotsaleproduct.productid}"><img src="${hotsaleproduct.productpicture}"></a></dt>
													<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${hotsaleproduct.productid}">${hotsaleproduct.productname}</a></dd>
													<dd class="desc">${hotsaleproduct.productdescribe}</dd>
													<dd class="price">${hotsaleproduct.productprice}</dd>
												</dl>
											</a>
										</div>
								</c:if>

								<c:if test="${status.index%2==1}">
										<div class="row">
											<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${hotsaleproduct.productid}">
												<span class="tip blue">销量${hotsaleproduct.totalhotsale}</span>
												<dl>
													<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${hotsaleproduct.productid}"><img src="${hotsaleproduct.productpicture}"></a></dt>
													<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${hotsaleproduct.productid}">${hotsaleproduct.productname}</a></dd>
													<dd class="desc">${hotsaleproduct.productdescribe}</dd>
													<dd class="price">${hotsaleproduct.productprice}</dd>
												</dl>
											</a>
										</div>
									</li>
								</c:if>
							</c:forEach>

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
							<img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/left1.jpg">
						</div>
					</div>
					<div class="span16">
						<!--滑动切换的模块-->
						<div class="m-slide">
							<div class="m-slide-contain m-s4">
								<%--出行--%>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">

									<c:forEach items="${top10products}" var="top10product" varStatus="status">
										<c:if test="${status.index%2==0}">
											<li class="col">
												<div class="row" content="${top10product.comment}" from="来自于${top10product.username}的评价">
													<span class="tip blue">${top10product.totalcomment}万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${top10product.productid}"><img src="${top10product.productpicture}"></a></dt>
														<dd class="name">${top10product.productname}</dd>
														<dd class="price">${top10product.productprice}</dd>
													</dl>
												</div>
											</c:if>
											<c:if test="${status.index%2==1}">
													<div class="row" content="${top10product.comment}" from="来自于${top10product.username}的评价">
														<span class="tip blue">${top10product.totalcomment}万人评价</span>
														<dl>
															<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${top10product.productid}"><img src="${top10product.productpicture}"></a></dt>
															<dd class="name">${top10product.productname}</dd>
															<dd class="price">${top10product.productprice}</dd>
														</dl>
													</div>
												</li>
											</c:if>
										</c:forEach>
									</ul>
								</div>
									<%--健康--%>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">

										<c:forEach items="${jiankang}" var="jiankang" varStatus="status">
											<c:if test="${status.index%2==0}">
												<li class="col">
												<div class="row" content="${jiankang.comment}" from="来自于${jiankang.username}的评价">
													<span class="tip blue">${jiankang.totalcomment}万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${jiankang.productid}"><img src="${jiankang.productpicture}"></a></dt>
														<dd class="name">${jiankang.productname}</dd>
														<dd class="price">${jiankang.productprice}</dd>
													</dl>
												</div>
											</c:if>
											<c:if test="${status.index%2==1}">
												<div class="row" content="${jiankang.comment}" from="来自于${jiankang.username}的评价">
													<span class="tip blue">${jiankang.totalcomment}万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${jiankang.productid}"><img src="${jiankang.productpicture}"></a></dt>
														<dd class="name">${jiankang.productname}</dd>
														<dd class="price">${jiankang.productprice}</dd>
													</dl>
												</div>
												</li>
											</c:if>
										</c:forEach>
									</ul>
								</div>
									<%--居家--%>
								<div class="m-slide-item">
								<ul class="m-cols m-col-4">

									<c:forEach items="${jujia}" var="jujia" varStatus="status">
										<c:if test="${status.index%2==0}">
											<li class="col">
											<div class="row" content="${jujia.comment}" from="来自于${jujia.username}的评价">
												<span class="tip blue">${jujia.totalcomment}万人评价</span>
												<dl>
													<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${jujia.productid}"><img src="${jujia.productpicture}"></a></dt>
													<dd class="name">${jujia.productname}</dd>
													<dd class="price">${jujia.productprice}</dd>
												</dl>
											</div>
										</c:if>
										<c:if test="${status.index%2==1}">
											<div class="row" content="${jujia.comment}" from="来自于${jujia.username}的评价">
												<span class="tip blue">${jujia.totalcomment}万人评价</span>
												<dl>
													<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${jujia.productid}"><img src="${jujia.productpicture}"></a></dt>
													<dd class="name">${jujia.productname}</dd>
													<dd class="price">${jujia.productprice}</dd>
												</dl>
											</div>
											</li>
										</c:if>
									</c:forEach>
								</ul>
							</div>
									<%--娱乐--%>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
										<c:forEach items="${yule}" var="yule" varStatus="status">
											<c:if test="${status.index%2==0}">
												<li class="col">
												<div class="row" content="${yule.comment}" from="来自于${yule.username}的评价">
													<span class="tip blue">${yule.totalcomment}万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${yule.productid}"><img src="${yule.productpicture}"></a></dt>
														<dd class="name">${yule.productname}</dd>
														<dd class="price">${yule.productprice}</dd>
													</dl>
												</div>
											</c:if>
											<c:if test="${status.index%2==1}">
												<div class="row" content="${yule.comment}" from="来自于${yule.username}的评价">
													<span class="tip blue">${yule.totalcomment}万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${yule.productid}"><img src="${yule.productpicture}"></a></dt>
														<dd class="name">${yule.productname}</dd>
														<dd class="price">${yule.productprice}</dd>
													</dl>
												</div>
												</li>
											</c:if>
										</c:forEach>
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
						</ul>
					</div>
				</header>
				<section class="m-box line2">
					<div class="span4">
						<div class="main-pic">
							<img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/left3.jpg">
						</div>
					</div>
					<div class="span16">
						<div class="m-slide">
							<div class="m-slide-contain m-s4">
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">
								<c:forEach begin="0" end="7" step="1" items="${creditproducts}" var="creditproduct" varStatus="status">
											<c:if test="${status.index%2==0&&status.index<7}">
												<li class="col">
												<div class="row" content="" from="">
													<span class="tip orange">需${creditproduct.productdisabled}积分</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}"><img src="${creditproduct.productpicture}"></a></dt>
														<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}">${creditproduct.productname}</a></dd>
														<dd class="price">${creditproduct.productprice}</dd>
													</dl>
												</div>
											</c:if>
											<c:if test="${status.index%2==1&&status.index!=7}">
												<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
													<span class="tip orange">需${creditproduct.productdisabled}积分</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}"><img src="${creditproduct.productpicture}"></a></dt>
														<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}">${creditproduct.productname}</a></dd>
														<dd class="price">${creditproduct.productprice}</dd>
													</dl>
												</div>
												</li>
											</c:if>
									<c:if test="${status.index%2==1&&status.index==7}">

										<div class="row row_half small-intro">
											<div class="small-introL">
												<span class="tip orange">需${creditproduct.productdisabled}积分</span>
												<b><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}">${creditproduct.productname}</a></b>
												<small>${creditproduct.productprice}</small>
											</div>
											<div class="small-introR"  style="margin-top: 35px;margin-right: 10px">
												<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}"><img src="${creditproduct.productpicture}"></a>
											</div>
										</div>
										<div class="row row_half scan-more">
											<div class="scan-moreL">
												<b ><a href="${pageContext.request.contextPath}/SelectProducCredits.action" >浏览更多</a></b>
												<small>兑换超值商品</small>
											</div>
											<a href="${pageContext.request.contextPath}/SelectProducCredits.action" ><div class="scan-moreR icon" style="margin-top: 35px;margin-right: 10px"></div></a>
										</div>
										</li>
									</c:if>
										</c:forEach>
									</ul>
								</div>
							<div class="m-slide-item">
									<ul class="m-cols m-col-4">

										<c:forEach begin="0" end="6" step="1" items="${creditproducts}" var="creditproduct" varStatus="status">
											<%--<c:if test="${status.index%2==0}">--%>
												<li class="col">
												<div class="row" content="fffffff" from="来自于hh的评价">
													<span class="tip blue">1万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}"><img src="${creditproduct.productpicture}"></a></dt>
														<dd class="name">${creditproduct.productname}</dd>
														<dd class="price">${creditproduct.productprice}</dd>
													</dl>
												</div>
									<%--		</c:if>--%>
											<%--<c:if test="${status.index%2==1}">--%>
												<div class="row" content="方便，特别安全，省了很多事" from="来自于hh的评价">
													<span class="tip blue">1万人评价</span>
													<dl>
														<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${creditproduct.productid}"><img src="${creditproduct.productpicture}"></a></dt>
														<dd class="name">${creditproduct.productname}</dd>
														<dd class="price">${creditproduct.productprice}</dd>
													</dl>
												</div>
												</li>
										<%--	</c:if>--%>
										</c:forEach>


									<%--	<li class="col">
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
										</li>--%>

									<%--	<li class="col">
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
										</li>--%>
<%--

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
--%>


										<%--<li class="col">
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
										</li>--%>
									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">

										<%--<li class="col">
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
										</li>--%>

									<%--	<li class="col">
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
										--%>

										<%--<li class="col">
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
										</li>--%>

									<%--	<li class="col">
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
										</li>--%>

									</ul>
								</div>
								<div class="m-slide-item">
									<ul class="m-cols m-col-4">

									<%--	<li class="col">
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
										</li>--%>

									<%--	<li class="col">
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
										</li>--%>

										<%--<li class="col">
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
--%>
									<%--	<li class="col">
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
										</li>--%>
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
									<c:forEach items="${Recomend}" var="Recomends" begin="0" end="4">
									<li class="col">
										<div class="row">
											<dl>
												<dt><img src="${Recomends.productpicture}"></dt>
												<dd class="name">${Recomends.productname}</dd>
												<dd class="price">${Recomends.productprice}</dd>
												<dd class="cmt">浏览次数${Recomends.productlookcount}</dd>
											</dl>
										</div>
									</li>
									</c:forEach>
								</ul>
								<%--<c:forEach begin="0" end="4" step="1" items="${Recomend}" var="Recomends">
									<li class="col sku-item " >
										<dl class="row" >
											<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${Recomends.productid}"><img src="${Recomends.productpicture}"></a></dt>
											<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${Recomends.productid}">${Recomends.productname}</a></dd>
											<dd class="price">${Recomends.productprice}</dd>
										</dl>
									</li>
								</c:forEach>--%>
							</div>
							<div class="m-slide-item">
								<ul class="m-cols m-col-5">
									<c:forEach items="${Recomend}" var="Recomends" begin="5" end="9">
										<li class="col">
											<div class="row">
												<dl>
													<dt><img src="${Recomends.productpicture}"></dt>
													<dd class="name">${Recomends.productname}</dd>
													<dd class="price">${Recomends.productprice}</dd>
													<dd class="cmt">浏览次数${Recomends.productlookcount}</dd>
												</dl>
											</div>
										</li>
									</c:forEach>

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
						<c:forEach items="${Recommendations}" var="Recommendation">
							<li class="col">
								<div class="row">
									<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${Recommendation.productid}"><img src="${Recommendation.productpicture}" style="width:250px;height:250px; "></a>
									<div style="border-bottom: 1px #CCCCCC solid"></div>
									<div class="content">
										<div class="from">推荐理由</div>
										<div class="cmt"  style="height:60px; ">
											${Recommendation.productdescribe}
										</div>
										<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${Recommendation.productid}" class="name">${Recommendation.productname}</a>
										<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${Recommendation.productid}" class="price"  style="width: 100px;">${Recommendation.productprice}元</a>
									</div>

								</div>
							</li>
						</c:forEach>

					<%--	<li class="col">
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
						</li>--%>
					</ul>
				</section>
			</section>
			<!--店家推荐结束-->

		</div>

	</section>
	<!-- 右侧浮动 -->
	<div id="float">
		<a href="${pageContext.request.contextPath}/LoginServlet?username=${sessionScope.user.username}" class="consult" target="_blank"></a>
		<a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=2" class="cart"></a>
		<a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=1" class="cart1"></a>
		<a href="javascript:void(0)" class="btn_top" style="display: none;"></a>
	</div>


<div style="height:100px"></div>

<footer>
	<div class="pc-footer-top">
		<div class="center">
			<ul class="clearfix" style="margin-left: 110px;">
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

</body>
</html>