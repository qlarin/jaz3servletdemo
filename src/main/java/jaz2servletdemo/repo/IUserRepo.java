package jaz2servletdemo.repo;

import java.util.*;

import jaz2servletdemo.source.*;

public interface IUserRepo extends IRepo<User> {

	public List<User> withTask(Task task);
	public List<User> withTask(String taskName);
	public List<User> withTask(int taskNumber);
	public User withName(String name);
	
}
