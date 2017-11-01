<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css"/>
    <!--[if IE 7]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css"/>
    <![endif]-->
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css"/>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-rtl.min.css"/>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-skins.min.css"/>
    <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css"/>
    <![endif]-->
    <script src="/jsp/admin/assets/js/ace-extra.min.js"></script>
    <!--[if lt IE 9]>
    <script src="/jsp/admin/assets/js/html5shiv.js"></script>
    <script src="/jsp/admin/assets/js/respond.min.js"></script>
    <![endif]-->
    <script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript"></script>
    <title>登陆</title>
</head>

<body class="login-layout">
<img src="images/1.jpg" alt="" style="position: absolute; left: 0px; top: 0px;width: 100%; height: 100%"/>
<div class="logintop">
    <span>欢迎进入孝和集团后台管理</span>
</div>

<div class="loginbody">
    <div class="login-container">
        <div class="position-relative">
            <div>
                <div>
                    <div class="widget-main">
                        <h4 class="header blue lighter bigger">
                            <i class="icon-coffee green"></i>
                            管理员登陆
                        </h4>

                        <div class="login_icon"><img src="images/login.png"/></div>

                        <form>
                            <fieldset>
                                <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="登录名"
                                                                   name="登录名">
															<i class="icon-user"></i>
														</span>
                                </label>

                                <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="密码"
                                                                   name="密码">
															<i class="icon-lock"></i>
														</span>
                                </label>

                                <div class="space"></div>

                                <div class="clearfix">
                                    <label class="inline">
                                        <input type="checkbox" class="ace">
                                        <span class="lbl" style="color: lightblue">保存密码</span>
                                    </label>

                                    <button type="button" class="width-35 pull-right btn btn-sm btn-primary"
                                            id="login_btn">
                                        <i class="icon-key"></i>
                                        登陆
                                    </button>
                                </div>

                                <div class="space-4"></div>
                            </fieldset>
                        </form>

                    </div>
                </div>
            </div><!-- /widget-body -->
        </div><!-- /login-box -->
    </div><!-- /position-relative -->
</div>
</body>
</html>
<script>
    $('#login_btn').on('click', function () {
        var num = 0;
        var str = "";
        $("input[type$='text']").each(function (n) {
            if ($(this).val() == "") {

                layer.alert(str += "" + $(this).attr("name") + "不能为空！\r\n", {
                    title: '提示框',
                    icon: 0,
                });
                num++;
                return false;
            }
        });
        if (num > 0) {
            return false;
        }
        else {
            layer.alert('登陆成功！', {
                title: '提示框',
                icon: 1,
            });
            location.href = "/jsp/admin/index.jsp";
            layer.close(index);
        }

    })

</script>