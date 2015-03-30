package jaz3servletdemo.repo;

import jaz3servletdemo.source.*;

public interface IRepoArchive {

	public IUserRepo getUsers();
	public IUserAddressRepo getUserAddresses();
	public IRepo<Task> getTasks();
	
}
