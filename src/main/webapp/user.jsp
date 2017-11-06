<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/31 0031
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border = 1>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>角色组</td>
        <td>性别</td>
    </tr>

    <c:forEach items="${adminList }" var="user">

        <tr>
            <td>${user.adminid}</td>
            <td>${user.adminuser }</td>
            <td>${user.admingroupid}</td>
            <td>${user.adminsex}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
