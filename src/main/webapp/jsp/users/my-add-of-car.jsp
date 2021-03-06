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

	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.8.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/jsp/users/js/jquery-labelauty.js"></script>
	<script>
        $(function(){
            $(':input').labelauty();
        });
	</script>
	<!--<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script>
        $(function(){
            $("#zhifu ul li").click(function(){
                $("#zhifu ul li p").removeClass("zhifufs");
                $(this).find("p").addClass("zhifufs");
            });
        });
        function change(i){
        }
	</script>-->
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

<div class="center" style="background:#fff">
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
						<%--<!-- 收货地址 -->
						<div class="xm-box">
							<div class="box-hd ">
								<h2 class="title">收货地址</h2>
								<!---->
							</div>
							<div class="box-bd">
								<div class="clearfix xm-address-list" id="checkoutAddrList">
									<dl class="item" >
										<dt>
											<strong class="itemConsignee">陈思顶</strong>
											<span class="tag">修改</span>
											<span class="tag">删除</span>
										</dt>
										<br/>
										<dd>
											<p class="itemRegion">贵州省 贵阳市</p>
											<p class="itemStreet">贵州省仁怀市贵州大学北校区</p>
											<p class="tel">188010666666</p>
										</dd>
										<dd style="display:none">
											<input type="radio" name="Checkout[address]" class="addressId"  value="10140916720030323">
										</dd>
									</dl>
									<div class="use-new-addr"  id="J_useNewAddr" data-state="off">
										<span class="iconfont icon-add"><img src="${pageContext.request.contextPath}/jsp/users/images/add_cart.png" /></span>
										新增收货地址
									</div>
								</div>
								<input type="hidden" name="newAddress[type]" id="newType" value="common">
								<input type="hidden" name="newAddress[consignee]" id="newConsignee">
								<input type="hidden" name="newAddress[province]" id="newProvince">
								<input type="hidden" name="newAddress[city]" id="newCity">
								<input type="hidden" name="newAddress[district]" id="newCounty">
								<input type="hidden" name="newAddress[address]" id="newStreet">
								<input type="hidden" name="newAddress[zipcode]" id="newZipcode">
								<input type="hidden" name="newAddress[tel]" id="newTel">
								<input type="hidden" name="newAddress[tag_name]" id="newTag">
								<!--点击弹出新增/收货地址界面start-->
								<div class="xm-edit-addr-box" id="J_editAddrBox">
									<div class="bd">
										<div class="item">
											<label>收货人姓名<span>*</span></label>
											<input type="text" name="userAddress[consignee]" id="Consignee" class="input" placeholder="收货人姓名" maxlength="15" autocomplete='off'>
											<p class="tip-msg tipMsg"></p>
										</div>
										<div class="item">
											<label>联系电话<span>*</span></label>
											<input type="text" name="userAddress[tel]" class="input" id="Telephone" placeholder="11位手机号" autocomplete='off'>
											<p class="tel-modify-tip" id="telModifyTip"></p>
											<p class="tip-msg tipMsg"></p>
										</div>
										<div class="item">
											<label>地址<span>*</span></label>
											<select name="userAddress[province]" id="Provinces" class="select-1">
												<option>省份/自治区</option>
											</select>
											<select name="userAddress[city]"  id="Citys" class="select-2" disabled>
												<option>城市/地区/自治州</option>
											</select>
											<select name="userAddress[county]"  id="Countys" class="select-3" disabled>
												<option>区/县</option>
											</select>
											<textarea   name="userAddress[street]" class="input-area" id="Street" placeholder="路名或街道地址，门牌号"></textarea>
											<p class="tip-msg tipMsg"></p>
										</div>
										<div class="item">
											<label>邮政编码<span>*</span></label>
											<input type="text" name="userAddress[zipcode]" id="Zipcode" class="input" placeholder="邮政编码"  autocomplete='off'>
											<p class="zipcode-tip" id="zipcodeTip"></p>
											<p class="tip-msg tipMsg"></p>
										</div>
										<div class="item">
											<label>地址标签<span>*</span></label>
											<input type="text" name="userAddress[tag]" id="Tag" class="input" placeholder='地址标签：如"家"、"公司"。限5个字内'  >
											<p class="tip-msg tipMsg"></p>
										</div>
									</div>
									<div class="ft clearfix">
										<button  type="button"  class="btn btn-lineDake btn-small " id="J_editAddrCancel">取消</button>
										<button type="button" class="btn btn-primary  btn-small " id="J_editAddrOk">保存</button>
									</div>
								</div>
								<!--点击弹出新增/收货地址界面end-->
								<div class="xm-edit-addr-backdrop" id="J_editAddrBackdrop"></div>
							</div>
						</div>--%>
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
											<input type="radio" name="paytype" checked="true" value="0" style="float: left"/>
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
											<input type="radio" name="gainmethod" checked="true" value="0" style="float: left"/>
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
									<div class="box-hd">
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
											<c:forEach items="${myshopcarList}" var="myshopcar" varStatus="status">
											<dd class="item clearfix" style="background-color: #deffb3">
												<div class="item-row">
													<div class="col col-1">
														<div class="g-pic">
															<img src="${pageContext.request.contextPath}/${myshopcar.shopcarC}" width="40" height="40" />
														</div>
														<div class="g-info">
															<%--<a href="#" target="_blank">--%>
																${myshopcar.shopcarA}
															<%--</a>--%>
														</div>
													</div>
													<div  id="jisuan0" class="col col-2"  style="text-align: left">${myshopcar.price}</div>
													<div id="jisuan1" class="col col-3" style="text-align: left">${myshopcar.orderamount}</div>
													<div id="jisuan2" class="col col-4" style="text-align: left">${myshopcar.shopcarB}</div>

												</div>
											</dd>
											</c:forEach>
										</dl>

										<script type="text/javascript">
											$("#sub_setID").click(function () {
											    var name=$("#name_").val();
											    var address=$("#address").val();
											    var phone=$("#phone").val();
											    var number_this=$("#number_this").val();
											    if(name!=""&&address!=""&&phone!=""&&number_this!=""){
											        var html= "<div class='add_mi'>"+
                                                        "<p style='border-bottom:1px dashed #ccc;line-height:28px;'>"+name+"</p>"+
                                                        "<p>"+address+"</p>"+
                                                        "<span>电话："+phone+"</span>"+
                                                    "<p>邮编："+number_this+"</p>"+
                                                    "</div>";
											        $(".Caddress").find(".add_mi").each(function (i) {
											            var input_out=$(".Caddress").find(".add_mi");
														if(i==input_out.length-1){
											                $(input_out[i]).after(html);
                                                            click_add_mi();
														}
                                                    });
											        /*隐藏输入的框*/
											        $(this).parents("div[class='shade_content']").hide();
											        /*给新增的地址选择一个可以选的图形*/
                                                    $('.Caddress .add_mi').click(function() {
                                                        $(this).css('background', 'url("${pageContext.request.contextPath}/jsp/users/shdz/images/mail_1.jpg") no-repeat').siblings('.add_mi').css('background', 'url("${pageContext.request.contextPath}/jsp/users/shdz/images/mail.jpg") no-repeat')
                                                    });
												}else {
											        alert("请输入内容");
												}
                                            })


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
												<h2 class="title">用户留言</h2></br>
												<input type="text" style="background-color: #bcbfb1" placeholder="点击输入留言信息" name="buyerrequest"/>

											</div>
											<!-- checkout-count-extend -->
											<div class="checkout-price">
												<ul>
													<li>
														订单总额：<span id="aaaa">${zongjia}</span>
													</li>
													<%--amountpay 应付金额    realpay实付=应付+邮费postfee--%>
													<input type="hidden" class="ace" name="amountpay" value="${zongjia}" />
													<!--<li>
                                                        活动优惠：<span>-0元</span>
                                                        <script type="text/javascript">
                                                            checkoutConfig.activityDiscountMoney=5;
                                                            checkoutConfig.totalPrice=244.00;
                                                        </script>
                                                    </li>-->
													<li>
														<%--用户购买的所有商品积分和======（数量*积分）的和--%>
														可获得积分：<span id="couponDesc">${totalcredit}</span>
															<input type="hidden" class="ace" name="totalcredit" value="${totalcredit}" />
													</li>
													<li>
														运费：<span id="postageDesc">0元</span>
													</li>
												</ul>
												<p class="checkout-total">应付总额：<span><strong id="totalPrice">${zongjia}</strong>元</span></p>
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

								<a href="/jsp/users/my-dingdan.jsp?flag=2" class="btn btn-lineDakeLight btn-back-cart">返回购物车</a>
								<%--<input type="hidden" class="ace" name="userid" value="${sessionScope.user.userid}" />--%>
								<input type="hidden" class="ace" name="userid" value="11" />
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
</script>

<script type="text/javascript">

function jiesuan(basePath) {
      if(confirm('确认购买？')){
          $("#checkoutForm").attr("action",basePath + "jieSuanForCar.action");
          $("#checkoutForm").submit();
	  }
}

</script>

</body>
</html>