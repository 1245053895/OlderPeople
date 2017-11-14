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

</head>
<body>

<header id="pc-header">

	<div class="pc-header-nav">
		<div class="pc-header-con">
			<div class="fl pc-header-link" >您好！，欢迎来孝和集团电子商城 
				<a href="login.html" target="_blank">请登录</a> 
				<a href="register.html" target="_blank"> 免费注册</a>
			</div>
			<div class="fr pc-header-list top-nav">
				<ul>
					<li><a href="#">我的收藏</a></li>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">个人中心</a></div>
						<div class="con">
							<dl>
								<dt><a href="">个人资料</a></dt>
								<dd><a href="">收货地址</a></dd>
								<dd><a href="">修改登录密码</a></dd>
								<dd><a href="">我的积分</a></dd>
								<dd><a href="">已购买的宝贝</a></dd>
							</dl>
						</div>
					</li>
										
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">帮助中心</a></div>
						<div class="con">
							<dl>
								<dt><a href="">积分说明</a></dt>
								<dd><a href="">联系客服</a></dd>
							</dl>
						</div>
					</li>
					
				</ul>
			</div>
		</div>
	</div>
	<div class="pc-header-logo clearfix">
		<div class="pc-fl-logo fl">
			<h1>
				<a href="index.html"></a>
			</h1>
		</div>
		<div class="head-form fl">
			<form class="clearfix">
				<input class="search-text" accesskey="" id="key" autocomplete="off" placeholder="请输入关键词" type="text">
				<button class="button" onclick="search('key');return false;">搜索</button>
			</form>
			<div class="words-text clearfix">
				<a href="#">制氧机</a>
				<a href="#">代步车</a>
				<a href="#">电动轮椅</a>
				<a href="#">血糖仪</a>
				<a href="#">血压计</a>
				<a href="#">木制拐杖</a>
				<a href="#">足浴盆</a>
			</div>
		</div>
		<div class="fr pc-head-car">
			<i class="icon-car"></i>
			<a href="#">我的购物车</a>
			<em>10</em>
		</div>
	</div>
	<!--  顶部    start-->
	<div class="yHeader">
		<!-- 导航   start  -->
		<div class="yNavIndex">
			<ul class="yMenuIndex" style="margin-left:0">
				<li style="background:#d1201e"><a href="" target="_blank">首页</a></li>
<!--				<li><a href="" target="_blank">首页</a></li>-->
				<li><a href="" target="_blank">品牌专区 </a></li>
				<li><a href="" target="_blank">询价专区</a></li>
				<li><a href="" target="_blank">新闻资讯</a></li>
				<li><a href="" target="_blank">合伙人</a></li>
				<li><a href="" target="_blank">关于我们</a></li>
			</ul>
		</div>
		<!-- 导航   end  -->
	</div>

</header>

<div class="containers center"><div class="pc-nav-item"><a href="#">首页</a> &gt; <a href="#">会员中心 </a> &gt; <a href="#">地址管理</a></div></div>
<section id="member">
	<div class="member-center clearfix">
		<div class="member-left fl">
			<div class="member-apart clearfix">
				<div class="fl"><a href="#"><img src="img/mem.png"></a></div>
				<div class="fl">
					<p>用户名：</p>
					<p><a href="#">亚里士多德</a></p>
					<p>搜悦号：</p>
					<p>389323080</p>
				</div>
			</div>
			<div class="member-lists">
				<dl>
					<dt>我的商城</dt>
					<dd><a href="user.html">我的资料</a></dd>
					<dd><a href="#">我的订单</a></dd>
					<dd><a href="#">我的收藏</a></dd>
					<dd><a href="my-user.html">账户安全</a></dd>
					<dd><a href="#">我的评价</a></dd>
					<dd class="cur"><a href="#">地址管理</a></dd>
				</dl>
				<dl>
					<dt>客户服务</dt>
					<dd><a href="#">退货申请</a></dd>
					<dd><a href="#">退货/退款记录</a></dd>
				</dl>
				<dl>
					<dt>我的消息</dt>
					<dd><a href="my-new.html">商城快讯</a></dd>
					<dd><a href="#">帮助中心</a></dd>
				</dl>
			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"><h2>地址管理</h2></div>
			</div>
			
			<div class="member-border">

				<div class="member-caution clearfix">
					
					<!-- 收货地址 -->
						<div class="xm-box">
							
							<div style="height: 36px"></div>
<!--
							<div class="box-hd ">
								<h2 class="title">收货地址</h2>
							</div>
-->
							<div class="box-bd">
								<div class="clearfix xm-address-list" id="checkoutAddrList">
									<dl class="item" style="margin-left: 40px">
										<dt>
											<strong class="itemConsignee">留刘海</strong>
											<span class="itemTag tag">家</span>
										</dt>
										<dd>
											
											<p class="itemRegion">北京市 海淀区</p>
											<p class="itemStreet">北京市海淀区双榆树</p>
											<p class="tel itemTel">188010666666</p>
											<span class="edit-btn J_editAddr">编辑</span>
										</dd>
										<dd style="display:none">
											<input type="radio" name="Checkout[address]" class="addressId"  value="10140916720030323">
										</dd>
									</dl>
									<div class="item use-new-addr"  id="J_useNewAddr" data-state="off" style="margin-left: 10px">
										<span class="iconfont icon-add"><img src="images/add_cart.png" /></span>
										使用新地址
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
							</div>                </div>
						<!-- 收货地址 END-->
					
					
<!--
						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">登录密码</div>
							<div class="warn3">互联网账号存在被盗风险，建议您定期更改密码以保护账户安全。</div>
							<div class="warn4"><a href="#">修改</a> </div>
						</li>
-->

<!--
						<li class="clearfix">
							<div class="warn1"></div>
							<div class="warn2">手机验证</div>
							
							<div class="warn3">134*****693  </div>
							<span style="margin-left: -450px; height:33px; line-height:33px; float:left; color: #A8A8A8">若已丢失或停用，请立即更换，避免账户被盗</span>

							<div class="warn4"><a href="#">更换</a> </div>
						</li>
-->

					</ul>
<!--
					<div class="member-prompt">
						<p>安全提示：</p>
						<p>您当前IP地址是：<i class="reds">110.106.0.01</i>  北京市          上次登录的TP： 2015-09-16  <i class="reds">110.106.0.02 </i> 天津市</p>
						<p>1. 注意防范进入钓鱼网站，不要轻信各种即时通讯工具发送的商品或支付链接，谨防网购诈骗。</p>
						<p>2. 建议您安装杀毒软件，并定期更新操作系统等软件补丁，确保账户及交易安全。      </p>
					</div>
-->
					
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