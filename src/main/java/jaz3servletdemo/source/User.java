package jaz3servletdemo.source;

public class User extends Unit {

	private String username;
	private String password;
	private String email;
	private String task = "Common User";
	private Boolean state = false;
	
	public User(String username, String password, String email){
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		this.setTask(task);
		this.setState(state);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Boolean getState(){
		return state;
	}
	
	public void setState(Boolean state){
		this.state = state;
	}
	
}
