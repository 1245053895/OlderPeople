<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <link rel="stylesheet" href="/jsp/admin/font/css/font-awesome.min.css" />
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/jsp/admin/assets/css/ace-ie.min.css" />
    <![endif]-->
    <script src="/jsp/admin/js/jquery-1.9.1.min.js"></script>
    <script src="/jsp/admin/assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
    <script src="/jsp/admin/assets/js/typeahead-bs2.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <script src="/jsp/admin/assets/js/jquery.easy-pie-chart.min.js"></script>
    <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
    <title>订单管理</title>
</head>

<body>
<!--订单列表-->
    <form action="${pageContext.request.contextPath}/getAllOrder.action" method="post">
        <div class="search_style">
            <div class="title_names">搜索查询</div>
            <ul class="search_content clearfix">
                <li><label class="l_f">任意条件</label><input name="conditions" type="text" class="text_add" placeholder="订单编号" style=" width:250px"></li>
                <li><label class="l_f">时间</label><input class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
                <li style="width:90px;"><button type="submit" class="btn_search"><i class="fa fa-search"></i>查询</button></li>
            </ul>
        </div>
    </form>
    <!--订单列表展示-->
    <table class="table table-striped table-bordered table-hover" id="sample-table">
        <thead>
        <tr>
            <th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
            <th width="200px">订单ID</th>
            <th width="200px">用户名</th>
            <th width="100px">商品金额</th>
            <th width="100px">可获积分</th>
            <th width="200px">配送方式</th>
            <th width="200px">买家备注</th>
            <th width="200px">订单状态</th>
            <th width="200px">支付类型</th>
            <th width="200px">支付状态</th>
            <th width="500px">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${orderCustoms}" var="order">
            <tr>
                <td><label><input type="checkbox" value="${order.orderid}" class="ace"><span class="lbl"></span></label></td>
                <td>${order.orderid}</td>
                <td>${order.username}</td>
                <td class="pay"onmouseover="getPayDetail(this)" onmouseout="removePayDetail(this)">
                    <fmt:formatNumber value="${order.realpay}" type="currency"/>
                    <div id="payDetail">
                        <div>商品金额:<fmt:formatNumber value="${order.realpay}" type="currency"/></div>
                        <div>邮费:<fmt:formatNumber value="${order.postfee}" type="currency"/></div>
                        <div>总金额:<fmt:formatNumber value="${order.realpay+order.postfee}" type="currency"/></div>
                    </div>
                </td>
                <td>${order.totalcredit}</td>
                <td>
                    <c:if test="${order.shippingname==''&&order.shippingcode==''}">
                        <span class="label label-success radius">
                            自提
                        </span>
                    </c:if>
                    <c:if test="${order.shippingname!=null&&order.shippingcode!=null}">
                        ${order.shippingname}<br/>
                        <a href="http://www.kuaidi100.com" target="view_window">${order.shippingcode}</a>
                    </c:if>
                </td>
                <td>${order.buyerrequest}</td>
                <td class="td-status">
                    <c:if test="${order.status==0}">
                        <span class="label label-default radius">
                            交易关闭
                        </span>
                    </c:if>

                    <c:if test="${order.status==1}">
                        <span class="label label-success radius">
                            待发货
                        </span>
                    </c:if>
                    <c:if test="${order.status==2}">
                        <span class="label label-success radius">
                            已发货
                        </span>
                    </c:if>
                    <c:if test="${order.status==3}">
                        <span class="label label-success radius">
                            已签收
                        </span>
                    </c:if>
                    <c:if test="${order.status==4}">
                        <span class="label label-success radius">
                            已完成
                        </span>
                    </c:if>
                    <c:if test="${order.status==5}">
                        <span class="label label-warning radius">
                            拒收
                        </span>
                    </c:if>
                    <c:if test="${order.status==6}">
                        <span class="label label-warning radius">
                            退货
                        </span>
                    </c:if>
                    <c:if test="${order.status==null}">
                        未查到
                    </c:if>
                    </span><br/>
                    <fmt:formatDate value="${order.updatetime}" pattern="yyyy-MM-dd hh:mm:ss"/>
                </td>
                <td>
                    <c:if test="${order.paytype==0}">
                        在线支付
                    </c:if>
                    <c:if test="${order.paytype==1}">
                        货到付款
                    </c:if>
                </td>
                <td>
                    <c:if test="${order.paystatus==0}">
                        <span class="label label-success radius">已支付</span>
                    </c:if>
                    <c:if test="${order.paystatus==1}">
                        <span class="label label-defaunt radius">未支付</span>
                    </c:if>

                </td>
                <td>
                    <c:if test="${order.status==1}">
                        <a onClick="shipping(this,${order.orderid})"  href="javascript:void(0);" title="发货"  class="btn btn-xs btn-success">发货</a>
                    </c:if>
                    <c:if test="${order.status!=0&&order.status!=1}">
                        <a onClick="Delivery_stop(this,'10001')"  href="javascript:void(0);" title="物流详情"  class="btn btn-xs btn-success">物流详情</a>
                    </c:if>
                    <c:if test="${order.status==5}">
                        <a onClick="Delivery_stop(this,'10001')"  href="javascript:void(0);" title="拒收理由"  class="btn btn-xs btn-success">拒收理由</a>
                    </c:if>
                    <c:if test="${order.status==6}">
                        <a onClick="Delivery_stop(this,'10001')"  href="javascript:void(0);" title="审核"  class="btn btn-xs btn-success">审核</a>
                    </c:if>
                    <a title="订单详情"  href="${pageContext.request.contextPath}/getOrderDetailByOrderId.action?id=${order.orderid}"  class="btn btn-xs btn-info order_detailed" >订单详情</a>
                    <c:if test="${order.status!=4 && order.status!=0}">
                        <a id="CloseDeal" title="关闭交易" href="javascript:void(0);"  onclick="CloseDeal(this,${order.orderid})" class="btn btn-xs btn-warning" >关闭交易</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</div>
