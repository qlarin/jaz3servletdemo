package jaz3servletdemo.repo;

import jaz3servletdemo.source.*;

public interface IRepoArchive {

	public IUserRepo getUsers();
	public IRepo<UserAddress> getUserAddresses();
	public IRepo<Task> getTasks();
	
}
