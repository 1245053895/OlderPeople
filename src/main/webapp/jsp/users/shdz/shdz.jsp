<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/26
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>商城网上商城</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/shdz/css/styledz.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/shdz/css/css.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/shdz/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
        $(function() {
            var region = $("#region");
            var address = $("#address");
            var number_this = $("#number_this");
            var name = $("#name_");
            var phone = $("#phone");
            $("#sub_setID").click(function() {
                var input_out = $(".input_style");
                for (var i = 0; i <= input_out.length; i++) {
                    if ($(input_out[i]).val() == "") {
                        $(input_out[i]).css("border", "1px solid red");

                        return false;
                    } else {
                        $(input_out[i]).css("border", "1px solid #cccccc");
                    }
                }
            });
            var span_momey = $(".span_momey");
            var b = 0;
            for (var i = 0; i < span_momey.length; i++) {
                b += parseFloat($(span_momey[i]).html());
            }
            var out_momey = $(".out_momey");
            out_momey.html(b);
            $(".shade_content").hide();
            $(".shade").hide();
            $('.nav_mini ul li').hover(function() {
                $(this).find('.two_nav').show(100);
            }, function() {
                $(this).find('.two_nav').hide(100);
            })
            $('.left_nav').hover(function() {
                $(this).find('.nav_mini').show(100);
            }, function() {
                $(this).find('.nav_mini').hide(100);
            })
            $('#jia').click(function() {
                $('input[name=num]').val(parseInt($('input[name=num]').val()) + 1);
            })
            $('#jian').click(function() {
                $('input[name=num]').val(parseInt($('input[name=num]').val()) - 1);
            })
            $('.Caddress .add_mi').click(function() {
                $(this).css('background', 'url("${pageContext.request.contextPath}/jsp/users/shdz/images/mail_1.jpg") no-repeat').siblings('.add_mi').css('background', 'url("${pageContext.request.contextPath}/jsp/users/shdz/images/mail.jpg") no-repeat')
            });
        })
        var x = Array();

        function func(a, b) {
            x[b] = a.html();
            alert(x)
            a.css('border', '2px solid #f00').siblings('.min_mx').css('border', '2px solid #ccc');
        }

        function onclick_close() {
            var shade_content = $(".shade_content");
            var shade = $(".shade");
            if (confirm("确认关闭么！此操作不可恢复")) {
                shade_content.hide();
                shade.hide();
            }
        }

        function onclick_open() {
            $(".shade_content").show();
            $(".shade").show();
            var input_out = $(".input_style");
            for (var i = 0; i <= input_out.length; i++) {
                if ($(input_out[i]).val() != "") {
                    $(input_out[i]).val("");
                }
            }
        }

        function onclick_remove(r) {
            if (confirm("确认删除么！此操作不可恢复")) {
                var out_momey = $(".out_momey");
                var input_val = $(r).parent().prev().children().eq(1).val();
                var span_html = $(r).parent().prev().prev().children().html();
                var out_add = parseFloat(input_val).toFixed(2) * parseFloat(span_html).toFixed(2);
                var reduce = parseFloat(out_momey.html()).toFixed(2)- parseFloat(out_add).toFixed(2);
                console.log(parseFloat(reduce).toFixed(2));
                out_momey.text(parseFloat(reduce).toFixed(2))
                $(r).parent().parent().remove();
            }
        }

        function onclick_btnAdd(a) {
            var out_momey = $(".out_momey");
            var input_ = $(a).prev();
            var input_val = $(a).prev().val();
            var input_add = parseInt(input_val) + 1;
            input_.val(input_add);
            var btn_momey = parseFloat($(a).parent().prev().children().html());
            var out_momey_float = parseFloat(out_momey.html()) + btn_momey;
            out_momey.text(out_momey_float.toFixed(2));
        }

    </script>
</head>

