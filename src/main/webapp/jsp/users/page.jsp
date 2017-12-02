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
	<script type="text/javascript">
        var root="<%=path%>";
	</script>
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
                if(num>1){
                    $(".input").val(num-1);
                }

            })

        })
	</script>
	<script>
        $(function(){
            $("#shoucang a").click(function(){
                $("#shoucang a img").removeClass("shoucangs");
                $(this).find("img").addClass("shoucangs");
            });
        });
	</script>
	<style>
		.li-ul-ss l{
			width:200px;
		}

		#column10086{
			overflow: scroll;
		}
	</style>




	<style>
		.black_overlay{
			display: none;
			position: absolute;
			top: 0%;
			left: 0%;
			width: 100%;
			height: 100%;
			background-color: black;
			z-index:1001;
			-moz-opacity: 0.8;
			opacity:.80;
			filter: alpha(opacity=80);
		}
		.white_content {
			display: none;
			position: absolute;
			top: 10%;
			left: 30%;
			width: 500px;
			height: 400px;
			border: 16px solid lightblue;
			background-color: white;
			z-index:1002;
			overflow: auto;
		}

		.container1 div{
		  display:inline;
		}
	</style>
	<script type="text/javascript">
        //弹出隐藏层
        function ShowDiv(show_div,bg_div){
            document.getElementById(show_div).style.display='block';
            document.getElementById(bg_div).style.display='block' ;
            var bgdiv = document.getElementById(bg_div);
            bgdiv.style.width = document.body.scrollWidth;
// bgdiv.style.height = $(document).height();
            $("#"+bg_div).height($(document).height());
        };
        //关闭弹出层
        function CloseDiv(show_div,bg_div)
        {
            document.getElementById(show_div).style.display='none';
            document.getElementById(bg_div).style.display='none';
        };
	</script>
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
		<div class="Xcontent06">
			<img src="${pageContext.request.contextPath}/${myProduct.images[0]}">
			<div id="mask" style="display:none;position: absolute ;top: 220px;left: 400px;width: 143px;height: 143px;background-color: rgba(200,200,200,0.8)"></div>
			<div id="enlarge" style="display: none;position: relative; top: -430px;left: 440px;width: 430px;height: 430px;border: 1px #000000 solid;overflow: hidden;">
				<div id="enlarge_img" style="position: absolute;width: 1290px;height: 1290px;max-width: 1290px;max-height: 1290px;
										/*background-image: url('/jsp/admin/images/upload/hlc6.1.jpg');*/
										background-repeat:no-repeat;
										background-attachment: scroll;
										background-position: -100px 0px;
										background-color: transparent;
										background-size: 1290px 1290px">
				</div>
			</div>
		</div>
		<ol class="Xcontent08">
			<c:forEach items="${myProduct.images}" var="it" varStatus="status">
			<div class="Xcontent07"><img  src="${pageContext.request.contextPath}/${it}"></div>
			</c:forEach>
		</ol>
		<ol class="Xcontent13 clearfix">
			<div class="Xcontent14 clearfix"><a href="#"><p>${myProduct.productname}</p></a></div>
			<div class="Xcontent15 clearfix red fl" style="margin-top:15px;margin-right: 8px;">${myProduct.productdescribe}</div>
			<div class="Xcontent16 clearfix"><p style="margin-top:14px;">更多惊喜，你值得拥有！</p></div>
			<c:if test="${myProduct.productdisabled>0}">
			<div class="Xcontent15 clearfix red fl"><p style="margin-top:14px;font-size: 30px;">消耗 <strong id="aaa">${myProduct.productdisabled}</strong> 积分可兑换</p></div>
			</c:if>
			<div  style="height:14px;"></div>

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
					<input id="bbb" class="input" style="padding-left:0px;" name="shuliang" value="1"></form>
				<div class="Xcontent33"><img src="${pageContext.request.contextPath}/jsp/users/images/shangpinxiangqing/16.png"></div>
				<div class="Xcontent36" id="shoucang">
					<a href=""><img src="${pageContext.request.contextPath}/jsp/users/images/shoucang.png" height="15px" width="15px"></a>
					<a href="">收藏宝贝</a>
				</div>
				<div class="Xcontent36">
					<a href="jsp/admin/chat/login.jsp" target="_blank"><img src="${pageContext.request.contextPath}/jsp/users/images/kefu.png" height="15px" width="15px"></a>
					<a href="jsp/admin/chat/login.jsp" target="_blank">联系客服</a>
				</div>
			</div>

			<input type="hidden" class="ace" name="productid" value="${productid}" />
			<div class="Xcontent34"><a href="javascript:oneMei('<%=basePath%>');">立即购买</a></div>
			<div class="Xcontent35"><a href="javascript:void(0)">加入购物车</a></div>

			<c:if test="${myProduct.productdisabled>0}">
			<div class="Xcontent341"><a id="submit"  href="javascript:lijiduihuan();" onclick="ShowDiv('MyDiv','fade')">立即兑换</a></div>
			</c:if>
			<%--<input id="Button1" type="button" value="点击弹出层" onclick="ShowDiv('MyDiv','fade')" />--%>
			<!--弹出层时背景层DIV-->

			<%--	<div id="fade" class="black_overlay">
			</div>
			<div id="MyDiv" class="white_content">
				<div style="text-align: right; cursor: default; height: 40px;" id="move">
					<span style="font-size: 16px;" onclick="CloseDiv('MyDiv','fade')">关闭</span>
				</div>--%>

			<%--	<form method="post" action="" name="allnotice">
					<div data-role="popup" id="myPopup" class="ui-content" style="width: 400px;height: 300px;margin-left: 30px  " >
				<h1>欢迎!</h1> <div class="container1" style="color: #d10607"> 账号可用积分： <div id="myDiv1" style="margin-right: 20px"></div>
						<div >要兑换的数量：<div id="myDiv2" style="margin-right: 20px"></div></div>
						&lt;%&ndash;保存兑换的数量&ndash;%&gt;
						<input type="hidden" id="ace0" name="shuliang" value="88" />
						<div >将消耗的积分：<div id="myDiv3"></div></div>
						&lt;%&ndash;保存消耗的积分&ndash;%&gt;
						<input type="hidden" id="ace1" name="totalcredit" value="88" />
					</div><br>

						&lt;%&ndash;保存商品id&ndash;%&gt;
						<input type="hidden" class="ace" name="productid" value="${productid}" />

				<fieldset data-role="controlgroup" data-type="horizontal" style="font-size: 20px;height: 100px;">
					<br>
					<legend><strong>请选择您的收货收货方式：</strong></legend><br>
					<label style="width: 160px;margin-left: 60px" for="male">  快递配送</label>
					<input type="radio" name="gainmethod" id="male"   value="0">
					<label style="width: 160px;margin-left: 45px"  for="female">货物自取</label>
					<input checked="checked" type="radio" name="gainmethod" id="female" value="1">
				</fieldset></br></br>

				<div class="Add_p_s"  id="testDiv"  style=" display:none;font-size: 15px;" >
					<label class="form-label col-2" ><strong style="font-size: 20px">收货地址：</strong></label>
					<div style="height: 20px"></div>
					<div class="formControls col-2"><span class="select-box">
				<select class="select" name="mygainid">
					<option value="-2" >请选择收货地址!如果没有地址，请前往个人中心添加！</option>
					&lt;%&ndash;<option value="-2" >${gainaddres}</option>&ndash;%&gt;
                    &lt;%&ndash;判断地址gainid大于0&ndash;%&gt;
                     <c:forEach items="${gainaddres}" var="gainaddres1" varStatus="status">
						 <option value="${gainaddres1.gainid}">${gainaddres1.gainaddress}</option>
					 </c:forEach>
				</select>
				</span></div></div></br>


				<p style="text-align: center;margin-top: 30px">
					<input style="width: 80px;margin-left: 80px" class="button" type="button" onclick="addPointProductOrder()" data-inline="true" id="formbutton"  value="确认兑换">
					<input style="width: 80px;margin-left: 80px" class="button" type="button"  data-inline="true"  onclick="CloseDiv('MyDiv','fade')" value="取消兑换"> </p>
			</div>
