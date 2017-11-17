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

	<jsp:include page="/jsp/users/head.jsp"></jsp:include>

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
                queryFavoritesByUserId(0,5);
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
            "\n" +
            "      </ul>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "\n" +
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
                    "        <div class='member-minute clearfix'>\n" +
                    "         <span>"+content.createtime+"</span>\n" +
                    "         <span>订单号：<em>"+content.orderid+"</em></span>\n" +
                    "         <span class='member-custom'>客服电话：<em>010-6544-0986</em></span>\n" +
                    "        </div>\n" +
                    "        <div class='member-circle clearfix'>\n" +
                    "         <div class='ci1'>\n";

                console.log(content.productCustoms);
				$.each(content.productCustoms,function(i, productCustom) {
                    productCount++;
                    htmlStr2+="    <div class='ci7 clearfix'>\n" +
                        "           <span class='gr1'><a href='#'><img src='/"+productCustom.productpicture+"' style='height: 80px;width: 80px;max-width:200px;' title='"+productCustom.productname+"' about='' width='60' height='60'></a></span>\n" +
                        "           <span class='gr2' style='margin-left: 50px;width: 150px;height: 85px'><a href='#'>"+productCustom.productname+"</a></span>\n" +
                        "           <span class='gr3'>X"+productCustom.shoppingcount+"</span>\n" +
                        "          </div>\n";
                });

				htmlStr3="         </div>\n" +
					"         <div class='ci2 height"+index+"'>"+content.gainname+"</div>\n" +
					"         <div class='ci3 height"+index+"'><p class='red'>￥<span>"+content.amountpay+"</span></p><p>";
				if(content.paytype==0){
                    htmlStr3+="在线支付";
				}else{
                    htmlStr3+="货到付款"
				}
                htmlStr3+="</p></div>\n" +
					"         <div class='ci4 height"+index+"'><p>2015-09-22</p></div>\n" ;
				switch (content.status){
					case 0:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>交易关闭</p>"
						if(content.shippingcode!=null||content.shippingcode!=""){
                            htmlStr3+="<p><a href='#'>物流跟踪</a></p>"
						}
						htmlStr3+="<p><a href='#'>订单详情</a></p></div>\n";

                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>重新购买</a> </p></div>\n";
                        break;
                    case 1:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>待发货</p><p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>提醒发货</a> </p> <p><a href='#'>取消订单</a> </p></div>\n";
                        break;
                    case 2:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>已发货</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>确认收货</a> </p></p></div>\n";
                        break;
                    case 3:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>已签收</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>评价</a></p><p><a href='#' class='member-touch'>售后服务</a></p></div>\n";
                        break;
                    case 4:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>已完成</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p>剩余15时20分</p><p><a href='#' class='member-touch'>再次购买</a></p><p><a href='#' class='member-touch'>售后服务</a></p></div>\n";
                        break;
                    case 5:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>拒收</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>拒收理由</a> </p></div>\n";
                        break;
                    case 6:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>申请退货</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>撤销申请</a> </p></div>\n";
                        break;
                    case 7:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>同意退货</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p>剩余15时20分</p><p><a href='#' class='member-touch'>填写物流</a> </p><p><a href='#' class='member-touch'>撤销申请</a> </p></div>\n";
                        break;
                        break;
                    case 8:
                        htmlStr3+="<div class='ci5 height"+index+"'><p>拒绝退货</p><p><a href='#'>物流跟踪</a></p> <p><a href='#'>订单详情</a></p></div>\n";
                        htmlStr3+= "<div class='ci5 ci8 height"+index+"'><p><a href='#' class='member-touch'>查看原因</a> </p></div>\n";
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
    function queryFavoritesByUserId(start,count,status,conditions) {
        console.log("这是收藏夹");
        var favorites="<div class='member-border'>\n" +
            "    <div class='member-return H-over'>\n" +
            "     <div class='member-vessel'>\n" +
            "      <div class='member-volume fl'>\n" +
            "       <a href='#' class='fl member-btn-fl'></a>\n" +
            "       <div class='member-whole clearfix' id='dingdan'>\n" +
            "        <ul id='H-table' class='H-table'>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,5,-1);'>全部商品<em>(44)</em></a></li>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,5,0);'>热销商品<em>(44)</em></a></li>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,5,2);'>已下架<em>(44)</em></a></li>\n" +
            "         <li><a href='javascript:queryFavoritesByUserId(0,5,3);'>积分兑换<em>(44)</em></a></li>\n" +
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
                var html="<li class='module'>\n" +
                    "          <ul class='shop-tools clearfix'>\n" +
                    "           <li class='shop-tools-item1' style='background-position:-20px -20px;' title='加入购物车'>置顶</li>\n" +
                    "           <li class='shop-tools-item2' style='background-position:4px -98px;' title='删除商品'>删除</li>\n" +
                    "          </ul>\n" +
                    "          <a href='#'><img src='/"+content.productpicture+"' style='overflow:hidden;width:125px;height: 125px' title='"+content.productname+"'></a>\n" +
                    "          <a href='#'>"+content.productname+"</a>\n" +
                    "          <p>￥"+content.productprice+" <i style='text-decoration: line-through;color: #666a6e;font-size: 11px;'>￥"+content.marketprice+"</i></p>\n" +
                    "         </li>";

                $("#favorites").append(html);
            });
        }
    }
    function queryShopCarByUserId(start,count,status,conditions) {
        var car="<div class='center ' id='dingdan'>\n" +
            "    <ul class='pc-shopping-title clearfix'>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,-1);'>全部商品(10)</a></li>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,2);'>已下架(0)</a></li>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,0);'>热销商品(0)</a></li>\n" +
            "     <li><a href='javascript:queryShopCarByUserId(0,5,1);'>新品(0)</a></li>\n" +
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
                console.log(content.shoppingcount);
                var html="<tr>\n" +
                    "        <th><input type='checkbox'  style='margin-left:15px; float:left'></th>\n" +
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
                    "         <input class='input' value='"+content.orderamount+"'>" +
                    "         <div onclick='add(this)' class='Xcontent33'><img src='images/shangpinxiangqing/16.png'></div>\n" +
                    "        </th>\n" +
                    "        <th class='red'>￥<span>"+content.productprice*content.orderamount+"</span></th>\n" +
                    "        <th>\n" +
                    "         <p><a href='#'>删除</a></p>\n" +
                    "         <br/>\n" +
                    "         <p><a href='#'>移入收藏夹</a></p>\n" +
                    "        </th>\n" +
                    "       </tr>";

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