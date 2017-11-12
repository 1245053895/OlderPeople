<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmd" uri="http://java.sun.com/jstl/fmt_rt" %>
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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
        <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/jsp/admin/font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
		<script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
        <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
		<script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
        <script type="text/javascript" src="/jsp/admin/Widget/swfupload/swfupload.js"></script>
        <script type="text/javascript" src="/jsp/admin/Widget/swfupload/swfupload.queue.js"></script>
        <script type="text/javascript" src="/jsp/admin/Widget/swfupload/swfupload.speed.js"></script>
        <script type="text/javascript" src="/jsp/admin/Widget/swfupload/handlers.js"></script>
<title>物流管理</title>
    <style>
        body{
            width: 100%;
            height: 100%;
        }
    </style>
</head>

<body style="margin: 15px;">
    <div class="search_style">
        <div class="title_names">搜索查询</div>
        <form id="TransportConfuse" action="${pageContext.request.contextPath}/TransportConfuse.action" method="post">
            <ul class="search_content clearfix">
                <li><label class="l_f">物流方式</label><input name="sqlString"  value="${stringAndString.sqlString}" type="text" class="text_add" placeholder="物流编号、物流名称" style=" width:250px"></li>
                <li style="width:90px;">
                    <button type="submit" class="btn_search"><i class="icon-search"></i>查询</button>
                </li>
            </ul>
        </form>
    </div>
    <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:ovid()" id="ads_add" class="btn btn-warning"><i class="fa fa-plus"></i> 添加物流方式</a>

        <a title="批量删除"

           href="javascript:ovid(0)" onclick="TransportDelect()"
           class="btn btn-xs btn-warning"><i class="icon-trash  bigger-120"></i>批量删除</a>


       </span>
       <span class="r_f">共：<b>${totalMessage.totaltransport}</b>条</span>
    </div>
    <form action="${pageContext.request.contextPath}/DelectTransportQuerry.action" id="arrayDelectForm" method="post">
    <div class="Guestbook_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
            <thead>
            <tr>
                <th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                <th width="80">物流ID</th>
                <th width="100">物流名称</th>
                <th width="240px">物流图片</th>
                <th width="180">加入时间</th>
                <th width="70">状态</th>
                <th width="250">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${transportslist}" var="transportslist">
            <tr>
                <td><label><input name="Transpostids" value="${transportslist.transportid}" type="checkbox" class="ace"><span class="lbl"></span></label></td>
                <td>${transportslist.transportid}</td>
                <td width="200px;">${transportslist.transportname}</td>
                <td><span class="ad_img"><img src="${transportslist.transportimg}"  width="200px" height="100px"/></span></td>
                <td><fmd:formatDate value="${transportslist.transportA}" pattern="yyyy-MM-dd HH:mm:ss"/></td>

                <c:if test="${transportslist.transportB==null}">
                    <td class="td-status"><span class="label label-success radius">已启用</span></td>
                </c:if>
                <c:if test="${transportslist.transportB==1}">
                    <td class="td-status"><span class="label label-success radius">已启用</span></td>
                </c:if>
                <c:if test="${transportslist.transportB==0}">
                    <td class="td-status"><span class="label label-default radius">已停用</span></td>
                </c:if>

                <td class="td-manage">

                    <c:if test="${transportslist.transportB==0}">
                        <a onClick="member_start(this,'${transportslist.transportid}')" href="javascript:void(0);" title="启用"
                           class="btn btn-xs btn-success"><i class="fa fa-check  bigger-120"></i></a>
                    </c:if>
                    <c:if test="${transportslist.transportB==1}">
                        <a onClick="member_stop(this,'${transportslist.transportid}')" href="javascript:void(0);" title="停用"
                           class="btn btn-xs btn-success"><i class="fa fa-check  bigger-120"></i></a>
                    </c:if>
                    <c:if test="${transportslist.transportB==null}">
                        <a onClick="member_stop(this,'${transportslist.transportid}')" href="javascript:void(0);" title="启用"
                           class="btn btn-xs btn-success"><i class="fa fa-check  bigger-120"></i></a>
                    </c:if>
                    <a title="删除" href="javascript:void(0);"
                       onclick="one_del(this,'${transportslist.transportid}')" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i>
                    </a>
                </td>

            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</form>
