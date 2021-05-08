package dataAccess.absracts;

import entities.concretes.Customer;

public interface CustomerDao {
	void singUp(Customer customer);
	void singIn(Customer customer);

}