</form>
				<script type="text/javascript">
                    function addPointProductOrder(){
                        /* var btn = document.getElementById("firstbuy");
                         btn.onclick = function(){  */


                        var hh1= document.getElementById("myDiv1").innerText;
                        var hh2= document.getElementById("myDiv3").innerText;
//                        alert(hh1);alert(hh2);alert(hh1-hh2);
                        if(hh1-hh2 <0 ){

                            alert("对不起！您的积分不够！");

                            return false;
                        }else{

                            document.allnotice.action = "${pageContext.request.contextPath}/jiFenDingDan.action";
                            document.allnotice.submit();

                        }

                    } 	 ;

				</script>--%>

<%--  </div>--%>
<script type="text/javascript">
    document.getElementById("male").onclick=function(){
        document.getElementById("testDiv").style.display="block";
    }

    document.getElementById("female").onclick=function(){
            document.getElementById("testDiv").style.display="none";
        }


   $(function () {
		$("#submit").click(function () {
            $.ajax({
                type : 'post',
                async : false,
                url : root+'/userJiFen.action',

                data : '{}',
                contentType : 'application/json;charset=utf-8',        //返回数据形式为json
                success : function(result) {
                    //请求成功时执行该函数内容，result即为服务器返回的json对象
                    if (result) {
//                        alert(result.creditscore);
                        $('#myDiv1').html(result.creditscore);

                        var a1= document.getElementById("aaa").innerHTML;
//                                              alert(a1);
                        var b1= document.getElementById("bbb");
                        $('#myDiv2').html(b1.value);
                        document.getElementById("ace0").value=b1.value;
//                        alert(b1.value);
                        var c1=a1*(b1.value);
                        $('#myDiv3').html(c1);
//                        alert(c1);
                        document.getElementById("ace1").value=c1;

                    }
                },
                error : function(errorMsg) {
                    //请求失败时执行该函数
                    alert("请求数据失败!");
                }
            } )

        })
   })


