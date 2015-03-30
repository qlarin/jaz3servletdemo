package jaz3servletdemo.repo.impl;

import java.util.List;

import jaz3servletdemo.repo.IRepoArchive;
import jaz3servletdemo.repo.impl.modelRepoArchive;
import jaz3servletdemo.source.User;


public class Register {

	private static IRepoArchive archive = new modelRepoArchive();
	
	public static synchronized void registerUser(String username, String password, String email){
		User login = new User(username, password, email);
		archive.getUsers().save(login);
	}

	public static synchronized List<User> getAllRegistered() {
	 return archive.getUsers().getAll();
	}	
	
	public static synchronized User getRegistered(String name){
		return archive.getUsers().withName(name);
	}
	
	public static synchronized Boolean checkRegistered(String name) throws Exception{
		if(getRegistered(name).getUsername().equals(name)){
			return true;
		}
		throw new Exception();
	}
}
