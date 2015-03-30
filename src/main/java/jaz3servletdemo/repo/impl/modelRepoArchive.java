package jaz3servletdemo.repo.impl;

import jaz3servletdemo.source.*;
import jaz3servletdemo.repo.*;

public class modelRepoArchive implements IRepoArchive{

	private modelDatabase database = new modelDatabase();
	
	public IUserRepo getUsers(){
		return new modelUserRepo(database);
	}
	
	public IRepo<UserAddress> getUserAddresses(){
		return new modelUserAddressRepo(database);
	}
	
	public IRepo<Task> getTasks(){
		return new modelTaskRepo(database);
	}
}
