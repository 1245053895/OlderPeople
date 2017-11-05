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
    搜索谷歌：<input type="search" name="googlesearch">            </br>


  多选  <input type="checkbox" name="item_id" value="001"/>
    <input type="checkbox" name="item_id" value="002"/>
    <input type="checkbox" name="item_id" value="002"/>                </br>

    单选  <input type="radio" name="it" value="001"/>
    <input type="radio" name="it" value="002"/>
    <input type="radio" name="ite" value="002"/>


    <button type="submit" >添加</button>

</form></br>


修改的表单</br>
<form action="${pageContext.request.contextPath }/user/modifyUser.action" method="post">
    <input type="hidden" name="id" value="${user.id }">
    用户名<input type="text" name="username" value="${user.username }"><br>
    年龄<input type="text" name="age" value="${user.age }"><br>
    <c:choose>
        <c:when test="${user.sex==1 }">
            性别  男<input type="radio" name="sex" value="1" checked="checked">女<input type="radio" name="sex" value="0"><br>
        </c:when>
        <c:when test="${user.sex==0 }">
            性别  男<input type="radio" name="sex" value="1" >女<input type="radio" name="sex" value="0" checked="checked"><br>
        </c:when>
        <c:otherwise>
            性别  男<input type="radio" name="sex" value="1" >女<input type="radio" name="sex" value="0"><br>
        </c:otherwise>
    </c:choose>
    生日 <input type="text" name="birthday" value="${user.formatDateString }"><br>
    表单名称 <input type="text" name="order.orderName" ><br>
    <input type="submit" value="提交">
</form>
</br>


添加的表单</br>
<!-- 使用form表单上传文件
  		1。提交方式是Post
  		2. 必须显示指定属性 enctype="multipart/form-data"
  		3.上传字段类型使用file
  	 -->
<form action="${pageContext.request.contextPath }/user/uploadUser.action" method="post" enctype="multipart/form-data">
    用户名<input type="text" name="username" ><br>
    年龄<input type="text" name="age" ><br>
    性别  男<input type="radio" name="sex" value="1" >女<input type="radio" name="sex" value="0"><br>
    生日 <input type="text" name="birthday" ><br>
    头像 <input type="file" name="userphoto"><br>
    <input type="submit" value="提交">
</form></br>








<div class="widget-body">
    <ul class="b_P_Sort_list">
        <c:forEach items="${kindOfProducts}" var="pro" varStatus="status">
            <li><i class="fa fa-users green"></i><a href="<%=request.getContextPath() %>/ProductType.action"> ${pro.kindofproduct}</a></li>
        </c:forEach>
    </ul>
</div>




<table border = 1>
    <tr>

        <td>时间</td>
    </tr>

    <c:forEach items="${productAndTypeVos }" var="user">

        <tr>

            <td> value="<fmt:formatDate value="${user.productcreatetime}" pattern="yyyy-MM-dd HH:mm:ss"/>"</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
