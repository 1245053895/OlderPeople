<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KAIRUN
  Date: 2017/11/17
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset=" utf-8">
    <meta name="author" content="http://www.softwhy.com/" />
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/jsp/users/img/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/home.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/base.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/media_index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/mod.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/search/search.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/search/upload.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/search/result.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/users/css/search/loading.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/index.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/search/search.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/users/js/search/upload.js"></script>
    <style>
        body, ul, li
        {
            margin:0;
            padding:0;
        }
        body
        {
            font-size:12px;
            font-family:sumsun, arial;
            background:#FFFFFF;
        }
        .gover_search
        {
            position:relative;
            z-index:99;
            height:63px;
            padding:15px 0 0 20px;
            border-bottom:0;
        }
        .gover_search_form {height:36px;}
        .gover_search .search_t
        {
            float:left;
            width:112px;
            line-height:26px;
            color:#666;
        }
        .gover_search .input_search_key
        {
            float:left;
            width:435px;
            height:34px;
            padding:3px;
            margin-right:5px;
            border:1px solid #ccc;
            line-height:18px;
            background:#fff;
        }
        .gover_search .search_btn
        {
            float:left;
            width:68px;
            height:26px;
            overflow:hidden;
            border:1px solid #ccc;
            text-align:center;
            color:#ff3300;
            letter-spacing:5px;
            cursor:pointer;
            font-weight:bold;
        }
        .gover_search .search_suggest
        {
            position:absolute;
            z-index:999;
            left:132px;
            top:41px;
            width:433px;
            border:1px solid #ccc;
            border-top:none;
            display:none;
            color:#004080;
            margin-left:-112px;
        }
        .gover_search .search_suggest li
        {
            height:24px;
            overflow:hidden;
            padding-left:3px;
            line-height:24px;
            background:#fff;
            cursor:default;
        }
        .gover_search .search_suggest li.hover {background:#ddd;}
        .num_right
        {
            float:right;
            text-align:right;
            line-height:24px;
            padding-right:10px
        }
    </style>
</head>
<body>
<div class="search_my">
    <div class="bg"></div>
    <div class="search-wrapper">
        <div class="input-holder">
            <input type="text" name="input_text" class="search-input" placeholder="请输入关键词" />
            <button class="search-icon" onClick="searchToggle(this, event);"><span></span></button>
            <div class="search-select"></div>
            <div class="upload_image">
                <form id="uploadForm" action="" method="post" enctype="multipart/form-data">
                    <div class="select_img">
                        <div id="select_area"></div>
                        <input type="file" id="imageFile" style="filter:alpha(opacity=0);opacity:0;width: 0;height: 0;"/>
                        <div id="select_text">上传图片</div>
                    </div>
                    <div id="drop_img">
                        <div id="preview">
                            <div class="drop_this">
                                <center>请将图片拖到这里!</center>
                            </div>
                        </div>
                        <div class="header-tip"></div>
                    </div>
                </form>
            </div>
            <div class="result-suggest">
                <ul>
                    <li>老人</li>
                    <li>老年得出</li>
                </ul>
            </div>
        </div>
        <span class="close" onClick="searchToggle(this, event);"></span>
        <div class="result-container">

        </div>
    </div>
    <div class="result-list">
        <div class="product_advertising">
            <%--这是广告--%>
        </div>
        <div class="product_center">
            <div class="product_list">
                <div>
                    <img src="${pageContext.request.contextPath}/jsp/users/images/wntj/cy.jpg">
                </div>
                <div class="product_name">金黄嫩茶叶</div>
                <div class="product_price"><em>149</em>元</div>
            </div>
        </div>
    </div>
    <div class="loading">
        <div class="circle-loader">
            <div class="circle-line">
                <div class="circle circle-blue"></div>
                <div class="circle circle-blue"></div>
                <div class="circle circle-blue"></div>
            </div>
            <div class="circle-line">
                <div class="circle circle-yellow"></div>
                <div class="circle circle-yellow"></div>
                <div class="circle circle-yellow"></div>
            </div>
            <div class="circle-line">
                <div class="circle circle-red"></div>
                <div class="circle circle-red"></div>
                <div class="circle circle-red"></div>
            </div>
            <div class="circle-line">
                <div class="circle circle-green"></div>
                <div class="circle circle-green"></div>
                <div class="circle circle-green"></div>
            </div>
        </div>
    </div>
    <%--弹幕--%>
    <%--<div class="barrage">
        <div class="barrage_body">
            <div>
                6666
            </div>
        </div>

    </div>--%>
</div>

<script>

    //阻止默认事件
    window.onload = function(){
        upload_img();//拖拽上传
    };
</script>
<div class="pc-header-nav">
    <div class="pc-header-con">
        <c:if test="${empty user.userid}">
            <div class="fl pc-header-link" >您好！欢迎来孝和集团电子商城
                <a href="javascript:;" onclick="login()" id="login">请登录</a>&nbsp;
                <a href="${pageContext.request.contextPath}/jsp/users/register.jsp" target="_blank"> 免费注册</a>
            </div>
        </c:if>
        <c:if test="${not empty user.userid}">
            <div class="fl pc-header-link" >${user.username}您好！欢迎来孝和集团电子商城
                <a target="_self" href="${pageContext.request.contextPath}/ExitLogin.action" target="_blank"> 退出登录</a>
            </div>
        </c:if>

        <div class="fr pc-header-list top-nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=1">收藏夹</a></li>
                <!-- flag=0 表示跳到订单页面; flag=1 表示跳到收藏页面;flag=2 表示跳到购物车页面; ...-->
                <li><a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=0">我的订单</a></li>
                <li><a href="${pageContext.request.contextPath}/CustomerInformation.action">个人中心</a></li>
                <li><a href="${pageContext.request.contextPath}/ShopFrontPage.action">返回首页</a></li>
                <li>
                    <div class="nav"><i class="pc-top-icon"></i><a href="#">帮助中心</a></div>
                    <div class="con">
                        <dl>
                            <dt><a href="/CreditsMean.action">积分说明</a></dt>
                            <dd><a href="/LoginServlet?username=${sessionScope.user.username}">联系客服</a></dd>
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
            <a href="${pageContext.request.contextPath}/ShopFrontPage.action"></a>
        </h1>
    </div>
    <div class="head-form fl">
        <form class="clearfix" onsubmit="return false">
            <div class="gover_search">
                <div class="gover_search_form clearfix">
                    <%--<span class="search_t">关键词匹配搜索</span>--%>
                    <input type="text" class="input_search_key" id="gover_search_key" autocomplete="off" placeholder="请输入关键词搜索" />
                    <%--<button type="submit" class="search_btn">搜索</button>--%>
                    <button class="button" onclick="search('key');return false;" style="margin-left: -5px;margin-top: -1px;"> 搜索</button>
                    <div class="search_suggest" id="gov_search_suggest">
                        <ul>
                        </ul>
                    </div>
                </div>
            </div>
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
        <a href="${pageContext.request.contextPath}/jsp/users/my-dingdan.jsp?flag=2" target="_blank">我的购物车</a>
        <em>10</em>
    </div>
</div>

<script type="text/javascript" src="http://www.softwhy.com/mytest/jQuery/jquery-1.8.3.js"></script>
<script type="text/javascript">
    function oSearchSuggest(searchFuc)
    {
        var input = $('#gover_search_key');
        var suggestWrap = $('#gov_search_suggest');
        var key = "";
        var init = function(){
            input.bind('keyup',sendKeyWord);
            input.bind('blur',function(){setTimeout(hideSuggest,100);})
        }
        var hideSuggest = function(){
            suggestWrap.hide();
        }
        //发送请求，根据关键字到后台查询
        var sendKeyWord = function(event){
            //键盘选择下拉项
            if(suggestWrap.css('display')=='block'&&event.keyCode == 38||event.keyCode == 40)
            {
                var current = suggestWrap.find('li.hover');
                if(event.keyCode == 38)
                {
                    if(current.length>0)
                    {
                        var prevLi = current.removeClass('hover').prev();
                        if(prevLi.length>0)
                        {
                            prevLi.addClass('hover');
                            input.val(prevLi.html());
                        }
                    }
                    else
                    {
                        var last = suggestWrap.find('li:last');
                        last.addClass('hover');
                        input.val(last.html());
                    }
                }
                else if(event.keyCode == 40)
                {
                    if(current.length>0)
                    {
                        var nextLi = current.removeClass('hover').next();
                        if(nextLi.length>0)
                        {
                            nextLi.addClass('hover');
                            input.val(nextLi.html());
                        }
                    }
                    else
                    {
                        var first = suggestWrap.find('li:first');
                        first.addClass('hover');
                        input.val(first.html());
                    }
                }
                //输入字符
            }
            else
            {
                var valText = $.trim(input.val());
                if(valText ==''||valText==key)
                {
                    return;
                }
                searchFuc(valText);
                key = valText;
            }
        }
        //请求返回后，执行数据展示
        this.dataDisplay = function(data){
            if(data.length<=0)
            {
                suggestWrap.hide();
                return;
            }
            //往搜索框下拉建议显示栏中添加条目并显示
            var li;
            var tmpFrag = document.createDocumentFragment();
            suggestWrap.find('ul').html('');
            for(var i=0; i<data.length; i++)
            {
                li = document.createElement('LI');
                li.innerHTML = data[i];
                tmpFrag.appendChild(li);
            }
            suggestWrap.find('ul').append(tmpFrag);
            suggestWrap.show();
            //为下拉选项绑定鼠标事件
            suggestWrap.find('li').hover(function(){
                suggestWrap.find('li').removeClass('hover');
                $(this).addClass('hover');
            },function(){
                $(this).removeClass('hover');
            }).bind('click',function(){
                $(this).find("span").remove();
                input.val(this.innerHTML);
                suggestWrap.hide();
            });
        }
        init();
    };
    //实例化输入提示的JS,参数为进行查询操作时要调用的函数名
    var searchSuggest = new oSearchSuggest(sendKeyWordToBack);
    //这是一个模似函数，实现向后台发送ajax查询请求，并返回一个查询结果数据，传递给前台的JS,再由前台JS来展示数据。本函数由程序员进行修改实现查询的请求
    //参数为一个字符串，是搜索输入框中当前的内容
    function sendKeyWordToBack(keyword){
        var fd = new FormData();
        fd.append("data",keyword);
        $.ajax({
            type: "POST",
            contentType:false, //必须false才会避开jQuery对 formdata 的默认处理 , XMLHttpRequest会对 formdata 进行正确的处理
            processData: false, //必须false才会自动加上正确的Content-Type
            url: "/getSameProducts.action",
            timeout: 15000,
            data: fd,
            success: function (msg) {
                var aData = [];
                $.each( msg.suggest, function(index, content) {
                    aData.push(content);
                });
                //将返回的数据传递给实现搜索输入框的输入提示js类
                searchSuggest.dataDisplay(aData);
            },
            error: function (msg) {

            },
            beforeSend:function () {

            }
        });
    }

    function search() {
        var val=$(".input_search_key").val();
        console.log(val);
        $('.search-wrapper').addClass('active');
        $(".search_my").find(".bg").show();
        $(".search-wrapper").css({"top":"15%","left":"50%"});
        $(".result-container").show();
        $("input[class='search-input']").val(val);
        var fd = new FormData();
        fd.append("data",val);
        ajax(fd);

    }

    //去登陆页面
    function login(){
        window.location.href = "${pageContext.request.contextPath}/LoginPage.action?returnUrl=" + encodeURIComponent(window.location.href);
    }

</script>
</body>
</html>
