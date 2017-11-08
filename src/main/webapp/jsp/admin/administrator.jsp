<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
    <link rel="stylesheet" href="/jsp/admin/font/css/font-awesome.min.css" />
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
    <![endif]-->
    <script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
    <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/jsp/admin/Widget/Validform/5.3.2/Validform.min.js"></script>
    <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript"></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <title>管理员</title>
</head>

<body>
<div class="page-content clearfix">
    <div class="administrator">
        <div class="d_Confirm_Order_style">
            <div class="search_style">
                <div class="title_names">搜索查询</div>
                <ul class="search_content clearfix">
                    <form action="${pageContext.request.contextPath}/admin/mohuSelectByName.action" method="post">
                        <li><label class="l_f">管理员名称</label><input name="name" value="${name}" type="text" class="text_add" placeholder="请输入管理员的名称" style=" width:400px"></li>
                        <%--<li style="width:90px;"><button type="button" class="btn_search"><i class="fa fa-search"></i>查询</button></li>--%>
                        <input type="submit" value="查询"/>
                    </form>
                </ul>
            </div>
            <!--操作-->
            <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:void(0)" onclick="openThis()" id="administrator_add" class="btn btn-warning"><i class="fa fa-plus"></i> 添加管理员</a>
        <a href="javascript:test()" class="btn btn-danger"><i class="fa fa-trash"></i> 批量删除</a>
       </span>
                <span class="r_f">共：<b>${kindOfAdmin2.adminCount2}</b>人</span>
            </div>
            <!--管理员列表-->
            <div class="clearfix administrator_style side_green" id="administrator" style="left: 0px;">
                <div class="left_style">
                    <div id="scrollsidebar" class="left_Treeview">
                        <div class="show_btn" id="rightArrow"><span></span></div>
                        <div class="widget-box side_content" style="height: 0px;">
                            <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
                            <div class="side_list"><div class="widget-header header-color-green2"><h4 class="lighter smaller">管理员分类列表</h4></div>
                                <div class="widget-body">
                                    <ul class="b_P_Sort_list">
                                        <c:forEach items="${kindOfAdmins}" var="admin" varStatus="index">
                                            <c:if test="${index.count==1}">
                                                <li><i class="fa fa-users green"></i> <b>全部管理员(${fn:length(kindOfAdmins)} 种)</b></li>
                                            </c:if>
                                            <li value="${admin.admingroupid}"><i  class="fa fa-users green"></i> <a  href="/admin/adminkindOfAdmins.action?admingroupid=${admin.admingroupid}" name="admingroupid" >${admin.allrloe}</a></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="table_menu_list" id="testIframe" style="width: 909px; height: 0px;">
                    <div id="sample_table_wrapper" class="dataTables_wrapper no-footer">
                        <form id="my" name="my" action="${pageContext.request.contextPath}/admin/deleteBatch.action" method="post">
                            <table class="table table-striped table-bordered table-hover dataTable no-footer" id="sample_table" role="grid" aria-describedby="sample_table_info">
                                <thead>
                                <tr role="row">
                                    <th width="25px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="" style="width: 20px;">
                                        <label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                                    <th width="80px" class="sorting_desc" tabindex="0" aria-controls="sample_table" rowspan="1" colspan="1" aria-sort="descending" aria-label="编号: 升序排列" style="width: 48px;">编号</th>
                                    <th width="250px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="账号" style="width: 170px;">账号</th>
                                    <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="密码" style="width: 63px;">密码</th>
                                    <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="姓名" style="width: 63px;">姓名</th>
                                    <th width="100px" rowspan="1" colspan="1" aria-label="性别" style="width: 63px;">性别</th>
                                    <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="所在部门" style="width: 63px;">所在部门</th>
                                    <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="电话" style="width: 63px;">电话</th>
                                    <th width="200px">操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${adminList }" var="user">
                                <form id="form_${user.adminid}" action="${pageContext.request.contextPath}/updateByPrimaryKey.action?id=${user.adminid}" method="post">
                                    <tr>
                                        <td><label><input type="checkbox" name="postIds" value="${user.adminid}" class="ace"><span class="lbl"></span></label></td>
                                        <td><input type="text" value="${user.adminid}" name="adminid" class="input_style text_info" readonly="true"/></td>
                                        <td><input type="text" value="${user.adminname}" name="adminname" class="input_style text_info${user.adminid}" readonly="true"/></td>
                                        <td><input type="text" value="${user.adminpwd}" name="adminpwd" class="input_style text_info${user.adminid}" readonly="true"/></td>
                                        <td><input type="text" value="${user.adminuser}" name="adminuser" class="input_style text_info${user.adminid}" readonly="true"/></td>
                                        <td><input type="text" value="${user.adminsex}" name="adminsex" class="input_style text_info${user.adminid}" readonly="true"/></td>
                                        <td><input type="text" value="${user.admindepart}" name="admindepart" class="input_style text_info${user.adminid}" readonly="true"/></td>
                                        <td><input type="text" value="${user.adminphone}" name="adminphone" class="input_style text_info${user.adminid}" readonly="true"/></td>
                                        <td class="td-manage">
                                            <a title="编辑" onclick="modify(${user.adminid})" href="javascript:void(0);"  class="btn btn-xs btn-info radius" ><i id="edit${user.adminid}" class="fa bigger-120">编辑</i></a>
                                            <a title="删除" href="/admin/deleteByPrimaryKey.action?id=${user.adminid}" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>
                                        </td>
                                    </tr>
                                </form>
                                </c:forEach>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <style type="text/css">
            .input_style{
                width: 100%;
                background-color: transparent;
                border: 0px transparent solid;
            }
            .btn-xs{
                border-width: 3px;
            }
            .btn-info,.btn-info:focus
            {
                background-color: #6fb3e0!important;
                border-color: #6fb3e0;
            }

            .btn-info:hover,.open .btn-info.dropdown-toggle
            {
                background-color: #4f99c6!important;

                border-color: #6fb3e0;
            }

            .btn-info.no-border:hover
            {
                border-color: #4f99c6;
            }

            .btn-info.no-hover:hover
            {
                background-color: #6fb3e0!important;
            }

            .btn-info
            {
                background-color: #5fa6d3!important;
                border-color: #4396cb;
            }

            .btn-info
            {
                background-color: #539fd0!important;
                border-color: #539fd0;
            }

            .btn-info.disabled,.btn-info[disabled],fieldset[disabled] .btn-info,.btn-info.disabled:hover,.btn-info[disabled]:hover,fieldset[disabled] .btn-info:hover,.btn-info.disabled:focus,.btn-info[disabled]:focus,fieldset[disabled] .btn-info:focus,.btn-info.disabled:active,.btn-info[disabled]:active,fieldset[disabled] .btn-info:active,.btn-info.disabled.active,.btn-info[disabled].active,fieldset[disabled] .btn-info.active
            {
                background-color: #6fb3e0!important;
                border-color: #6fb3e0;
            }

        </style>



        <!--添加管理员-->
        <div  id="closeThis" style="display: none;">
            <div class="layui-layer-shade" id="layui-layer-shade8" times="8" style="z-index:19891021; background-color:#000; opacity:0.3; filter:alpha(opacity=30);"></div>
            <div class="layui-layer layui-anim layui-layer-page " id="layui-layer8" type="page" times="8" showtime="0" contype="object" style="z-index: 19891022; width: 700px;top: 0px;left: 229.5px;">

                <div class="layui-layer-title" style="cursor: move;" move="ok">添加管理员</div>
                <div id="" class="layui-layer-content" style="height: 479px;">
                    <div id="add_administrator_style" class="add_menber layui-layer-wrap">
                        <form action="${pageContext.request.contextPath}/admin/insert.action" method="post" id="form-admin-add">
                            <div class="form-group">
                                <label class="form-label"><span class="c-red">*</span>账号：</label>
                                <div class="formControls">
                                    <input type="text" class="input-text" value="" placeholder="" id="adminname" name="adminname" datatype="*2-16" nullmsg="用户名不能为空">
                                </div>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label"><span class="c-red">*</span>初始密码：</label>
                                <div class="formControls">
                                    <input type="password" placeholder="密码" name="adminpwd" autocomplete="off" value="" class="input-text" datatype="*6-20" nullmsg="密码不能为空">
                                </div>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label "><span class="c-red">*</span>确认密码：</label>
                                <div class="formControls ">
                                    <input type="password" placeholder="确认新密码" autocomplete="off" class="input-text Validform_error" errormsg="您两次输入的新密码不一致！" datatype="*" nullmsg="请再输入一次新密码！" recheck="userpassword" id="newpassword2" name="newpassword2">
                                </div>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label"><span class="c-red">*</span>姓名：</label>
                                <div class="formControls">
                                    <input type="text" class="input-text" value="" placeholder="" id="user-name" name="adminuser" datatype="*2-16" nullmsg="姓名不能为空">
                                </div>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label "><span class="c-red">*</span>性别：</label>
                                <div class="formControls">
                                    <input type="text" class="input-text" value="" placeholder="" id="adminsex" name="adminsex" datatype="*2-16" nullmsg="所在部门不能为空">
                                </div>
                                <%-- <div class="formControls  skin-minimal">
                                     <label><input name="adminsex" type="radio" class="ace" checked="checked"><span class="lbl">保密</span></label>&nbsp;&nbsp;
                                     <label><input name="adminsex" type="radio" class="ace"><span class="lbl">男</span></label>&nbsp;&nbsp;
                                     <label><input name="adminsex" type="radio" class="ace"><span class="lbl">女</span></label>
                                 </div>--%>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label"><span class="c-red">*</span>所在部门：</label>
                                <div class="formControls">
                                    <input type="text" class="input-text" value="" placeholder="" id="department" name="admindepart" datatype="*2-16" nullmsg="所在部门不能为空">
                                </div>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label "><span class="c-red">*</span>手机：</label>
                                <div class="formControls ">
                                    <input type="text" class="input-text" value="" placeholder="" id="user-tel" name="adminphone" datatype="m" nullmsg="手机不能为空">
                                </div>
                                <div class="col-4"> <span class="Validform_checktip"></span></div>
                            </div>
                            <div class="form-group">
                                <label class="form-label">角色：</label>
                                <div class="formControls "> <span class="select-box" style="width:150px;">

                    <select class="select" name="admingroupid" size="1">
                        <c:forEach items="${admingroupnames}" var="admingroup">
                            <option value="${admingroup.admingroupid}">${admingroup.admingroupname}</option>
                        </c:forEach>
                    </select>
                    </span> </div>
                            </div>
                            <div class="form-group">
                                <label class="form-label">备注：</label>
                                <div class="formControls">
                                    <textarea name="" cols="" rows="" class="textarea" placeholder="说点什么...100个字符以内" dragonfly="true" onkeyup="checkLength(this);"></textarea>
                                    <span class="wordage">剩余字数：<span id="sy" style="color:Red;">100</span>字</span>
                                </div>
                                <div class="col-4"> </div>
                            </div>
                            <div style="text-align: center;width: 420px; ">
                                <input class="btn btn-primary radius" type="submit" id="Add_Administrator" value="&nbsp;&nbsp;提交&nbsp;&nbsp;" >

                            </div></form>
                    </div></div><span class="layui-layer-setwin"><a onclick="closeThis()" class="layui-layer-ico layui-layer-close layui-layer-close1" href="javascript:;"></a></span></div>
        </div>

        <script type="text/javascript">
            console.log("sssss");
            function closeThis() {
                var close =document.getElementById("closeThis");
                close.style.display="none";
            }
            function openThis() {
                var close =document.getElementById("closeThis");
                close.style.display="block";
            }
            function test() {
                /*document.getElementById("postIds").submit();*/
                //$("#postIds").attr("action",${pageContext.request.contextPath}+"/admin/deleteBatch.action");
                $("#my").submit();
                console.log("dfsfdsfs");

            }
        </script>

        <script type="text/javascript">
            jQuery(function($) {
                var oTable1 = $('#sample_table').dataTable( {
                    "aaSorting": [[ 1, "desc" ]],//默认第几个排序
                    "bStateSave": true,//状态保存
                    "aoColumnDefs": [
                        //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                        {"orderable":false,"aTargets":[0,2,3,4,5,7,8,]}// 制定列不参与排序
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
            });

        </script>
        <script type="text/javascript">
            $(function() {
                $("#administrator").fix({
                    float : 'left',
                    //minStatue : true,
                    skin : 'green',
                    durationTime :false,
                    spacingw:50,//设置隐藏时的距离
                    spacingh:270,//设置显示时间距
                });
            });
            //字数限制
            function checkLength(which) {
                var maxChars = 100; //
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
            //初始化宽度、高度
            $(".widget-box").height($(window).height()-215);
            $(".table_menu_list").width($(window).width()-260);
            $(".table_menu_list").height($(window).height()-215);
            //当文档窗口发生改变时 触发
            $(window).resize(function(){
                $(".widget-box").height($(window).height()-215);
                $(".table_menu_list").width($(window).width()-260);
                $(".table_menu_list").height($(window).height()-215);
            })
            laydate({
                elem: '#start',
                event: 'focus'
            });

            /*用户-停用*/
            function member_stop(obj,id){
                layer.confirm('确认要停用吗？',function(index){
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="fa fa-close bigger-120"></i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
                    $(obj).remove();
                    layer.msg('已停用!',{icon: 5,time:1000});
                });
            }
            /*用户-启用*/
            function member_start(obj,id){
                layer.confirm('确认要启用吗？',function(index){
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="fa fa-check  bigger-120"></i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
                    $(obj).remove();
                    layer.msg('已启用!',{icon: 6,time:1000});
                });
            }
            /*管理员列表-编辑*/
            var flag=true;
            function modify(v) {
                if(flag) {
                    $('.text_info' + v).attr("readonly", false);
                    $('.text_info' + v).parents("td").css("box-shadow","0px 0px 20px #888888 inset");
                    $('#edit'+v).text("提交");
                    flag = false;
                }else{
                    $("#form_"+v).submit();
                    $('#edit'+v).text("编辑");
                    flag=true;
                }
            }

            /*产品-删除*/
            function member_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                });
            }
            //表单验证提交
            $("#form-admin-add").Validform({

                tiptype:2,

                callback:function(data){
                    //form[0].submit();
                    if(data.status==1){
                        layer.msg(data.info, {icon: data.status,time: 1000}, function(){
                            location.reload();//刷新页面
                        });
                    }
                    else{
                        layer.msg(data.info, {icon: data.status,time: 3000});
                    }
                    var index =parent.$("#iframe").attr("src");
                    parent.layer.close(index);
                    //
                }
            });
        </script>
    </div>
</div>
</body>
</html>


