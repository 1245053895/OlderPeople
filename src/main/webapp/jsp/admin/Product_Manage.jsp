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
        <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/jsp/admin/Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
        <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
        
		<!--[if IE 7]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
			<script src="/jsp/admin/assets/js/jquery.min.js"></script>
		<!-- <![endif]-->
		<!--[if IE]>
       <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <![endif]-->
		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='/jsp/admin/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>
		<!-- <![endif]-->
		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='/jsp/admin/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
        <script src="/jsp/admin/assets/js/ace-elements.min.js"></script>
		<script src="/jsp/admin/assets/js/ace.min.js"></script>
        <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
		<script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
        <script type="text/javascript" src="/jsp/admin/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
        <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
<title>商品分类</title>
</head>

<body>
<div class=" clearfix">
 <div id="category">
    <div id="scrollsidebar" class="left_Treeview">
    <div class="show_btn" id="rightArrow"><span></span></div>
    <div class="widget-box side_content" >
    <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
     <div class="side_list">
      <div class="widget-header header-color-green2">
          <h4 class="lighter smaller">商品类型列表</h4>
      </div>
      <div class="widget-body">
          <div class="widget-main padding-8">
              <div  id="treeDemo" class="ztree"></div>
          </div>
  </div>
  </div>
  </div>  
  </div>
<!---->
 <iframe ID="testIframe" Name="testIframe" FRAMEBORDER=0 SCROLLING=AUTO  SRC="product-category-add.jsp" class="page_right_style"></iframe>
 </div>
</div>
</body>
</html>
<script type="text/javascript">
$(function() { 
	$("#category").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false
	});
});
</script>
<script type="text/javascript">
//初始化宽度、高度  
 $(".widget-box").height($(window).height()); 
 $(".page_right_style").width($(window).width()-220);
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	$(".widget-box").height($(window).height());
	 $(".page_right_style").width($(window).width()-220);
	})
 
/**************/
var setting = {
	view: {
		dblClickExpand: false,
		showLine: false,
		selectedMulti: false
	},
	data: {
		simpleData: {
			enable:true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: ""
		}
	},
	callback: {
		beforeClick: function(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("tree");
			if (treeNode.isParent) {
				zTree.expandNode(treeNode);
				return false;
			} else {
				demoIframe.attr("src",treeNode.file + ".html");
				return true;
			}
		}
	}
};

var zNodes =[
	{ id:1, pId:0, name:"商城分类列表", open:true},
	{ id:11, pId:1, name:"蔬菜水果(10)"},
	{ id:111, pId:11, name:"蔬菜(2)"},
	{ id:112, pId:11, name:"苹果(3)"},
	{ id:113, pId:11, name:"大蒜(1)"},
	{ id:114, pId:11, name:"白菜(2)"},
	{ id:115, pId:11, name:"青菜(2)"},
	{ id:12, pId:1, name:"手机数码(15)"},
	{ id:121, pId:12, name:"手机(10)"},
	{ id:122, pId:12, name:"照相机(5)"},
	{ id:13, pId:1, name:"电脑配件(16)"},
	{ id:131, pId:13, name:"手机(10)"},
	{ id:122, pId:13, name:"照相机(6)"},
	{ id:14, pId:1, name:"服装鞋帽(23)"},
	{ id:141, pId:14, name:"手机(21)"},
	{ id:42, pId:14, name:"照相机(2)"},
];
		
var code;
		
function showCode(str) {
	if (!code) code = $("#code");
	code.empty();
	code.append("<li>"+str+"</li>");
}
		
$(document).ready(function(){
	var t = $("#treeDemo");
	t = $.fn.zTree.init(t, setting, zNodes);
	demoIframe = $("#testIframe");
	demoIframe.bind("load", loadReady);
	var zTree = $.fn.zTree.getZTreeObj("tree");
	zTree.selectNode(zTree.getNodeByParam("id",'11'));
});	
</script>