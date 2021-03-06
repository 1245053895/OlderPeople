<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
        <link href="/jsp/admin/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
	    <script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
        <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
<title>添加商品分类</title>
</head>
<body>

<!-- 显示错误信息 -->
<c:if test="${allErrors!=null}">
    <c:forEach items="${allErrors }" var="error">
        ${error.defaultMessage}</br>
    </c:forEach>
</c:if>


<div class="type_style">
 <div class="type_title">商品类型信息</div>
  <div class="type_content">
  <form action="" method="post" class="form form-horizontal" id="form-user-add">
    <div class="Operate_cont clearfix">
      <label class="form-label"><span class="c-red"><strong>*</strong></span>商品类型名：</label>
      <div class="formControls ">
        <input type="text" class="input-text" value="${producttypename}" placeholder="" id="user-name" name="producttypename">
      </div>
    </div>

    <div class="Operate_cont clearfix">
    <label class="form-label">分类描述：</label>
    <div class="formControls">
    <textarea name="producttypeA"  rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength(this,100)"></textarea>
     <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
    </div>
    </div>
      <div style="padding:10px 0px; text-align:center">
          <a href="javascript:productTypeAdd('<%=basePath%>');" class="btn  btn-warning"><i class="icon-edit align-top bigger-125"></i>新增该类型</a>
          <a href="javascript:productTypeDda('<%=basePath%>');" class="btn  btn-danger"><i class="icon-trash   align-top bigger-125"></i>删除该类型</a>
      </div>
  </form>
  </div>
</div> 
</div>
<script type="text/javascript" src="Widget/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="Widget/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="assets/layer/layer.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script>
<script type="text/javascript">

    function productTypeAdd(basePath) {
        alert('您确定要增加商品类型吗？');
        $("#form-user-add").attr("action",basePath + "ProductTypeAdd.action");
        $("#form-user-add").submit();
    }

    function productTypeDda(basePath) {
        alert('您确定要删除商品类型吗？');
        $("#form-user-add").attr("action",basePath + "ProductTypeDda.action");
        $("#form-user-add").submit();
    }



$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-user-add").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
});
</script>
</body>
</html>