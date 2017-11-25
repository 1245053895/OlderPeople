$(document).ready(function(){
    /*当点击上传图片按钮时*/
    $("#select_text").click(function () {
        $(".select_text").click();
    });
    /*当点击相机图标时*/
    $(".search-select").click(function () {
        $(".upload_image").toggle(800,function () {
            //$(".header-tip").css("background-image","url(on.jpg)");
            console.log("隐藏/显示 图片上传组件 后执行的逻辑!");

        });
    });
    /*当input空间内容改变时执行*/
    $("#imageFile").change(function () {
        ajax(this.files);
    });
    /*当点击提示时执行*/
    $(".header-tip").click(function () {
        $(this).toggle(800,function () {
            console.log("隐藏/显示 提示 后执行的逻辑!");
        })
    });
});

function fileChange(files) {  //当input文件改变时
    //var files = $("#imageFile").get(0).files; //获取file控件中的内容

}

//阻止默认事件
function upload_img(){
    //拖离
    document.addEventListener('dragleave',function(e){e.preventDefault();});
    //拖后放
    document.addEventListener('drop',function(e){e.preventDefault();});
    //拖进
    document.addEventListener('dragenter',function(e){e.preventDefault();});
    //拖来拖去
    document.addEventListener('dragover',function(e){e.preventDefault();});
    var box = document.getElementById('drop_img'); //拖拽区域
    document.addEventListener("dragover",function(e){ //拖来拖去
        $(".header-tip").show();
        console.log("+6666");
    });
    document.addEventListener("drop",function(e){ //释放
        $(".header-tip").hide();
        console.log("+6666");
    });
    box.addEventListener("dragleave",function(e){ //拖离
        $(".header-tip").show();
        console.log("+6666");
    });
    box.addEventListener("drop",function(e){
        e.preventDefault(); //取消默认浏览器拖拽效果
        var files = e.dataTransfer.files; //获取文件对象
        //检测是否是拖拽文件到页面的操作
        if(files.length == 0){return false;}
        //检测文件是不是图片
        ajax(files);
    },false);
};

function ajax(files) {
    if(files[0].type.indexOf('image') === -1){
        alert("您拖的不是图片！");
        return false;
    }
    //拖拉图片到浏览器，可以实现预览功能
    //var img = window.webkitURL.createObjectURL(files[0]);
    var img = window.URL.createObjectURL(files[0]);
    var filename = files[0].name; //图片名称
    var filesize = Math.floor((files[0].size)/1024);
    if(filesize>4096){
        alert("上传大小不能超过4M.");
        return false;
    }
    var image = document.createElement('img');
    image.src = img;
    var p = document.createElement("p");
    //p.innerHTML = "图片名称："+filename+"<br/>大小："+filesize+"KB";
    $(".drop_this").empty();
    $(".drop_this").find("img").remove();
    $(".drop_this").append(image);


    //上传
    var fd = new FormData();
    fd.append("userID", "1");
    fd.append("errDeviceType", "001");
    fd.append("errDeviceID", "11761b4a-57bf-11e5-aee9-005056ad65af");
    fd.append("errType", "001");
    fd.append("errContent", "XXXXXX");
    fd.append("mypic", files[0]);
    $.ajax({
        type: "POST",
        contentType:false, //必须false才会避开jQuery对 formdata 的默认处理 , XMLHttpRequest会对 formdata 进行正确的处理
        processData: false, //必须false才会自动加上正确的Content-Type
        url: "/uploadSearchImage.action",
        data: fd,
        success: function (msg) {
            $(".upload_image").toggle(500);
            $(".result-list").hide(1000,function () {
                $(".result-list").show(1000)
            });
            //var jsonString = JSON.parse(msg);
            var jsonString = msg;
            $(".result-list").show();
            $(".product_center").find("div").remove();
            $.each( jsonString.product_list, function(index, content) {
                var html="<div class='product_list'>\n" +
                            "<div>\n" +
                                "<img src='"+content.product_image+"'>\n" +
                            "</div>\n" +
                            "<div class='product_name'>"+content.product_name+"</div>\n" +
                            "<div class='product_price'><em>"+content.price+"</em>元</div>\n" +
                           "</div>";
                //$(".product_center").append(html);
            });
            $.each( jsonString.productCustoms, function(index, content) {
                var html="<div class='product_list'>\n" +
                    "<div>\n" +
                    "<img src='"+content.productpicture+"'>\n" +
                    "</div>\n" +
                    "<div class='product_name'>"+content.productname+"</div>\n" +
                    "<div class='product_price'><em>"+content.productprice+"</em>元</div>\n" +
                    "</div>";
                $(".product_center").append(html);
            });

            $.each( jsonString.productCNN, function(index, content) {
                var html="<div class='product_list'>\n" +
                    "<div>\n" +
                    "<img src='"+content.productpicture+"'>\n" +
                    "</div>\n" +
                    "<div class='product_name'>"+content.productname+"</div>\n" +
                    "<div class='product_price'><em>"+content.productprice+"</em>元</div>\n" +
                    "</div>";
                $(".product_center").append(html);
            });
        },
        error: function (msg) {
            debugger;
            alert("error");
        }
    });

    /*xhr = new XMLHttpRequest();
    xhr.open("post", "/uploadSearchImage.action", true);
    xhr.setRequestHeader("X-Requested-With", "XMLHttpRequest");

    var fd = new FormData();
    fd.append('mypic', files[0]);
    xhr.send(fd);*/

}