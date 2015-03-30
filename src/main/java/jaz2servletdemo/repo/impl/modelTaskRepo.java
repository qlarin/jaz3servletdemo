package jaz2servletdemo.repo.impl;

import java.util.List;

import jaz2servletdemo.source.*;
import jaz2servletdemo.repo.*;

public class modelTaskRepo implements IRepo<Task>{

	modelDatabase database;
	
	public modelTaskRepo(modelDatabase database){
		super();
		this.database = database;
	}
	
	public void save(Task unit){
		database.tasks.add(unit);
	}
	
	public void delete(Task unit){
		database.tasks.remove(unit);
	}
	
	public void update(Task unit){
		
	}
	
	public List<Task> getAll(){
		return database.tasks;
	}
	
	public Task get(int id){
		for(Task t: database.tasks){
			if(t.getNumber()==id)
				return t;
		}
		return null;
	}
	
	public Task getUnit(String name){
		for(Task t: database.tasks){
			if(t.getName()==name)
				return t;
		}
		return null;
	}
	
}
