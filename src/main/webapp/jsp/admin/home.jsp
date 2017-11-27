<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String root =request.getContextPath(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript">
        var root="<%=root%>";
    </script>
    <script src="echarts.min.js"></script>
    <script src="jquery-1.4.4.min.js"></script>
    <script src="myChart3.js"></script>
		<link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
        <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
		<!--[if IE 7]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="/jsp/admin/assets/js/ace-extra.min.js"></script>
		<!--[if lt IE 9]>
		<script src="/jsp/admin/assets/js/html5shiv.js"></script>
		<script src="/jsp/admin/assets/js/respond.min.js"></script>
		<![endif]-->
        		<!--[if !IE]> -->
		<script src="/jsp/admin/assets/js/jquery.min.js"></script>
		<!-- <![endif]-->
           	<script src="/jsp/admin/assets/dist/echarts.js"></script>
        <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>

       <title>系统后台首页</title>
       </head>
<script type="text/javascript">

    function myfun() {

//        alert("自动加载");
        <%--alert( ${pingJiaShuList[0].goodcomment});--%>
        <%--alert( ${pingJiaShuList[0].goodcommentcount});--%>

        <%--$(".Xcontent19 span").text(${myProduct.productprice});--%>
        //alert($(".Xcontent19 span").text());

//        var a = $(".Xcontent19 span").text() * 1.2 +"";
        //alert(a.split(".")[0]+".0")

//        $(".Xcontent181 span").text(a.split(".")[0]+".0");
        var data;
        $.ajax({
            type : 'post',
            async : false,
//            url : root+'/readforms10000.action',
                url : root+'/readforms10001.action',
//                url : root+'/readforms10002.action',
//                url : root+'/readforms10005.action',
            data : '{}',
            contentType : 'application/json;charset=utf-8',        //返回数据形式为json
            success : function(result) {
                //请求成功时执行该函数内容，result即为服务器返回的json对象
                if (result) {
//                   alert(result.totalAmountOfTransaction);
//                    $('#myDiv').html(result.name5);
                    $('#myDiv1').html(result.totalAmountOfTransaction);
//                    $('#myDiv2').html(result.orderQuantity);
//                    $('#myDiv3').html(result.refundAmount);

                }
            },
            error : function(errorMsg) {
                //请求失败时执行该函数
                alert("请求数据失败!");
            }
        }


        );

        $.ajax({
                type : 'post',
                async : false,
                url : root+'/readforms10000.action',

                data : '{}',
                contentType : 'application/json;charset=utf-8',        //返回数据形式为json
                success : function(result) {
                    //请求成功时执行该函数内容，result即为服务器返回的json对象
                    if (result) {
//                        alert(result.name5);
                        $('#myDiv').html(result.name5);
                    }
                },
                error : function(errorMsg) {
                    //请求失败时执行该函数
                    alert("请求数据失败!");
                }
            } );

        $.ajax({
                type : 'post',
                async : false,
                url : root+'/readforms10002.action',
                data : '{}',
                contentType : 'application/json;charset=utf-8',        //返回数据形式为json
                success : function(result) {
                    //请求成功时执行该函数内容，result即为服务器返回的json对象
                    if (result) {
//                        alert(result.orderQuantity);
                        $('#myDiv2').html(result.orderQuantity);

                    }
                },
                error : function(errorMsg) {
                    //请求失败时执行该函数
                    alert("请求数据失败!");
                }
            } );


        $.ajax({
                type : 'post',
                async : false,
                url : root+'/readforms10005.action',
                data : '{}',
                contentType : 'application/json;charset=utf-8',        //返回数据形式为json
                success : function(result) {
                    //请求成功时执行该函数内容，result即为服务器返回的json对象
                    if (result) {
//                        alert(result.refundAmount);
                    $('#myDiv3').html(result.refundAmount);

                    }
                },
                error : function(errorMsg) {
                    //请求失败时执行该函数
                    alert("请求数据失败!");
                }
            }

        );


    }
    window.onload=myfun;
</script>

<body>
<div class="page-content clearfix">
 <div class="alert alert-block alert-success">
  <button type="button" class="close" data-dismiss="alert"><i class="icon-remove"></i></button>
  <i class="icon-ok green"></i>欢迎使用<strong class="green">后台管理系统<small>(v1.0)</small></strong>,你本次登陆IP:${ip}
 </div>
 <div class="state-overview clearfix">
                  <div class="col-lg-3 col-sm-6">
                      <section class="panel">
                          <a href="user_list.jsp" title="商城用户">
                          <div class="symbol terques">
                             <i class="icon-user"></i>
                          </div>
                          <div class="value">
                              <h1 id="myDiv">${orderAndString0.name5}</h1>
                              <p>商城用户</p>
                          </div>
                          </a>
                      </section>
                  </div>
                 <div class="col-lg-3 col-sm-6">
                     <section class="panel">
                         <a href="" title="交易金额">
                             <div class="symbol blue">
                                 <i class="icon-bar-chart"></i>
                             </div>
                             <div class="value">
                                 <h1 id="myDiv1">￥${orderAndString1.totalAmountOfTransaction}</h1>
                                 <p>交易金额</p>
                             </div>
                         </a>
                     </section>
                 </div>
                  <div class="col-lg-3 col-sm-6">
                      <section class="panel">
                          <a href="Orderform.jsp" title="用户订单">
                          <div class="symbol red">
                              <i class="icon-tags"></i>
                          </div>
                          <div class="value">
                              <h1 id="myDiv2">${orderAndString2.orderQuantity}</h1>
                              <p>用户订单</p>
                          </div>
                          </a>
                      </section>
                  </div>
                  <div class="col-lg-3 col-sm-6">
                      <section class="panel">
                          <a href="" title="退款金额">
                          <div class="symbol yellow">
                              <i class="icon-shopping-cart"></i>
                          </div>
                          <div class="value">
                              <h1 id="myDiv3">￥${orderAndString5.refundAmount}</h1>
                              <p>退款金额</p>
                          </div>
                          </a>
                      </section>
                  </div>

              </div>

    <div id="main" style="height:400px; overflow:hidden; width:100%; overflow:auto" >555</div>

     </div>
</body>
</html>
