package dataAccess.concretes;

import dataAccess.absracts.CustomerDao;
import entities.concretes.Customer;

public class GoogleDao implements CustomerDao{

	@Override
	public void singUp(Customer customer) {
		System.out.println("Google hesabi ile kayit oldunuz:"+customer.getEmail());
		
	}

	@Override
	public void singIn(Customer customer) {
		System.out.println("Google hesabi ile giris yaptiniz:"+customer.getEmail());
		
	}


	

}
