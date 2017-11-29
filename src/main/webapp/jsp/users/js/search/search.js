var flag=false,clik=true,start_x,start_y;
$(document).ready(function(){
    var flag=false;
    $(".bg").click(function (e) {
        $(this).hide();
        $(".search-wrapper").css({"top":"85%","left":"90%"});
        $(this).next().removeClass('active');
        $(".upload_image").hide();
        $(".result-list").hide();
        e.preventDefault();  //通知浏览器不要执行与事件关联的默认动作。
    });

    $(".search-wrapper").mousedown(function (e1) {
        start_x=e1.clientX;
        start_y=e1.clientY;
        flag=true;
    });
    $(document).mouseup(function (e2) {
        flag=false;
    });
    $(".search-wrapper").mouseup(function (e2) {
        if(Math.abs(e2.clientX-start_x)<10&&Math.abs(e2.clientY-start_y)<10){
            clik=true;
        }else {
            clik=false;
        }

    });
    $(document).mousemove(function(e){
        if(flag&&!$('.search-wrapper').hasClass('active')){
            if(e.clientY<30){
                $(".search-wrapper").css({"top":30+'px',"left":e.clientX+'px'});
            }else if(e.clientX<30){
                $(".search-wrapper").css({"top":e.clientY+'px',"left":30+'px'});
            }else if(e.clientY>$(window).height()-30){
                $(".search-wrapper").css({"top":($(window).height())-30+'px',"left":e.clientX+'px'});
            }else if(e.clientX>$(window).width()-30){
                $(".search-wrapper").css({"top":e.clientY+'px',"left":($(window).width()-30)+'px'});
            }else{
                $(".search-wrapper").css({"top":e.clientY+'px',"left":e.clientX+'px'});
            }
            clik=false;
        }
    });

    $("input[name='input_text']").bind('input propertychange', function() {
        console.log($(this).val());
        var data=$(this).val();
        var fd = new FormData();
        fd.append("data",data);
        $.ajax({
            type: "POST",
            contentType:false, //必须false才会避开jQuery对 formdata 的默认处理 , XMLHttpRequest会对 formdata 进行正确的处理
            processData: false, //必须false才会自动加上正确的Content-Type
            url: "/uploadSearchImage.action",
            timeout: 15000,
            data: fd,
            success: function (msg) {
                $(".product_center").find("div").remove();
                $(".result-list").hide(10,function () {
                    $(".result-list").show(10);
                    //$(".upload_image").hide();
                });
                var jsonString = msg;
                $.each( jsonString.productCustoms, function(index, content) {
                    var html="<a target='_blank' href='/xiangqing.action?productid="+content.productid+"'><div class='product_list'>\n" +
                        "<div>\n" +
                        "<img src='/"+content.productpicture+"'>\n" +
                        "</div>\n" +
                        "<div class='product_name'>"+content.productname+"</div>\n" +
                        "<div class='product_price'><em>"+content.productprice+"</em>元</div>\n" +
                        "</div></a>";
                    $(".product_center").append(html);
                });
            },
            error: function (msg) {

            },
            beforeSend:function () {

            }
        });
    });

});

function searchToggle(obj, evt){
    var container = $(obj).closest('.search-wrapper');

    if(!container.hasClass('active')&&clik){  //打开 hasClass 指示当前jQuery对象所匹配的元素是否含有指定的css类名
        container.addClass('active');
        evt.preventDefault();  //通知浏览器不要执行与事件关联的默认动作。
        $(obj).parents(".search_my").find(".bg").show();
        $(".search-wrapper").css({"top":"15%","left":"50%"});
        /*$(".upload_image").show();*/
        $(".result-container").show();
        //$(".result-list").show(); //注意!!要注释掉
        //closest() 方法获得匹配选择器的第一个祖先元素，从当前元素开始沿 DOM 树向上。 length 属性包含 jQuery 对象中元素的数目。
    } else if(container.hasClass('active') && $(obj).closest('.input-holder').length == 0){ //关闭
        container.removeClass('active');
        $(obj).parents(".search_my").find(".bg").hide();
        $(".search-wrapper").css({"top":"85%","left":"90%"});
        $(".upload_image").hide();
        $(".result-container").hide();
        $(".result-list").hide();
        $(".upload_image").hide();
        //将上次输入的内容置为空
        //container.find('.search-input').val('');
        // 当我们按下时，清除和隐藏结果容器
        //container.find('.result-container').fadeOut(100, function(){$(this).empty();});
    }else if(container.hasClass('active')){  //打开搜索状态,点击搜索按钮
        submitFn(obj, evt);
    }
}

function submitFn(obj, evt){
    value = $(obj).parents('.search-wrapper').find('.search-input').val().trim();

    _html = "您搜索的关键词： ";
    if(!value.length){
        _html = "关键词不能为空。";
    }
    else{
        _html += "<b>" + value + "</b>";
    }

    $(obj).parents('.search-wrapper').find('.result-container').html('<span>' + _html + '</span>');
    $(obj).parents('.search-wrapper').find('.result-container').fadeIn(100);

    evt.preventDefault();
}