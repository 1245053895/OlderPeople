<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="utf-8" />
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
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
    <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>

    <title>个人信息管理</title>
</head>

<body>
<div class="admin_info_style">
    <div class="admin_modify_style" id="Personal">
        <div class="type_title">管理员信息 </div>
        <div class="xinxi">
            <div style="margin-top: 50px;margin-left: 200px; float: left;">
                <form action="" method="post" enctype="multipart/form-data">
                    <img src="jsp/admin/images/admintx.png" height="210px" width="190px">
               <%--     <input type="file" name="adminpic" height="210px" width="190px">
                    <input type="submit" value="提交">--%>
                <%--<img src="images/admintx.png" height="210px" width="190px">--%>
                    <button onclick="" class="btn btn-success" type="submit">上传图片</button>
                </form>
                <div class="Button_operation clearfix">
                    <a href="javascript:ovid()" onclick="change_Password()" class="btn btn-warning btn-xs">修改密码</a>
                    <button onclick="modify();" class="btn btn-danger" type="submit">修改信息</button>
                    <button onclick="save_info();" class="btn btn-success" type="button">保存修改</button>
                </div>

            </div>
            <div class="info">
                <form id="submitform" action="${pageContext.request.contextPath}/UpdateMyselfInformation.action" method="post">
                    <input type="hidden" name="adminid" value="${adminRole.adminid}"/>
                    <div class="form-group" style="height: 30px;">
                        <label class="col-sm-3 control-label no-padding-right">账号： </label>
                        <div class="col-sm-9">
                            <input type="text" name="adminname" value="${adminRole.adminname}" class="col-xs-7 text_info" disabled="disabled"></div>
                        <div class="form-group"  style="height: 30px;">
                            <label class="col-sm-3 control-label no-padding-right">姓名： </label>
                            <div class="col-sm-9">
                                <input type="text" name="adminuser" value="${adminRole.adminuser}" class="col-xs-7 text_info" disabled="disabled"></div>
                        </div>
                        <div class="form-group"  style="height: 30px;">
                            <label class="col-sm-3 control-label no-padding-right">性别： </label>
                            <div class="col-sm-9">
                                <span class="sex" id="admin_info_span">${adminRole.adminsex}</span>
                                <div class="add_sex">
                                    <label><input name="adminsex" type="radio" value="保密" class="ace" checked="checked"><span class="lbl">保密</span></label>&nbsp;&nbsp;
                                    <label><input name="adminsex" type="radio" value="男" class="ace"><span class="lbl">男</span></label>&nbsp;&nbsp;
                                    <label><input name="adminsex" type="radio" value="女" class="ace"><span class="lbl">女</span></label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group" style="height: 30px;">
                            <label class="col-sm-3 control-label no-padding-right" >所在部门： </label>
                            <div class="col-sm-9"><input type="text" name="admindepart"  value="${adminRole.admindepart}" class="col-xs-7 text_info" disabled="disabled"></div>
                        </div>
                        <div class="form-group" style="height: 30px;">
                            <label class="col-sm-3 control-label no-padding-right">电话： </label>
                            <div class="col-sm-9"><input type="text" name="adminphone" id="website-title" value="${adminRole.adminphone}" class="col-xs-7 text_info" disabled="disabled"></div>
                        </div>
                        <div class="form-group" style="height: 30px;" >
                            <label class="col-sm-3 control-label no-padding-right">角色： </label>
                            <div class="col-sm-9" > <span  id="admin_info_span1">${adminRole.admingroupname}</span></div>
                        </div>
                    </div>
                </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!--修改密码样式-->
<form action="${pageContext.request.contextPath}/updatePasswordById.action?adminid=${admin.adminid}" method="post">
    <div class="change_Pass_style" id="change_Pass">
        <ul class="xg_style">
            <li><label class="label_name">原&nbsp;&nbsp;密&nbsp;码</label><input name="${admin.adminpwd}" type="password" class="" id="password"></li>
            <li><label class="label_name">新&nbsp;&nbsp;密&nbsp;码</label><input name="adminpwd" type="password" class="" id="Nes_pas"></li>
            <li><label class="label_name">确认密码</label><input name="" type="password" class="" id="c_mew_pas"></li>

        </ul>
        <div class="center"> <button class="btn btn-primary" type="submit" id="submit">确认修改</button></div>
    </div>
</form>
</body>
</html>
<script>

    //按钮点击事件
    function modify(){
        $('.text_info').attr("disabled", false);
        $('.text_info').addClass("add");
        $('#Personal').find('.xinxi').addClass("hover");
        $('#Personal').find('.btn-success').css({'display':'block'});
    };
    function save_info(){
        var num=0;
        var str="";
        $(".xinxi input[type$='text']").each(function(n){
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
            $("#submitform").submit();
            layer.alert('修改成功！',{
                title: '提示框',
                icon:1,
            });
            $('#Personal').find('.xinxi').removeClass("hover");
            $('#Personal').find('.text_info').removeClass("add").attr("disabled", true);
            $('#Personal').find('.btn-success').css({'display':'none'});
            layer.close(index);

        }
    };
    //初始化宽度、高度
    $(".admin_modify_style").height($(window).height());
    $(".recording_style").width($(window).width()-400);
    //当文档窗口发生改变时 触发
    $(window).resize(function(){
        $(".admin_modify_style").height($(window).height());
        $(".recording_style").width($(window).width()-400);
    });
    //修改密码
    function change_Password(){
        layer.open({
            type: 1,
            title:'修改密码',
            area: ['300px','300px'],
            shadeClose: true,
            content: $('#change_Pass'),
           /* btn:['确认修改'],*/
            yes:function(index, layero){
                if ($("#password").val()==""){
                    layer.alert('原密码不能为空!',{
                        title: '提示框',
                        icon:0,

                    });
                    return false;
                }
                if ($("#Nes_pas").val()==""){
                    layer.alert('新密码不能为空!',{
                        title: '提示框',
                        icon:0,

                    });
                    return false;
                }

                if ($("#c_mew_pas").val()==""){
                    layer.alert('确认新密码不能为空!',{
                        title: '提示框',
                        icon:0,

                    });
                    return false;
                }
                if(!$("#c_mew_pas").val || $("#c_mew_pas").val() != $("#Nes_pas").val() )
                {
                    layer.alert('密码不一致!',{
                        title: '提示框',
                        icon:0,

                    });
                    return false;
                }
                else{
                    layer.alert('修改成功！',{
                        title: '提示框',
                        icon:1,
                    });
                    layer.close(index);
                }
            }
        });
    }
</script>
<script>
    jQuery(function($) {
        var oTable1 = $('#sample-table').dataTable( {
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,2,3,4,5,6]}// 制定列不参与排序
            ] } );


        $('table th input:checkbox').on('click' , function(){
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                .each(function(){
                    this.checked = that.checked;
                    $(this).closest('tr').toggleClass('selected');
                });

        });
    });</script>
