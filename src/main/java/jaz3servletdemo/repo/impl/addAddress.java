package jaz3servletdemo.repo.impl;

import java.util.List;

import jaz3servletdemo.repo.IRepoArchive;
import jaz3servletdemo.repo.impl.modelRepoArchive;
import jaz3servletdemo.source.UserAddress;

public class addAddress {

	private IRepoArchive database = new modelRepoArchive();
	private int count = 0;
	
	public synchronized void add(UserAddress address){
		UserAddress newAddress = new UserAddress(address.getUsername(), address.getAddressType(), address.getProvince(), address.getCity(), address.getPostcode(), address.getStreet(), address.getHousenr());
		newAddress.setNr(count);
		incCount();
		saveAddress(newAddress);
	}
	
	public synchronized void editAddress(UserAddress address, int id){
		for(UserAddress ua : getAllAddresses()){
			if(ua.getNr()==id){
				int index = getAllAddresses().indexOf(ua);
				removeAddress(ua);
				UserAddress newAddress = new UserAddress(address.getUsername(), address.getAddressType(), address.getProvince(), address.getCity(), address.getPostcode(), address.getStreet(), address.getHousenr());
				newAddress.setNr(id);
				updateAddress(newAddress, index);
			}
		}
	}
	
	public synchronized void saveAddress(UserAddress address){
		database.getUserAddresses().save(address);
	}
	
	public synchronized void updateAddress(UserAddress address, int index){
		database.getUserAddresses().update(address, index);
	}
	
	public synchronized void removeAddress(UserAddress address){
		database.getUserAddresses().delete(address);
	}
	
	public synchronized List<UserAddress> getAllAddresses() {
		return database.getUserAddresses().getAll();
	}
	
	public synchronized UserAddress getAddress(String name){
		return database.getUserAddresses().withName(name);
	}

	public synchronized int getCount() {
		return count;
	}

	public synchronized void incCount(){
		this.count++;
	}
	
}
