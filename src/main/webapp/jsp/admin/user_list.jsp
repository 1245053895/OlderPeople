<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmd" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--aaaa
  Created by IntelliJ IDEA.
  User: Administrator

  Date: 2017/10/30
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
    <link href="/jsp/admin/assets/css/codemirror.css" rel="stylesheet">
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css"/>
    <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css"/>
    <!--[if IE 7]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css"/>
    <![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css"/>
    <![endif]-->
    <script src="/jsp/admin/assets/js/jquery.min.js"></script>

    <!-- <![endif]-->

    <!--[if IE]>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <![endif]-->

    <!--[if !IE]> -->

    <script type="text/javascript">
        window.jQuery || document.write("<script src='/jsp/admin/assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
    </script>

    <!-- <![endif]-->

    <!--[if IE]>
    <script type="text/javascript">
        window.jQuery || document.write("<script src='/jsp/admin/assets/js/jquery-1.10.2.min.js'>" + "<" + "/script>");
    </script>
    <![endif]-->

    <script type="text/javascript">
        if ("ontouchend" in document) document.write("<script src='/jsp/admin/assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
    </script>
    <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
    <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <!-- page specific plugin scripts -->
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
    <script type="text/javascript" src="/jsp/admin/js/H-ui.admin.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript"></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <title>用户列表</title>
</head>

<body>
<div class="page-content clearfix">
    <div id="Member_Ratings">
        <div class="d_Confirm_Order_style">
            <div class="search_style">
                <div class="title_names">搜索查询</div>
                <form id="QueryUserConfuse" action="${pageContext.request.contextPath}/QueryUserConfuse.action"
                      method="post">
                    <ul class="search_content clearfix">
                        <li><label class="l_f">查找用户</label><input name="sqlString" type="text"
                                                                  value="${stringAndString.sqlString}" class="text_add"
                                                                  placeholder="输入用户名称、电话、邮箱" style=" width:400px"/></li>
                        <li style="width:90px;">
                            <button type="submit" class="btn_search"><i class="icon-search"></i>查询</button>
                        </li>
                    </ul>
                </form>
            </div>
            <!---->
            <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:ovid(0)" id="member_add" class="btn btn-warning"><i class="icon-plus"></i>添加用户</a>

           <a title="批量删除"
              href="javascript:ovid(0)" onclick="arrayDelect()"
              class="btn btn-xs btn-warning"><i class="icon-trash  bigger-120"></i>批量删除</a>
           </td>

       </span>
                <span class="r_f">共：<b>2345</b>条</span>
            </div>
            <!---->
            <form action="${pageContext.request.contextPath}/DelectUserArray.action" id="arrayDelectForm" method="post">
                <div class="table_menu_list">
                    <table class="table table-striped table-bordered table-hover" id="sample-table">
                        <thead>
                            <tr>
                                <th width="25">
                                    <label><input type="checkbox" class="ace"><span class="lbl"></span></label>
                                </th>
                                <th width="80px" class="sorting_desc" tabindex="0" aria-controls="sample_table" rowspan="1"
                                    colspan="1" aria-sort="descending" aria-label="编号: 升序排列" style="width: 48px;">编号
                                </th>
                                <th width="250px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="用户名"
                                    style="width: 170px;">用户名
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="密码"
                                    style="width: 63px;">密码
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="性别"
                                    style="width: 63px;">性别
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="真实姓名"
                                    style="width: 63px;">真实姓名
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="电话"
                                    style="width: 63px;">电话
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="出生年月"
                                    style="width: 63px;">出生年月
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="收货地址"
                                    style="width: 63px;">收货地址
                                </th>
                                <th width="100px" rowspan="1" colspan="1" aria-label="e-mail" style="width: 63px;">e-mail</th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="邮编"
                                    style="width: 63px;">邮编
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="注册时间"
                                    style="width: 63px;">注册时间
                                </th>
                                <th width="100px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="状态"
                                    style="width: 63px;">状态
                                </th>
                                <th width="200px" class="sorting_disabled" rowspan="1" colspan="1" aria-label="操作"
                                    style="width: 143px;">操作
                                </th>
                        </tr>
                        </thead>

                        <tbody>

                                <c:forEach items="${userList}" var="userlist">
                                    <tr>
                                        <td><label><input name="ids" value="${userlist.userid}" type="checkbox" class="ace"><span class="lbl"></span></label></td>
                                        <td>${userlist.userid}</td>
                                        <td><u style="cursor:pointer" class="text-primary"
                                               onclick="member_show('chh','member-show.jsp','10001','500','400')">${userlist.username}</u>
                                        </td>
                                        <td>${userlist.userpwd}</td>
                                        <td>${userlist.usersex}</td>
                                        <td>${userlist.userrealname}</td>
                                        <td>${userlist.userphone}</td>
                                        <td><fmd:formatDate value="${userlist.userbirthday}" pattern="yyyy-MM-dd"/></td>
                                        <td class="text-l">${userlist.useraddress}</td>
                                        <td>${userlist.useremail}</td>
                                        <td>${userlist.userzip}</td>
                                        <td><fmd:formatDate value="${userlist.userinputdate}" pattern="yyyy-MM-dd"/></td>

                                        <c:if test="${userlist.userA==0}">
                                            <td class="td-status"><span class="label label-defaunt radius">已停用</span></td>
                                        </c:if>
                                        <c:if test="${userlist.userA==1}">
                                            <td class="td-status"><span class="label label-success radius">已启用</span></td>
                                        </c:if>

                                        <td class="td-manage">
                                            <c:if test="${userlist.userA==0}">
                                                <a onClick="member_start(this,'${userlist.userid}')" href="javascript:void(0);" title="启用"
                                                   class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                                            </c:if>
                                            <c:if test="${userlist.userA==1}">
                                                <a onClick="member_stop(this,'${userlist.userid}')" href="javascript:void(0);" title="停用"
                                                   class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                                            </c:if>





                                            <a
                                               onclick="return confirm('确定删除？')"
                                               title="删除"
                                               href="${pageContext.request.contextPath}/DelectUserById.action?Userid=${userlist.userid}"
                                               class="btn btn-xs btn-warning"><i class="icon-trash  bigger-120"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>


                        </tbody>
                    </table>
                </div>
            </form>
        </div>
    </div>
</div>
<!--添加用户图层-->
<div class="add_menber"id="add_menber_style"
     style="display:none;z-index: 19891022; width: 700px;top: 0px;left: 229.5px;">
    <form id="insertSelective" action="${pageContext.request.contextPath}/insertSelective.action" method="post">
        <ul class=" page-content">
            <li><label class="label_name">用&nbsp;&nbsp;户 &nbsp;名：</label><span class="add_name"><input value=""
                                                                                                       name="username"
                                                                                                       type="text"
                                                                                                       class="text_add"/></span>
                <div class="prompt r_f"></div>
            </li>
            <li><label class="label_name">真实姓名：</label><span class="add_name"><input name="userrealname"
                                                                                     type="text"
                                                                                     class="text_add"/></span>
                <div class="prompt r_f"></div>
            </li>
            <li><label class="label_name">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label><span class="add_name">
         <label><input name="usersex" value="1" type="radio" checked="checked" class="ace"><span class="lbl">男</span></label>&nbsp;&nbsp;&nbsp;
         <label><input name="usersex" value="2" type="radio" class="ace"><span class="lbl">女</span></label>&nbsp;&nbsp;&nbsp;
         <label><input name="usersex" value="3" type="radio" class="ace"><span class="lbl">保密</span></label>
         </span>
                <div class="prompt r_f"></div>
            </li>
            <li><label class="label_name">电话：</label><span class="add_name"><input name="userphone" type="text"
                                                                                   class="text_add"/></span>
                <div class="prompt r_f"></div>
            </li>
                     <li><label class="label_name">出生年月：</label><span class="add_name"><input name="userbirthday" type="text"  class="text_add"/></span><<%----%>div class="prompt r_f"></div></li>
            <li><label class="label_name">电子邮箱：</label><span class="add_name"><input name="useremail" type="text"
                                                                                     class="text_add"/></span>
                <div class="prompt r_f"></div>
            </li>
            <li class="adderss"><label class="label_name">家庭住址：</label><span class="add_name">
                <input name="useraddress" type="text" class="text_add" style=" width:350px"/></span>
                <div class="prompt r_f"></div>
            </li>
            <li class="status"><label class="label_name">状态：</label><span class="add_name">
                <%--<input name="userA" type="text" class="text_add" style=" width:350px"/>--%>
                <label><input name="userA" type="radio" value="0" class="ace"><span class="lbl">停用</span></label>&nbsp;&nbsp;
                <label><input name="userA" type="radio" value="1" class="ace"><span class="lbl">启用</span></label>
                </span>
                    <div class="prompt r_f"></div>
            </li>
            <%--<div class="status">
                <label><input name="userA" type="radio" value="0" class="ace"><span class="lbl">停用</span></label>&nbsp;&nbsp;
                <label><input name="userA" type="radio" value="1" class="ace"><span class="lbl">启用</span></label>
            </div>--%>
            <li class="adderss"><label class="label_name">邮编：</label><span class="add_name"><input
                    name="userzip" type="text" class="text_add" style=" width:350px"/></span>
                <div class="prompt r_f"></div>
            </li>
            <%--<li class="adderss"><label class="label_name">注册时间：</label><span class="add_name"><input
                  name="userinputdate" type="text" class="text_add" style=" width:350px"/></span>
                <div class="prompt r_f"></div>
            </li>--%>
        </ul>
    </form>
</div>
</body>
</html>
<script>
    jQuery(function ($) {
        var oTable1 = $('#sample-table').dataTable({
            "aaSorting": [[1, "desc"]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable": false, "aTargets": [0, 8, 9]}// 制定列不参与排序
            ]
        });


        $('table th input:checkbox').on('click', function () {
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                .each(function () {
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

            if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2)) return 'right';
            return 'left';
        }
    })
    /*用户-添加*/
    $('#member_add').on('click', function () {
      /*  $("#insertSelective").serialize();*/
        layer.open({
            type: 1,
            title: '添加用户',
            maxmin: true,
            shadeClose: true, //点击遮罩关闭层
            area: ['800px', ''],
            content: $('#add_menber_style'),
            btn: ['提交', '取消'],
            yes: function (index, layero) {
                var num = 0;
                var str = "";
                $(".add_menber input[type$='text']").each(function (n) {
                    if ($(this).val() == "") {

                        layer.alert(str += "" + $(this).attr("name") + "不能为空！\r\n", {
                            title: '提示框',
                            icon: 0,
                        });
                        num++;
                        return false;
                    }
                });
                if (num > 0) {
                    return false;
                }
                else {

                    $("#insertSelective").submit();
                    layer.alert('添加成功！', {
                        title: '提示框',
                        icon: 1,
                    });
                    layer.close(index);
                }
            }
        });
    });

    /*用户-查看*/
    function member_show(title, url, id, w, h) {
        layer_show(title, url + '#?=' + id, w, h);
    }

    /*用户-停用*/
    function member_stop(obj, id) {
        layer.confirm('确认要停用吗？', function (index) {

            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:void(0);" title="启用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!', {icon: 5, time: 1000});
            window.location.href="${pageContext.request.contextPath}/UpdateStatusStop.action?userid="+id;
        });
    }

    /*用户-启用*/
    function member_start(obj, id) {
        layer.confirm('确认要启用吗？', function (index) {
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:void(0);" title="停用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!', {icon: 6, time: 1000});
            window.location.href="${pageContext.request.contextPath}/UpdateStatusStart.action?userid="+id;
        });
    }

    /*用户-编辑*/
    function member_edit(id) {
        layer.open({
            type: 1,
            title: '修改用户信息',
            maxmin: true,
            shadeClose: false, //点击遮罩关闭层
            area: ['800px', ''],
            content: $('#add_menber_style'),
            btn: ['提交', '取消'],
            yes: function (index, layero) {
                var num = 0;
                var str = "";
                $(".add_menber input[type$='text']").each(function (n) {
                    if ($(this).val() == "") {

                        layer.alert(str += "" + $(this).attr("name") + "不能为空！\r\n", {
                            title: '提示框',
                            icon: 0,
                        });
                        num++;
                        return false;
                    }
                });
                if (num > 0) {
                    return false;
                }
                else {
                    $("#insertSelective").submit();
                    layer.alert('添加成功！', {
                        title: '提示框',
                        icon: 1,
                    });
                    layer.close(index);
                }
            }
        });
    }

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {

            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }

    laydate({
        elem: '#start',
        event: 'focus'
    });

    function arrayDelect() {
        /*document.getElementById("#arrayDelectForm").submit();*/
        /*document.arrayDelectForm.submit();*/
        $("#arrayDelectForm").submit();
        console.log("dyfygj");
    }
</script>