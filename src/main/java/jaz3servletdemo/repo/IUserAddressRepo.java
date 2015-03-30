package jaz3servletdemo.repo;

import jaz3servletdemo.source.UserAddress;

public interface IUserAddressRepo extends IRepo<UserAddress> {

	public UserAddress withName(String name);
	
}
