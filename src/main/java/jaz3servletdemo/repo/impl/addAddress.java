package jaz3servletdemo.repo.impl;

import java.util.List;

import jaz3servletdemo.repo.IRepoArchive;
import jaz3servletdemo.repo.impl.modelRepoArchive;
import jaz3servletdemo.source.UserAddress;

public class addAddress {

	private IRepoArchive database = new modelRepoArchive();

	public void add(UserAddress address){
		UserAddress newAddress = new UserAddress(address.getUsername(), address.getAddressType(), address.getProvince(), address.getCity(), address.getPostcode(), address.getStreet(), address.getHousenr());
		database.getUserAddresses().save(newAddress);
	}
	
	public List<UserAddress> getAllAddresses(){
		return database.getUserAddresses().getAll();
	}
	
}
