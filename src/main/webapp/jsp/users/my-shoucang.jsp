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
	<title>购物商城-我的收藏</title>
	<link rel="shortcut icon" type="image/x-icon" href="img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/home.css">
	<link rel="stylesheet" type="text/css" href="css/member.css">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript" src="js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>

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
					<dd><a href="#">我的购物车</a></dd>
					<dd><a href="#">我的收藏</a></dd>
					<dd><a href="#">我的评价</a></dd>
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
				<div class="member-heels fl"><h2>我的收藏</h2></div>
				<div class="member-backs member-icons fr"><a href="#">搜索</a></div>
				<div class="member-about fr"><input placeholder="商品名称/商品编号/订单编号" type="text"></div>
			</div>
			<div class="member-border">
				<div class="member-return H-over">
					<div class="member-vessel">
						<div class="member-volume fl">
							<a href="#" class="fl member-btn-fl"></a>
							<div class="member-whole clearfix" id="dingdan">
								<ul id="H-table" class="H-table">
									<li><a href="#">全部商品<em>(44)</em></a></li>
									<li><a href="#">热销商品<em>(44)</em></a></li>
									<li><a href="#">已下架<em>(44)</em></a></li>
									<li><a href="#">积分兑换<em>(44)</em></a></li>
								</ul>
								<div class="member-check clearfix fl" style="float: right">
									<a href="#" class="member-shops">一键加入购物车</a>
									<a href="#" class="member-delete">一键删除</a>
								</div>
							</div>
							<div class="member-cakes fl">
								<ul>
									<li>
										<ul class="shop-tools clearfix">
											<li class="shop-tools-item1" style="background-position:-20px -20px;" title="加入购物车">置顶</li>
											<li class="shop-tools-item2" style="background-position:4px -98px;" title="删除商品">删除</li>
										</ul>
										<a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" width="125" height="125"></a>
										<a href="#">老年代步车</a>
										<p>￥78.00 <i style="text-decoration: line-through;color: #666a6e;font-size: 11px;">￥178.00</i></p>
									</li>
									<li>
										<ul class="shop-tools clearfix">
											<li class="shop-tools-item1" style="background-position:-20px -20px;" title="加入购物车">置顶</li>
											<li class="shop-tools-item2" style="background-position:4px -98px;" title="删除商品">删除</li>
										</ul>
										<a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" width="125" height="125"></a>
										<a href="#">老年代步车</a>
										<p>￥78.00 <i style="text-decoration: line-through;color: #666a6e;font-size: 11px;">￥178.00</i></p>
									</li>
									<li>
										<ul class="shop-tools clearfix">
											<li class="shop-tools-item1" style="background-position:-20px -20px;" title="加入购物车">置顶</li>
											<li class="shop-tools-item2" style="background-position:4px -98px;" title="删除商品">删除</li>
										</ul>
										<a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" width="125" height="125"></a>
										<a href="#">老年代步车</a>
										<p>￥78.00 <i style="text-decoration: line-through;color: #666a6e;font-size: 11px;">￥178.00</i></p>
									</li>
									<li>
										<ul class="shop-tools clearfix">
											<li class="shop-tools-item1" style="background-position:-20px -20px;" title="加入购物车">置顶</li>
											<li class="shop-tools-item2" style="background-position:4px -98px;" title="删除商品">删除</li>
										</ul>
										<a href="#"><img src="images/shangpinxiangqing/X-1.png" title="" width="125" height="125"></a>
										<a href="#">老年代步车</a>
										<p>￥78.00 <i style="text-decoration: line-through;color: #666a6e;font-size: 11px;">￥178.00</i></p>
									</li>

								</ul>
							</div>
						</div>
					</div>
				</div>



				<div class="clearfix" style="padding:30px 20px;">
					<div class="fr pc-search-g pc-search-gs" style="margin-top: 50px;">
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