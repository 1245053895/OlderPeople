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
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/style.css"/>       
        <link href="assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/ace.min.css" />
        <link rel="stylesheet" href="font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="js/jquery-1.9.1.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>           	
		<script src="assets/js/jquery.dataTables.min.js"></script>
		<script src="assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="assets/layer/layer.js" type="text/javascript" ></script>          
        <script src="assets/laydate/laydate.js" type="text/javascript"></script>
        <script src="js/dragDivResize.js" type="text/javascript"></script>
<title>添加权限</title>
</head>

<body>
<div class="Competence_add_style clearfix">
  <div class="left_Competence_add">
   <div class="title_name">添加权限</div>
    <div class="Competence_add">
     <div class="form-group"><label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 权限名称 </label>
       <div class="col-sm-9"><input type="text" id="form-field-1" placeholder=""  name="权限名称" class="col-xs-10 col-sm-5"></div>
	</div>
     <div class="form-group"><label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 权限描述 </label>
      <div class="col-sm-9"><textarea name="权限描述" class="form-control" id="form_textarea" placeholder="" onkeyup="checkLength(this);"></textarea><span class="wordage">剩余字数：<span id="sy" style="color:Red;">200</span>字</span></div>
	</div>
   <!--按钮操作-->
   <div class="Button_operation">
				<button onclick="article_save_submit();" class="btn btn-primary radius submitadmin" type="submit"><i class="fa fa-save "></i> 保存并提交</button>
			</div>
   </div>
   </div>
   <!--权限分配-->
   <div class="Assign_style">
      <div class="title_name">权限分配</div>
      <div class="Select_Competence">
      <dl class="permission-list">
		<dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox"><span class="lbl">用户管理</span></label></dt>
		<dd>
		 <dl class="cl permission-list2">
		 <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0"><span class="lbl">用户信息</span></label></dt>
         <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">添加</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">修改</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">删除</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">查看</span></label>
		</dd>
		</dl>
		</dd>
	    </dl>
        <!--消息管理-->
         <dl class="permission-list">
		<dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox"><span class="lbl">消息管理</span></label></dt>
		<dd>
		 <dl class="cl permission-list2">
		 <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0"><span class="lbl">消息回复</span></label></dt>
         <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">查看</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">回复</span></label>

		</dd>
		</dl>
	     <dl class="cl permission-list2">
		  <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1"> <span class="lbl">评论回复</span></label></dt>
		  <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">查看</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">回复</span></label>
		 </dd>
		</dl>
        </dd>
	    </dl>
        <!--商品管理-->
        <dl class="permission-list">
		<dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox"><span class="lbl">商品管理</span></label></dt>
		<dd>
		 <dl class="cl permission-list2">
		 <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0"><span class="lbl">商品分类</span></label></dt>
         <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">添加</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">修改</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">删除</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">查看</span></label>
		</dd>
		</dl>
	     <dl class="cl permission-list2">
		  <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1"> <span class="lbl">商品列表</span></label></dt>
		  <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">添加</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">修改</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">删除</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">查看</span></label>
		 </dd>
        </dd>
		</dl>

          <!--订单管理-->
        <dl class="permission-list">
		<dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox" ><span class="lbl">订单管理</span></label></dt>
		<dd>
		 <dl class="cl permission-list2">
		 <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0" ><span class="lbl">用户订单</span></label></dt>
         <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">添加</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">修改</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">删除</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">查看</span></label>
		</dd>
		</dl>
	     <dl class="cl permission-list2">
		  <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1" > <span class="lbl">订单详情</span></label></dt>
		  <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">添加</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">修改</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">删除</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" ><span class="lbl">查看</span></label>
		 </dd>
		</dl>
			<dl class="cl permission-list2">
		  <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1"> <span class="lbl">退货订单</span></label></dt>
		  <dd>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">添加</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">修改</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">删除</span></label>
		   <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0"><span class="lbl">查看</span></label>
		 </dd>
		</dl>
        </dd>
		</dl>
		</dd>
		</dl>
	  </div>
  </div>
</div>
</body>
</html>
<script type="text/javascript">
//初始化宽度、高度  
 $(".left_Competence_add,.Competence_add_style").height($(window).height()).val();; 
 $(".Assign_style").width($(window).width()-500).height($(window).height()).val();
 $(".Select_Competence").width($(window).width()-500).height($(window).height()-40).val();
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	
	$(".Assign_style").width($(window).width()-500).height($(window).height()).val();
	$(".Select_Competence").width($(window).width()-500).height($(window).height()-40).val();
	$(".left_Competence_add,.Competence_add_style").height($(window).height()).val();;
	});
/*字数限制*/
function checkLength(which) {
	var maxChars = 200; //
	if(which.value.length > maxChars){
	   layer.open({
	   icon:2,
	   title:'提示框',
	   content:'您出入的字数超多限制!',	
    });
		// 超过限制的字数了就将 文本框中的内容按规定的字数 截取
		which.value = which.value.substring(0,maxChars);
		return false;
	}else{
		var curr = maxChars - which.value.length; //250 减去 当前输入的
		document.getElementById("sy").innerHTML = curr.toString();
		return true;
	}
};
/*按钮选择*/
$(function(){
	$(".permission-list dt input:checkbox").click(function(){
		$(this).closest("dl").find("dd input:checkbox").prop("checked",$(this).prop("checked"));
	});
	$(".permission-list2 dd input:checkbox").click(function(){
		var l =$(this).parent().parent().find("input:checked").length;
		var l2=$(this).parents(".permission-list").find(".permission-list2 dd").find("input:checked").length;
		if($(this).prop("checked")){
			$(this).closest("dl").find("dt input:checkbox").prop("checked",true);
			$(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",true);
		}
		else{
			if(l==0){
				$(this).closest("dl").find("dt input:checkbox").prop("checked",false);
			}
			if(l2==0){
				$(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",false);
			}
		}
		
	});
});

</script>