</script>


			</ol>
		</ul>
	</div>
</form>

<div class="containers center clearfix" style="margin-top:20px; background:#fff;">
	<div class="pc-info fr" style="padding-left:10px; padding-top:20px;float: left;margin-left: 100px;margin-top: -100px;">
		<div class="pc-overall">
			<ul id="H-table1" class="brand-tab H-table1 H-table-shop clearfix ">
				<li class="cur"><a href="javascript:void(0);">商品介绍</a></li>
				<li><a href="#top" target="_self">商品评价</a></li>
			<%--<li><a href="javascript:void(0);">售后保障</a></li>--%>
			</ul>
			<div class="pc-term clearfix">
				<div class="H-over1 pc-text-word clearfix">
					<div style="margin-left: 30px;margin-right:30px ">
						<c:forEach items="${myProduct.images1}" var="it" varStatus="status">
							<div style="text-align:center;margin-left: 200px;"><img src="${pageContext.request.contextPath}/${it}"width="70%";height="100%"></div>
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
		<a name="top" id="top"></a>
		<div id="pinglun" class="pc-overall" style="">
			<ul id="pingjia" class="brand-tab H-table H-table-shop clearfix" id="H-table" style="margin-left:0;">
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
					<ul id="pingjiashu" class="clearfix">
						<c:forEach items="${pingJiaList}" var="itss" varStatus="status">
							<li class="clearfix">
								<div class="column1" >
									<%--<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>--%>
									<p style="float: right;margin-left: 50px">${itss.ccomment}</p>
										<p class="column5" style="float: right;margin-left: 130px"><span style="float: right;margin-left: 30px">评论用户：${itss.username}</span><span>日期时间：<f:formatDate value="${itss.commenttime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></p>
								</div>

								<c:if test="${itss.goodcomment==0}">
								<div class="column2 a00" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star0.png"></div>
								</c:if>
								<c:if test="${itss.goodcomment==1}">
									<div class="column2 a11" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star1.png"></div>
								</c:if>
								<c:if test="${itss.goodcomment==2}">
									<div class="column2 a22" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star2.png"></div>
								</c:if>
								<c:if test="${itss.goodcomment==3}">
									<div class="column2 a33" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star3.png"></div>
								</c:if>
								<c:if test="${itss.goodcomment==4}">
									<div class="column2 a44" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star4.png"></div>
								</c:if>
								<c:if test="${itss.goodcomment==5}">
									<div class="column2 a55" style="float: right;margin-right: 90px"><img src="${pageContext.request.contextPath}/jsp/users/img/icon/star5.png"></div>
								</c:if>
							</li>
						</c:forEach>
					</ul>
				</div>

			</div>
		</div>
	</div>
