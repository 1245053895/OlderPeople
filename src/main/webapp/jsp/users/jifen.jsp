<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<title>购物商城-会员中心</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
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

	<style type="text/css">
		img{
			float: left;
			width: 60px;
			height: 60px;
			overflow: hidden;
			text-align: center;
			margin: 0 10px 0 20px;
		}
	</style>

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
				<li><a href="" target="_blank" title="积分商城">积分商城</a></li>
				<li><a href="${pageContext.request.contextPath}/queryTotalCommentshop.action" target="_blank" title="好评专区">好评专区</a></li>
				<li><a href="" target="_blank" title="关于我们">关于我们</a></li>
			</ul>
		</div>
		<!-- 导航   end  -->
	</div>

</header>

<section id="member">
	<div class="member-center clearfix">
		<div class="member-left fl">
			<div class="member-apart clearfix">
				<div class="fl"><a href="#"><img src="${userAndBrithday.userC}"></a></div>
				<div class="fl">
					用户名：${userAndBrithday.username}<br>
					<%--<p></p>--%>
					账号：${userAndBrithday.userid}
					<%--<p></p>--%>
				</div>
			</div>
			<div class="member-lists" id="leftinfo">
				<dl  onclick = "change(this);">
					<dt>个人中心</dt>
					<dd><a href="/CustomerInformation.action">个人资料</a></dd>
					<dd><a href="/CustomersAddress.action">收货地址</a></dd>
					<dd><a href="/UpdataPwdPage.action">修改登录密码</a></dd>
					<dd><a href="/MyCredits.action">我的积分</a></dd>
				</dl>
				<%--<dl  onclick = "change(this);">
					<dt>客户服务</dt>
					<dd><a href="#">退货订单</a></dd>
					<dd><a href="#">退货/退款记录</a></dd>
				</dl>--%>
			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"><h2>我的积分</h2></div>
			</div>
			<div class="member-border">
				<!--
                                <div class="member-secure clearfix">
                                    <div class="member-extent fl">
                                        <h2 class="fl">安全级别</h2>
                                        <ul class="fl">
                                            <li class="on"></li>
                                            <li class="on"></li>
                                            <li class="on"></li>
                                            <li class="on"></li>
                                            <li class="on"></li>
                                            <li class="on"></li>
                                            <li class="on"></li>
                                            <li class="on1"><a href="#"></a></li>
                                            <li class="on2"><a href="#"></a></li>
                                            <li class="on3"><a href="#"></a></li>
                                        </ul>
                                        <span class="fl">较高</span>
                                    </div>
                                    <div class="fr reds"><p> * 建议您开启全部安全设置，以保障您的账户及资金安全</p></div>
                                </div>
                -->
				<div class="member-caution clearfix">
					<ul>
						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">可用的积分</div>
							<div class="warn2" style="color: #ea4949;font-size: 16px;border: none">${totalCreditsById.totalCredits}</div>
						</li>
						<li class="clearfix">
							<%--<div class="warn1"></div>--%>
							<%--<div class="warn2">登录密码</div>--%>
							<%--<div class="warn3">互联网账号存在被盗风险，建议您定期更改密码以保护账户安全。</div>--%>
							<%--<div class="warn4"><a href="#">修改</a> </div>--%>
							<div class="warn2" style="margin-left: 10px;border: none">商品名称</div>
							<div class="warn2" style="margin-left: 260px;border: none">积分变化</div>
							<div class="warn2" style="margin-left: 200px;border: none">日期</div>
						</li>

						<c:forEach items="${totalCreditsByIds}" var="totalCreditsById">
						<li class="clearfix">
							<div class="warn2" style="margin-left: 10px;border: none;font-weight: normal;width: 380px;height: 60px">
								<a class="img" href=""><img src="${totalCreditsById.productpicture}" width="60px" height="60px"></a>
								<a style="width: 290px;height: 40px;overflow: hidden;line-height: 20px;text-align: left;display: block">${totalCreditsById.productname}</a>
								<span style="height: 20px;display: block;line-height: 20px;text-align: left">编号：${totalCreditsById.productid}</span>
							</div>
							<div class="warn2" style="margin-left: 15px;border: none;font-weight: normal;height: 60px">
								<span style="font-size: 24px;font-weight: 700;text-align: center;color: #ea4949;line-height: 60px">+${totalCreditsById.productcredits}</span>
							</div>
							<div class="warn2" style="float: right;margin-right: -40px;border: none;font-weight: normal;height: 60px;width: 300px;line-height: 60px"><fmt:formatDate value="${totalCreditsById.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
							</div>
						</li>
						</c:forEach>

						<!--
                                                <li class="clearfix">
                                                    <div class="warn1"></div>
                                                    <div class="warn2">密保问题</div>
                                                    <div class="warn3">建议您设置密保问题。  </div>
                                                    <div class="warn4"><a href="#">设置密保</a> </div>
                                                </li>
                        -->
						<%--<li class="clearfix">--%>
						<%--<div class="warn1"></div>--%>
						<%--<div class="warn2">验证手机</div>--%>
						<%----%>
						<%--<div class="warn3">134*****693  </div>--%>
						<%--<span style="margin-left: -400px; height:33px; line-height:33px; float:left; color: #A8A8A8;font-size: 12px">若已丢失或停用，请立即更换，避免账户被盗</span>--%>
						<%--<!----%>
						<%--<div class="warn3">您验证的手机：  --%>
						<%--<i class="reds">134*****693</i>--%>
						<%--若已丢失或停用，请立即更换，--%>
						<%--<i class="reds">避免账户被盗</i>--%>
						<%--</div>--%>
						<%---->--%>
						<%--<!--							<div class="warn5"><p>解绑请咨询搜小悦官方客服 <i>souyue@zhongsou.com  </i></p></div>-->--%>
						<%--<div class="warn4"><a href="#">更换</a> </div>--%>
						<%--</li>--%>
						<!--
                                                <li class="clearfix">
                                                    <div class="warn6"></div>
                                                    <div class="warn2">支付密码</div>
                                                    <div class="warn3">安全程度：  建议您设置更高强度的密码。</div>
                                                    <div class="warn5"><a href="#">支付密码管理</a></div>
                                                </li>
                        -->
					</ul>
					<%--<div class="member-prompt">--%>
					<%--<p>安全提示：</p>--%>
					<%--<p>您当前IP地址是：<i class="reds">110.106.0.01</i>  北京市          上次登录的TP： 2015-09-16  <i class="reds">110.106.0.02 </i> 天津市</p>--%>
					<%--<p>1. 注意防范进入钓鱼网站，不要轻信各种即时通讯工具发送的商品或支付链接，谨防网购诈骗。</p>--%>
					<%--<p>2. 建议您安装杀毒软件，并定期更新操作系统等软件补丁，确保账户及交易安全。      </p>--%>
					<%--</div>--%>
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