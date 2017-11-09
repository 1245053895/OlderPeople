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
 <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
        	<!--[if IE 7]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
        <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
		<script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
        <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
        <script src="/jsp/admin/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.ui.touch-punch.min.js"></script>
        <script src="/jsp/admin/assets/js/ace-elements.min.js"></script>
		<script src="/jsp/admin/assets/js/ace.min.js"></script>
<title>系统设置</title>

</head>

<body>
<div class="margin clearfix">
 <div class="stystems_style">
  <div class="tabbable">
	<ul class="nav nav-tabs" id="myTab">
	  <li class="active">
		<a data-toggle="tab" href="#home"><i class="green fa fa-home bigger-110"></i>&nbsp;基本设置</a></li>
      <%--<li class="">
		<a data-toggle="tab" href="#profile">消息通知<span class="badge badge-danger">4</span></a></li>
      <li class="">
		<a data-toggle="tab" data-toggle="dropdown" class="dropdown-toggle" href="#dropdown">底部菜单</a>
      </li>
        <li class="">
         private int webid;
 private String webname;
 private String webicon;
 private String keywords;
 private  String blockwords;
 private  String webfilepath;
 private  String webdescrible;
 private  String bottomcopyright;
 private  String recordnumber;
		<a data-toggle="tab" data-toggle="dropdown" class="dropdown-toggle" href="#other">其他设置</a>
      </li>--%>
	</ul>
      <form id="QueryUserConfuse" action="${pageContext.request.contextPath}/AddSystem.action" method="post">
    <div class="tab-content">
		<div id="home" class="tab-pane active">
         <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>网站名称： </label>
          <div class="col-sm-9"><input type="text" placeholder="控制在25个字、50个字节以内" name="webname" value="网站名称" class="col-xs-10 "></div>
          </div>
           <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>网站icon图标： </label>
          <div class="col-sm-9"><input type="file" id="id-input-file-2" name="Icon_pic" /></div>
          </div>
          <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>关键词： </label>
          <div class="col-sm-9"><input type="text" placeholder="5个左右,8汉字以内,用英文,隔开" name="keywords" value="" class="col-xs-10 "></div>
          </div>
          <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>屏蔽词： </label>
          <div class="col-sm-9"><input type="text" placeholder="8汉字以内,用英文,隔开" name="blockwords"  value="" class="col-xs-10 "></div>
          </div>
	      <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>文件路径配置： </label>
          <div class="col-sm-9"><input type="text" placeholder="默认为空，为相对路径" name="webfilepath" value="" class="col-xs-10"></div>
          </div>
          <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>描述： </label>
          <div class="col-sm-9"><input type="text" placeholder="空制在80个汉字，160个字符以内" name="webdescrible" value="" class="col-xs-10"></div>
          </div>
          <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>底部版权信息： </label>
          <div class="col-sm-9"><input type="text" placeholder=""  name="bottomcopyright" value="" class="col-xs-10 "></div>
          </div>
          <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>备案号： </label>
          <div class="col-sm-9"><input type="text" placeholder=""  name="recordnumber" value="" class="col-xs-10 "></div>
          </div>
          <%-- <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>统计代码： </label>
          <div class="col-sm-9"><textarea class="textarea"></textarea></div>
          </div>--%>
          <div class="Button_operation"> 
				<button onclick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="fa fa-save "></i>&nbsp;保存</button>
				
				<button onclick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
               
			</div>
        </div>

		</div>
      </form>
		</div>
 </div>

</div>
</body>
</html>
<script>
$('#id-input-file-2').ace_file_input({
					no_file:'选择上传图标 ...',
					btn_choose:'选择',
					btn_change:'更改',
					droppable:false,
					onchange:null,
					thumbnail:false, //| true | large
					whitelist:'gif|png|jpg|jpeg'
					//blacklist:'exe|php'
					//onchange:''
					//
				});
</script>