<!--发货-->
<div id="Delivery_stop" style=" display:none">
    <div class="">
        <div class="content_style">
            <form id="updateOrderShipping" action="${pageContext.request.contextPath}/updateOrderShipping.action" method="post">
                <input id="orderId" type="hidden" name="orderid">
                <div class="form-group"><label class="col-sm-2 control-label no-padding-right" for="form-field-1">快递公司 </label>
                    <div class="col-sm-9">
                        <select name="shippingname" class="form-control" id="form-field-select-1">

                        </select>
                    </div>
                </div>
                <div class="form-group"><label class="col-sm-2 control-label no-padding-right" for="form-field-1"> 快递号 </label>
                    <div class="col-sm-9"><input  name="shippingcode" type="text" id="form-field-1" placeholder="快递号" class="col-xs-10" style="margin-left:0px;"></div>
                </div>
            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>
<style>
    #payDetail{
        position: absolute;
        display: none;
        width: auto;
        max-width: 150px;
        height:auto;
        margin: 10px;
        background-color: #FFFFCC;
        border:1px #39b1d4 solid;
    }
    #payDetail div{
        float:left;
    }
</style>
<script>
    function removePayDetail(obj){
        $(obj).children().css({"display":"none"});
    }
    function getPayDetail(obj) {
        $(obj).children().css({"display":"block"});
    }
    function LoadFunction() {

    }
    function erryFunction() {
        alert("error");
    }
    function succFunction(data) {
        alert(data);
    }
