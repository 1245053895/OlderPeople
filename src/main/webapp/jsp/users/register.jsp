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
	<title>注册.购物商城</title>
	<link rel="shortcut icon" type="${pageContext.request.contextPath}/image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
<%--	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/home.css">--%>
	<link href="${pageContext.request.contextPath}/jsp/users/css/zhuce.css" rel="stylesheet" type="text/css" />
	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.11.3.min.js"></script>

	<script type="text/javascript">

        function len6to16(self) {
            var allNext = $(self).nextAll();
            if (self.value.length < 6 || self.value.length > 18) {
                $(allNext[0]).show();
                $(allNext[2]).text('输入内容在6-16位之间');
            }else{
                $(allNext[0]).show();
                $(allNext[2]).hide();
            }

        }
        function passwordEQ() {
            var passwordSet = $(':password');
            var allNext = $(passwordSet[1]).nextAll();
            if (passwordSet[0].value != passwordSet[1].value) {
                $(allNext[0]).show();
                $(allNext[2]).text('两次密码不一致');
            }else{
                $(allNext[0]).show();
                $(allNext[2]).hide();
            }
        }
        $(function () {
            $(':button').click(function () {
                var textBoxSet = $('.regTextBox');
                var errorSet = $('.error');
                var tipsSet = $('.tops');

                for (var i = 0; i < textBoxSet.length; i++) {
                    if (textBoxSet[i].value == undefined || textBoxSet[i].value == '') {
                        $(errorSet[i]).show();
                        $(tipsSet[i]).text('请输入内容');
                    }else{
                        /*$(allNext[0]).show();
                        $(allNext[2]).hide();*/
                        $("#form_submit").submit();
                    }
                }
            });
        });
	</script>

	<script type="text/javascript">
        function createXMLHttpRequest() {
            /*try {
                return new XMLHttpRequest();
            } catch (e) {
                try {
                    return new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e) {
                    return new ActiveXObject("Microsoft.XMLHTTP");
                }
            }*/
        }

        function send() {
            var data=$("#username").val();
            console.log(data+"ffff");
            $.ajax({
                url:"${pageContext.request.contextPath}/customerReginsterCheck.action",
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
            /*var xmlHttp = createXMLHttpRequest();
            xmlHttp.onreadystatechange = function() {
                if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    if(xmlHttp.responseText == "true") {
                        document.getElementById("error").innerHTML = "用户名已被注册！";
                    } else {
                        document.getElementById("error").innerHTML = "";
                    }
                }
            };

            xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            var username = document.getElementById("username").value;
            xmlHttp.send("username=" + username);*/
        }
	</script>

</head>
<body>

<div class="wrap">
	<div class="reg">
		<div class="head" style="height: 100px">
			<a href="index.jsp" class="logo">
				<img src="${pageContext.request.contextPath}/jsp/users/img/icon/logo2.png" height="90px" width="200px" style="margin-top: -12px;" />
			</a>
		</div>
		<div class="main">
			<div class="ad"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuce/zhucebg.jpg" width="730" height="500"/></div>
			<div class="form">
				<%--<form method="post" onsubmit="return false" action>--%>
					<h3>注册孝和商城</h3>
					<span style="float: right;margin-top:-32px;">已有账号！<a href="${pageContext.request.contextPath}/LoginPage.action" style=" text-decoration: none">登录</a></span>
					<form id="form_submit" action="${pageContext.request.contextPath}/CustomerReginster.action" method="post">
					<div class="list">
						<div class="box">
							<input  id="username" onblur="send()" type="text" name="username" class="regTextBox" placeholder="用户名" />
							<span class="icon"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuce/username.png" /></span>
							<span id="error" style="color: red"></span>
							<b class="error"></b>
							<span class="tops"></span>
						</div>
					</div>
					<div class="list">
						<div class="box">

							<input type="text" name="userphone" class="regTextBox" onblur="len6to16(this)" placeholder="手机号" />
							<span class="icon"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuce/telephone.png" /></span>
							<b class="error">×</b>
							<span class="tops"></span>
						</div>
					</div>
					<div class="list">
						<div class="box">
							<input type="password" id="password" name="userpwd" class="regTextBox" onblur="len6to16(this)" placeholder="密码"  />
							<span class="icon"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuce/key.png" /></span>
							<span class="error">×</span>
							<span class="tops"></span>
						</div>
					</div>
					<div class="list">
						<div class="box">
							<input type="password" id="confirmpwd" name="againpwd" class="regTextBox" onblur="passwordEQ()" placeholder="确认密码" />
							<span class="icon"><img src="${pageContext.request.contextPath}/jsp/users/images/zhuce/key.png" /></span>
							<b class="error">×</b>
							<span class="tops"></span>
						</div>
					</div>
					<div>
						<%--<a href="javascript: $('#form_submit').submit;"><input type="button" value="立即注册" /></a>--%>
						<a href="javascript:void(0)"><input type="button" value="立即注册" /></a>
					</div>
					</form>


					<input type="checkbox" checked="checked" style="margin-top:10px;" />同意
					<a href="#" style="margin-top:10px;margin-left:-3px; text-decoration:none;">《孝和商城注册条款》</a>
					<div class="fastway">
						<h3>无需注册，即可登录</h3>
					<div class="moreregister clearfix">
						<a href="#" style="margin-right: 45px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/weixin.png" alt="">微信登录</a>
						<a href="#"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/weibo.png" alt="">微博登录</a>
						<a href="#" style="margin-right:0"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/tengxun.png" alt="">QQ登录</a>
					</div>
					</div>
				<%--</form>--%>
			</div>
		</div>
	</div>
</div>
<footer>
	<div class="foot">
		<div class="foots">
			<p>
				<!--关于我们 招聘信息 联系我们 商家入驻 商家后台 商家社区 ©2017 Yungouwu.com 北京云购物网络有限公司-->
				<a href="">关于我们</a><span  style="color:#999"> | </span>
				<a href="">招聘信息</a><span  style="color:#999"> | </span>
				<a href="">联系我们</a><span  style="color:#999"> | </span>
				<a href="">后台管理</a><span  style="color:#999"> | </span>
				©2017 上海孝和集团电子商城
			</p>
			<p style="color:#999">营业执照注册号：990106000129004 | 网络文化经营许可证：北网文（2016）0349-219号 | 增值电信业务经营许可证：京2-20110349 | 安全责任书 | 京公网安备 99010602002329号 </p>
		</div>
	</div>
</footer>

</body>
</html>