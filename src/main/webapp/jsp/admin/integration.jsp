<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>--%>
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
 <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/jsp/admin/font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
        <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
		<script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
        <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
<title>积分管理</title>
</head>

<body>
<div class="margin clearfix">
 <div class="" id="Other_Management">
 <div class="search_style">
      <div class="title_names">搜索查询</div>
      <ul class="search_content clearfix">
       <li><label class="l_f">会员名称</label><input name="" type="text" class="text_add" placeholder="输入会员名称、电话、邮箱" style=" width:400px"></li>
       <li style="width:90px;"><button type="button" class="btn_search"><i class="fa fa-search"></i>查询</button></li>
      </ul>
    </div>
    <div class="border clearfix">
      <%-- <span class="l_f">
        <a href="javascript:void(0)" class="btn btn-danger"><i class="fa fa-trash"></i>&nbsp;批量删除</a>
       </span>--%>
       <span class="r_f">共：<b>${totalMessage.totaluserrecord}</b>条</span>
     </div>
     <div class="list_style">
     <table class="table table-striped table-bordered table-hover" id="sample-table">
     <thead>
		 <tr>
				<th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="100">用户ID</th>
				<th width="120">用户名</th>
				<th width="100">积分</th>
                <th width="120">最近登录时间</th>
				<th width="120">浏览(条)</th>
                <th width="120">购物(比)</th>
				<%--<th width="250">操作</th>--%>
			</tr>
		</thead>
	<tbody>

        <c:forEach items="${userAndUserLog}" var="log" varStatus="status">
            <tr>
                <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
                <td>${log.userid}</td>
                <td>${log.username}</td>
                <td><a href="javascript:void(0)" onclick="integration_history('${log.userid}')">${log.creditscore}</a></td>
                <td><a href="javascript:void(0)" onclick="Browse_history('${log.userid}')"><fmt:formatDate value="${log.userlogintime}" pattern="yyyy-MM-dd HH:mm:ss"/></a></td>
                <td><a href="javascript:void(0)" onclick="Browse_history('${log.userid}')">${log.browseCount}</a></td>
                <td><a href="javascript:void(0)" onclick="integration_history('${log.userid}')">${log.ratio}</a></td>
               <%-- <td>
                    <a title="删除" href="javascript:;"  onclick="member_del(this,'${log.userid}')"
                       class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i>
                    </a>
                </td>--%>
            </tr>
        </c:forEach>
    </tbody>
 </table>
 </div>
     
 </div>
</div>
<!--积分-->
<div id="integration_history" style="display:none; padding:10px;">
   <table class="table table-striped table-bordered table-hover" id="integration_history_list" width="100%">
     <thead>
         <tr>
             <th width="80">用户</th>
             <th width="100">购买产品</th>
             <th width="80">总价格(元)</th>
             <th width="120">积分</th>
             <th width="120">获得时间</th>
         </tr>
     </thead>
     <tbody id="credits">
         <tr>
             <td></td>
         </tr>
     </tbody>
   </table>
</div>
<!--浏览记录-->
<div id="Browse_history" style="display:none; padding:10px">
<table class="table table-striped table-bordered table-hover" id="Browse_history_list" width="100%">
     <thead>
		 <tr>
				<th width="80">用户名</th>
				<th width="100">开始登录时间</th>
				<th width="80">结束登录时间</th>
				<th width="120">用户IP</th>
			</tr>
		</thead>
	<tbody id="log">
		<tr>
            <td></td>
        </tr>
        </tbody>    
     </table>     


