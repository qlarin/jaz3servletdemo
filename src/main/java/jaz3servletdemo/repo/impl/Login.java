package jaz3servletdemo.repo.impl;

public class Login {

	public static synchronized void logInUser(String username, String password){
		Register.getRegistered(username).setState(true);
	}
	
	public static synchronized boolean checkPassword(String username, String password) throws Exception{
		if(Register.getRegistered(username).getPassword().equals(password) && Register.getRegistered(username).getPassword().hashCode() == password.hashCode()){
			return true;
		}
		throw new Exception();
	}
	
	public static synchronized boolean checkLoged(String username) throws Exception{
		if(Register.getRegistered(username).getState()){
			return true;
		}
		throw new Exception();
	}
}