</script>
<script>
    //时间选择
    laydate({
        elem: '#start',
        event: 'focus'
    });
    /*订单-关闭*/
    function CloseDeal(obj,id){
        layer.confirm('确认要关闭交易吗？',function(index){
            $.ajax({
                type: 'POST',
                url: '/updateCloseDeal.action',
                cache: false,
                data: "orderid="+id,
                timeout:10000,
                success: succFunction, //成功执行方法
                beforeSend: LoadFunction, //加载执行方法
                error: erryFunction  //错误执行方法
            });
            function LoadFunction() {
                layer.msg('关闭中...',{icon:1,time:10000});
            }
            function erryFunction(){
                layer.msg('关闭失败...',{icon:1,time:5000});
            }
            function succFunction(data) {
                $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已关闭</span>');
                layer.msg('已关闭!',{icon:1,time:3000});
            }

        });
    }
    /**发货**/
    function shipping(obj,id){
        $.ajax({
            type: 'POST',
            url: '/getTransport.action',
            cache: false,
            success: succFunction, //成功执行方法
            beforeSend: LoadFunction, //加载执行方法
            error: erryFunction  //错误执行方法
        });
        function LoadFunction() {
            $("#form-field-select-1").html("加载中...");
        }
        function erryFunction(){
            $("#form-field-select-1").html("获取失败,请刷新网页...");
        }
        function succFunction(data){
            //$("#form-field-select-1").append("<option value=\"\">--选择快递--</option>");
            $("#orderId").val(id);
            var html="";
            for(var i = 0; i < data.length; i++){ //循环后台传过来的Json数组
                var datas = data[i];
                html+="<option value=\""+datas.transportname+"\">"+datas.transportname+"</option>";
            }
            $("#form-field-select-1").append(html);
            //console.log(html);
            layer.open({
                type: 1,
                title: '发货',
                maxmin: true,
                shadeClose:false,
                area : ['500px' , ''],
                content:$('#Delivery_stop'),
                btn:['确定','取消'],
                yes: function(index, layero){
                    if($('#form-field-1').val()==""){
                        layer.alert('快递号不能为空！',{
                            title: '提示框',
                            icon:0,
                        })

                    }else{
                        $("#updateOrderShipping").submit();
                        /*layer.confirm('提交成功！',function(index){
                            /!*$(obj).parents("tr").find(".td-manage").prepend('<a style=" display:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="已发货"><i class="fa fa-cubes bigger-120"></i></a>');
                            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发货</span>');
                            $(obj).remove();
                            layer.msg('已发货!',{icon: 6,time:1000});*!/
                            //window.location.href="${pageContext.request.contextPath}/UpdateStatusStart.action?userid="+id;
                        });*/
                        layer.close(index);
                    }

                }
            })
        }
    };
    //面包屑返回值
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.iframeAuto(index);
    $('.Order_form,.order_detailed').on('click', function(){
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

    //初始化宽度、高度
    $(".hide_style").height($(".hide_style").height());
    var heights=$(".hide_style").outerHeight(true)+90;
    $(".widget-box").height($(window).height()-heights);
    $(".table_menu_list").width($(window).width()-250);
    $(".table_menu_list").height($(window).height()-heights);
    //当文档窗口发生改变时 触发
    $(window).resize(function(){
        $(".widget-box").height($(window).height()-heights);
        $(".table_menu_list").width($(window).width()-250);
        $(".table_menu_list").height($(window).height()-heights);
    })
    //比例
    var oldie = /msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase());
    $('.easy-pie-chart.percentage').each(function(){
        $(this).easyPieChart({
            barColor: $(this).data('color'),
            trackColor: '#EEEEEE',
            scaleColor: false,
            lineCap: 'butt',
            lineWidth: 10,
            animate: oldie ? false : 1000,
            size:103
        }).css('color', $(this).data('color'));
    });

    $('[data-rel=tooltip]').tooltip();
    $('[data-rel=popover]').popover({html:true});
</script>
<script>
    //订单列表
    jQuery(function($) {
        var oTable1 = $('#sample-table').dataTable( {
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,1,2,3,4,5,6,7,8,9]}// 制定列不参与排序
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