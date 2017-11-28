<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<title>购物商城-我的评价</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/member.css">
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

<div class="containers center"><div class="pc-nav-item"><a href="#">首页</a> &gt; <a href="#">会员中心 </a> &gt; <a href="#">商城快讯</a></div></div>
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
					<dd><a href="#">账户安全</a></dd>
					<dd class="cur"><a href="#">我的评价</a></dd>
					<dd><a href="#">地址管理</a></dd>
				</dl>
				<dl>
					<dt>客户服务</dt>
					<dd><a href="#">退货申请</a></dd>
					<dd><a href="#">退货/退款记录</a></dd>
				</dl>
				<dl>
					<dt>我的消息</dt>
					<dd><a href="#">商城快讯</a></dd>
					<dd><a href="#">帮助中心</a></dd>
				</dl>
			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"><h2>我的评价</h2></div>
			</div>
			<div class="member-border">
				<div class="member-column clearfix">
					<span class="co1">商品信息</span>
					<span class="co2">购买时间</span>
					<span class="co3">评价状态</span>
				</div>
				<c:forEach items="${productCustoms}" var="productCustom">
					<div class="member-class clearfix">
						<ul>
							<li class="clearfix">
								<div class="sp1">
									<span class="gr1"><a href="#"><img about="" title="" src="${pageContext.request.contextPath}/${productCustom.productpicture}" width="60" height="60"></a></span>
									<span class="gr2"><a href="#">${productCustom.productname}</a></span>
									<span class="gr3">X${productCustom.shoppingcount}</span>
								</div>
								<div></div>
								<div class="sp2"><fmt:formatDate value="${productCustom.commenttime}" pattern="yyyy-MM-dd HH:mm:ss"/> </div>

								<c:if test="${productCustom.comment==''||productCustom.comment==null}">
									<div class="sp3">
										<a href="javascript:void (0);">发表评价</a>
									</div>
								</c:if>
								<c:if test="${productCustom.comment!=''}">
									<div class="sp3" style="line-height: 90px">
										<div style="margin-top: -30px;margin-left: -60px;line-height: normal;">${productCustom.comment}</div>
									</div>
								</c:if>
							</li>
						</ul>
					</div>

					<div class="member-setup clearfix" id="pj" style="display: none">
						<ul>
							<li class="clearfix">
								<div class="member-score fl"><i class="reds">*</i>评分：</div>
								<div class="member-star fl">
									<select style="width: 50px;text-align: center">
										<option>1</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
									</select>
								</div>
								<div class="member-judge fr">
									<a href="javascript:void (0);" style="border: 1px #32a3ce solid;width: 70px;height: 50px;">发表评价</a>
								</div>
							</li>
							<li>
								<input value="${productCustom.commentid}" type="hidden">
							</li>

							<li class="clearfix comment">
								<div class="member-score fl"><i class="reds">*</i>商品评价：</div>
								<div class="member-star fl">
									<textarea maxlength="200"></textarea>
								</div>
							</li>
						</ul>
					</div>
				</c:forEach>

				<script>
                    $(document).ready(function(){
                        $(".sp3").find("a").click(function () {
                            $(this).parents(".member-class").next().css("display","block");
                        });
                        $(".member-judge").click(function () {
                            var data=new Array();
							data.push($(this).parents("li").next().find("input").val());
                            console.log($(this).parents("li[class='clearfix']").find("select").val()+"^^^");
                            console.log($(this).parents("ul").find("textarea").val()+"//");
                            data.push($(this).parents("li[class='clearfix']").find("select").val());//好评   0 评论id
							data.push($(this).parents("ul").find("textarea").val());//评论内容
							if(ajax("updateCommentByids.action",data)){
								alert("谢谢您的评价!");
							}else{
							    alert("评价失败!")
							}
                            $(this).parents(".member-setup").css("display","none");
                        });
                    });

                    function ajax(url,data) {
                        var flag;
                        $.ajax({
                            url:"${pageContext.request.contextPath}/"+url,
                            async:false,
                            type: 'POST',
                            data:{"data":data},
                            traditional: true,
                            timeout: 5000,
                            cache: false,
                            success: succFunction, //成功执行方法
                            beforeSend: LoadFunction, //加载执行方法
                            error: erryFunction  //错误执行方法
                        });
                        function LoadFunction() {

                        }
                        function erryFunction(){
                            flag=0;
                        }
                        function succFunction(data) {
                            if(data) {
                                flag=1;
                            }else {
                                flag=0;
                            }
                        }
                        return flag;
                    }


				</script>

				<%--<div class="member-class clearfix">
					<ul>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">发表评价</a> </div>
						</li>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">发表评价</a> </div>
						</li>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">发表评价</a> </div>
						</li>
					</ul>
				</div>--%>
				<%--<div class="member-pages clearfix">
					<div class="fr pc-search-g">
						<a class="fl pc-search-f" href="#">上一页</a>
						<a href="#" class="current">1</a>
						<a href="javascript:;">2</a>
						<a href="javascript:;">3</a>
						<a href="javascript:;">4</a>
						<a href="javascript:;">5</a>
						<a href="javascript:;">6</a>
						<a href="javascript:;">7</a>
						<span class="pc-search-di">…</span>
						<a title="使用方向键右键也可翻到下一页哦！" class="pc-search-n" href="javascript:;" onclick="SEARCH.page(3, true)">下一页</a>
						<span class="pc-search-y">
                        <em>  共20页    到第</em>
                        <input class="pc-search-j" placeholder="1" type="text">
                        <em>页</em>
                        <a href="#" class="confirm">确定</a>
                    </span>

					</div>
				</div>--%>

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