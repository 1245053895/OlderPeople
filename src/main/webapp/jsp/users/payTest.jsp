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

<%--传入购物车id和购买数量--%>
<form action="/myTset.action" method="post">
<div>
    <input type="hidden" class="ace" name="shopcarid" value="1" />
<input name="orderamount" value="10">
</div>

<div>
    <input type="hidden" class="ace" name="shopcarid" value="2" />
<input name="orderamount" value="100">
</div>

<div>
    <input type="hidden" class="ace" name="shopcarid" value="3" />
<input name="orderamount" value="50">
</div>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