<!--添加物流方式-->
<div id="add_ads_style"  style="display:none">
 <div class="add_adverts">
     <form id="AddTransport" action="${pageContext.request.contextPath}/AddTransport.action" enctype="multipart/form-data"  method="post">
         <ul>
              <li><label class="label_name">物流名称</label>
                  <span class="cont_style"><input name="transportname" type="text" placeholder="请输入物流名称" class="col-xs-10 col-sm-5"></span>
              </li>
             <%--<li><label class="label_name"></label>
                 <span class="cont_style"><input name="transportA" type="text" placeholder="请输加入该物流名称的时间" class="col-xs-10 col-sm-5"></span>
             </li>--%>
             <li><label class="label_name">状&nbsp;&nbsp;&nbsp;&nbsp;态：</label>
                 <span class="cont_style">
                     <label><input name="transportB" value="1" type="radio" class="ace"><span class="lbl">启用</span></label>&nbsp;&nbsp;&nbsp;
                     <label><input name="transportB" value="0" type="radio" class="ace"><span class="lbl">禁用</span></label>&nbsp;&nbsp;&nbsp;
                    </span>
                 <div class="prompt r_f"></div>
             </li>

              <li><label class="label_name">物流图片</label><span class="cont_style">
                  <input width="100px" height="100px"type="file" id="xdaTanFileImg" onchange="xmTanUploadImg(this)" accept="image/*"   name="Transport_pic" style="display: none" />
                  <img name="Transport_pic" id="xmTanImg" width="100px" height="100px" style="margin-left: 10px"/>
                  <div id="xmTanDiv" style="margin-top: 10px">
                        <button onclick="$('#xdaTanFileImg').click();" class="btn btn-success" type="button">上传图片</button>
                  </div>
               </span>
              </li>
         </ul>
     </form>
 </div>
</div>
</body>
</html>
<script>
//初始化宽度、高度  
 $(".widget-box").height($(window).height()); 
 $(".Ads_list").width($(window).width()-220);
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	$(".widget-box").height($(window).height());
	 $(".Ads_list").width($(window).width()-220);
	});
	$(function() { 
	$("#advertising").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false,
		stylewidth:'220',
		spacingw:30,//设置隐藏时的距离
	    spacingh:250,//设置显示时间距
		set_scrollsidebar:'.Ads_style',
		table_menu:'.Ads_list'
	});
});
/*广告图片-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',{icon:0,},function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="显示"><i class="fa fa-close bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('停用!',{icon: 5,time:1000});
        window.location.href="${pageContext.request.contextPath}/AdvertisingStatusStop.action?transportId="+id;
	});
}
/*广告图片-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',{icon:0,},function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="关闭"><i class="fa fa-check  bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('启用!',{icon: 6,time:1000});
        window.location.href="${pageContext.request.contextPath}/AdvertisingStatusStart.action?transportId="+id;
	});
}
/*广告图片-删除*/
function one_del(obj,id){
    layer.confirm('确认要删除吗？',{icon:0,},function(index){
        $(obj).parents("tr").remove();
        layer.msg('已删除!',{icon:1,time:1000});
        window.location.href="${pageContext.request.contextPath}/TransportDelect.action?transportId="+id;
    });
}



/*******添加广告*********/
 $('#ads_add').on('click', function(){
	  layer.open({
        type: 1,
        title: '添加物流方式',
		maxmin: true, 
		shadeClose: false, //点击遮罩关闭层
        area : ['800px' , 'auto'],
        content:$('#add_ads_style'),
		btn:['提交','取消'],
		yes:function(index,layero){	
		 var num=0;
		 var str="";
     $(".add_adverts input[type$='text']").each(function(n){
          if($(this).val()=="")
          {
               
			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,								
          }); 
		    num++;
            return false;            
          } 
		 });
		  if(num>0){  return false;}	 	
          else{
              $("#AddTransport").submit();
			  layer.alert('添加成功！',{
               title: '提示框',				
			icon:1,		
			  });
			   layer.close(index);	
		  }		  		     				
		}
    });
})
</script>
<script type="text/javascript">
function updateProgress(file) {
	$('.progress-box .progress-bar > div').css('width', parseInt(file.percentUploaded) + '%');
	$('.progress-box .progress-num > b').html(SWFUpload.speed.formatPercent(file.percentUploaded));
	if(parseInt(file.percentUploaded) == 100) {
		// 如果上传完成了
		$('.progress-box').hide();
	}
}

function initProgress() {
	$('.progress-box').show();
	$('.progress-box .progress-bar > div').css('width', '0%');
	$('.progress-box .progress-num > b').html('0%');
}

function successAction(fileInfo) {
	var up_path = fileInfo.path;
	var up_width = fileInfo.width;
	var up_height = fileInfo.height;
	var _up_width,_up_height;
	if(up_width > 120) {
		_up_width = 120;
		_up_height = _up_width*up_height/up_width;
	}
	$(".logobox .resizebox").css({width: _up_width, height: _up_height});
	$(".logobox .resizebox > img").attr('src', up_path);
	$(".logobox .resizebox > img").attr('width', _up_width);
	$(".logobox .resizebox > img").attr('height', _up_height);
}

