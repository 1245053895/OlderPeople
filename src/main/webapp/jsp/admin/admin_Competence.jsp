<%--
  Created by IntelliJ IDEA.
  User: mywork
  Date: 2017-10-30
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="renderer" content="webkit|ie-comp|ie-stand"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="/jsp/admin/css/style.css"/>
	<link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet"/>
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
	<title>管理权限</title>
</head>

<body>
<c:if test="${empty adminRoles }">
	<jsp:forward page="/RloeController.action"/>
</c:if>

<div class="margin clearfix">
	<div class="border clearfix">
       <span class="l_f">
        <a href="javascript:void(0)" id="Competence_add" class="btn btn-warning" title="添加权限"><i class="fa fa-plus"></i> 添加权限</a>
        <%--<a href="javascript:void(0)" class="btn btn-danger"><i class="fa fa-trash"></i> 批量删除</a>--%>
       </span>
		<span class="r_f">共：<b>5</b>类</span>
	</div>
	<div class="compete_list">
		<table id="sample-table-1" class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
				<th class="center"><label><input type="checkbox" class="ace"/><span class="lbl"></span></label></th>
				<th>角色名称</th>
				<th>用户名称</th>
				<th class="hidden-480">描述</th>
				<th class="hidden-480">操作</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${adminRoles}" var="adminRole">
				<tr>
					<td class="center"><label><input type="checkbox" class="ace"/><span class="lbl"></span></label></td>
					<td>${adminRole.admingroupname}</td>
					<td class="hidden-480">${adminRole.adminuser}</td>
					<td>${adminRole.admingroupdescription}</td>
					<td>
						<a title="编辑" onclick="Competence_modify('560')" href="javascript:;"  class="btn btn-xs btn-info" ><i class="fa fa-edit bigger-120"></i></a>
							<%-- <a title="删除" href="javascript:;"  onclick="Competence_del(this,'1')" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>--%>
					</td>
				</tr>
			</c:forEach>

			</tbody>
		</table>
	</div>
</div>

</body>
</html>