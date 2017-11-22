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
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta name="renderer" content="webkit">
	<title>商品详情</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
    <link rel="stylesheet" href="//res.layui.com/layui/dist/css/layui.css"  media="all">
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
	<style>
		.li-ul-ss l{
			width:200px;
		}

		#column10086{
			overflow: scroll;
		}
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
				<li><a href="" target="_blank" title="首页">首页</a></li>
				<li><a href="" target="_blank" title="热销专区">热销专区</a></li>
				<li><a href="" target="_blank" title="新品专区">新品专区</a></li>
				<li><a href="" target="_blank" title="积分商城">积分商城</a></li>
				<li><a href="" target="_blank" title="合伙人">合伙人</a></li>
				<li><a href="" target="_blank" title="关于我们">关于我们</a></li>
			</ul>
		</div>
		<!-- 导航   end  -->
	</div>

</header>
<!--<nav>
	<div class="pc-nav-d">
		<div class="center">
			<a href="#">美妆个护</a> >
			<a href="#">面部护肤</a> >
			<a href="#">套装</a> >
			<a href="#">欧莱雅（LOREAL）</a> >
			<a href="#">欧莱雅套装</a>
		</div>
	</div>
</nav>-->
<form id="mainForm">
<div class="Xcontent">
	<ul class="Xcontent01">
<%--${myProduct.images[0]}--%>
		<div class="Xcontent06"><img src="${pageContext.request.contextPath}/${myProduct.images[0]}"></div>
		<ol class="Xcontent08">
			<c:forEach items="${myProduct.images}" var="it" varStatus="status">
			<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>
			</c:forEach>
		</ol>
		<ol class="Xcontent13 clearfix">
			<div class="Xcontent14 clearfix"><a href="#"><p>${myProduct.productname}</p></a></div>
			<div class="Xcontent15 clearfix red fl" style="margin-top:15px;margin-right: 8px;">${myProduct.productdescribe}</div>
			<div class="Xcontent16 clearfix"><p style="margin-top:14px;">更多惊喜，你值得拥有！</p></div>
			<div class="Xcontent17">
				<p class="Xcontent18">售价</p>
				<p class="Xcontent19">￥<span id="price">90</span></p>
				<p class="Xcontent18">原价</p>
				<p class="Xcontent181">￥<span></span></p>
				<!--<div class="Xcontent20">
					<p class="Xcontent21">促销</p>
					<img src="images/shangpinxiangqing/X12.png">
					<p class="Xcontent22">领610元新年礼券，满再赠好礼</p>
				</div>-->
				<div class="Xcontent23">
					<p class="Xcontent24">服务</p>
					<p class="Xcontent25">30天无忧退货&nbsp;&nbsp;&nbsp;&nbsp;       48小时快速退款 &nbsp;&nbsp;&nbsp;&nbsp;        满88元免邮</p>
				</div>
				<p class="Xcontent18" style="margin-top: 15px;">邮费</p>
				<p class="Xcontent191">￥<span>0</span></p>
			</div>
			<div id="summary-qita">
				<ul class="qita">
					<li>
						<p style="color: #666a6e">
                            累计评论&nbsp;&nbsp;&nbsp;&nbsp;
							<span>
								<a href="#"> <span  class="sd444">${pingJiaShu.goodcommentcount}</span>人评论</a>
                                <span  class="sd"></span>
							</span>
                            赠送积分&nbsp;&nbsp;&nbsp;&nbsp;
                            <span>
                                <a href="#">${myProduct.productcredits}</a>
                            </span>
						</p>
					</li>
				</ul>
			</div>
			<%--<div class="Xcontent26">
				<p class="Xcontent27">属性</p>
				<div class="Xcontent28"><img  src="images/shangpinxiangqing/X14.png"></div>
				<div class="Xcontent29"><img  src="images/shangpinxiangqing/X1.png"></div>
			</div>--%>
			<div class="Xcontent30">
				<p class="Xcontent31">数量</p>
				<div class="Xcontent32"><img src="${pageContext.request.contextPath}/jsp/users/images/shangpinxiangqing/X15.png"></div>
				<form>
					<%--max为库存量--%>
					<input class="input" name="shuliang" value="1"></form>
				<div class="Xcontent33"><img src="${pageContext.request.contextPath}/jsp/users/images/shangpinxiangqing/16.png"></div>
			</div>
			<input type="hidden" class="ace" name="productid" value="${productid}" />
			<div class="Xcontent34"><a href="javascript:oneMei('<%=basePath%>');">立即购买</a></div>
			<div class="Xcontent35"><a href="javascript:void(0)">加入购物车</a></div>
            <div class="Xcontent36">
                <a href=""><img src="${pageContext.request.contextPath}/jsp/users/images/shoucang.png" height="15px" width="15px"></a>
                <a href="">收藏宝贝</a>
            </div>
            <div class="Xcontent36">
                <a href=""><img src="${pageContext.request.contextPath}/jsp/users/images/kefu.png" height="15px" width="15px"></a>
                <a href="#">联系客服</a>
            </div>
		</ol>
	</ul>
