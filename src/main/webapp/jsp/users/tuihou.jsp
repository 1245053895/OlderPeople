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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
    <meta name="renderer" content="webkit">
    <link rel="shortcut icon" type="image/x-icon" href="img/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/base.css">
    <link rel="stylesheet" type="text/css" href="css/home.css">
    <link rel="stylesheet" type="text/css" href="css/member.css">
    <link href="${pageContext.request.contextPath}/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
    <link href="${pageContext.request.contextPath}/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/admin/assets/css/ace.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/admin/assets/css/font-awesome.min.css" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/admin/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/admin/assets/css/ace-ie.min.css" />
    <![endif]-->
    <script src="${pageContext.request.contextPath}/jsp/admin/js/jquery-1.9.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/js/jquery.ui.touch-punch.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/js/ace-elements.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/admin/assets/js/ace.min.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
    <script type="text/javascript" src="js/modernizr-custom-v2.7.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
    <title>购物商城-退货/退款申请</title>
<style>
    .nav-tabs
    {
        border-color:  #eed3d7;
        margin-bottom: 0;
        margin-left: 0;
        position: relative;
        top: 1px;
    }

    .nav-tabs>li>a,.nav-tabs>li>a:focus
    {
        border-radius: 0!important;
        background-color: #f9f9f9;
        color: #999;
        margin-right: -1px;
        line-height: 16px;
        position: relative;
        z-index: 11;
        border-color: #eed3d7;
    }
    .nav-tabs>li.active>a, .nav-tabs>li.active>a:hover, .nav-tabs>li.active>a:focus{
        color: #576373;
        border-color:  #eed3d7;
        border-top: 2px #EE4644 solid;
        background-color: transparent;
        border-bottom-color: transparent;
        z-index: 12;
        line-height: 16px;
        margin-top: -1px;
    }
    .nav-tabs>li>a:hover
    {
        background-color: #FFF;
        color: #EE4644;
        border-color: #eed3d7;
    }
    .form-group{
        margin-left: -6px;
        text-align: center;
        margin-bottom: 75px;
        margin-top: 20px;
    }
    .col-sm-1{
        width: 15%;
    }
    input[type=checkbox].ace+.lbl, input[type=radio].ace+.lbl{margin-left: 40px;}
    input[type="file"]{margin-left: 10px;}

    .btn-primary,.btn-primary:focus
    {
        background-color: #ee4644!important;
        border-color: #ee4644;
    }

    .btn-primary:hover,.open .btn-primary.dropdown-toggle
    {
        background-color: #ee4644!important;
        border-color: #ee4644;
    }

    .btn-primary.no-border:hover
    {
        border-color: #ee4644;
    }

    .btn-primary.no-hover:hover
    {
        background-color: #ee4644!important;
    }

    .btn-primary.active
    {
        background-color: #2f7bba!important;
        border-color: #ee4644;
    }

    .btn-primary.no-border.active
    {
        background-color: #ee4644!important;
        border-color:#ee4644;
    }
    .col-sm-9{width: 20%;}
</style>
</head>

<body>

<header id="pc-header">

    <jsp:include page="/jsp/users/head.jsp"></jsp:include>
    <div class="yHeader">
        <!-- 导航   start  -->
        <div class="yNavIndex">
            <ul class="yMenuIndex">
                <li><a href="${pageContext.request.contextPath}/ShopFrontPage.action"  title="首页">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/ProductHot.action" target="_blank" title="热销专区">热销专区</a></li>
                <li><a href="${pageContext.request.contextPath}/SelectNewProduct.action" target="_blank" title="新品专区">新品专区</a></li>
                <li><a href="" target="_blank" title="积分商城">积分商城</a></li>
                <li><a href="${pageContext.request.contextPath}/queryTotalCommentshop.action" target="_blank" title="好评专区">好评专区</a></li>
                <li><a href="" target="_blank" title="关于我们">关于我们</a></li>
            </ul>
        </div>
        <!-- 导航   end  -->
    </div>

