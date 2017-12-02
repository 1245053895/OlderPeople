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
	<title>我的购物车-购物商城</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
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
		<section id="pc-jie">
			<div class="center " id="dingdan">
				<ul class="pc-shopping-title clearfix">
					<li><a href="#">全部商品(10)</a></li>
					<li><a href="#">限时优惠(7)</a></li>
					<li><a href="#">已下架(0)</a></li>
				</ul>
			</div>
			<div class="pc-shopping-cart center">
				<div class="pc-shopping-tab">
					<table>
						<thead>
							<tr class="tab-0">
								<th class="tab-1">
									<input type="checkbox" name="s_all" class="s_all tr_checkmr" id="s_all_h">
									<label style="margin-left: 20px;"> 全选</label>
								</th>
								<th class="tab-2">商品</th>
								<th class="tab-3">商品信息</th>
								<th class="tab-4">金额</th>
								<th class="tab-5">数量</th>
								<th class="tab-6">小计</th>
								<th class="tab-7">操作</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th><input type="checkbox"  style="margin-left:15px; float:left"></th>
								<th class="tab-th-1">
									<a href="#"><img src="images/shangpinxiangqing/X1.png" width="100%" alt=""></a>
									<a href="#" class="tab-title">赛亿（shinee)取暖器家用/取暖电器/电暖器/电暖气台式摇头暖风机HN2118PT </a>
								</th>
								<th>
									<p>颜色：黑色</p>
									<p>规格：落地款</p>
								</th>
								<th>
									<p>售价</p>
									<p class="red">￥<span>69.00</span></p>
									<p style="text-decoration: line-through;">￥<span>89.00</span></p>
									<br/>
									<p>邮费</p>
									<p>￥<span>0</span></p>
								</th>
								<th class="tab-th-2">
									<div class="Xcontent32"><img src="images/shangpinxiangqing/X15.png"></div>
									<form>
										<input class="input" value="1"></form>
									<div class="Xcontent33"><img src="images/shangpinxiangqing/16.png"></div>
								</th>
								<th class="red">￥<span>69.00</span></th>
								<th>
									<p><a href="#">删除</a></p>
									<br/>
									<p><a href="#">移入收藏夹</a></p>
								</th>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div style="height:10px"></div>
			<div class="center">
				<div class="clearfix pc-shop-go">
					<div class="fl pc-shop-fl">
						<input type="checkbox" placeholder="" style="margin-left:5px">
						<label style="margin-left: 15px;">全选</label>
						<a href="#">删除</a>
						<a href="#">清除失效商品</a>
					</div>
					<div class="fr pc-shop-fr">
						<p>共有 <em class="red pc-shop-shu">2</em> 款商品，总计（含运费）</p>
						<span>¥ 699.00</span>
						<a href="#">去付款</a>
					</div>
				</div>
			</div>
	</section>
	</div>
</div>


<div style="height:100px"></div>

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
</body>
</html>