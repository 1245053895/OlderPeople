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
	</style>
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
				<a href="index.jsp"></a>
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

<div class="Xcontent">
	<ul class="Xcontent01">

		<div class="Xcontent06"><img src="images/shangpinxiangqing/lndbc1.png"></div>
		<ol class="Xcontent08">
			<div class="Xcontent07"><img src="images/shangpinxiangqing/lndbc1.png"></div>
			<div class="Xcontent09"><img src="images/shangpinxiangqing/lndbc2.png"></div>
			<div class="Xcontent10"><img src="images/shangpinxiangqing/lndbc3.png"></div>
			<div class="Xcontent11"><img src="images/shangpinxiangqing/lndbc4.png"></div>
			<div class="Xcontent12"><img src="images/shangpinxiangqing/lndbc5.png"></div>
		</ol>
		<ol class="Xcontent13 clearfix">
			<div class="Xcontent14 clearfix"><a href="#"><p>好哥HG-W660老年代步车</p></a></div>
			<div class="Xcontent15 clearfix red fl" style="margin-top:15px;margin-right: 8px;">热销商品，爆款</div>
			<div class="Xcontent16 clearfix"><p style="margin-top:14px;">更多惊喜，你值得拥有！</p></div>
			<div class="Xcontent17">
				<p class="Xcontent18">售价</p>
				<p class="Xcontent19">￥<span>69.00</span></p>
				<p class="Xcontent18">原价</p>
				<p class="Xcontent181">￥<span>89.00</span></p>
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
								<a href="#">16人评论</a>
                                <span  class="sd"></span>
							</span>
                            赠送积分&nbsp;&nbsp;&nbsp;&nbsp;
                            <span>
                                <a href="#">69</a>
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
				<div class="Xcontent32"><img src="images/shangpinxiangqing/X15.png"></div>
				<form>
					<input class="input" value="1"></form>
				<div class="Xcontent33"><img src="images/shangpinxiangqing/16.png"></div>
			</div>
			<div class="Xcontent34"><a href="#">立即购买</a></div>
			<div class="Xcontent35"><a href="#">加入购物车</a></div>
            <div class="Xcontent36">
                <a href="#"><img src="images/shoucang.png" height="15px" width="15px"></a>
                <a href="#">收藏宝贝</a>
            </div>
            <div class="Xcontent36">
                <a href="#"><img src="images/kefu.png" height="15px" width="15px"></a>
                <a href="#">联系客服</a>
            </div>
		</ol>
	</ul>
</div>