var swfImageUpload;
$(document).ready(function() {
	var settings = {
		flash_url : "Widget/swfupload/swfupload.swf",
		flash9_url : "Widget/swfupload/swfupload_fp9.swf",
		upload_url: "upload.php",// 接受上传的地址
		file_size_limit : "5MB",// 文件大小限制
		file_types : "*.jpg;*.gif;*.png;*.jpeg;",// 限制文件类型
		file_types_description : "图片",// 说明，自己定义
		file_upload_limit : 100,
		file_queue_limit : 0,
		custom_settings : {},
		debug: false,
		// Button settings
		button_image_url: "Widget/swfupload/upload-btn.png",
		button_width: "95",
		button_height: "30 ",
		button_placeholder_id: 'uploadBtnHolder',
		button_window_mode : SWFUpload.WINDOW_MODE.TRANSPARENT,
		button_cursor : SWFUpload.CURSOR.HAND,
		button_action: SWFUpload.BUTTON_ACTION.SELECT_FILE,
		
		moving_average_history_size: 40,
		
		// The event handler functions are defined in handlers.js
		swfupload_preload_handler : preLoad,
		swfupload_load_failed_handler : loadFailed,
		file_queued_handler : fileQueued,
		file_dialog_complete_handler: fileDialogComplete,
		upload_start_handler : function (file) {
			initProgress();
			updateProgress(file);
		},
		upload_progress_handler : function(file, bytesComplete, bytesTotal) {
			updateProgress(file);
		},
		upload_success_handler : function(file, data, response) {
			// 上传成功后处理函数
			var fileInfo = eval("(" + data + ")");
			successAction(fileInfo);
		},
		upload_error_handler : function(file, errorCode, message) {
			alert('上传发生了错误！');
		},
		file_queue_error_handler : function(file, errorCode, message) {
			if(errorCode == -110) {
				alert('您选择的文件太大了。');	
			}
		}
	};
	swfImageUpload = new SWFUpload(settings);
});
</script>

<script type="text/javascript">
    /*用户-查看*/
    function member_show(title,url,id,w,h){
        layer_show(title,url+'#?='+id,w,h);
    }
    /*留言-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            $(obj).parents("tr").remove();

            layer.msg('已删除!',{icon:1,time:1000});
        });
    }

    /*checkbox激发事件*/
    $('#checkbox').on('click',function(){
        if($('input[name="checkbox"]').prop("checked")){
            $('.Reply_style').css('display','block');
        }
        else{

            $('.Reply_style').css('display','none');
        }
    })
    /*留言查看*/
    function Guestbook_iew(id){
        var index = layer.open({
            type: 1,
            title: '留言信息',
            maxmin: true,
            shadeClose:false,
            area : ['600px' , ''],
            content:$('#Guestbook'),
            btn:['确定','取消'],
            yes: function(index, layero){
                if($('input[name="checkbox"]').prop("checked")){
                    if($('.form-control').val()==""){
                        layer.alert('回复内容不能为空！',{
                            title: '提示框',
                            icon:0,
                        })
                    }else{
                        layer.alert('确定回复该内容？',{
                            title: '提示框',
                            icon:0,
                            btn:['确定','取消'],
                            yes: function(index){
                                layer.closeAll();
                            }
                        });
                    }
                }else{
                    layer.alert('是否要取消回复！',{
                        title: '提示框',
                        icon:0,
                    });
                    layer.close(index);
                }
            }
        })
    };
    /*字数限制*/
    function checkLength(which) {
        var maxChars = 200; //
        if(which.value.length > maxChars){
            layer.open({
                icon:2,
                title:'提示框',
                content:'您输入的字数超过限制!',
            });
            // 超过限制的字数了就将 文本框中的内容按规定的字数 截取
            which.value = which.value.substring(0,maxChars);
            return false;
        }else{
            var curr = maxChars - which.value.length; //250 减去 当前输入的
            document.getElementById("sy").innerHTML = curr.toString();
            return true;
        }
    };
</script>
<script type="text/javascript">
    jQuery(function($) {
        var oTable1 = $('#sample-table').dataTable( {
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,2,3,5,6]}// 制定列不参与排序
            ] } );
        $('table th input:checkbox').on('click' , function(){
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                .each(function(){
                    this.checked = that.checked;
                    $(this).closest('tr').toggleClass('selected');
                });

        });
        $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('table')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            var w2 = $source.width();

            if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
            return 'left';
        }
    })
    function TransportDelect() {
        /*document.getElementById("#arrayDelectForm").submit();*/
        /*document.arrayDelectForm.submit();*/
        $("#arrayDelectForm").submit();
        console.log("dyfygj");
    }


    //判断浏览器是否支持FileReader接口
    if (typeof FileReader == 'undefined') {
        document.getElementById("xmTanDiv").InnerHTML = "<h1>当前浏览器不支持FileReader接口</h1>";
        //使选择控件不可操作
        document.getElementById("xdaTanFileImg").setAttribute("disabled", "disabled");
    }

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