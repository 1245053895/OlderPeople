<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/express.css">
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
	<jsp:include page="/jsp/users/head.jsp"></jsp:include>
	<%--</div>--%>
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
					<dd><a href="javascript:check('1');">我的收藏</a></dd>
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
	.module{
		height: 200px;
	}
	.member-cakes{
		width: 968px;
	}
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
                queryFavoritesByUserId(0,24);
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
        var order="<div class='member-whole clearfix' id='dingdan'>\n" +
            "    <ul id='H-table' class='H-table'>\n" +
            "     <li class='cur'><a href='javascript:queryOrderByUserId(0,5,-1);'>全部订单</a></li>\n" +
            "     <li><a href='javascript:queryOrderByUserId(0,5,1);'>待发货</a></li>\n" +
            "     <li><a href='javascript:queryOrderByUserId(0,5,2);'>已发货</a></li>\n" +
            "     <li><a href='javascript:queryOrderByUserId(0,5,3);'>已签收</a></li>\n" +
            "     <li><a href='javascript:queryOrderByUserId(0,5,4);'>已完成</a></li>\n" +
            "     <li><a href='javascript:queryOrderByUserId(0,5,6);'>退货订单<em></em></a></li>\n" +
            "    </ul>\n" +
            "   </div>\n" +
            "   <div class='member-border'>\n" +
            "    <div class='member-return H-over'>\n" +
            "     <div class='member-cancel clearfix' id='tb_haed'>\n" +
            "      <span class='be1'>订单信息</span>\n" +
            "      <span class='be2'>收货人</span>\n" +
            "      <span class='be2'>订单金额</span>\n" +
            "      <span class='be2'>订单时间</span>\n" +
            "      <span class='be2'>订单状态</span>\n" +
            "      <span class='be2'>订单操作</span>\n" +
            "     </div>\n" +
            "     <div class='loading'>\n" +
            "      <div></div>\n" +
            "      <img style='margin-top: -150px;float: left;' src='${pageContext.request.contextPath}/jsp/users/images/loading1.gif'/>\n" +
            "     </div>\n" +
            "     <div id='order' class='member-sheet clearfix'><ul></ul></div>\n" +
            "    </div>\n" +
            "    <div class='member-return H-over' style='display:none;'>\n" +
            "     <div class='member-cancel clearfix'>\n" +
            "      <span class='be1'>订单信息</span>\n" +
            "      <span class='be2'>收货人</span>\n" +
            "      <span class='be2'>订单金额</span>\n" +
            "      <span class='be2'>订单时间</span>\n" +
            "      <span class='be2'>订单状态</span>\n" +
            "      <span class='be2'>订单操作</span>\n" +
            "     </div>\n" +
            "     <div class='member-sheet clearfix'>\n" +
            "      <ul>\n" +
            "      </ul>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "    <div class='clearfix' style='padding:30px 20px;'>\n" +
            "     <div class='fr pc-search-g pc-search-gs'>\n" +
            "      <a style='display:none' class='fl ' href='javascript:void(0);'>上一页</a>\n" +
            "      <a href='javascript:queryOrderByUserId(0,5);' class='current'>1</a>\n" +
            "      <a href='javascript:queryOrderByUserId(6,5);'>2</a>\n" +
            "      <a href='javascript:queryOrderByUserId(11,5);'>3</a>\n" +
            "      <a href='javascript:queryOrderByUserId(16,5);'>4</a>\n" +
            "      <a href='javascript:queryOrderByUserId(21,5);'>5</a>\n" +
            "      <a href='javascript:queryOrderByUserId(26,5);'>6</a>\n" +
            "      <a href='javascript:queryOrderByUserId(31,5);'>7</a>\n" +
            "      <span class='pc-search-di'>…</span>\n" +
            "      <a href='javascript:;'>1088</a>\n" +
            "      <a title='使用方向键右键也可翻到下一页哦！' class='' href='javascript:;'>下一页</a>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "\n" +
            "   </div>";

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
            if(data==""){
                $(".loading").find("img").attr("src","${pageContext.request.contextPath}/jsp/users/images/loading.gif");
                if(para[3]==-1){
                    $(".loading").find("div").text("您没有买过东西!");
                }else if(para[3]==1){
                    $(".loading").find("div").text("您没有待发货的订单!");
                }else if(para[3]==2){
                    $(".loading").find("div").text("您没有已发货订单!");
                }else if(para[3]==3){
                    $(".loading").find("div").text("您没有已签收订单!");
                }else if(para[3]==4){
                    $(".loading").find("div").text("您没有完成任何交易!");
                }else if(para[3]==6){
                    $(".loading").find("div").text("您没有正在退货的订单!");
                }
            }else {
                $(".loading").find("img").css("display", "none");
                $(".loading").find("div").css("display", "none");
                $("#order").find("ul").find("li").remove();
                $.each(data, function (index, content) {
                    console.log(content.shoppingcount);
                    var htmlStr1 = "";
                    var htmlStr2 = "";
                    var htmlStr3 = "";
                    var productCount = 0;

                    htmlStr1 = "<li>\n" +
                        "        <div class='member-minute clearfix'>\n" +
                        "         <span>" + gettime(content.createtime) + "</span>\n" +
                        "         <span>订单号：<em id='order_id'>" + content.orderid + "</em></span>\n" +
                        "         <span class='member-custom'>客服电话：<em>010-6544-0986</em></span>\n" +
                        "        </div>\n" +
                        "        <div class='member-circle clearfix'>\n" +
                        "         <div class='ci1'>\n";

                    console.log(content.productCustoms);
                    $.each(content.productCustoms, function (i, productCustom) {
                        productCount++;
                        htmlStr2 += "    <div class='ci7 clearfix'>\n" +
                            "           <span class='gr1'><a href='#'><img src='/" + productCustom.productpicture + "' style='height: 80px;width: 80px;max-width:200px;' title='" + productCustom.productname + "' about='' width='60' height='60'></a></span>\n" +
                            "           <span class='gr2' style='margin-left: 50px;width: 150px;height: 85px'><a href='#'>" + productCustom.productname + "</a></span>\n" +
                            "           <span class='gr3'>X" + productCustom.shoppingcount + "</span>\n" +
                            "          </div>\n";
                    });

                    htmlStr3 = "         </div>\n" +
                        "         <div class='ci2 height" + index + "'>" + content.gainname + "</div>\n" +
                        "         <div class='ci3 height" + index + "'><p class='red'>￥<span>" + content.amountpay + "</span></p><p>";
                    if (content.paytype == 0) {
                        htmlStr3 += "在线支付";
                    } else {
                        htmlStr3 += "货到付款"
                    }
                    htmlStr3 += "</p></div>\n" +
                        "         <div class='ci4 height" + index + "'><p>2015-09-22</p></div>\n";
                    switch (content.status) {
                        case 0:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>交易关闭</p>"
                            if (content.shippingcode != null || content.shippingcode != "") {
                                htmlStr3 += "<p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p>"
                            }
                            htmlStr3 += "<p><a href='#'>订单详情</a></p></div>\n";

                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>重新购买</a> </p></div>\n";
                            break;
                        case 1:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>待发货</p><p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>提醒发货</a> </p> <p><a href='#'>取消订单</a> </p></div>\n";
                            break;
                        case 2:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>已发货</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>确认收货</a> </p></p></div>\n";
                            break;
                        case 3:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>已签收</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>评价</a></p><p><a href='#' class='member-touch'>售后服务</a></p></div>\n";
                            break;
                        case 4:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>已完成</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p>剩余15时20分</p><p><a href='#' class='member-touch'>再次购买</a></p><p><a href='#' class='member-touch'>售后服务</a></p></div>\n";
                            break;
                        case 5:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>拒收</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>拒收理由</a> </p></div>\n";
                            break;
                        case 6:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>申请退货</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>撤销申请</a> </p></div>\n";
                            break;
                        case 7:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>同意退货</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p>剩余15时20分</p><p><a href='#' class='member-touch'>填写物流</a> </p><p><a href='#' class='member-touch'>撤销申请</a> </p></div>\n";
                            break;
                            break;
                        case 8:
                            htmlStr3 += "<div class='ci5 height" + index + "'><p>拒绝退货</p><p><a class='express' href='javascript:queryExpress(" + content.shippingcode + ");'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                            htmlStr3 += "<div class='ci5 ci8 height" + index + "'><p><a href='#' class='member-touch'>查看原因</a> </p></div>\n";
                            break;
                        default:
                            htmlStr3 += "未获取到订单状态";
                            break;

                    }
                    htmlStr3 += "</div></li>"
                    $("#order").find("ul").append(htmlStr1 + htmlStr2 + htmlStr3);
                    $(".height" + index).height(110 * productCount - 23);  //动态设置高度

                });
            }
        }
    }
    function queryFavoritesByUserId(start,count,status,conditions) {
        console.log("这是收藏夹");
        var favorites="<div class='member-border'>\n" +
            "    <div class='member-return H-over'>\n" +
            "     <div class='member-vessel'>\n" +
            "      <div class='member-volume fl'>\n" +
            "       <a href='#' class='fl member-btn-fl'></a>\n" +
            "       <div class='member-whole clearfix' id='dingdan'>\n" +
            "        <ul id='H-table' class='H-table'>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,24,-1);'>全部商品<em>(44)</em></a></li>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,24,0);'>热销商品<em>(44)</em></a></li>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,24,2);'>已下架<em>(44)</em></a></li>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,24,3);'>积分兑换<em>(44)</em></a></li>\n" +
            "        </ul>\n" +
            "        <div class='member-check clearfix fl' style='float: right'>\n" +
            "         <a href='#' class='member-shops'>一键加入购物车</a>\n" +
            "         <a href='#' class='member-delete'>一键删除</a>\n" +
            "        </div>\n" +
            "       </div>\n" +
            "       <div class='member-cakes fl'>\n" +
            "        <ul id='favorites'>\n" +
            "        </ul>\n" +
            "       </div>\n" +
            "      </div>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "    <div class='clearfix' style='padding:30px 20px;'>\n" +
            "     <div class='fr pc-search-g pc-search-gs' style='margin-top: 50px;'>\n" +
            "      <a style='display:none' class='fl ' href='#'>上一页</a>\n" +
            "      <a href='#' class='current'>1</a>\n" +
            "      <a href='javascript:;'>2</a>\n" +
            "      <a href='javascript:;'>3</a>\n" +
            "      <a href='javascript:;'>4</a>\n" +
            "      <a href='javascript:;'>5</a>\n" +
            "      <a href='javascript:;'>6</a>\n" +
            "      <a href='javascript:;'>7</a>\n" +
            "      <span class='pc-search-di'>…</span>\n" +
            "      <a href='javascript:;'>1088</a>\n" +
            "      <a title='使用方向键右键也可翻到下一页哦！' class='' href='javascript:;'>下一页</a>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "   </div>";

        $(".member-head").nextAll("div").remove();
        $(".member-heels").text("我的收藏夹");
        $(".member-right").append(favorites);
        $(".member-right").css("width","970px");

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
        }else{
            para.push(conditions);
        }

        $.ajax({
            url:"${pageContext.request.contextPath}/selectFavoritesList.action",
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
            $("#id_head").css("visibility", "visible");
            $.each(data, function (index, content) {
                console.log(content.shoppingcount);
                var html="<li class='module' value='"+content.productid+"'>\n" +
                    "          <ul class='shop-tools clearfix'>\n" ;

				if(content.isOnShopcar==0){
                    html+="<li class='shop-tools-item1' style='background-position:-20px -20px;' value='"+content.productid+"' title='加入购物车'>置顶</li>";
				}

                html+="           <li class='shop-tools-item2' style='background-position:4px -98px;' value='"+content.productid+"' title='删除商品'>删除</li>\n" +
                    "          </ul>\n" +
                    "          <a href='#'><img src='/"+content.productpicture+"' style='overflow:hidden;width:125px;height: 125px' title='"+content.productname+"'></a>\n" +
                    "          <a href='#'>"+content.productname+"</a>\n" +
                    "          <p>￥"+content.productprice+" <i style='text-decoration: line-through;color: #666a6e;font-size: 11px;'>￥"+content.marketprice+"</i></p>\n" +
                    "       </li>";

                $("#favorites").append(html);

                if(index==0){
                    var i=0
                    $("#H-table").find("li").each(function(){
                        if(i==0){
                            $(this).find("a").text("全部商品("+content.countNumb[0]+")");
                        }
                        if(i==1){
                            $(this).find("a").text("热销商品("+content.countNumb[1]+")");
                        }
                        /*if(i==2){
                            $(this).find("a").text("新品("+content.countNumb[2]+")");
                        }*/
                        if(i==3){
                            $(this).find("a").text("已下架("+content.countNumb[3]+")");
                        }
                        if(i==2){
                            $(this).find("a").text("积分兑换("+content.countNumb[4]+")");
                        }
                        i++;
                    });
                }
            });

            //商品移入购物车
            $(".shop-tools-item1").click(function(){
                var id = new Array();
                id.push($(this).val());
                id.push(1);//默认一个商品
                //var s=$(this).siblings("li").val();
                var data=ajax("insertShiftToCart.action",id);
                if(data){
                    $(this).remove();
                    alert("移入成功!");
                }else {
                    alert("移入失败!");
                }

            });
            //一键加入购物车
            $(".member-shops").click(function () {
                var flag=true;
                var count=0;
                $("li[class='module']").each(function(){
                    if(!!$(this).find(".shop-tools-item1").val()){ //如果购物车中没有该商品 则加入购物车
						count++;
                        var id = new Array();
                        id.push($(this).val());
                        id.push(1);//默认一个商品
                        var data=ajax("insertShiftToCart.action",id);
                        if(data){
                            flag=flag&&true;
                        }else {
                            flag=flag&&false;
                        }
                        $(this).find(".shop-tools-item1").remove();
                	}
                });
                if(count>0){
                    if(flag){
                        alert("加入成功!");
                    }else {
                        alert("加入失败!");
                    }
				}else{
                    alert("这些商品已经在购物车中!不要重复加入!")
				}

            })


            //一键移除收藏夹商品
            $(".member-delete").click(function () {
				if(confirm("确定删除吗!")){
                    $("li[class='module']").each(function(){
                        var id=$(this).val();
                        //var s=$(this).siblings("li").val();
                        var data=ajax("delectFavorites.action",id);
                        if(data){
                            $(this).fadeOut("slod");
                            //$(this).remove();
                        }
                    });
				}
                alert("移除成功");
            });
            //删除商品
            $(".shop-tools-item2").click(function(){
                var id=$(this).val();
                //var s=$(this).siblings("li").val();
                var data=ajax("delectFavorites.action",id);
                if(data){
                    $(this).parent().parent().remove();
				}else {
                    alert("删除失败!");
				}

            });
        }
    }
    function queryShopCarByUserId(start,count,status,conditions) {
        var car="<div class='center ' id='dingdan'>\n" +
            "    <ul class='pc-shopping-title clearfix'>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,-1);'>全部商品</a></li>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,0);'>热销商品</a></li>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,1);'>新品</a></li>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,2);'>已下架</a></li>\n" +
            "    </ul>\n" +
            "   </div>\n" +
            "   <div class='pc-shopping-cart center'>\n" +
            "    <div class='pc-shopping-tab'>\n" +
            "     <table>\n" +
            "      <thead>\n" +
			"<thead>\n" +
            "       <tr id='id_head' class='tab-0'>\n" +
            "        <th class='tab-1'>\n" +
            "         <input type='checkbox' name='s_all' class='s_all tr_checkmr' id='s_all_h'>\n" +
            "         <label style='margin-left: 20px;'> 全选</label>\n" +
            "        </th>\n" +
            "        <th class='tab-2'>商品</th>\n" +
            "        <th class='tab-3'>商品信息</th>\n" +
            "        <th class='tab-4'>金额</th>\n" +
            "        <th class='tab-5'>数量</th>\n" +
            "        <th class='tab-6'>小计</th>\n" +
            "        <th class='tab-7'>操作</th>\n" +
            "       </tr>\n" +
            "      </thead>"+
			"       <div class='loading'>\n" +
            "        <div></div>\n" +
            "        <img  style='margin-top: -80px;' src='${pageContext.request.contextPath}/jsp/users/images/loading1.gif'/>\n" +
            "       </div>"+
            "      </thead>\n" +
            "      <tbody id='car'>\n" +
            "      </tbody>\n" +
            "     </table>\n" +
            "    </div>\n" +
            "   </div>\n" +
			"   <div style='height:10px'></div>\n" +
            "   <div class='center'>\n" +
            "    <div class='clearfix pc-shop-go'>\n" +
            "     <div class='fl pc-shop-fl'>\n" +
            "      <input type='checkbox' name='s_all' style='margin-left:5px'>\n" +
            "      <label style='margin-left: 15px;'>全选</label>\n" +
            "      <a href='javascript:batchDeleteShopCar()'>批量删除</a>\n" +
            "     </div>\n" +
            "     <div class='fr pc-shop-fr'>\n" +
            "      <p>共有 <em class='red pc-shop-shu' id='count'>0</em> 款商品，总计（含运费）</p>\n" +
            "      <span id='sum'>¥0.00</span>\n" +
            "      <a href='#'>去付款</a>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "   </div>"+
			"    <div class='clearfix' style='padding:30px 20px;'>\n" +
            "     <div class='fr pc-search-g pc-search-gs'>\n" +
            "      <a style='display:none' class='fl ' href='javascript:void(0);'>上一页</a>\n" +
            "      <a href='javascript:queryOrderByUserId(0,5);' class='current'>1</a>\n" +
            "      <a href='javascript:queryOrderByUserId(6,5);'>2</a>\n" +
            "      <a href='javascript:queryOrderByUserId(11,5);'>3</a>\n" +
            "      <a href='javascript:queryOrderByUserId(16,5);'>4</a>\n" +
            "      <a href='javascript:queryOrderByUserId(21,5);'>5</a>\n" +
            "      <a href='javascript:queryOrderByUserId(26,5);'>6</a>\n" +
            "      <a href='javascript:queryOrderByUserId(31,5);'>7</a>\n" +
            "      <span class='pc-search-di'>…</span>\n" +
            "      <a href='javascript:;'>1088</a>\n" +
            "      <a title='使用方向键右键也可翻到下一页哦！' class='' href='javascript:;'>下一页</a>\n" +
            "     </div>\n" +
            "    </div>";

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
                var html="<tr id='tr_"+content.shopcarid+"'>\n" +
                    "        <th><input type='checkbox' name='stuCheckBox' value='"+content.shopcarid+"' style='margin-left:15px; float:left'></th>\n" +
                    "        <th class='tab-th-1'>\n" +
                    "         <a href='#' style='border: 0px;'><img src='/"+content.productpicture+"' style='height: 120px;width: 120px;max-width:200px;margin-left: 50px' alt='"+content.productname+"' title='"+content.productname+"'></a>\n" +
                    "         <a href='#' style='margin-left: 50px;width: 200px' class='tab-title'>"+content.productname+"</a>\n" +
                    "        </th>\n" +
                    "        <th>\n" +
                    "         <p>"+content.productdescribe+"</p>\n" +
                    "         <p></p>\n" +
                    "        </th>\n" +
                    "        <th>\n" +
                    "         <p>售价￥<span class='red'>"+content.productprice+"</span></p>\n" +
                    "         <p>市场价￥<span style='text-decoration: line-through;'>"+content.marketprice+"</span></p>\n" +
                    "         <br/>\n" +
                    "        </th>\n" +
                    "        <th class='tab-th-2'>\n" +
                    "         <div onclick='minus(this)' class='Xcontent32'><img src='images/shangpinxiangqing/X15.png'></div>\n" +
                    "         <input class='input' type='number' max='1000' oninput='computations(this)' onpropertychange='computations(this)' value='"+content.orderamount+"'>" +
                    "         <div onclick='add(this)' class='Xcontent33'><img src='images/shangpinxiangqing/16.png'></div>\n" +
                    "        </th>\n" +
                    "        <th class='red'>￥<span id='xiaoji'>"+content.productprice*content.orderamount+"</span></th>\n" +
                    "        <th>\n" +
                    "         <p><a href='javascript:delectShopCarById("+content.shopcarid+")'>删除</a></p>\n" +
                    "         <br/>\n"
				if(content.isOnFavorites==0){
                    html+= "      <p id='move_"+content.productid+"'><a href='javascript:shiftToFavorites("+content.productid+",this)'>移入收藏夹</a></p>\n" ;
				}
                html+="</th></tr>";

                $("#car").append(html);
                if(index==0){
                    var i=0
                    $(".pc-shopping-title").find("li").each(function(){
                        if(i==0){
                            $(this).find("a").text("全部商品("+content.countNumb[0]+")");
						}
                        if(i==1){
                            $(this).find("a").text("热销商品("+content.countNumb[1]+")");
                        }
                        if(i==2){
                            $(this).find("a").text("新品("+content.countNumb[2]+")");
                        }
                        if(i==3){
                            $(this).find("a").text("已下架("+content.countNumb[3]+")");
                        }
						i++;
                    });
				}
            });

            /*全选 反选*/
            $('input[name="s_all"]').click(function(){
                if($(this).is(':checked')){
                    $('input[name="stuCheckBox"]').each(function(){
                        //此处如果用attr，会出现第三次失效的情况
                        $(this).prop("checked",true);
                        $('input[name="s_all"]').prop("checked",true);
                        summing();
                    });
                }else{
                    $('input[name="stuCheckBox"]').each(function(){
                        $(this).removeAttr("checked",false);
                        $('input[name="s_all"]').removeAttr("checked",false);
                        summing();
                    });
                }

            });
            //选择商品计算总计
            $('input[name="stuCheckBox"]').click(function () {
                summing();
            });

        }
    }

    //查询物流
	function queryExpress(orderid) {
        $.ajax({
            url:"${pageContext.request.contextPath}/queryExpressBycode.action",
            async:false,
            type: 'POST',
            data:{"id":orderid},
            traditional: true,
            timeout: 5000,
            cache: false,
            success: succFunction, //成功执行方法
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction  //错误执行方法
        });
        function LoadFunction() {

        }
        function erryFunction(){

        }
        function succFunction(data) {
            var json= JSON.parse(data);
            $(".member-head").nextAll("div").remove();
            $(".member-heels").text("物流详情");
			$(".member-right").append(
			    "<div data-mohe-type='kuaidi_new' class='g-mohe ' id='mohe-kuaidi_new' style='margin: 0px auto;width: 800px;height:700px;overflow-y:scroll;'>\n" +
                "    <div id='mohe-kuaidi_new_nucom'>\n" +
                "        <div class='mohe-wrap mh-wrap'>\n" +
                "            <div class='mh-cont mh-list-wrap mh-unfold'>\n" +
                "                <div class='number' style='height: 50px;margin-top: 20px;font-size: 24px'>\n" +
                "                    <label>快递单号:</label><span class='id' style='color: #2a91d8'></span>&nbsp;&nbsp;\n" +
                "                    <label>快递公司:</label><span class='name' style='color: #2a91d8'>${name}</span>\n" +
                "                </div>\n" +
                "                <div class='mh-list'>\n" +
                "                    <ul id='express_ul'>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "                <div style='width: auto;height: 100px;'></div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>"

			);
            console.log(data);

            //var json=data;
            //console.log(json);
            //console.log(json.status);
            $(".number").find(".id").html(json.result.number);
            $(".number").find(".name").html(json.result.type);
            $.each( json.result.list, function(index, content) {
                console.log(json.status);
                if (index == 0) {
                    $("#express_ul").append("<li class='first' style='height:60px;'>\n" +
                        "<p>" + content.time + "</p>\n" +
                        " <p>" + content.status + "</p>\n" +
                        " <span class='before'></span><span class='after'></span><i class='mh-icon mh-icon-new'></i></li>");
                }else{
                    $("#express_ul").append("<li  style='height:60px;'>\n" +
                        "<p>" + content.time + "</p>\n" +
                        " <p>" + content.status + "</p>\n" +
                        " <span class='before'></span><span class='after'></span></li>");
                }
            });
            $("#express_ul").append("<li style='margin-left:-100px;margin-top:50px;height: 120px;width: 100%;border-top: 1px #d3d3d3 solid'></li>");
        }
    }

    //通过id将购物车内商品移入收藏夹
    function shiftToFavorites(shopcarid) {
        var data=ajax('insertShiftToFavorites.action',shopcarid);
        console.log(data+"**")
        if(data==1){
            //$(obj).parents("tr").remove();
            //$("#tr_"+shopcarid).remove();
			$("#move_"+shopcarid).remove();
			alert("已经成功移入收藏夹!");
        }
    }

    //通过id删除购物车商品
    function delectShopCarById(shopcarid) {
        var data=ajax('delectShopCarById.action',shopcarid);
        console.log(data+"**")
        if(data==1){
            //$(obj).parents("tr").remove();
            //$("#tr_"+shopcarid).remove();
            $("#tr_"+shopcarid).slideToggle();
        }
        summing();
    }

    //批量删除
	function batchDeleteShopCar() {
        var ids=new Array();
        $('input[name="stuCheckBox"]').each(function(){
            if($(this).is(':checked')){
                console.log($(this).val());
                ids.push($(this).val());
            }
        });
        var  data=ajax("delectBatchDeleteShopCar.action",ids);
        if(data==1){
            $('input[name="stuCheckBox"]').each(function(){
                if($(this).is(':checked')){
                    $(this).parents("tr").remove();
                }
            });
            summing();
		}else{
            alert("删除失败!");
		}
    }

    function ajax(url,data) {
        var flag;
        $.ajax({
            url:"${pageContext.request.contextPath}/"+url,
            async:false,
            type: 'POST',
            data:{"id":data},
            traditional: true,
            timeout: 5000,
            cache: false,
            success: succFunction, //成功执行方法
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction  //错误执行方法
        });
        function LoadFunction() {

        }
        function erryFunction(){
            flag=0;
        }
        function succFunction(data) {
            if(data) {
                flag=1;
            }else {
                flag=0;
            }
        }
        return flag;
    }
    //计算总计
    function summing() {
        var count=0,sum=0;
        $('input[name="stuCheckBox"]').each(function () {
            if($(this).is(':checked')){
                sum+=parseInt($(this).parent().siblings("th").find("#xiaoji").text());
                count++;
            }
        })
		if(sum==0){
            $("#sum").text("¥0.00");
            $("#count").text(count);
		}else {
            $("#sum").text("¥"+sum);
            $("#count").text(count);
		}

    }
    //计算小计 并显示到小计栏
    function computations(obj){
		console.log("+++"+$(obj).val());
		var price=$(obj).parent().siblings("th").find(".red").text();
		var numb=$(obj).parent().find(".input").val();
		var sum=price*numb;
		$(obj).parent().siblings("th").find("#xiaoji").text(sum);
        summing();
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
        var mydate = new Date(mydate);
        var str = "" + mydate.getFullYear()+"-";
        var mm = mydate.getMonth()
        if(mydate.getMonth()>9){
            str += mm+"-";
        } else{
            str += "0" + mm+"-";
        }
        if(mydate.getDate()>9){
            str += mydate.getDate()+" ";
        } else{
            str += "0" + mydate.getDate()+" ";
        }
        if(mydate.getHours()>9){
            str += mydate.getHours()+":";
		}else {
            str += "0"+mydate.getHours()+":";
		}
        if(mydate.getMinutes()>9){
            str += mydate.getMinutes()+":";
        }else {
            str += "0"+mydate.getMinutes()+":";
        }
        if(mydate.getSeconds()>9){
            str += mydate.getSeconds();
        }else {
            str += "0"+mydate.getSeconds();
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
        $(obj).siblings("input").val(value); //无法改变value=""li的值
        $(obj).siblings("input").attr("value",value);
        computations(obj);
    };

    function minus(obj){
        var num = $(obj).siblings("input").val()
        if(num>0){
            $(obj).siblings("input").val(num-1);  //无法改变value=""li的值
            $(obj).siblings("input").attr("value",num-1);
        }
        computations(obj);
    };
</script>
</body>
</html>