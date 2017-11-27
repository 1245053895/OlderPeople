<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/11/26
  Time: 16:30
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
    <title>购物商城-关于我们</title>
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
    <script>
        $(function(){
            $("#dingdan ul li").click(function(){
                $("#dingdan ul li a").removeClass("dingdans");
                $(this).find("a").addClass("dingdans");
            });
        });
        function change(i){

        }
    </script>
    <script>
        $(function(){
            $("#leftinfo dl dd").click(function(){
                $("#leftinfo dl dd a").removeClass("leftinfos");
                $(this).find("a").addClass("leftinfos");
            });
        });
        function change(i){

        }
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

<section id="member">
    <div class="member-center clearfix" style="margin-top: 10px;margin-left: -50px">

        <div class="member-right fr">
                <img src="images/abt.jpg">
            <div class="member-border">

                <div class="member-caution clearfix">
                    <br>
                    <div>
                        <p><strong style="font-size: 18px">关于我们</strong></p>
                        <br>
                        <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp孝和集团致力于传承中国传统孝文化，提升中老年人生活品质，为他们提供优质的产品和服务。</p>
                        <br>
                        <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp孝和集团的网上购物商城是为了更进一步为老年群体服务、方便老年人购物的网上商店，购物商城让老人在家足不出户就可以购买到需要的商品。</p>
                        <br>
                        <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp目前，孝和集团已成为全国众多老人首选的老年服务对象，与全国众多名牌厂商达成了长期稳定的战略合作关系，为国内各企事业单位、大型养老机构采购的优质供应商及服务商。</p>
                        <br>
                        <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp孝和集团的网上购物商城是全国最大的专注于中老年人用品的一站式老年购物商城，主营范围有：出行代步、康复护理、健康监测、休闲娱乐、养生保健、居家日用等商品。致力于为客户提供全面、及时、便捷、高品质的商品，打造多元化的老年一站式购物体验平台。</p>
                        <br>
                        <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp购物商城是专门提供老年服务用品的商城，商品丰富应有尽有，做到全方位立体式满足老年人的各种日常所需品需求，致力于成为中国老年人最可靠信赖的全商品购物平台。</p>
                        <br>
                        <p style="color: #ea4949">企业文化</p>
                        <p>传承中华敬老美德，弘扬中华爱老文化</p>
                        <br>
                        <p style="color: #ea4949">企业愿景</p>
                        <p>建设老年商业综合体，成为养老产业的领航者</p>
                        <br>
                        <p style="color: #ea4949">企业价值观 </p>
                        <p>用心关爱、忠诚负责、追求卓越、感恩奉献</p>
                        <p>用心关爱：孝悌之道，存乎一心。用心关爱老人，为他们提供优质的产品和贴心的服务，是我们一直以来为之不懈努力的追求。我们一直这样做，并始终坚持这样做</p>
                        <p>忠诚负责：对企业忠诚，对社会负责，是嘉年乐全体员工一直遵循的工作准则</p>
                        <p>追求卓越：超越自我，追求卓越，从绝望中寻找希望，人生终将辉煌</p>
                        <p>感恩奉献：我们现在所取得的成绩，不是单靠自身就能成就的。一个有社会责任感的企业才能得到长足的发展，才会有生命力。感恩企业、感恩社会，积极奉献，用心回报社会</p>
                        <br>
                        <p style="color: #ea4949">企业经营理念</p>
                        <p>诚信经营、专业服务、合作共赢</p>
                        <p>诚信经营：以诚立身，以诚立信，诚信经营是公司成功之本</p>
                        <p>专业服务：秉承专业、专注，提供真诚贴心、专业的服务</p>
                        <p>合作共赢：我们期待更多的优秀合作伙伴加入，相互促进，共创未来</p>
                        <br>
                        <p style="color: #ea4949">企业服务理念 </p>
                        <p>真心、爱心、善心服务客户；诚心、热心、专心回报社会</p>
                        <br>
                        <p style="color: #ea4949">企业人才观 </p>
                        <p>以德为先、尊重人才、共同发展</p>
                        <p>以德为先：良好的社会公德和职业道德，是我们选择人才的第一标准</p>
                        <p>尊重人才：尊重知识，以人为本，人性化管理，搭建员工充分展示才华的平台</p>
                        <p>共同发展：企业与员工共同成长、共享发展成果</p>
                    </div>

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
