<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<style type="text/css">
    #userList {list-style:none}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>联系客服</title>
<script type="text/javascript"  src="jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	var  ws;
	//此处改为服务器ip
	var url="ws://127.0.0.1:8080/chatSocket?username=${sessionScope.username}";
	
	function connect(){
		 if ('WebSocket' in window) {
             ws = new WebSocket(url);
         } else if ('MozWebSocket' in window) {
             ws = new MozWebSocket(url);
         } else {
             alert('WebSocket is not supported by this browser.');
             return;
         }
		 ws.onmessage=function(event){
			eval("var result="+event.data);

			if(result.alert!=undefined){
				$("#content").append("<p style=\"color: rgba(209,6,7,0.96);font-size: small;\">"+result.alert+"</p>");
			}

			if(result.names!=undefined){
				//$("#userList").html("<b>在线人员</b><br/>");
				//$(result.names).each(function(){
				//	$("#userList").append("<input type='checkbox' value='"+this+"' />"+this+"<br/>");
				//});
				
				 var html = "<h3>在线人员</h3>";  
                $(result.names).each(function() {  
                 html += "<li><input type='radio' value='"+this+"'name='username'>"+this+"</li>";   
                    $("#userList").html(html);  
                }); 
			}
			
			if(result.from!=undefined){
				$("#content").append( "<b style=\"color: rgba(209,6,7,0.96);font-size: large;background: rgba(242,35,255,0.2)\">"
                    +result.date+"   "+"<b style=\"color: rgba(3,8,3,0.95)\">"+result.sendMsg+"</b>"+"</p>");
			}

		 };
	}//
	
	function send() {  
        var msg = $("#sendMsg").val();  
        var ss = $("input[name='username']:checked").val();  
        //alert($("input[name='username']:checked").val());
        //alert(ss);
        console.info(ss);  
        var obj=null;  
        //单聊  
        if(ss!=undefined){  
            obj = {  
            //type是用来区分是单聊和群聊  
                type:1,//1为单聊，2为群聊  
                toUser:ss,  
                fromUser:"${username}",  
                msg:msg  
            };  
        }else{  
            //群聊  
            obj = {  
                type:2,//1为单聊，2为群聊  
                msg:msg  
            };  
        }  
        obj = JSON.stringify(obj);  
        console.info(obj);  
        ws.send(obj);   
        $("#sendMsg").val("");  
    }  
</script>

    <style type="text/css">
        #content{
            overflow: scroll;
        }
        #users{
            overflow: scroll;
        }
        </style>

</head>  
  
<body onload="connect();" >

<div>
    <div id="msg" >
        <div >  <h3>欢迎 ${sessionScope.username } 使用本系统！！</h3></div>
        <p id="content" style="width: 565px;height: 380px;margin-top: 40px;margin-left: 490px;border-top:1px solid #EFEFEF;border-right:1px solid #EFEFEF;border-radius:3px;background-color: #EFEFEF;overflow-x: hidden;overflow-y: scroll">
        </p>
    </div>
    <div id="users"
         style="width: 200px;height: 520px;border:1px solid #2e3238;border-radius:3px;position: absolute;float: left;left: 412px;top: 40px;margin-left: -115px;background-color: #2e3238;overflow-x: hidden;overflow-y: hidden">
        <div style="font-size: 18px;color:#f9f8e2;margin-top: 20px;margin-left: 20px;">欢迎&nbsp;&nbsp;&nbsp; ${sessionScope.username }* * *</div>
        <ul id="userList" >
        </ul>
    </div>
    <div id="send" style="width: 565px;height: 139px;margin-left: 490px;border-right:1px solid #ffffff;border-bottom:1px solid #ffffff;border-radius:3px;margin-top: -17px;background-color: white" align="right">
        <textarea style="width:559px;height: 110px;background-color: white;border-color: transparent" id="sendMsg"></textarea>
        <input type="button" value="发送消息" onclick="send();" style="width: 80px;">
    </div>  </div>

</body>
</html>