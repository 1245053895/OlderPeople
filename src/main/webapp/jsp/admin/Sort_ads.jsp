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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
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
		<script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
        <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
<title>订单详情</title>
</head>

<body>
<div class="page-content clearfix">
 <div class="sort_style">
     <div class="search_style">
         <div class="title_names">搜索查询</div>
         <ul class="search_content clearfix">
             <li><label class="l_f">订单编号</label><input name="" type="text" class="text_add" placeholder="订单编号、商品名称" style=" width:250px"></li>
             <li style="width:90px;"><button type="button" class="btn_search"><i class="fa fa-search"></i>查询</button></li>
         </ul>
     </div>
  <div class="sort_list">
    <table class="table table-striped table-bordered table-hover" id="sample-table">
		<thead>
		 <tr>
				<th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="100px">ID</th>
				<th width="100px">订单ID</th>
				<th width="300px">商品名称</th>
				<th width="100px">购买数量</th>
				<th width="100px">单价</th>
				<th width="100px">邮费</th>
				<th width="100px">总金额</th>
				<th width="250px">操作</th>
			</tr>
		</thead>
	<tbody>
      <tr>
       <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
       <td>1</td>
       <td>2</td>
       <td>保暖内衣</td>
       <td>3</td>
       <td>75</td>
       <td>14</td>
       <td>164</td>
       <td class="td-manage">
        <a title="编辑" onclick="member_edit('编辑','member-add.html','4','','510')" href="javascript:;"  class="btn btn-xs btn-info" ><i class="fa fa-edit bigger-120"></i></a>
        <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>
        <a title="订单详细"  href="order_detailed.jsp"  class="btn btn-xs btn-info order_detailed" ><i class="fa fa-list bigger-120"></i></a>
       </td>
      </tr>
    </tbody>
    </table>
  </div>
 </div>
</div>
<%--<!--添加分类-->
<div class="sort_style_add margin" id="sort_style_add" style="display:none">
  <div class="">
     <ul>
      <li><label class="label_name">分类名称</label><div class="col-sm-9"><input name="分类名称" type="text" id="form-field-1" placeholder="" class="col-xs-10 col-sm-5"></div></li>
      <li><label class="label_name">分类说明</label><div class="col-sm-9"><textarea name="分类说明" class="form-control" id="form-field-8" placeholder="" onkeyup="checkLength(this);"></textarea><span class="wordage">剩余字数：<span id="sy" style="color:Red;">200</span>字</span></div></li>
      <li><label class="label_name">分类状态</label>
      <span class="add_content"> &nbsp;&nbsp;<label><input name="form-field-radio1" type="radio" checked="checked" class="ace"><span class="lbl">显示</span></label>&nbsp;&nbsp;&nbsp;
     <label><input name="form-field-radio1" type="radio" class="ace"><span class="lbl">隐藏</span></label></span>
     </li>
     </ul>
  </div>
</div>--%>
</body>
</html>
<script type="text/javascript">

/*广告图片-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',{icon:0,},function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Order_form ,.ads_link').on('click', function(){
	var cname = $(this).attr("title");
	var cnames = parent.$('.Current_page').html();
	var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIframe span').html(cname);
	parent.$('#parentIframe').css("display","inline-block");
    parent.$('.Current_page').attr("name",herf).css({"color":"#4c8fbd","cursor":"pointer"});
	//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+">" + cnames + "</a>");
    parent.layer.close(index);
	
});
function AdlistOrders(id){
	window.location.href = "Ads_list.html?="+id;
};
</script>
<script type="text/javascript">
jQuery(function($) {
				var oTable1 = $('#sample-table').dataTable( {
				"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,2,4,6,7,]}// 制定列不参与排序
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
			})
</script>