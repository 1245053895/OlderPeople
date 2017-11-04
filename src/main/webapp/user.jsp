<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ProductType.action">

    商品名：   <input type="text" name="productname">
    日期：    <input type="date" name="productcreatetime">
    <%--日期时间：    <input type="datetime-local" name="productcreatetime">--%>
    E-mail:   <input type="email" name="email">
    搜索谷歌：<input type="search" name="googlesearch">
    <button type="submit" >添加</button>
</form>



<div class="widget-body">
    <ul class="b_P_Sort_list">
        <c:forEach items="${kindOfProducts}" var="pro" varStatus="status">
            <li><i class="fa fa-users green"></i><a href="<%=request.getContextPath() %>/ProductType.action"> ${pro.kindofproduct}</a></li>
        </c:forEach>
    </ul>
</div>




<table border = 1>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>角色组</td>
        <td>性别</td>
    </tr>

    <c:forEach items="${productAndTypeVos }" var="user">

        <tr>
            <td>${user.productid}</td>
            <td>${user.adminuser }</td>
            <td>${user.admingroupid}</td>
            <td>${user.adminsex}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