</header>
<section id="member">
    <div class="member-center clearfix">
 <%--       <div class="member-left fl">
            <div class="member-apart clearfix">
                <div class="fl"><a href="#"><img src="img/mem.png"></a></div>
                <div class="fl">
                    <p>用户名：</p>
                    <p><a href="#">亚里士多德</a></p>
                    <p>账号：</p>
                    <p>389323080</p>
                </div>
            </div>
            <div class="member-lists" id="leftinfo">
                <dl  onclick = "change(this);">
                    <dt>我的商城</dt>
                    <dd><a href="#">我的订单</a></dd>
                    <dd><a href="#">我的购物车</a></dd>
                    <dd><a href="#">我的收藏</a></dd>
                    <dd><a href="#">我的评价</a></dd>
                </dl>
                <dl  onclick = "change(this);">
                    <dt>客户服务</dt>
                    <dd><a href="#">退货订单</a></dd>
                    <dd><a href="#">退货/退款记录</a></dd>
                </dl>
            </div>
        </div>--%>
        <div class="member-right fr">
            <div class="margin clearfix">
                <div class="stystems_style">
                    <div class="tabbable">
                        <ul class="nav nav-tabs" id="myTab" style="width: 900px;">
                            <li class="active">
                                <a data-toggle="tab" onclick="change1(this)" href="#home"><i class="green fa fa-home bigger-110"></i>&nbsp;我要退货</a></li>
                            <li class="">
                                <a data-toggle="tab" onclick="change2(this)" data-toggle="dropdown" class="dropdown-toggle" href="#other">我要退款(无需退货)</a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div id="home1" class="tab-pane active" style="display: block">
                                <div style="margin-top:10px;">
                                    <label style="margin-left: 25px; margin-right: 8px;"><span style="color: red">*</span>订单状态： </label>
                                    <label><input name="productnew" value="1" type="radio" class="ace"><span class="lbl">未发货</span></label>&nbsp;&nbsp;
                                    <label><input name="productnew" value="0" type="radio" class="ace"><span class="lbl">已签收</span></label>
                                </div>
                                <div class="clearfix" style="margin-top: 30px;">
                                    <label class="form-label col-2" style="float: left;margin-left: 32px;"><span style="color: red">*</span>退货原因：</label>
                                    <div class="formControls col-10" style="float: left;margin-left: 48px;">
                                        <select name="productname" type="text" class="input-text" style="width: 200px;">
                                            <option value="1">请选择退货原因</option>
                                            <option value="2">发货太慢</option>
                                            <option value="3">多拍/错拍/不想要</option>
                                            <option value="4">不满意商品</option>
                                            <option value="5">卖家发错货</option>
                                            <option value="6">货物质量问题</option>
                                            <option value="6">其他原因</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>其他原因： </label>
                                    <div class="col-sm-9"><textarea class="textarea"></textarea></div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"><i  style="color: red">*</i>上传凭证： </label>
                                    <div class="col-sm-9"><input type="file" id="id-input-file-1"  /></div>
                                </div>
                                <div class="Button_operation">
                                    <button onclick="article_save_submit();" class="btn btn-primary radius" type="submit" style="margin-left: -300px; margin-bottom: -200px;width: 150px;"><i class="fa fa-save "></i>&nbsp;保存</button>

                                    <button onclick="layer_close();" class="btn btn-default radius" type="button" style="margin-bottom: -200px;width: 150px;">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>

                                </div>
                            </div>
                            <div id="profile" class="tab-pane ">

                            </div>
                            <div id="dropdown" class="tab-pane">

                            </div>
                            <div id="home2" class="tab-pane active" style="display: none">
                                <%--<div style="margin-top:10px;">
                                    <label style="margin-left: 25px; margin-right: 8px;"><span style="color: red">*</span>订单状态：</label>
                                    <label><input name="productnew" value="1" type="radio" class="ace"><span class="lbl">未发货</span></label>&nbsp;&nbsp;
                                    <label><input name="productnew" value="0" type="radio" class="ace"><span class="lbl">已签收</span></label>
                                </div>--%>
                                <div class="clearfix" style="margin-top: 30px;">
                                    <label class="form-label col-2" style="float: left;margin-left: 32px;"><span style="color: red">*</span>退款原因：</label>
                                    <div class="formControls col-10" style="float: left;margin-left: 48px;">
                                        <select name="productname" type="text" class="input-text" style="width: 200px;">
                                            <option value="1">请选择退款原因</option>
                                            <option value="2">货物损坏</option>
                                            <option value="3">商品变质</option>
                                            <option value="4">生产日期与卖家承诺不符</option>
                                            <option value="5">认为是三无产品</option>
                                            <option value="6">认为是假货</option>
                                            <option value="6" id="checkbox">其他原因</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>其他原因： </label>
                                    <div class="col-sm-9"><textarea class="textarea"></textarea></div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"><i  style="color: red">*</i>上传凭证： </label>
                                    <div class="col-sm-9"><input type="file" id="id-input-file-2"  /></div>
                                </div>
                                <div class="Button_operation">
                                    <button onclick="article_save_submit();" class="btn btn-primary radius" type="submit" style="margin-left: -300px; margin-bottom: -200px;width: 150px;"><i class="fa fa-save "></i>&nbsp;保存</button>

                                    <button onclick="layer_close();" class="btn btn-default radius" type="button" style="margin-bottom: -200px;width: 150px;">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>

                                </div>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>
</body>
</html>
<script>
    $('#id-input-file-1').ace_file_input({
        no_file:'选择上传图片 ...',
        btn_choose:'选择',
        btn_change:'更改',
        droppable:false,
        onchange:null,
        thumbnail:false, //| true | large
        whitelist:'gif|png|jpg|jpeg'
        //blacklist:'exe|php'
        //onchange:''
        //
    });
    $('#id-input-file-2').ace_file_input({
        no_file:'选择上传图片 ...',
        btn_choose:'选择',
        btn_change:'更改',
        droppable:false,
        onchange:null,
        thumbnail:false, //| true | large
        whitelist:'gif|png|jpg|jpeg'
        //blacklist:'exe|php'
        //onchange:''
        //
    });
    $(function(){
        $("#leftinfo dl dd").click(function(){
            $("#leftinfo dl dd a").removeClass("leftinfos");
            $(this).find("a").addClass("leftinfos");
        });
    });
    function change1(obj){
        $("#home1").css("display","block");
        $("#home2").css("display","none");
    }

    function change2(obj){
        $("#home2").css("display","block");
        $("#home1").css("display","none");
    }
</script>

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
