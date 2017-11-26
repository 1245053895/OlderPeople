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
	<title>购物商城-所有分类</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/style.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/media_index.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/mod.css">
	<link id="bootstrap_221" rel="stylesheet" type="text/css" class="library" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.SuperSlide.js"></script>
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

	<style type="text/css">
		.navbar .nav > li .dropdown-menu {
			margin: 0;
			width: 1142px;
			height:120px;
			float: left;
		}
		.navbar .nav > li:hover .dropdown-menu {
			display: block;
			float: left;
		}
		.wd{width: 190px;float: left;height: 110px;}
		.dropdown-menu li{ border-right:1px #3a87ad dashed}
		.dropdown-xl{ width: 175px;margin-left:20px;padding-left: -25px;}
		.dropdown-xl dl dt{margin-bottom: 10px;height: 20px;line-height: 20px;}
		.dropdown-xl dl dd{margin-bottom: 8px; float: left;padding-right: 15px;}
		.yScrollListInList ul li{width: 152px;}
	</style>
</head>
<body>

<header id="pc-header">

	<jsp:include page="/jsp/users/head.jsp"></jsp:include>
	<!--  顶部    start-->
	<div class="yHeader" style="margin-top: 50px">
		<!-- 导航   start  -->
		<div class="yNavIndex">
			<ul class="yMenuIndex">
				<li><a href="${pageContext.request.contextPath}/ShopFrontPage.action"  title="首页">首页</a></li>
				<li><a href="${pageContext.request.contextPath}/ProductHot.action" title="热销专区">热销专区</a></li>
				<li><a href="${pageContext.request.contextPath}/SelectNewProduct.action"  title="新品专区">新品专区</a></li>
				<li><a href="" target="_blank" title="积分商城">积分商城</a></li>
				<li><a href="" target="_blank" title="合伙人">合伙人</a></li>
				<li><a href="" target="_blank" title="关于我们">关于我们</a></li>
			</ul>
		</div>
		<!-- 导航   end  -->
	</div>

</header>


<div class="center" style="background:#fff;">
	<div style="padding:20px">
<%--		<div class="containers clearfix"><div class="pc-nav-item fl"><a href="#" class="pc-title">首页</a> &gt;<a href="#"> 所有货架</a></div> <div class="fr" style="padding-top:20px;"><a href="#" class="reds">所有品牌&gt;</a></div></div>--%>
		<div class="containers">
<%--			<div class="pc-nav-rack clearfix">
				<ul>
					<li><a href="#">家用电器</a></li>
					<li><a href="#">手机数码</a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">家居家装</a></li>
					<li><a href="#">男装女装</a></li>
					<li><a href="#">个护化妆</a></li>
					<li><a href="#">运动户外</a></li>
					<li><a href="#">箱包钟表</a></li>
					<li><a href="#">汽车用品</a></li>
					<li><a href="#">玩具乐器</a></li>
					<li><a href="#">食品酒类</a></li>
					<li><a href="#">玩具乐器</a></li>
					<li><a href="#">营养保健</a></li>
					<li><a href="#">图书音像</a></li>
					<li><a href="#">充值票务</a></li>
				</ul>
			</div>--%>

	<div class="container" style="margin-top: -20px;">
		<div class="navbar">
			<div class="navbar-inner" style="border-bottom: 1px #3a87ad solid">
				<ul class="nav nav-pills" style="width: 100px;">
					<li class="dropdown"><a href="#">所有分类<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<c:forEach items="${productTypeExtends}" var="productTypeExtend">
								<li class="wd">
										<div class="dropdown-xl">
												<dl>
													<dt><a href="${pageContext.request.contextPath}/SelectProductType.action?ProductTypeId=${productTypeExtend.producttypeid}">${productTypeExtend.producttypename}</a></dt>

													<c:forEach items="${productTypeExtend.product}" var="product">
														<dd><a  href="${pageContext.request.contextPath}/xiangqing.action?productid=${product.productid}" >${product.productname}</a></dd>
													</c:forEach>

												</dl>
										</div>
								</li>
							</c:forEach>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>

			<div style="width: 1180px;margin:0px auto;" >

				<div style="width: 150px;margin-left: 20px;font-size: 18px;">
					<img src="/jsp/users/images/dingwei.png" width="50px" height="50px">
					<c:forEach items="${productTypeExtends1}" var="productTypeExtends11">
					<h4 style="margin-top: -30px;margin-left: 45px;">${productTypeExtends11.producttypename}</h4>
					</c:forEach>
				</div>
				<div class="time-border">


					<div class="yScrollList" style="width: 1180px;height: 100%">
						<div class="yScrollListIn">
							<div class="yScrollListInList yScrollListInList1" style="display:block; width: 1180px;height: 100%;margin-left: -40px">
								<ul style="width: 1180px;text-align: center">
									<c:forEach items="${productss}" var="products">
										<li style="text-align: center">
											<div class="row" style="margin-left: 10px;">
												<dl>
													<dd><a>${products.productname}</a></dd>
													<dt><a href="${pageContext.request.contextPath}/xiangqing.action?productid=${products.productid}"><img src="${products.productpicture}"></a></dt>
													<dd class="name"><a href="${pageContext.request.contextPath}/xiangqing.action?ProductTypeId=${products.productid}">${products.productname}</a></dd>

													<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">${products.productprice}</dd>
												</dl>
											</div>
										</li>
									</c:forEach>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
<%--				<div class="pc-nav-digit clearfix">
					<ul>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
						<li>
							<div class="digit1"><a href="#"><img src="images/shangpinxiangqing/X-1.png" width="100%"></a></div>
							<div class="digit2"><a href="#">家用电器</a></div>
						</li>
					</ul>
				</div>--%>
			</div>

			<div style="padding-top:30px;">
				<div class="member-pages clearfix">
					<div class="fr pc-search-g">
						<a href="#" class="fl pc-search-f">上一页</a>
						<a class="current" href="#">1</a>
						<a href="javascript:;">2</a>
						<a href="javascript:;">3</a>
						<a href="javascript:;">4</a>
						<a href="javascript:;">5</a>
						<a href="javascript:;">6</a>
						<a href="javascript:;">7</a>
						<span class="pc-search-di">…</span>
						<a onclick="SEARCH.page(3, true)" href="javascript:;" class="pc-search-n" title="使用方向键右键也可翻到下一页哦！">下一页</a>
						<span class="pc-search-y">
                        <em>  共20页    到第</em>
                        <input type="text" placeholder="1" class="pc-search-j">
                        <em>页</em>
                        <a class="confirm" href="#">确定</a>
                    </span>

					</div>
				</div>
			</div>
		</div>

	</div>
</div>


<div style="height:100px"></div>

<footer >
	<div class="pc-footer-top">
		<div class="center">
			<ul class="clearfix" style="margin:0px auto;">
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