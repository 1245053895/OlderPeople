<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" /> 
        <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
        <link rel="stylesheet" href="/jsp/admin/Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
        <link href="/jsp/admin/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
	    <script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
        <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
        <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
		<!-- page specific plugin scripts -->
		<script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
        <script type="text/javascript" src="/jsp/admin/js/H-ui.admin.js"></script>
        <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
        <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
        <script type="text/javascript" src="/jsp/admin/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
        <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
<title>产品列表</title>
</head>
<body>

<%--<c:if test="${empty productAndTypeVos }">--%>
    <%--<jsp:forward page="/ProducList.action"/>--%>
<%--</c:if>--%>

    <div class=" page-content clearfix">

     <div id="products_style">
         <div class="search_style">
             <form action="<%= basePath %>ProducList.action" id="mainForm" method="post">
                 <div class="title_names">搜索查询</div>
                 <ul class="search_content clearfix">
                     <li><label class="l_f" style="margin-right: 5px;">商品名称</label><input name="producname" type="text"  class="text_add"  value="${productname}" class="text_add" placeholder="请输入商品名称进行查询"  style=" width:400px"/></li>
                     <li style="width:90px;"><button type="submit" class="btn_search"><i class="icon-search"></i>查询</button></li>
                 </ul>
             </form>
         </div>
             <table class="table table-striped table-bordered table-hover" id="sample-table">
                 <thead>
                 <tr>
                     <th width="80px">编号</th>
                     <th width="100px">商品名称</th>
                     <th width="100px">价格</th>
                     <th width="100px">商品描述</th>
                     <th width="180px">商品图片</th>
                     <th width="80px">是否新品</th>
                     <th width="80px">是否热销</th>
                     <th width="80px">是否可用积分兑换</th>

                 </tr>
                 </thead>
                 <tbody>
                 <c:forEach items="${productAndTypeVos}" var="productAndTypeVos" varStatus="status">
                     <tr>
                         <td width="80px">${status.index + 1}</td>
                         <td width="100px"><u style="cursor:pointer" class="text-primary" onclick="">${productAndTypeVos.productname}</u></td>
                         <td width="100px">${productAndTypeVos.productprice}</td>
                         <td width="100px">${productAndTypeVos.productdescribe}</td>

                         <td width="100px">  <img src="${productAndTypeVos.productpicture}" width="80px" height="110px">  </td>

                         <td width="100px">
                             <img src="/jsp/admin/images/<c:if test="${productAndTypeVos.productnew==1}">yes</c:if><c:if test="${productAndTypeVos.productnew==0}">no</c:if>.png" alt="是" style="cursor:pointer;width:30px;height: 30px;"/>
                         </td>
                         <td width="100px">
                             <img src="/jsp/admin/images/<c:if test="${productAndTypeVos.producthotsale==1}">yes</c:if><c:if test="${productAndTypeVos.producthotsale==0}">no</c:if>.png" alt="是" style="cursor:pointer;width:30px;height: 30px;"/>
                         </td>
                         <td width="100px">
                             <img src="/jsp/admin/images/<c:if test="${productAndTypeVos.productdisabled==1}">yes</c:if><c:if test="${productAndTypeVos.productdisabled==0}">no</c:if>.png" alt="是" style="cursor:pointer;width:30px;height: 30px;"/>
                         </td>
                     </tr>
                 </c:forEach>
                 </tbody>
             </table>
         </div>

     </div>
     </div>
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
		  {"orderable":false,"aTargets":[0,2,3,4,5,8,9]}// 制定列不参与排序
		] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			
			
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			});
 laydate({
    elem: '#start',
    event: 'focus' 
});
$(function() { 
	$("#products_style").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false,
		spacingw:30,//设置隐藏时的距离
	    spacingh:260,//设置显示时间距
	});
});
</script>
<script type="text/javascript">
//初始化宽度、高度  
 $(".widget-box").height($(window).height()-215); 
$(".table_menu_list").width($(window).width()-260);
 $(".table_menu_list").height($(window).height()-215);
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	$(".widget-box").height($(window).height()-215);
	 $(".table_menu_list").width($(window).width()-260);
	  $(".table_menu_list").height($(window).height()-215);
	})
 
/*******树状图*******/
var setting = {
	view: {
		dblClickExpand: false,
		showLine: false,
		selectedMulti: false
	},
	data: {
		simpleData: {
			enable:true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: ""
		}
	},
	callback: {
		beforeClick: function(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("tree");
			if (treeNode.isParent) {
				zTree.expandNode(treeNode);
				return false;
			} else {
				demoIframe.attr("src",treeNode.file + ".html");
				return true;
			}
		}
	}
}

//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Order_form').on('click', function(){
	var cname = $(this).attr("title");
	var chref = $(this).attr("href");
	var cnames = parent.$('.Current_page').html();
	var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIframe').html(cname);
    parent.$('#iframe').attr("src",chref).ready();;
	parent.$('#parentIframe').css("display","inline-block");
	parent.$('.Current_page').attr({"name":herf,"href":"javascript:void(0)"}).css({"color":"#4c8fbd","cursor":"pointer"});
	//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
    parent.layer.close(index);
	
});
</script>
