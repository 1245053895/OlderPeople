<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
<!--[if lt IE 9]>
<script type="text/javascript" src="/jsp/admin/js/html5.js"></script>
<script type="text/javascript" src="/jsp/admin/js/respond.min.js"></script>
<script type="text/javascript" src="/jsp/admin/js/PIE_IE678.js"></script>
<![endif]-->
<link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="/jsp/admin/css/style.css"/>
<link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
<link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
      <link rel="stylesheet" href="/jsp/admin/Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<link href="/jsp/admin/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="/jsp/admin/Widget/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />

<title>新增商品</title>
</head>
<body>

<!-- 显示错误信息 -->
<%--<c:if test="${allErrors!=null }">--%>
    <%--<c:forEach items="${allErrors }" var="error">--%>
        <%--${ error.defaultMessage}<br/>--%>
    <%--</c:forEach>--%>
<%--</c:if>--%>


<%--<div class="clearfix" id="add_picture">--%>
<div class="page_right_style" style="margin: 0px auto">
   <div class="type_title">添加商品</div>


	<form action="<%= basePath %>AddProduct.action" method="post" enctype="multipart/form-data" class="form form-horizontal" id="form-article-add">
		<div class="clearfix cl">
         <label class="form-label col-2"><span class="c-red">*</span>商品名称：</label>
		 <div class="formControls col-10"><input name="productname" type="text" class="input-text"></div>
		</div>
		<div class=" clearfix cl">
         <label class="form-label col-2">商品描述：</label>
	     <div class="formControls col-10"><input name="productdescribe" type="text" class="input-text"></div>
		</div>
		<div class=" clearfix cl">
			<div class="Add_p_s">
				<label class="form-label col-2">商品类型：</label>
				<div class="formControls col-2"><span class="select-box">
				<select class="select" name="producttypeid">

                     <c:forEach items="${producttypeList}" var="producttype1" varStatus="status">
                         <option value="${producttype1.producttypeid}">${producttype1.producttypename}</option>
                     </c:forEach>

				</select>
				</span></div>
			</div>
			<div class="Add_p_s">
				<label class="form-label col-2" style="padding-left: 0px;">价格：<div class="formControls col-2"><input name="productprice" type="text" class="input-text" >元</div></label>
			</div>
			<div class="Add_p_s">
				<label class="form-label col-2">商品积分：<div class="formControls col-2"><input name="productcredits" type="text" class="input-text" >分</div></label>
			</div>
			<div></br>
				<div class="Add_p_s">
					<label style="margin-left: 15px; margin-right: 8px;">是否新品： </label>
					<label><input name="productnew" value="1" type="radio" class="ace"><span class="lbl">是</span></label>&nbsp;&nbsp;
					<label><input name="productnew" value="0" type="radio" class="ace"><span class="lbl">否</span></label>
				</div>
				<div class="Add_p_s">
					<label style="margin-left: 15px; margin-right: 8px;">是否热销： </label>
					<label><input name="producthotsale" value="1" type="radio" class="ace"><span class="lbl">是</span></label>&nbsp;&nbsp;
					<label><input name="producthotsale" value="0" type="radio" class="ace"><span class="lbl">否</span></label>
				</div>
				<div class="Add_p_s">
					<label style="margin-left: 15px;margin-right: 8px;">是否可用积分兑换： </label>
					<label><input name="productdisabled" value="1" type="radio" class="ace"><span class="lbl">是</span></label>&nbsp;&nbsp;
					<label><input name="productdisabled" value="0" type="radio" class="ace"><span class="lbl">否</span></label>
				</div>

                <div class="Add_p_s">
                  <%--  <label style="margin-left: 15px;margin-right: 8px;">上架日期</label>
                    <input type="date" name="productstoretime">--%>
					  <label class="label_name">&nbsp;&nbsp;&nbsp;&nbsp;商品状态：</label>
						  <span class="cont_style">
							 <label><input name="productA" value="1" type="radio" class="ace"><span class="lbl">启用</span></label>&nbsp;&nbsp;
							 <label><input name="productA" value="0" type="radio" class="ace"><span class="lbl">禁用</span></label>&nbsp;
                           </span>
						  <div class="prompt r_f"></div>
                </div>

			</div>
		</div>
		<div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>商品图片： </label>
			<div class="form-group">
				<input width="200px" height="200px"type="file" id="xdaTanFileImg" onchange="xmTanUploadImg(this)"   name="product_pic" style="display: none" />
				<div id="xmTanDiv" class="col-sm-1">
					<img src="${systemset.webicon}" id="xmTanImg" width="1000px" height="100px" style="width: 100px;height: 100px;margin-bottom: 10px"/>
					<button onclick="$('#xdaTanFileImg').click();" class="btn btn-success" type="button">上传图片</button>
				</div>
			</div>
		</div>

		<div class="clearfix cl">
			<div class="Button_operation">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="icon-save "></i>保存并提交</button>
			</div>
		</div>
	</form>
</div>

<script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
<script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
<script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
<script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
<script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
<script type="text/javascript" src="/jsp/admin/Widget/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="/jsp/admin/Widget/icheck/jquery.icheck.min.js"></script>
 <script type="text/javascript" src="/jsp/admin/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript" src="/jsp/admin/Widget/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="/jsp/admin/Widget/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="/jsp/admin/Widget/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="/jsp/admin/Widget/ueditor/1.4.3/ueditor.all.min.js"> </script>
<script type="text/javascript" src="/jsp/admin/Widget/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
<script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
<script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
<script type="text/javascript" src="/jsp/admin/js/H-ui.admin.js"></script>

<script>
    //选择图片，马上预览
    function xmTanUploadImg(obj) {
        var file = obj.files[0];

        console.log(obj);console.log(file);
        console.log("file.size = " + file.size);  //file.size 单位为byte

        var reader = new FileReader();

        //读取文件过程方法
        reader.onloadstart = function (e) {
            console.log("开始读取....");
        }
        reader.onprogress = function (e) {
            console.log("正在读取中....");
        }
        reader.onabort = function (e) {
            console.log("中断读取....");
        }
        reader.onerror = function (e) {
            console.log("读取异常....");
        }
        reader.onload = function (e) {
            console.log("成功读取....");

            var img = document.getElementById("xmTanImg");
            img.src = e.target.result;
            //或者 img.src = this.result;  //e.target == this
        }

        reader.readAsDataURL(file)
    }
</script>

</body>
</html>