</div>
<div style="height:100px"></div>
<div class="center" style="background:#fff">
    <div class="tabox">
        <div class="hd top-nav">
            <ul class="li-ul-ss">
                <li class="con " style="width:238px">猜您喜欢</li>
				<li class="con ">新品上架</li>
                <li class="con ">热评商品</li>
                <li class="con ">热销商品</li>
                <li class="con ">疯狂抢购</li>

			</ul>
        </div>
        <div class="bd my_ul">
            <ul class="lh bd_1" style="display: block;">1
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

			<ul class="lh bd_2" style="display: none;">2
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
			<ul class="lh bd_3" style="display: none;">3
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
			<ul class="lh bd_4" style="display: none;">
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
			<ul class="lh bd_5" style="display: none;">
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

<jsp:include page="${pageContext.request.contextPath}/jsp/users/bottom.jsp"></jsp:include>
<script type="text/javascript">

    $("#pingjia").find("li").click(function (i) {
        console.log(i);
        if($(this).hasClass("cur")){
            $(this).removeClass("cur");
            $(this).siblings("li").addClass("cur");
        }
        if(!$(this).hasClass("cur")){
            $(this).addClass("cur");
            $(this).siblings("li").removeClass("cur");
        }
    });
	$("#pingjia").find("li").each(function (i) {
		switch (i){
			case 0:
				console.log(i);
				$(this).click(function () {
                    getPinglun(0);
                });
			    break;
			case 1:
                console.log(i);
                $(this).click(function () {
                    getPinglun(1);
                });
				break;
            case 2:
                console.log(i);
                $(this).click(function () {
                    getPinglun(2);
                });
                break;
            case 3:
                console.log(i);
                $(this).click(function () {
                    getPinglun(3);
                });
                break;
			default:
                console.log(i);
			    break
		}
    })
	function getPinglun(i) {
		if(i==0){
			$(".a00").parents("li").show();
			$(".a11").parents("li").show();
			$(".a22").parents("li").show();
			$(".a33").parents("li").show();
			$(".a44").parents("li").show();
			$(".a55").parents("li").show();
		}
		if(i==1){
            $(".a00").parents("li").hide();
            $(".a11").parents("li").hide();
            $(".a22").parents("li").hide();
            $(".a33").parents("li").hide();
            $(".a44").parents("li").show();
            $(".a55").parents("li").show();
		}
		if(i==2){
            $(".a00").parents("li").hide();
            $(".a11").parents("li").hide();
            $(".a22").parents("li").show();
            $(".a33").parents("li").show();
            $(".a44").parents("li").hide();
            $(".a55").parents("li").hide();
		}
		if(i==3){
            $(".a00").parents("li").show();
            $(".a11").parents("li").show();
            $(".a22").parents("li").hide();
            $(".a33").parents("li").hide();
            $(".a44").parents("li").hide();
            $(".a55").parents("li").hide();
		}

    }

	 $(".Xcontent06").mouseover(function (event) {
		 $("#enlarge").show();
		 $("#mask").show();
         $(".Xcontent06").mousemove(function (event) {
             var offset = $(this).offset();
             var relativeX = event.pageX - offset.left;
             var relativeY = event.pageY - offset.top;
			 var top,left;

             $("#enlarge_img").css("background-image","url("+$(this).children("img").attr('src')+")");
             if(relativeX<71){
                 if(relativeY<71){
                     top=offset.top;
                     left=offset.left;
				 }else if(relativeY>357){
                     top=offset.top+289;
                     left=offset.left;
                 }else {
                     top=relativeY+offset.top-72;
                     left=offset.left;
				 }
             }else if(relativeX>357){
                 if(relativeY<73){
                     top=offset.top;
                     left=offset.left+286;
                 }else if(relativeY>357){
                     top=offset.top+289;
                     left=offset.left+286;
                 }else {
                     top=relativeY+offset.top-72;
                     left=offset.left+286;
                 }
			 }else if(relativeX<=360&&relativeX>=71){
                 if(relativeY<73){
                     top=offset.top;
                     left=relativeX+offset.left-72;
                 }else if(relativeY>357){
                     top=offset.top+289;
                     left=relativeX+offset.left-72;
                 }else {
                     left=relativeX+offset.left-72;
                     top=relativeY+offset.top-72;
                 }
			 }
             //console.log((relativeX+400+72)+" "+(relativeY+220+72));
             $("#mask").offset({top:top,left:left});
             $("#enlarge_img").css("background-position",-(relativeX)*2+"px "+-(relativeY)*2+"px");

             /*if(relativeX>143&&relativeX<286&&relativeY>143&&relativeY<286){
                 $("#mask").offset({top:-((relativeY-220+72)),left:-((relativeX-400)+72)});
                 //$("#enlarge_img").css("background-position",(relativeX*2)+"px "+(relativeY*2)+"px");
			 }else*/

         });
     });
     $(".Xcontent06").mouseout(function (event) {
         $("#enlarge").hide();
         $("#mask").hide();
     });

     function lijiduihuan() {
         if(${sessionScope.user==null}){
             alert("请先登录！")
		 }else { var flag=ajax("isExchage.action",${myProduct.productid})
             if(flag){
                 window.location.href="/jifenPage.action?productid=${productid}";
             }else {
                 alert("积分不足！")
             }}

     }





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
        $("#shoucang").click(function () {
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
        console.log("jjjjj");
        $(this).addClass("hover").siblings().removeClass("hover");
        $(this).find("li .nav a").addClass("hover");
        $(this).find(".con").show();

    },function(){
        console.log("dddd");
        //$(this).css("background-color","#f5f5f5");
        $(this).find(".con").hide();
        //$(this).find(".nav a").removeClass("hover");
        $(this).removeClass("hover");
        $(this).find(".nav a").removeClass("hover");
    })

    function oneMei(basePath) {
//        alert('您确定要删除吗？');
        window.location.href = "http://localhost:8080/LoginPage.action?returnUrl=" + encodeURIComponent(window.location.href);
        $("#mainForm").attr("action",basePath + "querendingdan.action");
        $("#mainForm").submit();
    }

</script>

<script type="text/javascript">



    $(".li-ul-ss").find("li").click(function(){
        var index=$(this).index();
        console.log(index);
        for(var i=0;i<5;i++){
            if(i==index){
                $(".my_ul").find("ul").eq(i).css("display","block");
            }else {
                $(".my_ul").find("ul").eq(i).css("display","none");
            }
        }
    });


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