</div></form>

<div class="containers center clearfix" style="margin-top:20px; background:#fff;">
	<div class="pc-info fr" style="padding-left:10px; padding-top:20px">
		<div class="pc-overall">
			<ul id="H-table1" class="brand-tab H-table1 H-table-shop clearfix ">
				<li class="cur"><a href="javascript:void(0);">商品介绍</a></li>
				<%--<li><a href="javascript:void(0);">商品评价<em class="reds">(91)</em></a></li>--%>
				<%--<li><a href="javascript:void(0);">售后保障</a></li>--%>
			</ul>
			<div class="pc-term clearfix">
				<div class="H-over1 pc-text-word clearfix">
					<ul class="clearfix">
					<%--	<li>
					<p>屏幕尺寸：4.8英寸</p>
					<p>分辨率：1280×720(HD,720P) </p>
				</li>
					<li>
						<p>后置摄像头：800万像素</p>
						<p>分辨率：1280×720(HD,720P) </p>
					</li>
					<li>
						<p>前置摄像头：190万像素</p>
						<p>分辨率：1280×720(HD,720P) </p>
					</li>
					<li>
						<p>3G：电信(CDMA2000)</p>
						<p>2G：移动/联通(GSM)/电信(CDMA </p>
					</li>--%>
					</ul>
					<div class="pc-line"></div>
					<ul class="clearfix">
						<%--<li>
							<p>商品名称：三星I939I</p>
							<p>商品毛重：360.00g </p>
						</li>
						<li>
							<p>商品编号：1089266</p>
							<p>商品产地：中国大陆</p>
						</li>
						<li>
							<p>品牌： 三星（SAMSUNG）</p>
							<p>系统：安卓（Android </p>
						</li>
						<li>
							<p>上架时间：2015-03-30 09:07:18</p>
							<p>机身颜色：白色</p>
						</li>--%>
					</ul>
					<div style="margin-left: 30px;margin-right:30px ">
						<c:forEach items="${myProduct.images1}" var="it" varStatus="status">
							<div style="text-align:center"><img src="${pageContext.request.contextPath}/${it}"width="95%";height="100px"></div>
						</c:forEach>
					</div>
				</div>
				<div class="H-over1" style="display:none">
					<div class="pc-comment fl"><strong>86<span>%</span></strong><br> <span>好评度</span></div>
					<div class="pc-percent fl">
						<dl>
							<dt>好评<span>(86%)</span></dt>
							<dd><div style="width:86px"></div></dd>
						</dl>
						<dl>
							<dt>中评<span>(86%)</span></dt>
							<dd><div style="width:86px"></div></dd>
						</dl>
						<dl>
							<dt>好评<span>(86%)</span></dt>
							<dd><div style="width:86px"></div></dd>
						</dl>
					</div>
				</div>
				<div class="H-over1 pc-text-title" style="display:none">
					<p>本产品全国联保，享受三包服务，质保期为：一年质保
						如因质量问题或故障，凭厂商维修中心或特约维修点的质量检测证明，享受7日内退货，15日内换货，15日以上在质保期内享受免费保修等三包服务！
						(注:如厂家在商品介绍中有售后保障的说明,则此商品按照厂家说明执行售后保障服务。) 您可以查询本品牌在各地售后服务中心的联系方式，请点击这儿查询......</p>
					<div class="pc-line"></div>
				</div>
			</div>
		</div>
		<div class="pc-overall">
			<ul class="brand-tab H-table H-table-shop clearfix " id="H-table" style="margin-left:0;">
				<li class="cur"><a href="javascript:void(0);">全部评价（<span>${pingJiaShu.goodcommentcount}</span>）</a></li>
				<li><a href="javascript:void(0);">好评<em class="reds">（<span>${pingJiaShu003}</span>）</em></a></li>
				<li><a href="javascript:void(0);">中评<em class="reds">（<span>${pingJiaShu002}</span>）</em></a></li>
				<li><a href="javascript:void(0);">差评<em class="reds">（<span>${pingJiaShu001}</span>）</em></a></li>
			</ul>
			<div class="pc-term clearfix">
				<div class="pc-column">
					<div class="column1" style="float: left">评价心得</div>
					<div class="column2" style="float: right;margin-right: 120px">顾客满意度</div>

				</div>
				<div class="H-over  pc-comments clearfix" id="column10086" style="height: 530px;">
					<ul class="clearfix">
						<c:forEach items="${pingJiaList}" var="itss" varStatus="status">
						<li class="clearfix">
							<div class="column1" >
								<%--<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>--%>
								<p style="float: right;margin-left: 50px">${itss.ccomment}</p>
									<p class="column5" style="float: right;margin-left: 130px"><span style="float: right;margin-left: 30px">评论用户：${itss.username}</span><span>日期时间：<f:formatDate value="${itss.commenttime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></p>
							</div>

							<c:if test="${itss.goodcomment==0}">
							<div class="column2" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star0.png"></div>
							</c:if>
							<c:if test="${itss.goodcomment==1}">
								<div class="column2" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star1.png"></div>
							</c:if>
							<c:if test="${itss.goodcomment==2}">
								<div class="column2" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star2.png"></div>
							</c:if>
							<c:if test="${itss.goodcomment==3}">
								<div class="column2" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star3.png"></div>
							</c:if>
							<c:if test="${itss.goodcomment==4}">
								<div class="column2" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star4.png"></div>
							</c:if>
							<c:if test="${itss.goodcomment==5}">
								<div class="column2" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star5.png"></div>
							</c:if>
						</li>
						</c:forEach>
					</ul>
				</div>

			</div>
		</div>
		<%--<div class="clearfix">--%>
			<%--<div class="fr pc-search-g pc-search-gs">--%>
				<%--<a href="#" class="fl " style="display:none">上一页</a>--%>
				<%--<a class="current" href="#">1</a>--%>
				<%--<a href="javascript:;">2</a>--%>
				<%--<a href="javascript:;">3</a>--%>
				<%--<a href="javascript:;">4</a>--%>
				<%--<a href="javascript:;">5</a>--%>
				<%--<a href="javascript:;">6</a>--%>
				<%--<a href="javascript:;">7</a>--%>
				<%--<span class="pc-search-di">…</span>--%>
				<%--<a href="javascript:;">1088</a>--%>
				<%--<a href="javascript:;" class="" title="使用方向键右键也可翻到下一页哦！">下一页</a>--%>
			<%--</div>--%>
		<%--</div>--%>
	</div>
</div>
<div style="height:100px"></div>
<div class="center" style="background:#fff">
    <div class="tabox">
        <div class="hd">
            <ul class="li-ul-ss">
                <li class=" " style="width:238px">疯狂抢购</li>
                <li class=" ">热评商品</li>
                <li class=" ">热卖商品</li>
                <li class=" ">猜您喜欢</li>
                <li class="">新品上架</li></ul>
        </div>
        <div class="bd">
            <ul class="lh" style="display: none;">
				<c:forEach items="${tuiJianList01}" var="it1" varStatus="status">
					<%--<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>--%>

                <li>
					<input type="hidden" class="ace" name="productid" value="${it1.productid}" />
                    <div class="p-img ld">
                        <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it1.productid}">
                            <img src="${pageContext.request.contextPath}/${it1.images[0]}"></a>
                    </div>
                    <div class="p-name" style="text-align: center;margin-top: 5px">
                        <a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it1.productid}" >${it1.productname}</a></div>
                    <div class="p-price"  style="text-align: center;">京东价：
                        <strong>￥${it1.productprice}</strong></div>
                </li>
				</c:forEach>
            </ul>
			<ul class="lh" style="display: none;">
				<c:forEach items="${tuiJianList02}" var="it2" varStatus="status">
					<%--<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>--%>

					<li>
						<input type="hidden" class="ace" name="productid" value="${it2.productid}" />
						<div class="p-img ld">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it2.productid}">
								<img src="${pageContext.request.contextPath}/${it2.images[0]}"></a>
						</div>
						<div class="p-name" style="text-align: center;margin-top: 5px">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it2.productid}" >${it2.productname}</a></div>
						<div class="p-price"  style="text-align: center;">京东价：
							<strong>￥${it2.productprice}</strong></div>
					</li>
				</c:forEach>
			</ul>
			<ul class="lh" style="display: none;">
				<c:forEach items="${tuiJianList03}" var="it3" varStatus="status">
					<%--<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>--%>

					<li>
						<input type="hidden" class="ace" name="productid" value="${it3.productid}" />
						<div class="p-img ld">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it3.productid}">
								<img src="${pageContext.request.contextPath}/${it3.images[0]}"></a>
						</div>
						<div class="p-name" style="text-align: center;margin-top: 5px">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it3.productid}" >${it3.productname}</a></div>
						<div class="p-price"  style="text-align: center;">京东价：
							<strong>￥${it3.productprice}</strong></div>
					</li>
				</c:forEach>
			</ul>
			<ul class="lh" style="display: none;">
				<c:forEach items="${tuiJianList04}" var="it4" varStatus="status">
					<%--<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>--%>

					<li>
						<input type="hidden" class="ace" name="productid" value="${it4.productid}" />
						<div class="p-img ld">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it4.productid}">
								<img src="${pageContext.request.contextPath}/${it4.images[0]}"></a>
						</div>
						<div class="p-name" style="text-align: center;margin-top: 5px">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it4.productid}" >${it4.productname}</a></div>
						<div class="p-price"  style="text-align: center;">京东价：
							<strong>￥${it4.productprice}</strong></div>
					</li>
				</c:forEach>
			</ul>
			<ul class="lh" style="display: none;">
				<c:forEach items="${tuiJianList05}" var="it5" varStatus="status">
					<%--<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>--%>

					<li>
						<input type="hidden" class="ace" name="productid" value="${it5.productid}" />
						<div class="p-img ld">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it5.productid}">
								<img src="${pageContext.request.contextPath}/${it5.images[0]}"></a>
						</div>
						<div class="p-name" style="text-align: center;margin-top: 5px">
							<a href="${pageContext.request.contextPath}/xiangqing.action?productid=${it5.productid}" >${it5.productname}</a></div>
						<div class="p-price"  style="text-align: center;">京东价：
							<strong>￥${it5.productprice}</strong></div>
					</li>
				</c:forEach>
			</ul>
        </div>
    </div>
    <script type="text/javascript">
        jQuery(".tabox").slide({delayTime: 0});
    </script>

