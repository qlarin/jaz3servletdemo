package jaz3servletdemo.repo.impl;

public class Promote {

	public static synchronized void change(String username){
		if(Register.getRegistered(username).getTask().equals("Common User")){
			Register.getRegistered(username).setTask("Premium User");
		}else{
			Register.getRegistered(username).setTask("Common User");
		}
	}
	
	public static synchronized void makeAdmin(String username){
		Register.getRegistered(username).setTask("Admin");
	}
			
}

