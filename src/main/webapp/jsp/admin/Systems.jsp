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

            <div class="info">

                <form id="QueryUserConfuse" action="${pageContext.request.contextPath}/AddSystem.action" enctype="multipart/form-data"  method="post">
                    <div class="tab-content">
                        <div id="home" class="tab-pane active">
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>网站名称： </label>
                                <div class="col-sm-9" ><input width="500px" type="text" placeholder="控制在25个字、50个字节以内" name="webname" value="${systemset.webname}"   class="col-xs-7 text_info" disabled="disabled" ></div>
                            </div>

                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>网站icon图标： </label>
                                <div class="form-group">
                                    <input width="200px" height="200px"type="file" id="xdaTanFileImg" onchange="xmTanUploadImg(this)"   name="webicons" style="display: none" />
                                    <div id="xmTanDiv" class="col-sm-1">
                                        <img src="${systemset.webicon}" id="xmTanImg" width="1000px" height="100px" style="width: 100px;height: 100px;margin-bottom: 10px"/>
                                        <button onclick="$('#xdaTanFileImg').click();" class="btn btn-success" type="button">上传图片</button>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>关键词： </label>
                                <div class="col-sm-9"><input type="text" placeholder="${systemset.keywords}" name="keywords" value="${systemset.keywords}"  class="col-xs-7 text_info" disabled="disabled"></div>
                            </div>
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>屏蔽词： </label>
                                <div class="col-sm-9"><input type="text" placeholder="8汉字以内,用英文,隔开" name="blockwords"  value="${systemset.blockwords}"  class="col-xs-7 text_info" disabled="disabled"></div>
                            </div>
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>文件路径配置： </label>
                                <div class="col-sm-9"><input type="text" placeholder="默认为空，为相对路径" name="webfilepatn" value="${systemset.webfilepatn}" class="col-xs-7 text_info" disabled="disabled"></div>
                            </div>
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>描述： </label>
                                <div class="col-sm-9"><input type="text" placeholder="空制在80个汉字，160个字符以内" name="webdescribe" value="${systemset.webdescribe}" class="col-xs-7 text_info" disabled="disabled"></div>
                            </div>
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>底部版权信息： </label>
                                <div class="col-sm-9"><input type="text" placeholder=""  name="bottomcopyright" value="${systemset.bottomcopyright}" class="col-xs-7 text_info" disabled="disabled"></div>
                            </div>
                            <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>备案号： </label>
                                <div class="col-sm-9"><input type="text" placeholder=""  name="recordnumber" value="${systemset.recordnumber}"  class="col-xs-7 text_info" disabled="disabled"></div>
                            </div>
                            <%-- <div class="form-group"><label class="col-sm-1 control-label no-padding-right"><i>*</i>统计代码： </label>
                            <div class="col-sm-9"><textarea class="textarea"></textarea></div>
                            </div>--%>
                            <div class="form-group" style="height: 30px;" >
                                <%--<label class="col-sm-3 control-label no-padding-right"></label>--%>
                                <div class="col-sm-9" >
                                    <button onclick="modify();" class="btn btn-danger" type="button">修改信息</button>
                                    <button onclick="save_info();" class="btn btn-success" type="button" style="display: none">保存修改</button>
                                </div>
                            </div>
                        </div>

                    </div>
                </form>


            </div>
        </div>
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
<script>

    //按钮点击事件
    function modify(){
        $('.text_info').attr("disabled", false);
        $('.text_info').addClass("add");
        $('#Personal').find('.xinxi').addClass("hover");
        $('#Personal').find('.btn-success').css({'display':'inline-block'});
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
            $("#QueryUserConfuse").submit();
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
    });
</script>
