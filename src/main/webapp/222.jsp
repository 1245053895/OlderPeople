<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String root =request.getContextPath(); %>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts报表</title>
    <!-- 引入 echarts.js -->
    <script src="echarts.min.js"></script>
    <script src="jquery-1.4.4.min.js"></script>
    <script src="myChart.js"></script>
    <script src="myChart1.js"></script>
    <script src="myChart2.js"></script>

    <script type="text/javascript">
        var root="<%=root%>";
    </script>
</head>
<body>

     <div style="margin-left: 4%;margin-top: 30px">
         <td>  <span id="Statistics" class="Statistics" style=" float:left; width: 500px;height:300px;"></span>  </td>
         <td>   <span id="Statistics1" class="Statistics1" style="float:left;width: 500px;height:300px;"></span> </td>
     </div>


     <table>
    <tr>
    <td style="margin: 100px;text-align: center" height="80px">
        <b> 下图 以注册时间作为X轴，积分作为Y轴，鼠标在气泡上显示用户名称，气泡大小代表登录次数，颜色划分类别（男、女）</b>
     </td>
    </tr>

    <tr >
    <td>  <div style="margin-left: 8%;">
         <span id="Statistics2" style="float:right;width: 1100px;height:400px;"></span>
     </div>  </td>
</tr>
</table>



</body>
</html>