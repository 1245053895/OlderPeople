package com.xh.chat.vo;


	public class ContentVO {
	
		 private int type;  
		    private String toUser;  
		    private String msg;  
		    private String fromUser;  
		      
		    public String getFromUser() {  
		        return fromUser;  
		    }  
		    public void setFromUser(String fromUser) {  
		        this.fromUser = fromUser;  
		    }  
		    public int getType() {  
		        return type;  
		    }  
		    public void setType(int type) {  
		        this.type = type;  
		    }  
		    public String getToUser() {  
		        return toUser;  
		    }  
		    public void setToUser(String toUser) {  
		        this.toUser = toUser;  
		    }  
		    public String getMsg() {  
		        return msg;  
		    }  
		    public void setMsg(String msg) {  
		        this.msg = msg;  
		    }  
		    @Override  
		    public String toString() {  
		        return "vo [type=" + type + ", toUser=" + toUser + ", msg=" + msg  
		                + ", fromUser=" + fromUser + "]";  
		    }  
		}  
