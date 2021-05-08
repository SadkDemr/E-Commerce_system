package business.absracts;

import java.util.List;
import java.util.function.Consumer;

import entities.concretes.Customer;

public interface CustomerService {
	void checkCustomer(Customer customer);
	void checkCustomerSinngIn(Customer customer);
	void checkCustomerEmail(Customer customer, Customer customer2);
	
	List<Consumer>getAll();

}
