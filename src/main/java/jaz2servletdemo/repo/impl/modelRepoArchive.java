package jaz2servletdemo.repo.impl;

import jaz2servletdemo.source.*;
import jaz2servletdemo.repo.*;

public class modelRepoArchive implements IRepoArchive{

	private modelDatabase database = new modelDatabase();
	
	public IUserRepo getUsers(){
		return new modelUserRepo(database);
	}
	
	public IRepo<Task> getTasks(){
		return new modelTaskRepo(database);
	}
}
