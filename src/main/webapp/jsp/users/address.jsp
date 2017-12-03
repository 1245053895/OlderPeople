<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmd" uri="http://java.sun.com/jstl/fmt_rt" %>
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
	<title>购物商城-收货地址</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">

	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/car/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/car/home.css">

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
				<div class="member-heels fl"><h2>地址管理</h2></div>
			</div>

			<div class="member-border">

				<div class="member-caution clearfix">

					<ul>
						<li class="clearfix">
							<div class="warn2" style="margin-left: 10px;border: none;display: none">地址编号</div>
							<div class="warn2" style=" border-right:1px dashed transparent; margin-left: -25px;">收货人</div>
							<div class="warn2" style="margin-left: 10px;border: none;margin-left: 35px;">详细地址</div>
							<div class="warn2" style="margin-left: 10px;border: none;margin-left: 40px;">邮编</div>
							<div class="warn2" style="margin-left: 10px;border: none;margin-left: -22px;">电话</div>
							<div class="warn2" style="margin-left: 10px;border: none">操作</div>
							<input type="button" class="warn2" style="width:100px;float: left;margin-left: -35px;border: 1px;font-weight: 800;text-align:center;margin-top:6px;font-size:15px;color: white;background-color:#FF9100;border-radius: 5px" id="xz" onClick="xdz()" value="添加新地址">

						</li>

						<script>
                            function xdz(){
                                document.getElementById("dz").style.display = "block";
                                document.getElementById("xz").style.display = "none";
                            }
                            function bc(){
                                document.getElementById("xz").style.display = "block";
                                document.getElementById("dz").style.display = "none";
                            }
						</script>
						<form action="${pageContext.request.contextPath}/InsertGainAddress.action" method="post">
							<li class="clearfix" style="display: none;background-color: #f5f5f5" id="dz">
								<input name="userid" value="${user.userid}"  readonly="ture" class="warn2" style="margin-left: 10px;font-weight: normal;border-color: red;display: none">
								<input name="gainname" placeholder="收货人姓名" class="warn2" style="margin-left: 10px;font-weight: normal;border-color: #e0e0e0; border-right: 2px #e0e0e0 solid;">
								<input name="gainaddress" placeholder="地址" class="warn2" style="margin-left: 10px;font-weight: normal;border-color: #e0e0e0; border-right: 2px #e0e0e0 solid;" >

								<input name="gaincode" placeholder="邮编只能填数字"  class="warn2" onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" style="margin-left: 10px;font-weight: normal;border-color: #e0e0e0; border-right: 2px #e0e0e0 solid;">
								<input name="gainmobile" placeholder="电话"  class="warn2" style="margin-left: 10px;font-weight: normal;border-color: #e0e0e0; border-right: 2px #e0e0e0 solid;">
								<input  type="submit" value="保存" class="warn2" style=" width :85px ;height:25px;margin-left: 45px;border-color:transparent;border-radius: 5px;background-color:#ea4949;color:white;" onClick="bc()">
								<input  value="取消" class="warn2" style="width: 85px;height: 25px; margin-left: 10px;border-radius: 5px;background-color:#6c90ab;color:white;border-color: transparent" onClick="bc()">
							</li>
						</form>


						<c:forEach items="${gainaddres}" var="gainaddres1">
							<form id="form${gainaddres1.gainid}" action="${pageContext.request.contextPath}/UpdateGainAdress.action" method="post">
								<li class="clearfix" style="background-color: #ffffff">
									<div class="warn2" style="margin-left: 10px;border: none;font-weight: normal;display: none">
										<input  class="inputx  aa${gainaddres1.gainid}" name="gainid" value="${gainaddres1.gainid}" readonly="true" >
									</div>
									<div class="warn2" style="margin-left: 10px;border: none;font-weight: normal">
										<input  class="inputx  aa${gainaddres1.gainid}" name="gainname" value="${gainaddres1.gainname}" readonly="true" style="padding-left:35px">
									</div>
									<div class="warn2" style="margin-left: -60px;border: none;font-weight: normal">
										<input  class="inputx  aa${gainaddres1.gainid}" name="gainaddress" value="${gainaddres1.gainaddress}"  readonly="true" style="width: 302px;">
									</div>
									<div class="warn2" style="margin-left: 130px;border: none;font-weight: normal">

										<input  class="inputx aa${gainaddres1.gainid}" name="gaincode" value="${gainaddres1.gaincode}" readonly="true" style="padding-left:35px;">
									</div>
									<div class="warn2" style="margin-left: -45px;border: none;font-weight: normal">
										<input class="inputx  aa${gainaddres1.gainid}" name="gainmobile" value="${gainaddres1.gainmobile}" readonly="true">
									</div>
									<div class="warn2" style="margin-left: 10px;border: none;font-weight: normal">
										<a href="javascript:void(0);" onclick="status(this,'${gainaddres1.gainid}')">修改</a>
										<span style="margin: auto 4px">|</span>
										<a title="删除" href="javascript:void(0);" onclick="user_del(this,'${gainaddres1.gainid}')">删除</a>
									</div>

									<a title="默认" href="javascript:void(0);" <c:if test="${gainaddres1.gainA.equals('1')}">style="background-color: #f4c0b1;padding: 3px 10px;margin-left: -15px;"</c:if> onclick="moren(this,'${gainaddres1.gainid}')">默认</a>
								</li>
							</form>
						</c:forEach>

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
	/*用户-删除*/
    function user_del(obj,id){
        var flag=confirm('确认要删除吗？')
        if(flag){
            $(obj).parents("li").remove();
            window.location.href="${pageContext.request.contextPath}/DelectGainaddress.action?gainid="+id;
        }
    }

	/*收货地址默认*/
    function moren(obj,id){
        var flag=confirm('确认要选择修改吗？')
        if(flag){
            window.location.href="${pageContext.request.contextPath}/UpdateGainAdressStatus.action?gainid="+id;
        }
    }
    var flag=true;
    function status(obj,id) {
        if(flag){
            $(".aa"+id).removeAttr("readonly");
            $(".aa"+id).css("border","1px #E6E6FA solid");
            $(obj).text("提交");
            flag=false;
        }else {
            $("#form"+id).submit();
        }

    }
</script>
</body>
</html>