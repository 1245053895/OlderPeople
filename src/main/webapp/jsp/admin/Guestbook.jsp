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
    <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <title>留言</title>
</head>

<body>
<form action="${pageContext.request.contextPath}/moHuSelectByNameOrRate.action" method="post">
<div class="margin clearfix">
    <div class="Guestbook_style">
        <div class="search_style">
            <div class="title_names">搜索查询</div>
            <ul class="search_content clearfix">
                <li><label class="l_f">商品</label><input name="productname"  type="text" class="text_add" placeholder="输入商品名" style=" width:250px"></li>
                <li><label class="l_f">平均好评度</label>
                    <select name="goodrate" style="margin-left: 10px">
                        <option  value =""></option>
                        <option  value ="1">1</option>
                        <option  value ="2">2</option>
                        <option  value="3" >3</option>
                        <option  value="4" >4</option>
                        <option  value="5" >5</option>
                    </select>
                </li>

                <li style="width:90px;"><button type="submit" class="btn_search"><i class="icon-search"></i>查询</button></li>
            </ul>
        </div>
     <%--   <div class="border clearfix">--%>
      <%-- <span class="l_f">--%>
       <%-- <a href="javascript:ovid()" class="btn btn-danger"><i class="fa fa-trash"></i>&nbsp;批量删除</a>--%>
        <%--<a href="javascript:ovid()" class="btn btn-sm btn-primary"><i class="fa fa-check"></i>&nbsp;已浏览</a>
        <a href="javascript:ovid()" class="btn btn-yellow"><i class="fa fa-times"></i>&nbsp;未浏览</a>--%>
       <%--</span>--%>
            <span class="r_f">共：<b>${totalMessage.total}</b>条</span>
       <%-- </div>--%>
        <!--留言列表-->
        <div class="Guestbook_list">
            <table class="table table-striped table-bordered table-hover" id="sample-table">
                <thead>
                <tr>
                    <th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                    <th width="97px">商品编号</th>
                    <th width="100px">商品名</th>
                    <%--<th width="100px">用户名</th>--%>
                    <%--<th>评论内容</th>--%>
                    <th width="97">平均好评度</th>
                    <%--<th width="170">评论时间</th>--%>
                    <%--<th width="70">状态</th>                --%>
                <%--    <th width="120">操作</th>--%>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${commentRates}" var="commentRate">
                <tr>
                    <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
                    <td>${commentRate.productid}</td>
                    <td><a href="${pageContext.request.contextPath}/selectCommentUserById.action?productid=${commentRate.productid}">${commentRate.productname}</a></td>
                    <%--<td><a href="member-show.jsp">张小泉</a></td>--%>
                    <%--<td class="text-l">--%>
                        <%--<a href="javascript:;" onclick="Guestbook_iew('12')">值此京东“618品质狂欢节”之际，中国特产无锡馆限量上线618份8只装精品水蜜桃</a>--%>
                    <td>${commentRate.goodrate}</td>
                    <%--<td>2017.10.12</td>--%>
                   <%-- <td class="td-manage">
                        <a href="javascript:void (0);"  onclick="member_del(this,${commentRate.productid})" title="删除" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>
                    </td>--%>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</form>
</body>
</html>
<script type="text/javascript">
    /*用户-查看*/
    function member_show(title,url,id,w,h){
        layer_show(title,url+'#?='+id,w,h);
    }
    /*留言-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            windows.location.href="${pageContext}/";
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
</script>