<body>
<!--		<div id="top">
			<div id="top_main">
				<ul class="topu">
					<li>
						<div class="xing">
						</div>
						<a href="#">收藏商城</a>
					</li>
				</ul>
				<div id="hello">
					<span>您好，欢迎来到商城！
			<a href="login.html">[登陆]</a><a href="login.html">[免费注册]</a>
			</span>
				</div>
				<div class="topright">
					<ul>
						<li>
							<div class="cun">
								<a href="#">我的订单</a>
							</div>
						</li>
						<li class="kefu">
							<div class="cun">
								<div class="a1">
									<div class="kefuhide">
										<span>客户服务</span>
										<div class="downjian1">
										</div>
										<ul>
											<li><a href="#">帮助中心</a></li>
											<li><a href="#">售后服务</a></li>
											<li><a href="#">在线客服</a></li>
											<li><a href="#">投诉中心</a></li>
											<li><a href="#">客服邮箱</a></li>
										</ul>
									</div>
								</div>
							</div>
						</li>
						<li class="wangzhan">
							<div class="cun">
								<span>网站导航</span>
								<div class="downjian1">
								</div>
							</div>
							<div class="wangzhanhide">
								<div class="tese">
									<span>特色栏目</span>
								</div>
								<div class="tesemain">
									<a href="#">商城通信</a>
									<a href="#">校园之星</a>
									<a href="#">视频购物</a>
									<a href="#">商城社区</a>
									<a href="#">在线读书</a>
									<a href="#">装机大师</a>
									<a href="#">商城E卡　</a>
									<a href="#">家装城</a>
									<a href="#">搭配购　</a>
									<a href="#">我喜欢　</a>
									<a href="#">游戏社区</a>
								</div>
								<div class="tese">
									<span>企业服务</span>
								</div>
								<div class="tesemain1">
									<a href="#">企业采购</a>
									<a href="#">办公直通车</a>
								</div>
								<div class="tese">
									<span>旗下网站</span>
								</div>
								<div class="tesemain2">
									<a href="#">English Site</a>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		&lt;!&ndash; 搜索区域开始 &ndash;&gt;
		<div id="serach">
			<div class="logo">
				<a href="index.html">
					<img src="images/logo.png" alt="" /></a>
				<div class="dongtu">
				</div>
			</div>
			<div class="sou">
				<div class="sousuo">
					<input type="text" class="kuang" value="跨界" style="color:#999;font-size:14px" />
					<div class="souzi">
						<a href="#">搜索</a>
					</div>
				</div>
				<div class="reci">
					<span>热门搜索:</span>
					<a href="#" style="color:red">校园之星</a>
					<a href="#">影院到家</a>
					<a href="#">JD制暖节</a>
					<a href="#">腕表领券</a>
					<a href="#">自营满减</a>
					<a href="#">N3抢购</a>
					<a href="#">图书换购</a>
					<a href="#">12.12</a>
				</div>
			</div>
			<div class="myjd">
				<div class="mytu">
				</div>
				<a href="#">我的商城</a>
				<div class="jiantou">
				</div>
				<div class="myjdhide">
					<div class="hello">
						<span>您好，请</span>
						<a href="#">登录</a>
					</div>
					<div class="hey">
						<div class="heyleft">
							<ul>
								<li><a href="#">待处理订单</a></li>
								<li><a href="#">咨询回复</a></li>
								<li><a href="#">降价商品</a></li>
								<li><a href="#">返修退换货</a></li>
								<li><a href="#">优惠券</a></li>
							</ul>
						</div>
						<div class="heyright">
							<ul>
								<li><a href="#">我的关注></a></li>
								<li><a href="#">我的京豆></a></li>
								<li><a href="#">我的理财></a></li>
								<li><a href="#">我的白条></a></li>
							</ul>
						</div>
					</div>
					<div class="hidebot">
						<div class="bottop">
							<span>最近浏览的商品:</span>
							<a href="#">查看浏览历史></a>
						</div>
						<div class="botdown">
							<span>「暂无数据」</span>
						</div>
					</div>
				</div>
			</div>
			<div class="gouwuche">
				<div class="chetu">
				</div>
				<a href="#">去购物车结算</a>
				<div class="jianleft">
				</div>
				<div class="num">
					<div class="numright">
					</div>
					<div class="numzi">
						<span>0</span>
					</div>
				</div>
				<div class="hideche">
					<div class="kongche">
					</div>
					<span>购物车中还没有商品，赶紧选购吧！</span>
				</div>
			</div>
			<div class="jubao">
			</div>
		</div>-->
<div class="Caddress" style="height: auto!important;width: 990px!important;">
        <div class="shdz ">
            <h2 class="shdztitle">收货地址</h2>
        </div>
     <c:forEach items="${gainaddresList}" var="gainaddres">
        <div class="add_mi">
            <p style="border-bottom:1px dashed #ccc;line-height:28px;">${gainaddres.gainname}</p>
            <p>${gainaddres.gainaddress}</p>
            <span>电话：${gainaddres.gainmobile}</span>
            <p>邮编：${gainaddres.gaincode}</p>
        </div>
     </c:forEach>
   <%-- <div class="add_mi">
        <p style="border-bottom:1px dashed #ccc;line-height:28px;">陈思顶</p>
        <p>萧山 北干 明怡花苑53幢3单元</p>
        <span> 电话：13735683918</span>
        <p>邮编：564511</p>
    </div>
    <div class="add_mi">
        <p style="border-bottom:1px dashed #ccc;line-height:28px;">陈思顶</p>
        <p>萧山 北干 明怡花苑53幢3单元</p>
        <span> 电话：13735683918</span>
        <p>邮编：564511</p>
    </div>--%>
    <div class="use-new-addr"  id="J_useNewAddr" data-state="off" onclick="javascript:onclick_open();">
        <span class="iconfont icon-add" ><img src="${pageContext.request.contextPath}/jsp/users/images/add_cart.png" /></span>
        新增收货地址
     </div>
</div>

<div class="shade_content">
    <div class="col-xs-12 shade_colse">
        <button onclick="javascript:onclick_close();">x</button>
    </div>
    <div class="nav shade_content_div">
        <div class="col-xs-12 shade_title">
            新增收货地址
        </div>
        <div class="col-xs-12 shade_from">
            <%--<form action="" method="post">--%>
                <div class="col-xs-12">
                    <span class="span_style" class="span_sty">收&nbsp;件&nbsp;人&nbsp;</span>
                    <input class="input_style" type="text" name="gainname" id="name_" value="" placeholder="&nbsp;&nbsp;请输入您的姓名" />
                </div>
                <div class="col-xs-12">
                    <span class="span_style">详细地址</span>
                    <input class="input_style" type="text" name="gainaddress" id="address" value="" placeholder="&nbsp;&nbsp;请输入您的详细地址" />
                </div>
                <div class="col-xs-12">
                    <span class="span_style">手机号码</span>
                    <input class="input_style" type="number" name="gainmobile" id="phone" value="" placeholder="&nbsp;&nbsp;请输入您的手机号码" />
                </div>
                <div class="col-xs-12">
                    <span class="span_style">邮政编码</span>
                    <input class="input_style" type="email" name="gaincode" id="number_this" value="" placeholder="&nbsp;&nbsp;请输入您的邮政编号" />
                </div>
                <div class="col-xs-12">
                    <input class="btn_remove" type="button" onclick="javascript:onclick_close();" value="取消" />
                    <input type="button" class="sub_set" id="sub_setID" value="提交" />
                </div>
            <%--</form>--%>
        </div>
    </div>
</div>

</body>

</html>
