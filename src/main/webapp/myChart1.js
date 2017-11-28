$(document).ready(function(){
    var myChart = echarts.init(document.getElementById('Statistics1'));
    var	option = {
        backgroundColor: '#c9c7cc',
        color:['#40e0d0', '#ffa500','#cd5c5c','#ba55d3','#ff69b4','#6495ed','#32cd32','#B5C334','#FCCE10','#E87C25','#27727B',
            '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',
            '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'],
        title : {
            text: '各个商品类型的订单数',
            subtext: '副标题',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: []
        },

        toolbox: {
            show : true,
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                magicType : {
                    show: true,
                    type: ['pie', 'funnel'],
                    option: {
                        funnel: {
                            x: '25%',
                            width: '50%',
                            funnelAlign: 'left',
                            max: 1548
                        }
                    }
                },
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        series : [
            {
                name: '订单数',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    myChart.showLoading();
    var name3=[];    //类别数组（实际用来盛放X轴坐标值）
    var name4=[];
    $.ajax({
        type : 'post',
        async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        //url : '${pageContext.request.contextPath}/readforms.action',
        url : root+'/readforms1.action',
        data : '{}',
        contentType : 'application/json;charset=utf-8',        //返回数据形式为json
        success : function(result) {
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (result) {

                for(var i=0;i<result.length;i++){
                    name3.push(result[i].name3);
                }

                for(var i=0;i<result.length;i++){
                    name4.push({
                        name:result[i].name3,
                        value:result[i].name4,
                    });

                }
                myChart.hideLoading();      //隐藏加载动画
                myChart.setOption({        //加载数据图表
                    legend: [
                        {data: name3}
                    ],
                    series: [

                        {
                            data: name4
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