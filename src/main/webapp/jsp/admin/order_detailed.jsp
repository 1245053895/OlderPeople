<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
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
        <script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
        <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
        <script src="/jsp/admin/assets/js/jquery.easy-pie-chart.min.js"></script>
        <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
<title>订单详细</title>
</head>

<body>
<div class="margin clearfix">
<div class="Order_Details_style">
<div class="Numbering">订单编号:<b>NJHDXJ201509-001</b></div></div>
 <div class="detailed_style">
 <!--收件人信息-->
    <div class="Receiver_style">
     <div class="title_name">收件人信息</div>
     <div class="Info_style clearfix">
        <div class="col-xs-4">  
         <label class="label_name"> 收件人姓名： </label>
         <div class="o_content">张孝全</div>
        </div>
        <div class="col-xs-4">  
         <label class="label_name"> 收件人电话： </label>
         <div class="o_content">16543432343</div>
        </div>
         <div class="col-xs-4">  
         <label class="label_name"> 收件地邮编： </label>
         <div class="o_content">104545</div>
        </div>
         <div class="col-xs-4">  
         <label class="label_name"> 收件地址： </label>
         <div class="o_content">江苏南京市雨花台区郁金香软件大厦3懂3单元302室</div>
        </div>
     </div>
    </div>
    <!--订单信息-->
    <div class="product_style">
    <div class="title_name">商品信息</div>
    <div class="Info_style clearfix">
      <div class="product_info clearfix">
      <a href="#" class="img_link"><img src="images/spxq1.jpg"  width="200" height="200"/></a>
      <span>
      <a href="#" class="name_link">老年外套，老年外套老年外套老年外套老年外套</a>
      <b>保暖舒服保暖舒服保暖舒服保暖舒服保暖舒服</b>
      <p>规格：XXL</p>
      <p>数量：2kg</p>
      <p>价格：<b class="price"><i>￥</i>56</b></p>
      <p>可获积分：23</p>
      <p>订单状态：<i class="label label-success radius">代发货</i></p>
      </span>
      </div>
      <div class="product_info clearfix">
      <a href="#" class="img_link"><img src="images/spxq2.jpg"  width="200" height="200"/></a>
      <span>
     <a href="#" class="name_link">老年外套，老年外套老年外套老年外套老年外套</a>
      <b>保暖舒服保暖舒服保暖舒服保暖舒服保暖舒服</b>
      <p>规格：XXL</p>
      <p>数量：2kg</p>
      <p>价格：<b class="price"><i>￥</i>69.9</b></p>
      <p>可获积分：23</p>
      <p>订单状态：<i class="label label-success radius">已签收</i></p>
      </span>
      </div>
    </div>
    </div>
    <!--总价-->
    <div class="Total_style">
     <div class="Info_style clearfix">
        <div class="col-xs-4">
         <label class="label_name"> 支付方式： </label>
         <div class="o_content">在线支付</div>
        </div>
        <div class="col-xs-4">  
         <label class="label_name"> 支付状态： </label>
         <div class="o_content">已支付</div>
        </div>
        <div class="col-xs-4">
         <label class="label_name"> 收货方式： </label>
         <div class="o_content">自取</div>
        </div>
        <div class="col-xs-4">
         <label class="label_name"> 物流名称： </label>
         <div class="o_content">天天快递</div>
        </div>
        <div class="col-xs-4">
         <label class="label_name"> 物流编号： </label>
         <div class="o_content">142315</div>
        </div>
        <div class="col-xs-4">
         <label class="label_name"> 订单生成日期： </label>
         <div class="o_content">2016-7-5</div>
        </div>
        </div>
      <div class="Total_m_style"><span class="Total">商品总数：<b>10</b></span><span class="Total_price">总价：<b>345</b>元</span></div>
    </div>
<div class="Button_operation">
				<button onclick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="icon-save "></i>返回上一步</button>
				
				<button onclick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
 </div>
</div>
</body>
</html>
