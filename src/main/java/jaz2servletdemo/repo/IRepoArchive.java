package jaz2servletdemo.repo;

import jaz2servletdemo.source.*;

public interface IRepoArchive {

	public IUserRepo getUsers();
	public IRepo<Task> getTasks();
	
}
