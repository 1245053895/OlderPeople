package com.xh.chat.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class Message {

	private  String  alert;   //
	
	private  List<String>  names;
	
	private  String  sendMsg;
	
	private String  from;
	
	private String  date;
	 public void setSendMsg(String msg,String username) {  
//	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//	        Date date = new Date();  
//	        date.getTime();  
//	        String dateStr = sdf.format(date);  
//	        String content = dateStr+" "+username+"说："+"<br>"+msg;
		 	String content = username+"说："+"<br>"+"&nbsp;"+msg;
	        this.sendMsg = content;  
	    }  
	
	 public void setSendMsg(String msg, String username, String toUsername) {  
//	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//	        Date date = new Date();  
//	        date.getTime();  
//	        String dateStr = sdf.format(date);  
//	        String content = dateStr+" "+username+"对"+toUsername+"说："+"<br>"+msg;  
	        String content = username+"对"+toUsername+"说："+"<br>"+"&nbsp;"+msg;
	        this.sendMsg = content;  
	    } 
	
	
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toJson() {
		return gson.toJson(this);
		
	}
	
	public static  Gson  gson=new Gson();
	
}
