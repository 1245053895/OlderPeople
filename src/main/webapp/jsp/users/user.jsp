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
	<title>购物商城-个人中心</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.SuperSlide.js"></script>
	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.8.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-labelauty.js"></script>
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
        function send() {
            var data=$("#username").val();
            console.log(data+"ffff");
            $.ajax({
                url:"${pageContext.request.contextPath}/CustomerUpdate.action",
                async:true,
                type: 'POST',
                data:{'data':data},
                traditional: true,
                timeout: 10000,
                cache: false,
                success: succFunction, //成功执行方法
                beforeSend: LoadFunction, //加载执行方法
                error: erryFunction  //错误执行方法
            });
            function LoadFunction() {
                $(".loading").find("img").css("display","block");
                $(".loading").find("div").css("display","block");
            }
            function erryFunction(){
                $(".loading").find("img").attr("src","${pageContext.request.contextPath}/jsp/users/images/loading.gif");
                $(".loading").find("div").text("加载失败!");
            }
            function succFunction(data){
                if(data.result){
                    $("#error").text("")
                }else {
                    $("#error").text("此用户已经被注册")
                    $("#error").css("font-color","#FF0000")
                }
            }
		}
	</script>

	<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/users/css/jquery-labelauty.css">
	<style>
		/*ul { list-style-type: none;}*/
		li { display: inline-block;}
		li { margin: 0px 0;}
		input.labelauty + label { font: 12px "Microsoft Yahei";}
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
			<form action="${pageContext.request.contextPath}/HeadPictrueShow.action" method="post" enctype="multipart/form-data">
			 <div class="member-apart clearfix">
				<div class="fl">
				<%--	<a href="#"><img src="jsp/users/img/mem.png"></a>--%>
					<input width="200px" height="200px" type="file" id="xdaTanFileImg" onchange="xmTanUploadImg(this)"   name="userC" style="display: none" />
					<img src="${userAndBrithday.userC}" id="xmTanImg" width="1000px" height="100px" style="width: 80px;height: 80px;margin-right: 12px;border-radius: 2px"/>
				</div>
					<div class="fl">
						用户名：${userAndBrithday.username}<br>
						账号：${userAndBrithday.userid}<br><br>
					</div>
					<div class="f1">
						<button onclick="$('#xdaTanFileImg').click();" class="btn btn-success" type="button" style="background-color: #ea4949;border: none;border-radius: 10%;color: #FFFFFF;font-size: 8px">更换头像</button>
						<button id="btn_upload" class="btn btn-success" type="submit" style="display: none;background-color: #ea4949;border: none;border-radius: 10%;color: #FFFFFF;font-size: 8px">提交</button>
					</div>
			  </div>
			</form>
			<div class="member-lists" id="leftinfo">
				<dl  onclick = "change(this);">
					<dt>个人中心</dt>
					<dd><a href="/CustomerInformation.action">个人资料</a></dd>
					<dd><a href="/CustomersAddress.action">收货地址</a></dd>
					<dd><a href="/UpdataPwdPage.action">修改登录密码</a></dd>
					<dd><a href="/MyCredits.action">我的积分</a></dd>
				</dl>

			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"><h2>个人资料</h2></div>
			</div>
			<div class="member-border">

				<div class="member-caution clearfix">
					<form id="form1" action="${pageContext.request.contextPath}/CustomerUpdate.action" method="post">
						<ul>
						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">用户名 </div>
							<span id="erro" style="color: red">${error}</span>
							<div class="warn3"><input   id="username" onblur="send()" class="inputx " type="text" name="username" value="${userAndBrithday.username}" readonly="readonly"></div>

						</li>
						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">性别</div>
							<span class="warn3">
								<ul style="height: 0px;margin-top: -10px;margin-left: -25px">
									<li style="border-bottom: 0px;"><input  type="radio" name="usersex" data-labelauty="男" value="1" <c:if test="${userAndBrithday.usersex==1}">checked></c:if></li>
									<li style="border-bottom: 0px;"><input type="radio" name="usersex" data-labelauty="女" value="0" <c:if test="${userAndBrithday.usersex==0}">checked></c:if></li>
								</ul>
							</span>

						</li>

						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">真实姓名</div>
							<div class="warn3"><input  class="inputx" type="text" name="userrealname" value="${userAndBrithday.userrealname}" readonly="readonly">  </div>

						</li>

						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">出生年月</div>
							<div class="warn3">
								<select style="width: 80px" name = "Year">
									<option selected = "selected">${temp[0]}</option>
									<option value = "2014">2018</option>
									<option value = "2015">2017</option>
									<option value = "2016">2016</option>
									<option value = "2017">2015</option>
									<option value = "2018">2014</option>
									<option value = "2014">2013</option>
									<option value = "2015">2012</option>
									<option value = "2016">2011</option>
									<option value = "2017">2010</option>
									<option value = "2018">2009</option>
									<option value = "2014">2008</option>
									<option value = "2015">2007</option>
									<option value = "2016">2006</option>
									<option value = "2017">2005</option>
									<option value = "2018">2004</option>
									<option value = "2014">2003</option>
									<option value = "2015">2002</option>
									<option value = "2016">2001</option>
									<option value = "2017">2000</option>
									<option value = "2018">1998</option>
									<option value = "2018">1997</option>
									<option value = "2018">1996</option>
									<option value = "2018">1995</option>
									<option value = "2018">1994</option>
									<option value = "2018">1993</option>
									<option value = "2018">1992</option>
									<option value = "2018">1991</option>
									<option value = "2018">1990</option>



								</select> 年
								<select style="margin-left: 20px;width: 60px" name = "Month">
									<option>${temp[1]}</option>
									<option value = "02">02</option>
									<option value = "03">03</option>
									<option value = "04">04</option>
								</select> 月
								<select style="margin-left: 20px;width: 60px" name = "Day">
									<option>${temp[2]}</option>
									<option value = "02">02</option>
									<option value = "03">03</option>
									<option value = "04">04</option>
								</select> 日
							</div>

						</li>

						<li class="clearfix">
							<div class="warn6"></div>
							<div class="warn2">邮箱地址</div>
							<div class="warn3" id="text"><input  class="inputx " type="text" name="useremail" value="${userAndBrithday.useremail}" readonly="readonly"> </div>
						</li>
							<li class="clearfix">
								<a class="warn4" href="javascript:void(0);" onclick="status(this)">修改</a>
							</li>
					</ul>
					</form>


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
						<div class="fl lss-img"><img src="${pageContext.request.contextPath}/img/icon/code.png" alt=""></div>
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

    //选择图片，马上预览
    function xmTanUploadImg(obj) {

        var file = obj.files[0];

        console.log(obj);console.log(file);
        console.log("file.size = " + file.size);  //file.size 单位为byte

        var reader = new FileReader();

        //读取文件过程方法
        reader.onloadstart = function (e) {
            console.log("开始读取....");
        }
        reader.onprogress = function (e) {
            console.log("正在读取中....");
        }
        reader.onabort = function (e) {
            console.log("中断读取....");
        }
        reader.onerror = function (e) {
            console.log("读取异常....");
        }
        reader.onload = function (e) {
            console.log("成功读取....");

            var img = document.getElementById("xmTanImg");
            img.src = e.target.result;
            //或者 img.src = this.result;  //e.target == this
        }

        reader.readAsDataURL(file)

        $('#btn_upload').show();
        reads(obj.files[0]);
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
    })

    var flag=true;
    function status(obj,id) {
        if(flag){
            $(".inputx").removeAttr("readonly");
            $(".inputx").css("border","1px #E6E6FA solid ")
            $(obj).text("提交");
            flag=false;
        }else {
            $("#form1").submit();
        }

    }

    function update(obj,id){
        layer.confirm('确认要修改吗？',{icon:0,},function(index){
            $(obj).parents("tr").remove();
            layer.msg('已修改!',{icon:1,time:1000});

        });
    }

</script>
<script>
    $(function(){
        $(':input').labelauty();
    });
</script>
</body>
</html>