<div class="containers center clearfix" style="margin-top:20px; background:#fff;">
	<div class="pc-info fr" style="padding-left:10px; padding-top:20px">
		<div class="pc-overall">
			<ul id="H-table1" class="brand-tab H-table1 H-table-shop clearfix ">
				<li class="cur"><a href="javascript:void(0);">商品介绍</a></li>
				<li><a href="javascript:void(0);">商品评价<em class="reds">(91)</em></a></li>
				<li><a href="javascript:void(0);">售后保障</a></li>
			</ul>
			<div class="pc-term clearfix">
				<div class="H-over1 pc-text-word clearfix">
					<ul class="clearfix">
						<li>
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
						</li>
					</ul>
					<div class="pc-line"></div>
					<ul class="clearfix">
						<li>
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
						</li>
					</ul>
					<div style="margin-left: 360px;">
						<div style="text-align:center"><img src="images/shangpinxiangqing/lndbc2.png" width="50%"></div>
						<div style="text-align:center"><img src="images/shangpinxiangqing/lndbc3.png" width="50%"></div>
						<div style="text-align:center"><img src="images/shangpinxiangqing/lndbc4.png" width="50%"></div>
						<div style="text-align:center"><img src="images/shangpinxiangqing/lndbc5.png" width="50%"></div>
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
				<li class="cur"><a href="javascript:void(0);">全部评价（199）</a></li>
				<li><a href="javascript:void(0);">好评<em class="reds">（33）</em></a></li>
				<li><a href="javascript:void(0);">中评<em class="reds">（02）</em></a></li>
				<li><a href="javascript:void(0);">差评<em class="reds">（01）</em></a></li>
			</ul>
			<div class="pc-term clearfix">
				<div class="pc-column">
					<span class="column1">评价心得</span>
					<span class="column2">顾客满意度</span>
					<span class="column3">购买信息</span>
					<span class="column4">评论者</span>
				</div>
				<div class="H-over  pc-comments clearfix">
					<ul class="clearfix">
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
					</ul>
				</div>
				<div style="display:none" class="H-over pc-comments">
					<ul class="clearfix">
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
					</ul>
				</div>
				<div style="display:none" class="H-over pc-comments">
					<ul class="clearfix">
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
					</ul>
				</div>
				<div style="display:none" class="H-over pc-comments">
					<ul class="clearfix">
						<li class="clearfix">
							<div class="column1">
								<p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
								<p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
								<p class="column5">2014-11-25 14:32</p>
							</div>
							<div class="column2"><img src="img/icon/star.png"></div>
							<div class="column3">颜色：云石白</div>
							<div class="column4">
								<p><img src="img/icon/user.png"></p>
								<p>2014-11-23 22:37 购买</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="clearfix">
			<div class="fr pc-search-g pc-search-gs">
				<a href="#" class="fl " style="display:none">上一页</a>
				<a class="current" href="#">1</a>
				<a href="javascript:;">2</a>
				<a href="javascript:;">3</a>
				<a href="javascript:;">4</a>
				<a href="javascript:;">5</a>
				<a href="javascript:;">6</a>
				<a href="javascript:;">7</a>
				<span class="pc-search-di">…</span>
				<a href="javascript:;">1088</a>
				<a href="javascript:;" class="" title="使用方向键右键也可翻到下一页哦！">下一页</a>
			</div>
		</div>
	</div>
