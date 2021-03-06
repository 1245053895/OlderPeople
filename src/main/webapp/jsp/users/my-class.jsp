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
	<title>购物商城-搜索</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link id="bootstrap_221" rel="stylesheet" type="text/css" class="library" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.SuperSlide.js"></script>
	<style type="text/css">
		.navbar .nav > li .dropdown-menu {
			margin: 0;
		}
		.navbar .nav > li:hover .dropdown-menu {
			display: block;
		}
	</style>

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


<div class="center" style="background:#fff;">
	<div style="padding:20px">
		<div class="containers clearfix">
			<div class="pc-info fr" style="width:1142px;margin-right: 80px;">
				<div class="pc-term" style="height: 40px;">
					<dl class="pc-term-dl clearfix">
						<dt>你是不是想找：</dt>
						<dd><a href="#">折叠轮椅</a></dd>
						<dd><a href="#">轮椅配件</a></dd>
						<dd><a href="#">电动轮椅</a></dd>
						<dd><a href="#">手动轮椅</a></dd>
						<dd><a href="#">爬楼轮椅</a></dd>
						<dd><a href="#">代步车</a></dd>
						<dd><a href="#">助行器</a></dd>
						<dd><a href="#">老年购物车</a></dd>
					</dl>
					<div class="pc-line"></div>

				</div>
				<div class="pc-term">
					<div class="clearfix pc-search-p">

						<div class="pc-search clearfix">
							<div class="sort-inner">
								<div class="container">
									<div class="navbar">
										<div class="navbar-inner">
											<ul class="nav nav-pills" style="width: 800px;">
												<li><a href="#">综合排序</a></li>
												<li class="dropdown"><a href="#">销量<span class="caret"></span></a>
													<ul class="dropdown-menu">
														<li><a href="#">销量由高到低</a></li>
													</ul>
												</li>
												<li class="dropdown"><a href="#">人气<span class="caret"></span></a>
													<ul class="dropdown-menu">
														<li><a href="#">人气由高到低</a></li>
													</ul>
												</li>
												<li class="dropdown"><a href="#">价格<span class="caret"></span></a>
													<ul class="dropdown-menu">
														<li><a href="#">价格由低到高</a></li>
														<li><a href="#">价格由高到低</a></li>
													</ul>
												</li>
												<li>
													<div class="fl pc-search-in">
														<input class="pc-search-s" placeholder="￥" type="text">
														<input class="pc-search-s" placeholder="￥" type="text">
														<a href="#" class="pc-search-a">搜索</a>
													</div>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="fr pc-search-v">
							<ul>
								<li><input type="checkbox"><a href="#">有货</a> </li>
								<li><input type="checkbox"><a href="#">限时抢购</a> </li>
								<li><input type="checkbox"><a href="#">满减大促</a> </li>
							</ul>
						</div>
					</div>
					<div class="pc-search-i">
						<div class="fr">
							<span class="pc-search-t"><b>1</b><em>/</em><i>32</i></span>
							<a href="#" class="pc-search-d">上一页</a>
							<a href="#">下一页</a>
						</div>
					</div>
				</div>
				<div class="time-border">


					<div class="yScrollList" style="width: 1180px;height: 100%">
						<div class="yScrollListIn">
							<div class="yScrollListInList yScrollListInList1" style="display:block; width: 1180px;height: 100%;margin-left: -55px">
								<ul style="width: 1180px;text-align: center">
									<li style="text-align: center;width: 152px;">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/fhgz1.1.png"></dt>
												<dd class="name">防滑拐杖</dd>
												<dd style="color: #B0B0B0">老年出行更安全</dd>
												<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">149元</dd>
											</dl>
										</div>
									</li>
									<li style="text-align: center">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/wfsb5.1.jpg"></dt>
												<dd class="name">笔墨纸砚</dd>
												<dd style="color: #B0B0B0">文房四宝，老年娱乐</dd>
												<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">149元</dd>
											</dl>
										</div>
									</li>
									<li style="text-align: center">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/whj1.1.gif"></dt>
												<dd class="name">雾化器</dd>
												<dd style="color: #B0B0B0">治疗各种呼吸系统疾病</dd>
												<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">149元</dd>
											</dl>
										</div>
									</li>
									<li style="text-align: center">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/sdly1.1.gif"></dt>
												<dd class="name">手动轮椅</dd>
												<dd style="color: #B0B0B0">残疾人轮椅代步</dd>
												<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">149元</dd>
											</dl>
										</div>
									</li>
									<li style="text-align: center">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/tkmbj1.1.png"></dt>
												<dd class="name">太空漫步机</dd>
												<dd style="color: #B0B0B0">老年运动，活动关节腿脚</dd>
												<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">149元</dd>
											</dl>
										</div>
									</li>
									<li style="text-align: center">
										<div class="row">
											<dl>
												<dt><img src="${pageContext.request.contextPath}/jsp/users/images/rxsp/tkmbj1.1.png"></dt>
												<dd class="name">太空漫步机</dd>
												<dd style="color: #B0B0B0">老年运动，活动关节腿脚</dd>
												<dd style="color: #ec1611;font: 13px/33px '微软雅黑'">149元</dd>
											</dl>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="pc-search-re clearfix">
					<dl>
						<dd>
							<input value="三星" id="key-re-search" class="text" type="text">
							<input value="搜&nbsp;索" id="btn-re-search" class="button" type="button">
						</dd>
					</dl>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>
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