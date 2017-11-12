package com.xh.chat.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.xh.chat.vo.ContentVO;
import com.xh.chat.vo.Message;
import com.google.gson.Gson;


@ServerEndpoint("/chatSocket")
public class ChatSocket {

	
	private  static  List<Session>  sessions=new ArrayList<Session>();
	private  static  Map<String, Session>  Map=new HashMap<String, Session>();
	
	private  static  List<String>   names=new ArrayList<String>();
	private  Session  session;
	private String username;
	private Gson  gson=new Gson();
	
	@OnOpen
	public  void open(Session  session){
			String str = session.getQueryString();//可以得到ws：//路径？后面的所有字符串  
	        username = str.split("=")[1];  
	        try {  
	            username = URLDecoder.decode(username, "utf-8");  
	        } catch (UnsupportedEncodingException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
			
			this.names.add(this.username);
			this.sessions.add(session);
			Map.put(this.username,session);
			
			Message   message=new Message();
			message.setAlert(this.username+"进入聊天室！！");
			message.setNames(names);
			
			this.broadcast(this.sessions, message.toJson() );
			
	}
	//private static Gson  gson=new Gson();
	@OnMessage
	public  void receive(Session  session,String json){
		ContentVO vo=gson.fromJson(json,ContentVO.class);
		if(vo.getType()==2){
			//广播
			Message  message=new Message();
			message.setSendMsg(vo.getMsg(),username);
			message.setFrom(this.username);
			message.setDate(new Date().toLocaleString());
			this.broadcast(this.sessions, message.toJson() );
		}
		else{
			//私聊
			String to = vo.getToUser();
			Session to_Session=Map.get(to); 
	         Session from_Session = Map.get(username);  
			Message  message=new Message();
			message.setSendMsg(vo.getMsg(),vo.getFromUser(),to);
			message.setFrom(this.username);
			System.out.println(message.toJson());
			message.setDate(new Date().toLocaleString());
			try {
				to_Session.getBasicRemote().sendText(message.toJson());  
	            from_Session.getBasicRemote().sendText(message.toJson());  
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		
	
	}
	
	@OnClose
	public  void close(Session session){
		this.sessions.remove(session);
		this.names.remove(this.username);
		
		Message   message=new Message();
		message.setAlert(this.username+"退出聊天室！！");
		message.setNames(names);
		Map.remove(this.username);
		this.broadcast(this.sessions, message.toJson() );
	}
	
	public void broadcast(List<Session>  ss,String msg){
		
		for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
			Session session = (Session) iterator.next();
			try {
				session.getBasicRemote().sendText(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