</div>
<div style="height:100px"></div>
<div class="center" style="background:#fff">
    <div class="tabox">
        <div class="hd">
            <ul class="li-ul-ss">
                <li class=" " style="width:238px">疯狂抢购</li>
                <li class=" ">猜您喜欢</li>
                <li class=" ">热卖商品</li>
                <li class=" ">热评商品</li>
                <li class="">新品上架</li></ul>
        </div>
        <div class="bd">
            <ul class="lh" style="display: none;">
                <li>
                    <div class="p-img ld">
                        <a href="">
                            <img src="images/shangpinxiangqing/X-1.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">艾家纺全棉加厚磨毛四件套</a></div>
                    <div class="p-price">京东价：
                        <strong>￥399.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X-1.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">优曼真丝提花奢华四件套</a></div>
                    <div class="p-price">京东价：
                        <strong>￥1299.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X1.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">3999！大金1.5匹变频空调更安静！</a></div>
                    <div class="p-price">京东价：
                        <strong>￥3999.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X2.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">爸爸爱喜禾（犬子在，不远游！感动无数读者的电子书</a></div>
                    <div class="p-price">京东价：
                        <strong>￥1.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X3.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">【超值】飞利浦21.5英寸LED背光宽屏液晶显示</a></div>
                    <div class="p-price">京东价：
                        <strong>￥809.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X4.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">爸爸爱喜禾（犬子在，不远游！感动无数读者的电子书</a></div>
                    <div class="p-price">京东价：
                        <strong>￥1.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X5.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">【超值】飞利浦21.5英寸LED背光宽屏液晶显示</a></div>
                    <div class="p-price">京东价：
                        <strong>￥809.00</strong></div>
                </li>
            </ul>
            <ul class="lh" style="display: none;">
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/shangpinxiangqing/X-1.png"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">安钛克（Antec）VP 550P 额定550W 120mm静音风扇 主动PFC 黑化外型设计电源</a></div>
                    <div class="p-price">京东价：
                        <strong>￥399.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.2.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">G.SKILL（芝奇）RipjawsX DDR3 1600 8G(4G×2条)台式机内存(F3-12800CL9D-8GBXL )</a></div>
                    <div class="p-price">京东价：
                        <strong>￥235.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">希捷（Seagate）1TB ST1000DM003 7200转64M SATA 6Gb/秒 台式机硬盘 建达蓝德 盒装正品</a></div>
                    <div class="p-price">京东价：
                        <strong>￥438.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.4.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">华硕(ASUS)P8Z77-V LK主板(Intel Z77/LGA 1155)</a></div>
                    <div class="p-price">京东价：
                        <strong>￥899.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">大水牛（BUBALUS）电脑机箱 经典-A1008 灰黑色（不含电源）</a></div>
                    <div class="p-price">京东价：
                        <strong>￥112.00</strong></div>
                </li>
            </ul>
            <ul class="lh" style="display: none;">
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/3.1.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">冬季健身TOP1！瑞亚特仰卧板加送俯卧撑架</a></div>
                    <div class="p-price">京东价：
                        <strong>￥187.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/3.2.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">HTC Z715e!双核！魔音耳机！</a></div>
                    <div class="p-price">京东价：
                        <strong>￥2399.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/3.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">下单返现150元！格力9片电油汀</a></div>
                    <div class="p-price">京东价：
                        <strong>￥449.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/3.4.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">绿之源净味宝2居室除味超值套装 4000克</a></div>
                    <div class="p-price">京东价：
                        <strong>￥449.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/3.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">宏碁i5 4G GT630M 1G独显 月销量破</a></div>
                    <div class="p-price">京东价：
                        <strong>￥3599.00</strong></div>
                </li>
            </ul>
            <ul class="lh" style="display: none;">
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">希捷（Seagate）1TB ST1000DM003 7200转64M SATA 6Gb/秒 台式机硬盘 建达蓝德 盒装正品</a></div>
                    <div class="p-price">京东价：
                        <strong>￥438.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">希捷（Seagate）1TB ST1000DM003 7200转64M SATA 6Gb/秒 台式机硬盘 建达蓝德 盒装正品</a></div>
                    <div class="p-price">京东价：
                        <strong>￥438.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">希捷（Seagate）1TB ST1000DM003 7200转64M SATA 6Gb/秒 台式机硬盘 建达蓝德 盒装正品</a></div>
                    <div class="p-price">京东价：
                        <strong>￥438.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">希捷（Seagate）1TB ST1000DM003 7200转64M SATA 6Gb/秒 台式机硬盘 建达蓝德 盒装正品</a></div>
                    <div class="p-price">京东价：
                        <strong>￥438.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.3.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">希捷（Seagate）1TB ST1000DM003 7200转64M SATA 6Gb/秒 台式机硬盘 建达蓝德 盒装正品</a></div>
                    <div class="p-price">京东价：
                        <strong>￥438.00</strong></div>
                </li>
            </ul>
            <ul class="lh" style="display: block;">
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">大水牛（BUBALUS）电脑机箱 经典-A1008 灰黑色（不含电源）</a></div>
                    <div class="p-price">京东价：
                        <strong>￥112.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">大水牛（BUBALUS）电脑机箱 经典-A1008 灰黑色（不含电源）</a></div>
                    <div class="p-price">京东价：
                        <strong>￥112.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">大水牛（BUBALUS）电脑机箱 经典-A1008 灰黑色（不含电源）</a></div>
                    <div class="p-price">京东价：
                        <strong>￥112.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">大水牛（BUBALUS）电脑机箱 经典-A1008 灰黑色（不含电源）</a></div>
                    <div class="p-price">京东价：
                        <strong>￥112.00</strong></div>
                </li>
                <li>
                    <div class="p-img ld">
                        <a href="#">
                            <img src="images/2.5.jpg"></a>
                    </div>
                    <div class="p-name">
                        <a href="#">大水牛（BUBALUS）电脑机箱 经典-A1008 灰黑色（不含电源）</a></div>
                    <div class="p-price">京东价：
                        <strong>￥112.00</strong></div>
                </li>
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