</div>

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
	/*商品加入购物车的ajax*/
	$(".Xcontent35").click(function () {
        console.log($("#price").text());
	    var data=new Array();
	    data.push(parseFloat(${myProduct.productid})); //商品
		data.push(parseFloat($(".input").val())); //数量
		data.push(parseFloat($("#price").text()));//价格
		if(${sessionScope.user==null}){
            alert("请先登录！");
        }else {
            var d=ajax("ShopCat.action",data);
            if(d){
                alert("加入购物车成功！");
            }else {
                alert("此商品已在购物车！");
            }
        }
    });

	function ajax(url,data) {
	    var flag=true;
	    $.ajax({
			url:'${pageContext.request.contextPath}/'+url,
			data:{"data":data},
			type:'POST',
			async:false,
			traditional:true,
			timeout:10000,
			cache:false,
			success:successFuncion,
			error:errorFunction,
			beforeSend:LoadFunction
		});
        function successFuncion(data) {
            if(data.red){
                flag=true
            }else{
                flag=false;
            }
        }
        function errorFunction() {
            flag=false;
        }
        function LoadFunction() {

        }
        return flag;
	}


       /* 商品加入收藏夹的ajax实现传值*/
        $(".Xcontent36").click(function () {
            var productid=${myProduct.productid}
            if(${sessionScope.user==null}){
                alert("请先登录！");
            }else {
                var b=ajax1("ShouCangShop.action",productid);
                if(b){
                    alert("收藏成功")
                }else {
                    alert("此商品已在收藏夹")
                }
            }
        });

