<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <script src="/jsp/admin/js/dragDivResize.js" type="text/javascript"></script>
<title>添加角色</title>
</head>
<body>
	<c:if test="${empty firstviewList}">
		<jsp:forward page="/getFirstview.action"/>
	</c:if>
	<style type="text/css">
		#role{
			width: 500px;
			height:100%;
			margin: 50px auto;
		}
	</style>
	<div id="role">
		<div class="type_title" style="margin-bottom: 50px;margin-top:-50px;width:1142px;float: left;margin-left: -321px;">添加权限</div>

		 <form  name="itemsForm" action="${pageContext.request.contextPath }/addRloeAndView.action" method="post">
			 <div class="Competence_add">
				 <div class="form-group">
					 <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 角色名称 </label>
					 <div class="col-sm-9">
						 <input type="text" name="admingroupname" id="form-field-1" placeholder="" class="col-xs-10 col-sm-5">
					 </div>
				 </div>
				 <div class="form-group">
					 <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 角色描述 </label>
					 <div class="col-sm-9">
						 <textarea name="admingroupdescription" class="form-control" id="form_textarea" placeholder="" onkeyup="checkLength(this);" style="height: 150px;"></textarea>
						 <span class="wordage">剩余字数：<span id="sy" style="color:Red;">200</span>字</span>
					 </div>
				 </div>
				 <div class="form-group">
					 <label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 权限分配 </label>
					 <div class="col-sm-9">
						 <c:forEach items="${firstviewList}" var="firstview" varStatus="status">
							 <%--<label class="middle"><input class="flag_${status.index}" name="firstViewAction[${status.index}]" readonly="readonly" type="checkbox"  value="${firstview.firstviewaction}"></label>--%>
							 <label class="middle" style=" padding:7px;"><input id="f3" type="checkbox" name="firstViewAction[${status.index}]" value="${firstview.firstviewaction}" class="ace"><span class="lbl">${firstview.firstviewdescription}</span></label>
						 </c:forEach>
					 </div>
				 </div>
		<!--按钮操作-->
				 <div class="Button_operation">
					 <input onclick="xz()" class="btn btn-primary radius submitadmin" type="submit" value="保存并提交" />
					 <%--<input onclick="xz()" class="btn btn-primary radius submitadmin" type="button" value="保存并提交" />--%>
				 </div>
			 </div>
		 </form>
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

</script>

<script>
	function xz() {
//		if(form-field-1==null || form-field-1==""){
//		    alert("错误","不能有空项");
//		}
//		else{
		    confirm("确定添加?");
//		}
    }
</script>