package dataAccess.concretes;

import dataAccess.absracts.CustomerDao;
import entities.concretes.Customer;

public class FacebookDao implements CustomerDao {

	@Override
	public void singUp(Customer customer) {
		System.out.println("Fabook hesabi ile kayit oldunuz:"+customer.getEmail());
		
	}

	@Override
	public void singIn(Customer customer) {
		System.out.println("Facebook hesabi ile giris yaptiniz:"+customer.getEmail());
		
	}

}
