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
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
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
    <script type="text/javascript" src="/jsp/admin/js/H-ui.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.min.js"></script>
    <script src="/jsp/admin/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script src="/jsp/admin/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/jsp/admin/assets/laydate/laydate.js" type="text/javascript"></script>
    <script src="/jsp/admin/assets/js/jquery.easy-pie-chart.min.js"></script>
    <script src="/jsp/admin/js/lrtk.js" type="text/javascript" ></script>
    <title>订单详细</title>
</head>

<body>
<div class="margin clearfix">
    <div class="Order_Details_style">
        <div class="Numbering">订单编号:<b>${orderDetailCustoms.get(0).orderid}</b></div></div>
    <div class="detailed_style">
        <!--收件人信息-->
        <div class="Receiver_style">
            <div class="title_name">收件人信息</div>
            <div class="Info_style clearfix">
                <div class="col-xs-4">
                    <label class="label_name"> 收件人姓名： </label>
                    <div class="o_content">${orderDetailCustoms.get(0).gainname}</div>
                </div>
                <div class="col-xs-4">
                    <label class="label_name"> 收件人电话： </label>
                    <div class="o_content">${orderDetailCustoms.get(0).gainmobile}</div>
                </div>
                <div class="col-xs-4">
                    <label class="label_name"> 收件地邮编： </label>
                    <div class="o_content">${orderDetailCustoms.get(0).gaincode}</div>
                </div>
                <div class="col-xs-4">
                    <label class="label_name"> 收件地址： </label>
                    <div class="o_content">${orderDetailCustoms.get(0).gainaddress}</div>
                </div>
            </div>
        </div>
        <!--订单信息-->
        <div class="product_style">
            <div class="title_name">商品信息</div>
            <div class="Info_style clearfix">
                <c:forEach items="${orderDetailCustoms}" var="orderDetailCustom">
                    <div class="product_info clearfix">
                        <a href="#" class="img_link"><img src="${pageContext.request.contextPath}/jsp/admin/images/${orderDetailCustom.productpicture}"  width="200" height="200"/></a>
                        <span>
                  <a href="#" class="name_link">${orderDetailCustom.productname}</a><br/>
                  <b>${orderDetailCustom.productdescribe}</b>
                  <p>规格: XXL</p>
                  <p>数量: ${orderDetailCustom.shoppingcount}</p>
                  <p>价格：<b class="price"><i>￥</i>${orderDetailCustom.productprice}</b></p>
                  <p>可获积分：${orderDetailCustom.totalcredit}</p>
                  <p>商品状态：

                    <c:if test="${orderDetailCustom.stock>0}">
                        <i class="label label-success radius">
                            有货:
                        </i>&nbsp;${orderDetailCustom.stock}
                    </c:if>
                    <c:if test="${orderDetailCustom.stock<1}">
                        <i class="label label-warning radius">
                            无货:
                        </i>&nbsp;${orderDetailCustom.stock}
                    </c:if>

                  </p>
              </span>
                    </div>
                </c:forEach>
            </div>
        </div>
        <!--总价-->
        <div class="Total_style">
            <div class="Info_style clearfix">
                <div class="col-xs-4">
                    <label class="label_name"> 支付方式： </label>
                    <div class="o_content">
                        <c:if test="${orderDetailCustoms.get(0).paytype==0}">
                            在线支付
                        </c:if>
                        <c:if test="${orderDetailCustoms.get(0).paytype==1}">
                            货到付款
                        </c:if>
                    </div>
                </div>
                <div class="col-xs-4">
                    <label class="label_name"> 支付状态： </label>
                    <div class="o_content">
                        <c:if test="${orderDetailCustoms.get(0).paystatus==0}">
                            已支付
                        </c:if>
                        <c:if test="${orderDetailCustoms.get(0).paystatus==1}">
                            未支付
                        </c:if>
                    </div>
                </div>
                <c:if test="${orderDetailCustoms.get(0).shippingname=='自取'}">
                    <div class="col-xs-4">
                        <label class="label_name"> 收货方式： </label>
                        <div class="o_content">
                            自取
                        </div>
                    </div>
                </c:if>
                <c:if test="${orderDetailCustoms.get(0).shippingname!='自取'}">
                    <div class="col-xs-4">
                        <label class="label_name"> 收货方式： </label>
                        <div class="o_content">
                            邮寄
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <label class="label_name"> 物流名称： </label>
                        <div class="o_content">${orderDetailCustoms.get(0).shippingname}</div>
                    </div>
                    <div class="col-xs-4">
                        <label class="label_name"> 物流编号： </label>
                        <div class="o_content">${orderDetailCustoms.get(0).shippingcode}</div>
                    </div>
                </c:if>
                <div class="col-xs-4">
                    <label class="label_name"> 订单生成日期： </label>
                    <div class="o_content"><fmt:formatDate  value="${orderDetailCustoms.get(0).createtime}" pattern="yyyy-MM-dd hh:mm:ss"/></div>
                </div>
            </div>
            <div class="Total_m_style">
                <span class="Total">商品总数：<b>${orderDetailCustoms.size()}</b></span>
                <span class="Total_price">总价：<b>
                    ${orderDetailCustoms.get(0).amountpay}
                </b>元</span>
            </div>
        </div>
        <div class="Button_operation">
            <c:if test="${orderDetailCustoms.get(0).orderid>1}">
                <a href="${pageContext.request.contextPath}/getOrderDetailByOrderId.action?id=${orderDetailCustoms.get(0).orderid-1}" class="btn btn-primary radius"><i class="icon-save "></i>上一个订单</a>
            </c:if>
            <a href="${pageContext.request.contextPath}/getOrderDetailByOrderId.action?id=${orderDetailCustoms.get(0).orderid+1}" class="btn btn-primary radius"><i class="icon-save "></i>下一个订单</a>

            <%--<button onclick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>--%>
        </div>
    </div>
</div>
</body>
</html>
