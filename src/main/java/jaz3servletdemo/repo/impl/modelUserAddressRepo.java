package jaz3servletdemo.repo.impl;


import java.util.List;

import jaz3servletdemo.source.*;
import jaz3servletdemo.repo.*;

public class modelUserAddressRepo implements IUserAddressRepo {

	private modelDatabase database;
	
	public modelUserAddressRepo(modelDatabase database){
		super();
		this.database = database;
	}
	
	public void save(UserAddress unit){
		database.addresses.add(unit);	
	}
	
	public void delete(UserAddress unit){
		database.addresses.remove(unit);
	}
	
	public void update(UserAddress unit, int id){
		database.addresses.add(id, unit);
	}
	
	public List<UserAddress> getAll(){
		return database.addresses;
	}

	public UserAddress get(int id){
		for(UserAddress ua: database.addresses){
			if(ua.getNumber()==id)
				return ua;
		}
		return null;
	}
	
	public UserAddress getUnit(String name){
		for(UserAddress ua: database.addresses){
			if(ua.getUsername()==name)
				return ua;
		}
		return null;
	}

	public UserAddress withName(String name) {
		for(UserAddress ua: database.addresses){
			if(ua.getUsername().equals(name))
				return ua;
		}
		return null;
	}
	
}
