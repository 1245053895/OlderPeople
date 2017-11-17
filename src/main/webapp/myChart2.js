$(document).ready(function(){
    var myChart = echarts.init(document.getElementById('Statistics2'));

    //app.title = '气泡图';

    // 测试数据
    var data1111 = [
        [['2017-10-20','400','98','hu1','0'],
            ['2014-05-01','200','67','hu2','0'],
            ['2017-11-10','200','88','hu5','0']],

        [['2012-10-01','300','66','hu3','1'],
            ['2017-11-06','300','88','hu4','1'],
            ['2013-04-01','400','78','hu6','1'],
            ['2017-11-08','100','33','hu7','1']],
    ];

    var data = [];
    var arr = [];
    var arr1 = [];

    $.ajax({
        type : 'post',
        async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        url : root+'/readforms4.action',
        data : '{}',
        datatype:'json',
        contentType : 'application/json;charset=utf-8',        //返回数据形式为json
        success: function (data1) {

           for(var i=0;i<data1.length;i++){
                if (data1[i].eee==0){
                    arr.push([data1[i].aaa,data1[i].bbb,data1[i].ccc,data1[i].ddd,data1[i].eee])
                }
                else {
                    arr1.push([data1[i].aaa,data1[i].bbb,data1[i].ccc,data1[i].ddd,data1[i].eee])
                }
            }
       // alert(arr);alert(arr1);
        myChart.hideLoading();
        myChart.setOption({
            series:[{
                name:'男',
                data:arr },{
                name:'女',
                data:arr1
            }]

        })

           // data=JSON.parse(data1);
           //data.push([arr,arr1])
            console.log(data1);
           arr.push(data1);
             console.log(arr);
             console.log(arr1);
            console.log(data);

},

});






    var   option = {
           backgroundColor: new echarts.graphic.RadialGradient(0.3, 0.3, 0.8, [{
               offset: 0,
               color: '#f7f8fa'
           }, {
               offset: 1,
               color: '#cdd0d5'
           }]),
           title: {
               text: '注册时间-积分-用户名称-登录次数-性别'
           },
           legend: {
               right: 10,
               data: ['男', '女']
           },
           xAxis: {
               type:'time',
               splitLine: {
                   lineStyle: {
                       type: 'dashed'
                   }
               }
           },
           yAxis: {
               splitLine: {
                   lineStyle: {
                       type: 'dashed'
                   }
               },
               scale: true
           },
           series: [{
               name: '男',
               data:[],
               type: 'scatter',
               symbolSize: function (data) {
                   return data[2]/2;
               },
               label: {
                   emphasis: {
                       show: true,
                       formatter: function (param) {
                           return param.data[3];
                       },
                       position: 'top'
                   }
               },
               itemStyle: {
                   normal: {
                       shadowBlur: 10,
                       shadowColor: 'rgba(120, 36, 50, 0.5)',
                       shadowOffsetY: 5,
                       color: new echarts.graphic.RadialGradient(0.4, 0.3, 1, [{
                           offset: 0,
                           color: 'rgb(251, 118, 123)'
                       }, {
                           offset: 1,
                           color: 'rgb(204, 46, 72)'
                       }])
                   }
               }
           }, {
               name: '女',
               //data: data[1],
               data: [],
               type: 'scatter',
               symbolSize: function (data) {
                   return data[2]/2;
               },
               label: {
                   emphasis: {
                       show: true,
                       formatter: function (param) {
                           return param.data[3];
                       },
                       position: 'top'
                   }
               },
               itemStyle: {
                   normal: {
                       shadowBlur: 10,
                       shadowColor: 'rgba(25, 100, 150, 0.5)',
                       shadowOffsetY: 5,
                       color: new echarts.graphic.RadialGradient(0.4, 0.3, 1, [{
                           offset: 0,
                           color: 'rgb(129, 227, 238)'
                       }, {
                           offset: 1,
                           color: 'rgb(25, 183, 207)'
                       }])
                   }
               }
           }]
       };
myChart.showLoading();




    myChart.setOption(option);
});