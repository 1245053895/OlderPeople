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
	<title>登录.购物商城</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.8.3.min.js"></script>
</head>
<body style="background-color: white">

<header id="pc-header">
	<div class="center">
		<div class="pc-fl-logo">
			<h1 style="margin-left: 150px;">
				<a href="index.jsp"></a>
			</h1>

		</div>
	</div>
</header>
<section>
	<div class="pc-login-bj">
		<div class="center clearfix">
			<div class="fl"></div>
			<div class="fr pc-login-box">
				<div class="pc-login-title"><h2>用户登录&nbsp;&nbsp;&nbsp;${error}</h2></div>
				<form id="code_input" action="${pageContext.request.contextPath}/CustomerLogin.action" method="post">
					<input type="hidden" name="returnUrl" value="${param.returnUrl }"/>
					<div class="pc-sign">
						<input type="text" name="username" placeholder="用户名/邮箱/手机号">
					</div>
					<div class="pc-sign">
						<input type="password" name="password" placeholder="请输入您的密码">
					</div>
					<div class="pc-sign">
						<input id="authCode" oninput="check()" name="authCode" type="text" style="width: 222px;float: left" placeholder="请输入验证码"/>
						<!--这里img标签的src属性的值为后台实现图片验证码方法的请求地址-->
						<label style="float: left;margin-left: 230px;margin-top: -40px;">
							<img type="image" src="/authCode.action" id="codeImage" onclick="chageCode()" title="图片看不清？点击重新得到验证码" style="cursor:pointer;float: left"/>
							<a onclick="chageCode()" style="float: left;margin-top: 10px;margin-left: 5px;">换一张</a>
						</label>
					</div>

					<script>
                        function chageCode() {
                            $('#codeImage').attr('src', 'authCode.action?abc=' + Math.random());//链接后添加Math.random，确保每次产生新的验证码，避免缓存问题。
							/*表单提交通过ajax验证用户的输入是否正确*/
						}
						function check() {
                            if($("#authCode").val()!=null){
                                $.post(
                                    "/validate.action",
                                    {"value": $("#authCode").val()},
                                    function (res) {
                                        if (res.res) {
                                            console.log("ok");
                                            $("#but").removeAttr("disabled");
                                            $("#but").css("background","#e22");
                                        } else {
                                            console.log("no");
                                            $("#but").attr("disabled","disabled");
                                            $("#but").css("background","#a11");
                                            //刷新验证码图片
                                            //$("#codeImage").trigger("click");
                                        }
                                    },
                                    "JSON"
                                );
							}
                        }
					</script>





					<div class="pc-submit-ss">
						<input id="but" type="submit" disabled="disabled" value="登录" placeholder="" style="background-color: #a11;margin-top: 15px;">
					</div>
					<div class="pc-item-san clearfix">
						<a href="#"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/weixin.png" alt="">微信登录</a>
						<a href="#"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/weibo.png" alt="">微博登录</a>
						<a href="#" style="margin-right:0;"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/tengxun.png" alt="">QQ登录</a>
					</div>
					<div class="pc-reg">
						<a href="#">忘记密码</a>
						<a href="/jsp/users/register.jsp" class="red">免费注册</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>

<footer>
	<div class="center">
		<div class="pc-footer-login">
			<p>
				<!--<a>关于我们</a> 招聘信息 联系我们 商家入驻 商家后台 商家社区 ©2017 Yungouwu.com 北京云购物网络有限公司-->
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