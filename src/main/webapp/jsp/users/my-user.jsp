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
	<title>购物商城-会员中心</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.SuperSlide.js"></script>
	<script src="${pageContext.request.contextPath}/jsp/users/js/md5.js"></script>
	<script src="${pageContext.request.contextPath}/jsp/users/js/search/md5.min.js"></script>
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
				<div class="fl"><a href="#"><img src="${userAndBrithday.userC}"></a></div>
				<div class="fl">
					用户名：${userAndBrithday.userrealname}<br>
					<%--<p></p>--%>
					账号：${userAndBrithday.username}
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
				<div class="member-heels fl"><h2>修改登录密码</h2></div>
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
							<div class="warn2">绑定手机号</div>
							<div id="phone" class="warn3"></div>
							<span style="margin-left: -400px; height:33px; line-height:33px; float:left; color: #A8A8A8;font-size: 12px">若已丢失或停用，请立即更换，避免账户被盗</span>
							<div class="warn4"><a href="#" onclick="sjyz()">更换</a> </div>
						</li>
						<script>
                            function mmyz() {
                                var p=prompt("请输入原始密码验证身份");
                                if(p!=null){
                                    var yz = md5(p);
                                    //yz为用户输入的密码，验证过后弹出新密码框；xmm的值是用户输入的新密码
                                    var password='${sessionScope.user.userpwd}';
                                    if (password!=yz){
                                        alert("密码不正确，请重新输入");
                                        return false;
                                    }
                                    var xmm = md5(prompt("请输入新密码"));
                                    if(xmm!=null){
                                        if(xmm==""){
                                            alert("密码不能为空");
                                            return false;
                                        }

                                        $.ajax({
                                            url:"${pageContext.request.contextPath}/updateLoginPassword.action",
                                            data:{"userpwd":xmm},
                                            type:"POST",
                                            timeout:6000,
                                            success:successFunction,
                                            beforeSend:LoadFunction,
                                            error:errorFunction
                                        })
                                        function LoadFunction() {

                                        }
                                        function successFunction(data) {
                                            alert("密码修改成功");
                                        }
                                        function errorFunction() {

                                        }
									}

                                }else {

								}
							}

                            function sjyz() {
                                var p=prompt("请输入登录密码验证身份")
								if(p!=null){
                                    var yz = md5(p);
                                    var password='${sessionScope.user.userpwd}';
                                    if (password!=yz){
                                        alert("密码不正确，请重新输入");
                                        return false;
                                    }
                                    var xsj = prompt("请输入新手机号")
									if(xsj!=null){
                                        if(xsj==""){
                                            alert("输入的手机号不能为空");
                                            return false;
                                        }

                                        $.ajax({
                                            url:"${pageContext.request.contextPath}/updataLoginPhone.action",
                                            data:{"userphone":xsj},
                                            type:"post",
                                            timeout:6000,
                                            success:successfunction,
                                            beforesend:loadfunction,
                                            error:errorfunction,
                                        })

                                        function successfunction() {
                                            alert("电话号码修改成功")

                                        }
                                        function loadfunction() {

                                        }
                                        function errorfunction() {

                                        }
									}
								}else {

								}


                            }
						</script>
						<!--
                                                <li class="clearfix">
                                                    <div class="warn1"></div>
                                                    <div class="warn2">密保问题</div>
                                                    <div class="warn3">建议您设置密保问题。  </div>
                                                    <div class="warn4"><a href="#">设置密保</a> </div>
                                                </li>
                        -->
						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">登录密码</div>
							<div class="warn3">互联网账号存在被盗风险，建议您定期更改密码以保护账户安全。</div>
							<div class="warn4"><a href="#" onclick="mmyz()">修改</a> </div>
						</li>



						<!--
                                                <li class="clearfix">
                                                    <div class="warn6"></div>
                                                    <div class="warn2">支付密码</div>
                                                    <div class="warn3">安全程度：  建议您设置更高强度的密码。</div>
                                                    <div class="warn5"><a href="#">支付密码管理</a></div>
                                                </li>
                        -->
					</ul>
					<div class="member-prompt">
						<p>安全提示：</p>
						<p>您当前IP地址是：<i class="reds">110.106.0.01</i>  北京市          上次登录的TP： 2015-09-16  <i class="reds">110.106.0.02 </i> 天津市</p>
						<p>1. 注意防范进入钓鱼网站，不要轻信各种即时通讯工具发送的商品或支付链接，谨防网购诈骗。</p>
						<p>2. 建议您安装杀毒软件，并定期更新操作系统等软件补丁，确保账户及交易安全。      </p>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>


<div style="height:100px"></div>

<jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>

<script type="text/javascript">
    var str=${sessionScope.user.userphone}+"";
	/*console.log("----"+str);*/
    $("#phone").text(str.substring(0,3)+"****"+str.substring(7,11));
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