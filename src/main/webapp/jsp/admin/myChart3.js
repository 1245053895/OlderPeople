$(document).ready(function(){
    var myChart = echarts.init(document.getElementById('main'));
    var option = {
        backgroundColor: '#CCFFCC',
        title : {
            text: '今年月购买订单交易记录',
            subtext: '实时获取用户订单购买记录'
        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['所有订单','待付款','已付款','代发货']
        },
        toolbox: {
            show : true,
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                magicType : {show: true, type: ['line', 'bar']},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'所有订单',
                type:'bar',
                data:[],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                itemStyle:{
                    normal:{color:'#0099CC'}
                }
            },
            {
                name:'待付款',
                type:'bar',
                data:[],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                itemStyle:{
                    normal:{color:'#9966FF'}
                }

            }
            , {
                name:'已付款',
                type:'bar',
                data:[],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                itemStyle:{
                    normal:{color:'#40e0d0'}
                }
            }
            , {
                name:'代发货',
                type:'bar',
                data:[],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                itemStyle:{
                    normal:{color:'#FF9933'}
                }
            }
        ]
    };
    myChart.showLoading();
    var name1=[];
    var name2=[];
    var name3=[];    //类别数组（实际用来盛放X轴坐标值）
    var name4=[];
    $.ajax({
        type : 'post',
        async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        //url : '${pageContext.request.contextPath}/readforms.action',
        url : root+'/getArray.action',
        data : '{}',
        contentType : 'application/json;charset=utf-8',        //返回数据形式为json
        success : function(result) {
        	//alert(result);
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (result) {
              //0-11待付款  20-31已付款 40-51待发货 60-71所有订单
                for(var i=0;i<12;i++){name1.push(result[i]);}
                // alert(name1);
                for(var i=20;i<32;i++){name2.push(result[i]);}
                // alert(name2);
                for(var i=40;i<52;i++){name3.push(result[i]);}
                // alert(name3);
                for(var i=60;i<72;i++){name4.push(result[i]);}
                // alert(name4);



                myChart.hideLoading();      //隐藏加载动画
                myChart.setOption({        //加载数据图表
                    legend: [
                        { data:['所有订单','待付款','已付款','代发货']}
                    ],
                    series: [
                        {
                            name:'所有订单',
                            data:name4
                        },
                        {
                            name:'待付款',
                            data:name1
                        },
                        {
                            name:'已付款',
                            data:name2
                        },
                        {
                            name:'代发货',
                            data:name3
                        }
                    ]
                });
            }
        },
        error : function(errorMsg) {
            //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart.hideLoading();
        }
    });
    myChart.setOption(option);
});