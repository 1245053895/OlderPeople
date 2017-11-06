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
	<link rel="stylesheet" href="assets/css/ace-ie.min.css" />
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
	<div class="search_style">
		<div class="title_names">搜索查询</div>
		<ul class="search_content clearfix">
			<form action="${pageContext.request.contextPath}/moHuSelectByAdminUser.action" method="post">
				<ul class="search_content clearfix">
					<li><label class="l_f">管理员名称</label><input name="adminuser" type="text" value="${adminuser}"  class="text_add" placeholder="请输入管理员名称"  style=" width:400px" /></li>
					<li style="width:90px;"><button type="submit" class="btn_search"><i class="icon-search"></i>查询</button></li>
				</ul>
			</form>
		</ul>
	</div>
	<div class="compete_list">
		<table id="sample-table-1" class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
				<%-- <th class="center"><label><input type="checkbox" class="ace"/><span class="lbl"></span></label></th>--%>
				<th>角色名称</th>
				<th>管理员名称</th>
				<th class="hidden-480">描述</th>
				<%--<th class="hidden-480">操作</th>--%>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${adminRoles}" var="adminRole">
				<tr>
						<%--<td class="center"><label><input type="checkbox" class="ace"/><span class="lbl"></span></label></td>--%>
					<td>${adminRole.admingroupname}</td>
					<td class="hidden-480">${adminRole.adminuser}</td>
					<td>${adminRole.admingroupdescription}</td>
						<%--<td>
                         <a title="编辑" onclick="Competence_modify('560')" href="javascript:;"  class="btn btn-xs btn-info" ><i class="fa fa-edit bigger-120"></i></a>
                         <a title="删除" href="javascript:;"  onclick="Competence_del(this,'1')" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>
                        </td>--%>
				</tr>
			</c:forEach>

			</tbody>
		</table>
	</div>
</div>

</body>
</html>