function ajax1(url,productid) {
	    var flag=true;
	    $.ajax({
			url:'${pageContext.request.contextPath}/'+url,
			data:{'productid':productid},
			type:'POST',
			async:false,
			timeout:10000,
			cache:false,
			success:successMethod,
			error:errorMethod,
	        beforeSend:LoadMethod,

		});
	    function successMethod(data) {
	        if(data.red){
	            flag=true
            }else {
	            flag=false;
			}

        }
		function errorMethod() {

		}
		function LoadMethod() {

		}
		return flag;

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

    function oneMei(basePath) {
//        alert('您确定要删除吗？');
        $("#mainForm").attr("action",basePath + "querendingdan.action");
        $("#mainForm").submit();
    }

</script>

<script type="text/javascript">

	function myfun() {
		//alert("自动加载") 01  23 45
        <%--alert("自动加载");--%>
        <%--alert( ${pingJiaShuList[0].goodcomment});--%>
        <%--alert( ${pingJiaShuList[0].goodcommentcount});--%>


        $(".Xcontent19 span").text(${myProduct.productprice});
        //alert($(".Xcontent19 span").text());

		var a = $(".Xcontent19 span").text() * 1.2 +"";
		//alert(a.split(".")[0]+".0")

		$(".Xcontent181 span").text(a.split(".")[0]+".0");

    }
window.onload=myfun;
</script>
</body>
</html>