</div>
</body>
</html>
<script>
jQuery(function($) {
				var oTable1 = $('#sample-table').dataTable( {
				"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,2,3,6]}// 制定列不参与排序
		] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			});
			


/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
//积分浏览
function integration_history(id){
    $(function () {
        $.ajax({
            url: '/getOrderDetail.action?id='+id,
            type: 'GET',
            dataType: 'json',
            timeout: 10000,
            cache: false,
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction,  //错误执行方法
            success: succFunction //成功执行方法
        })
        function LoadFunction() {

            $("#credits").html('加载中...');
        }
        function erryFunction() {
            alert("error");
        }
        function succFunction(tt) {
            var json = eval(tt); //数组
            console.log(json);
            var str="";
            $.each(json, function (index, item) {
                //循环获取数据
                var orderid = json[index].orderid;
                var username = json[index].username;
                var amountpay = json[index].amountpay;
                var totalcredit = json[index].totalcredit;

                var da = new Date(json[index].createtime);
                var createtime = da.getFullYear()+'-'+da.getMonth()+'-'+da.getDate()+' '+da.getHours()+":"+da.getMinutes()+":"+da.getSeconds();

                var products = json[index].products;
                str=str+"<tr><td style='display:none'>"+ orderid + "</td>"
                    +"<td>"+ username + "</td>"
                    +"<td>"+ products + "</td>"
                    +"<td>"+ amountpay + "</td>"
                    +"<td>"+ totalcredit + "</td>"
                    +"<td>"+ createtime + "</td></tr>"
            });
            $("#credits").html(str);
        }
    });
    layer.open({
       type: 1,
       title:'积分获取记录',
       area: ['800px','400px'],
       shadeClose: true,
       content: $('#integration_history'),
    })
    $('#integration_history_list').dataTable({
       "aaSorting": [[ 1, "desc" ]],//默认第几个排序
       "bStateSave": true,//状态保存
       "aoColumnDefs": [{
          "bSortable": false,
          "orderable":false,
          "aTargets": [0,1]
       }]
    });
	
};
//浏览记录

function Browse_history(id){
    $(function () {
        $.ajax({
            url: '/getUserLogById.action?id='+id,
            type: 'GET',
            dataType: 'json',
            timeout: 10000,
            cache: false,
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction,  //错误执行方法
            success: succFunction //成功执行方法
        })
        function LoadFunction() {

            $("#log").html('加载中...');
        }
        function erryFunction() {
            alert("error");
        }
        function succFunction(tt) {
            var json = eval(tt); //数组
            console.log(json);
            var str="";
            $.each(json, function (index, item) {
                //循环获取数据
                var username = json[index].username;

                var startdate = new Date(json[index].startlogintime);
                var startlogintime = startdate.getFullYear()+'-'+startdate.getMonth()+'-'+startdate.getDate()+' '+startdate.getHours()+":"+startdate.getMinutes()+":"+startdate.getSeconds();

                var enddate = new Date(json[index].endlogintime);
                var endlogintime = enddate.getFullYear()+'-'+enddate.getMonth()+'-'+enddate.getDate()+' '+enddate.getHours()+":"+enddate.getMinutes()+":"+enddate.getSeconds();

                var userip = json[index].userip;
                str=str+"<tr><td>"+ username + "</td>"
                    +"<td>"+ startlogintime + "</td>"
                    +"<td>"+ endlogintime + "</td>"
                    +"<td>"+ userip + "</td></tr>"
            });
            $("#log").html(str);
        }
    });
	layer.open({
        type: 1,
        title:'浏览记录',
        area: ['800px','400px'],
        shadeClose: true,
        content: $('#Browse_history'),
	})	
    $('#Browse_history_list').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [{
          "bSortable": false,
          "orderable":false,
          "aTargets": [0,1]
        }]
    });
}


//购物记录
function Order_history(id){
	layer.open({
    type: 1,
	title:'购物记录',
	area: ['800px','400px'],
	shadeClose: true,
	content: $('#Order_history'),
	});	
		$('#Order_history_list').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
    "bStateSave": true,//状态保存
    "aoColumnDefs": [{
	  "bSortable": false, 
	  "orderable":false, 
	  "aTargets": [0,1]
	 }]
});		
}


</script>
