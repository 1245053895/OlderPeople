<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jstl/fmt_rt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
	<title>确认订单-购物商城</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/car/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/car/home.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/users/css/jquery-labelauty.css">
	<link rel="stylesheet" type="text/css" href="css/styledz.css">
	<link rel="stylesheet" type="text/css" href="css/css.css" />
	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.8.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-labelauty.js"></script>
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
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
                $(this).css('background', 'url("images/mail_1.jpg") no-repeat').siblings('.add_mi').css('background', 'url("images/mail.jpg") no-repeat')
            })
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
	<script>
        $(function(){
            $(':input').labelauty();
        });
	</script>

</head>
<body>

<header id="pc-header">
	<jsp:include page="/jsp/users/head.jsp"></jsp:include>
</header>

<div class="center" style="background:#fff;margin-top: -15px;">
	<div class="pay_lc1">
		<span class="sp01">确认订单</span>
		<span class="sp02">在线支付</span>
		<span class="sp03">支付成功</span>
	</div>
	<!--收货地址body部分开始-->
	<div class="border_top_cart">
		<script type="text/javascript">
            var checkoutConfig={
                addressMatch:'common',
                addressMatchVarName:'data',
                hasPresales:false,
                hasBigTv:false,
                hasAir:false,
                hasScales:false,
                hasGiftcard:false,
                totalPrice:244.00,
                postage:10,//运费
                postFree:true,//活动是否免邮了
                bcPrice:150,//计算界值
                activityDiscountMoney:0.00,//活动优惠
                showCouponBox:0,
                invoice:{
                    NA:"0",
                    personal:"1",
                    company:"2",
                    electronic:"4"
                }
            };
            var miniCartDisable=true;
		</script>
		<div class="container">
			<div class="checkout-box">
				<%--*************************--%>
				<form  id="checkoutForm" action="#" method="post">
					<div class="checkout-box-bd">
						<!-- 地址状态 0：默认选择；1：新增地址；2：修改地址 -->
						<input type="hidden" name="Checkout[addressState]" id="addrState"   value="0">
						<!-- 收货地址 -->
						<%--<div>--%>

						<%--</div>--%>
						<!-- 收货地址 END-->
						<div id="checkoutPayment">
							<jsp:include page="/jsp/users/shdz/shdz.jsp"></jsp:include>
							<!-- 支付方式 -->
							<div class="xm-box" style="width: 990px!important;height: 100px!important;margin-top: 330px;">
								<div class="box-hd ">
									<h2 class="title">支付方式</h2>
								</div>
								<div>
									<ul class=" clearfix" style="margin-left: 30px;margin-top: 20px">
										<li>
											<input type="radio" name="paytype" value="0" style="float: left"/>
											<span style="font-size: 16px; float: left;margin-left: 5px;margin-right: 30px;">在线支付</span>
										</li>
										<li>
											<input type="radio" name="paytype" value="1" style="float: left"/>
											<span style="font-size: 16px; float: left;margin-left: 5px;margin-right: 30px;">货到付款</span>
										</li>
									</ul>
								</div>
							</div>
							<!-- 支付方式 END-->
							<!-- 收货方式-->
							<div class="xm-box">
								<div class="box-hd ">
									<h2 class="title">收货方式</h2>
								</div>
								<div>
									<ul class=" clearfix" style="margin-left: 30px;margin-top: 20px">
										<li>
											<input type="radio" name="gainmethod" value="0" style="float: left"/>
											<span style="font-size: 16px; float: left;margin-left: 5px;margin-right: 30px;">快递配送</span>
										</li>
										<li>
											<input type="radio" name="gainmethod" value="1" style="float: left"/>
											<span style="font-size: 16px; float: left;margin-left: 5px;margin-right: 30px;">货物自取</span>
										</li>
									</ul>
								</div>
							</div>
							<!-- 收货方式 END-->

							<!-- 商品清单 -->
							<div id="checkoutGoodsList" class="checkout-goods-box">
								<div class="xm-box">
									<div class="box-hd" style="border-bottom: 1px solid #dfdfdf">
										<h2 class="title">确认订单信息</h2>
									</div>
									<div class="box-bd">
										<dl class="checkout-goods-list">
											<dt class="clearfix">
												<span class="col col-1">商品名称</span>
												<span class="col col-2">购买价格</span>
												<span class="col col-3">购买数量</span>
												<span class="col col-4">小计（元）</span>
											</dt>
											<dd class="item clearfix" style="background-color: #deffb3">
												<div class="item-row">
													<div class="col col-1">
														<div class="g-pic">
															<img src="${pageContext.request.contextPath}/${productList[0].productpicture}" width="40" height="40" />
														</div>
														<div class="g-info">
															<a href="#" target="_blank">
																${productList[0].productname}
															</a>
														</div>
													</div>
													<input type="hidden" class="ace" name="productname" value="${productList[0].productname}" />
													<input type="hidden" class="ace" name="productid" value="${productList[0].productid}" />
													<div  id="jisuan0" class="col col-2"  style="text-align: left;width: 137px;">${productList[0].productprice}</div>
													<input type="hidden" class="ace" name="productprice" value="${productList[0].productprice}" />
													<input type="hidden" class="ace" name="payprice" value="${productList[0].productprice}" />
													<div id="jisuan1" class="col col-3" style="text-align: left;width: 100px;">${idList[0]}</div>
													<input type="hidden" class="ace" name="shoppingcount" value="${idList[0]}" />
													<div id="jisuan2" class="col col-4" style="text-align: left;width:55px;">${zongjia[0]}</div>
													<input type="hidden" class="ace" name="totalmoneycount" value="${zongjia[0]}" />
												</div>
											</dd>

										</dl>

										<script type="text/javascript">
											$("#sub_setID").click(function () {
												var name=$("#name_").val();
                                                var address=$("#address").val();
                                                var phone=$("#phone").val();
                                                var number_this=$("#number_this").val();
                                                if(name!=""&&address!=""&&phone!=""&&number_this!=""){
													var html="<div class='add_mi'>"+
																"<p style='border-bottom:1px dashed #ccc;line-height:28px;'>"+name+"</p>"+
																	"<p>"+address+"</p>"+
																	"<span>电话："+phone+"</span>"+
																"<p>邮编："+number_this+"</p>"+
																"</div>";
													$(".Caddress").find(".add_mi").each(function (i) {

                                                        var input_out = $(".Caddress").find(".add_mi");
                                                        if(i==input_out.length-1){
                                                            $(input_out[i]).after(html);
                                                    	}
                                                        console.log(i+"yyy"+input_out.length);
                                                    });
													$(this).parents("div[class='shade_content']").hide();

                                                    $('.Caddress .add_mi').click(function() {
                                                        $(this).css('background', 'url("${pageContext.request.contextPath}/jsp/users/shdz/images/mail_1.jpg") no-repeat').siblings('.add_mi').css('background', 'url("${pageContext.request.contextPath}/jsp/users/shdz/images/mail.jpg") no-repeat')
                                                    });
												}else {
                                                    alert("请输入内容！")
												}



                                            });

                                            function myfun() {

                                                <%--alert("自动加载");--%>
                                                <%--alert( ${pingJiaShuList[0].goodcomment});--%>
                                                <%--alert( ${pingJiaShuList[0].goodcommentcount});--%>
//                                                var test0= document.getElementById("jisuan0").innerHTML;
//                                                var test1= document.getElementById("jisuan1").innerHTML;
//                                                var test2=test1*test0;
//                                                document.getElementById("jisuan2").innerHTML=test2;
//                                                alert(test2);
                                                  <%--var userid=${sessionScope.user.userid}--%>
                                              <%--alert(userid);--%>
                                                var posoooo= document.getElementById("aaaa").innerHTML;
//                                                alert(posoooo);
                                                if (posoooo<88){ document.getElementById("postageDesc").innerHTML=15;
                                                    document.getElementById("totalPrice").innerHTML=parseInt(posoooo)+15;
                                                }

                                                console.log('${productList[0].productname}');


//                                                var test4= document.getElementById("postageDesc").innerHTML;
//                                                var test5=test3+test4;
//                                                document.getElementById("totalPrice").innerHTML=test5;

//                                            alert(obj.innerHTML);
                                                <%--$(".Xcontent19 span").text(${myProduct.productprice});--%>
                                                //alert($(".Xcontent19 span").text());

//                                            var a = $(".Xcontent19 span").text() * 1.2 +"";
                                                //alert(a.split(".")[0]+".0")

//                                            $(".Xcontent181 span").text(a.split(".")[0]+".0");

                                            }
                                            window.onload=myfun;
										</script>

										<div class="checkout-count clearfix">
											<div class="checkout-count-extend xm-add-buy">
												<h2 class="title">会员留言</h2></br>
												<input type="text" style="background-color: #f5f5f5" placeholder="点击输入留言信息" name="buyerrequest"/>

											</div>
											<!-- checkout-count-extend -->
											<div class="checkout-price">
												<ul>
													<li>
														订单总额：<span id="aaaa">${zongjia[0]}</span>
													</li>
													<%--amountpay 应付金额    realpay实付=应付+邮费postfee--%>
													<input type="hidden" class="ace" name="amountpay" value="${zongjia[0]}" />
													<!--<li>
                                                        活动优惠：<span>-0元</span>
                                                        <script type="text/javascript">
                                                            checkoutConfig.activityDiscountMoney=5;
                                                            checkoutConfig.totalPrice=244.00;
                                                        </script>
                                                    </li>-->
													<li>
														<%--用户购买的所有商品积分和======（数量*积分）的和--%>
														可获得积分：<span id="couponDesc">${zongjifen[0]}</span>
															<input type="hidden" class="ace" name="totalcredit" value="${zongjifen[0]}" />
													</li>
													<li>
														运费：<span id="postageDesc">0元</span>
													</li>
												</ul>
												<p class="checkout-total">应付总额：<span><strong id="totalPrice">${zongjia[0]}</strong>元</span></p>
											</div>
											<!--  -->
										</div>
									</div>
								</div>

								<!--S 加价购 产品选择弹框 -->
								<div class="modal hide modal-choose-pro" id="J_choosePro-664">
									<div class="modal-header">
										<span class="close" data-dismiss='modal'><i class="iconfont">&#xe617;</i></span>
										<h3>选择产品</h3>
										<div class="more">
											<div class="xm-recommend-page clearfix">
												<a class="page-btn-prev   J_carouselPrev iconfont" href="javascript: void(0);">&#xe604;</a><a class="page-btn-next  J_carouselNext iconfont" href="javascript: void(0);">&#xe605;</a>
											</div>
										</div>
									</div>
									<div class="modal-body J_chooseProCarousel">
										<div class="J_carouselWrap modal-choose-pro-list-wrap">
											<ul class="clearfix J_carouselList">
											</ul>
										</div>
									</div>
									<div class="modal-footer">
										<a href="/jsp/users/my-dingdan.jsp?flag=2" class="btn btn-disabled J_chooseProBtn">加入购物车</a>
									</div>
								</div>
								<!--E 加价购 产品选择弹框 -->

								<!--S 保障计划 产品选择弹框 -->


							</div>
							<!-- 商品清单 END -->
							<input type="hidden"  id="couponType" name="Checkout[couponsType]">
							<input type="hidden" id="couponValue" name="Checkout[couponsValue]">
							<div class="checkout-confirm">

								<a href="<%--${pageContext.request.c}--%>/jsp/users/my-dingdan.jsp?flag=2" class="btn btn-lineDakeLight btn-back-cart">返回购物车</a>
								<%--<input type="hidden" class="ace" name="userid" value="${sessionScope.user.userid}" />--%>
								<input type="hidden" class="ace" name="userid" value="${sessionScope.user.userid}" />
								<%--这里传入userid  userid=${sessionScope.user.userid}  --%>
								<a href="javascript:jiesuan('<%=basePath%>');" class="btn btn-primary">立即下单</a>

							</div>
						</div>
					</div>
				</form>
			</div>


		</div>
		<!-- 禮品卡提示 S-->
		<div class="modal hide lipin-modal" id="lipinTip">
			<div class="modal-header">
				<h2 class="title">温馨提示</h2>
				<p> 为保障您的利益与安全，下单后礼品卡将会被使用，<br>
					且订单信息将不可修改。请确认收货信息：</p>
			</div>
			<div class="modal-body">
				<ul>
					<li><strong>收&nbsp;&nbsp;货&nbsp;&nbsp;人：</strong><span id="lipin-uname"></span></li>
					<li><strong>联系电话：</strong><span id="lipin-uphone"></span></li>
					<li><strong>收货地址：</strong><span id="lipin-uaddr"></span></li>
				</ul>
			</div>
			<div class="modal-footer">
				<span class="btn btn-primary" id="useGiftCard">确认下单</span><span class="btn btn-dakeLight" id="closeGiftCard">返回修改</span>
			</div>
		</div>
		<!--  禮品卡提示 E-->
		<!-- 预售提示 S-->
		<div class="modal hide yushou-modal" id="yushouTip">
			<div class="modal-body">
				<h2>请确认收货地址及发货时间</h2>
				<ul class="list">
					<li>
						<strong>请确认配送地址，提交后不可变更：</strong>
						<p id="yushouAddr"> </p>
						<span class="icon-common icon-1"></span>
					</li>
					<li>
						<strong>支付后发货</strong>
						<p>如您随预售商品一起购买的商品，将与预售商品一起发货</p>
						<span class="icon-common icon-2"></span>
					</li>
					<li>
						<strong>以支付价格为准</strong>
						<p>如预售产品发生调价，已支付订单价格将不受影响。</p>
						<span class="icon-common icon-3"></span>
					</li>
				</ul>
			</div>
			<div class="modal-footer">
				<p id="yushouOk" class="yushou-ok">
					<span class="icon-checkbox"><i class="iconfont">&#xe626;</i></span>
					我已确认收货地址正确，不再变更</p>
				<span class="btn btn-lineDakeLight" data-dismiss="modal">返回修改地址</span>
				<span class="btn btn-primary" id="yushouCheckout">继续下单</span>

			</div>
		</div>
		<!--  预售提示 E-->

		<script id="newAddrTemplate" type="text/x-dot-template">
			<dl class="item selected" data-isnew="true" data-consignee="{{=it.consignee}}" data-tel="{{=it.tel}}" data-province="{{=it.province}}" data-provincename="{{=it.provinceName}}" data-city="{{=it.city}}" data-cityname="{{=it.cityName}}" data-county="{{=it.county}}" data-countyname="{{=it.countyName}}" data-zipcode="{{=it.zipcode}}" data-street="{{=it.street}}" data-tag="{{=it.tag}}">
				<dt>
					<strong class="itemConsignee">{{=it.consignee}}</strong>
					{{? it.tag }}
					<span  class="itemTag tag">{{=it.tag}}</span>
					{{?}}
				</dt>
				<dd>
					<p class="tel itemTel">{{=it.tel}}</p>
					<p  class="itemRegion">{{=it.provinceName}} {{=it.cityName}} {{=it.countyName}}</p>
					<p  class="itemStreet">{{=it.street}} ({{=it.zipcode}})</p>
					<span class="edit-btn J_editAddr">编辑</span>
				</dd>
			</dl>
		</script>


		<!-- 保险弹窗 -->
		<!-- 保险弹窗 -->




		<script src="${pageContext.request.contextPath}/jsp/users/js/base.min.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/address_all.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/checkout.min.js"></script>
	</div>
	<!--收货地址body部分结束-->
</div>



<div style="height:50px"></div>

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
						<div class="fl lss-img"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/code.png" alt=""></div>
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

<script type="text/javascript">

function jiesuan(basePath) {
   if(confirm('前去付款？')){
	   $("#checkoutForm").attr("action",basePath + "jieSuan.action");
	   $("#checkoutForm").submit();
   }

}

</script>

</body>
</html>