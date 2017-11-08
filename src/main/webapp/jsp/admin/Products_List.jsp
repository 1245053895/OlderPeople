<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link href="/jsp/admin/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/jsp/admin/css/style.css"/>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace.min.css" />
    <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome.min.css" />
    <link rel="stylesheet" href="/jsp/admin/Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link href="/jsp/admin/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
    <![endif]-->
    <script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
    <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
    <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <!-- page specific plugin scripts -->
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
    <script type="text/javascript" src="/jsp/admin/js/H-ui.admin.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <script type="text/javascript" src="/jsp/admin/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
    <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
    <title>产品列表</title>
</head>
<body>

<%--<c:if test="${empty productAndTypeVos }">
<jsp:forward page="/ProducList.action"/>
</c:if>--%>
    <div class=" page-content clearfix">
        <div id="products_style">
            <div class="search_style">
                <form action="<%= basePath %>ProducList.action" id="mainForm" method="post">
                <div class="title_names">搜索查询</div>
                <ul class="search_content clearfix">
                    <li><label class="l_f" style="margin-right: 5px;">商品名称</label><input name="producname" type="text"  class="text_add"  value="${productname}" class="text_add" placeholder="请输入商品名称进行查询"  style=" width:400px"/></li>
                    <%--<li><label class="l_f">上架时间</label><input name="productstoretime" class="inline laydate-icon"   id="start" style=" margin-left:10px;"></li>--%>
                    <li style="width:90px;"><button type="submit" class="btn_search"><i class="icon-search"></i>查询</button></li>
                </ul>
                </form>
            </div>
            <div class="border clearfix">
           <span class="l_f">
            <a href="${basePath}AddToProductType.action" title="添加商品" class="btn btn-warning Order_form"><i class="icon-plus"></i>添加商品</a>
            <a href="javascript:deleteBatch('<%=basePath%>');" class="btn btn-danger"><i class="icon-trash"></i>批量删除</a>
           </span>
                <span class="r_f">共：<b>${allproduct.productcount}</b>件商品</span>
            </div>
            <%--<div class="table_menu_list" id="testIframe">--%>
            <table class="table table-striped table-bordered table-hover" id="sample-table">
                <thead>
                <tr>
                    <th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                    <th width="80px">编号</th>
                    <th width="250px">商品名称</th>
                    <th width="250px">商品类型</th>
                    <th width="100px">上架时间</th>
                    <th width="100px">价格</th>
                    <th width="100px">商品描述</th>
                    <th width="180px">商品图片</th>
                    <th width="80px">商品积分</th>
                    <th width="80px">是否新品</th>
                    <th width="80px">是否热销</th>
                    <th width="80px">是否下架</th>
                    <th width="70px">状态</th>
                    <th width="200px">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${productAndTypeVos}" var="productAndTypeVos" varStatus="status">
                    <form id="form_${productAndTypeVos.productid}" action="${pageContext.request.contextPath}/updateById.action?id=${productAndTypeVos.productid}" method="post">
                        <tr>
                            <td width="25px">
                                <label>
                                    <input type="checkbox" class="ace" name="productid" value="${productAndTypeVos.productid}" >
                                    <span class="lbl"></span>
                                </label>
                            </td>
                            <td width="80px">
                                    ${productAndTypeVos.productid}
                            </td>
                            <td width="150px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                             value="${productAndTypeVos.productname}" name="productname"
                                                             class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                             value="${productAndTypeVos.producttypename}" name="producttypename"
                                                             class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                             value="<fmt:formatDate value="${productAndTypeVos.productstoretime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                                                             name="productstoretime" class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                             value="${productAndTypeVos.productprice}" name="productprice"
                                                             class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="150px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                                    value="${productAndTypeVos.productdescribe}" name="productdescribe"
                                                                    class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="100px">
                                <img src="/jsp/admin/images/upload/${productAndTypeVos.productpicture}" width="80px" height="110px">
                            </td>

                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                     value="${productAndTypeVos.productcredits}" name="productcredits"
                                                     class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>

                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                             value="<c:if test="${productAndTypeVos.productnew==1}">√</c:if>
                                                              <c:if test="${productAndTypeVos.productnew==0}">×</c:if>"
                                                             name="productnew" class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                                             value=" <c:if test="${productAndTypeVos.producthotsale==1}">√</c:if>
                                                                <c:if test="${productAndTypeVos.producthotsale==0}">×</c:if>"
                                                             name="producthotsale" class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <td width="100px">
                                <input style="border-width: 0px;background-color: transparent;" type="text"
                                       value=" <c:if test="${productAndTypeVos.producthotsale==1}">√</c:if>
                                                                <c:if test="${productAndTypeVos.producthotsale==0}">×</c:if>"
                                       name="producthotsale" class="input_style text_info${productAndTypeVos.productid}" readonly="true"/>
                            </td>
                            <c:if test="${productAndTypeVos.productA==1}">
                                <td class="td-status"><span class="label label-success radius">已启用</span></td>
                            </c:if>
                            <c:if test="${productAndTypeVos.productA==0}">
                                <td class="td-status"><span class="label label-default radius">已停用</span></td>
                            </c:if>
                            <c:if test="${productAndTypeVos.productA==null}">
                                <td class="td-status"><span class="label label-success radius">已启用</span></td>
                            </c:if>
                            <td>
                                <c:if test="${productAndTypeVos.productA==0}">
                                    <a onClick="member_start(this,'${productAndTypeVos.productid}')" href="javascript:void(0);" title="启用"
                                       class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                                </c:if>
                                <c:if test="${productAndTypeVos.productA==1}">
                                    <a onClick="member_stop(this,'${productAndTypeVos.productid}')" href="javascript:void(0);" title="停用"
                                       class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                                </c:if>
                                <c:if test="${productAndTypeVos.productA==null}">
                                    <a onClick="member_stop(this,'${productAndTypeVos.productid}')" href="javascript:void(0);" title="停用"
                                       class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                                </c:if>
                                <a title="编辑" onclick="modify(${productAndTypeVos.productid})" href="javascript:void(0);"  class="btn btn-xs btn-info radius" ><i id="edit${productAndTypeVos.productid}" class="fa bigger-120">编辑</i></a>
                                <a title="删除" href="${basePath}DeleteOneProduct.action?productid=${productAndTypeVos.productid}"  onclick="return confirmAct();" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a>
                            </td>
                        </tr>
                    </form>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    </div>
    </div>
</body>
</html>

<style type="text/css">
    body{
        font-size: 14px;
        font-family: "Microsoft YaHei", Arial, Helvetica, sans-serif;
        text-align: center;
    }
    .input_style{
        border: none;
        width: 100%;
        text-align: center;
        line-height: 30px;

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
    .dataTables_length{
        margin-left: -400px;
    }

</style>


<script>
    //下面1个函数需要优化

    function deleteBatch(basePath) {
        alert('您确定要删除吗？');
        $("#mainForm").attr("action",basePath + "DeleteBatchProduct.action");
        $("#mainForm").submit();
    }

    function confirmAct(){
        if (confirm("确定要执行此操作码？"))
        {return true;}
        return false;
    }



    jQuery(function($) {
        var oTable1 = $('#sample-table').dataTable( {
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,2,3,4,5,8,9]}// 制定列不参与排序
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
    laydate({
        elem: '#start',
        event: 'focus'
    });
    $(function() {
        $("#products_style").fix({
            float : 'left',
            //minStatue : true,
            skin : 'green',
            durationTime :false,
            spacingw:30,//设置隐藏时的距离
            spacingh:260,//设置显示时间距
        });
    });
</script>
<script type="text/javascript">
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
    /*用户-停用*/
    function member_stop(obj, id) {
        layer.confirm('确认要停用吗？', function (index) {

            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:void(0);" title="启用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!', {icon: 5, time: 1000});
            window.location.href="${pageContext.request.contextPath}/UpdateStatusStopP.action?productid="+id;
        });
    }

    /*用户-启用*/
    function member_start(obj, id) {
        layer.confirm('确认要启用吗？', function (index) {
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:void(0);" title="停用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!', {icon: 6, time: 1000});
            window.location.href="${pageContext.request.contextPath}/UpdateStatusStartP.action?productid="+id;
        });
    }
    /*产品-编辑*/
    var flag=true;

    function modify(v) {
        if(flag) {
            $('.text_info' + v).attr("readonly", false);
            $('.text_info' + v).parents("td").css("box-shadow","0px 0px 20px #888888 inset");
            $('#edit'+v).text("提交");
            flag = false;
        }else{
            $("#form_"+v).submit();
            $('.text_info' + v).attr("readonly", true);
            $('.text_info' + v).parents("td").css("box-shadow","0px 0px 0px #888888 inset");
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
    //面包屑返回值
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.iframeAuto(index);
    $('.Order_form').on('click', function(){
        var cname = $(this).attr("title");
        var chref = $(this).attr("href");
        var cnames = parent.$('.Current_page').html();
        var herf = parent.$("#iframe").attr("src");
        parent.$('#parentIframe').html(cname);
        parent.$('#iframe').attr("src",chref).ready();;
        parent.$('#parentIframe').css("display","inline-block");
        parent.$('.Current_page').attr({"name":herf,"href":"javascript:void(0)"}).css({"color":"#4c8fbd","cursor":"pointer"});
        //parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
        parent.layer.close(index);

    });
</script>
