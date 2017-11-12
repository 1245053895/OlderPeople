<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>聊天界面</title>
<script type="text/javascript"  src="jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	var  ws;
	var url="ws://localhost:8080/chatSocket?username=${sessionScope.username}";
	
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
				$("#content").append(result.alert+"<br/>");
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
				$("#content").append(result.date+"   "
						+result.sendMsg+"<br/>");
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
  
<body onload="connect();">

<div>
    <div id="msg" >
        <div>  <h3>欢迎 ${sessionScope.username } 使用本系统！！</h3></div>
        <p id="content" style="width: 400px;height: 380px; border: solid 1px;">
        </p>
    </div>
    <div id="users"
         style="width: 150px;height: 530px;border: solid 1px; position:absolute;left: 412px;top:8px;">
        <ul id="userList">
        </ul>
    </div>
    <div id="send" style="width: 400px;height:80px;border: solid 1px;"
         align="right">
        <textarea style="width: 400px;height: 50px;" id="sendMsg"></textarea>
        <input type="button" value="发送消息" onclick="send();">
    </div>  </div>
</body>
</html>