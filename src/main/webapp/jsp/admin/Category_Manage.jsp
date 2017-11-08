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
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit|ie-comp|ie-stand"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
    <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet"/>
    <%--<link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />--%>
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
<form action="<%= basePath %>queryAllRole.action" id="mainForm" method="post">
<%--<c:if test="${empty admingroups }">
    <jsp:forward page="/queryAllRole.action"/>
</c:if>--%>

<div class="margin clearfix">
    <div class="border clearfix">
       <span class="l_f">
        <a href="/getFirstview.action" id="Competence_add" class="btn btn-warning" title="添加权限"><i class="fa fa-plus"></i> 添加权限</a>
       <a href="javascript:deleteBatch('<%=basePath%>');" class="btn btn-danger"><i class="icon-trash"></i>批量删除</a>
       </span>
        <span class="r_f">共：<b>${kindOfAdmin.adminGroupCount1}</b>类</span>
    </div>
    <div class="compete_list">
        <table id="sample-table-1" class="table table-striped table-bordered table-hover">
            <thead>
            <tr>
                <th class="center"><label><input type="checkbox" class="ace"/><span class="lbl"></span></label></th>
                <th>角色id</th>
                <th>角色名称</th>
                <th class="hidden-480">角色描述</th>
                <th class="hidden-480">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${admingroups}" var="admingroup">
                <form id="form_${admingroup.admingroupid}" action="${pageContext.request.contextPath}/updateRloeById.action?id=${admingroup.admingroupid}" method="post">
                    <tr>
                        <td class="center"><label><input type="checkbox" name="RoleIds" value="${admingroup.admingroupid}"  class="ace"><span class="lbl"></span></label></td>
                        <td><input type="text" value="${admingroup.admingroupid}" name="admingroupid" class="input_style text_info" readonly="true"/></td>
                        <td class="hidden-480"><input type="text" name="admingroupname" value="${admingroup.admingroupname}" class="input_style text_info${admingroup.admingroupid}" readonly="true"/></td>
                        <td><input type="text" value="${admingroup.admingroupdescription}" name="admingroupdescription" class="input_style text_info${admingroup.admingroupid}" readonly="true"/></td>
                        <td>
                           <a title="编辑" onclick="modify(${admingroup.admingroupid})" href="javascript:void(0);"  class="btn btn-xs btn-info radius" ><i id="edit${admingroup.admingroupid}" class="fa bigger-120">编辑</i></a>
                           <a title="删除" href="${basePath}deleteRoleById.action?id=${admingroup.admingroupid}"  onclick="alert('您确定要删除吗？')" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>
                        </td>
                    </tr>
              </form>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>
</form>
</body>
</html>

<style type="text/css">
.input_style{
width: 100%;
background-color: transparent;
border: 0px transparent solid;
}
.btn-xs{
    border-width: 3px;
}
.btn-info,.btn-info:focus
{
background-color: #6fb3e0!important;
border-color: #6fb3e0;
}

.btn-info:hover,.open .btn-info.dropdown-toggle
{
background-color: #4f99c6!important;

border-color: #6fb3e0;
}

.btn-info.no-border:hover
{
border-color: #4f99c6;
}

.btn-info.no-hover:hover
{
background-color: #6fb3e0!important;
}

.btn-info
{
background-color: #5fa6d3!important;
border-color: #4396cb;
}

.btn-info
{
background-color: #539fd0!important;
border-color: #539fd0;
}

.btn-info.disabled,.btn-info[disabled],fieldset[disabled] .btn-info,.btn-info.disabled:hover,.btn-info[disabled]:hover,fieldset[disabled] .btn-info:hover,.btn-info.disabled:focus,.btn-info[disabled]:focus,fieldset[disabled] .btn-info:focus,.btn-info.disabled:active,.btn-info[disabled]:active,fieldset[disabled] .btn-info:active,.btn-info.disabled.active,.btn-info[disabled].active,fieldset[disabled] .btn-info.active
{
background-color: #6fb3e0!important;
border-color: #6fb3e0;
}

</style>

<script>
    var flag=true;
    function modify(v) {
        if(flag) {
            $('.text_info' + v).attr("readonly", false);
            $('.text_info' + v).parents("td").css("box-shadow","0px 0px 20px #888888 inset");
            $('#edit'+v).text("提交");
            flag = false;
        }else{
            $("#form_"+v).submit();
            $('#edit'+v).text("编辑");
            flag=true;
        }
    }
    function deleteBatch(basePath) {
        alert('您确定要删除吗？');
        $("#mainForm").attr("action",basePath + "deletBatchRole.action");
        $("#mainForm").submit();
        }
</script>