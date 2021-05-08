package business.concretes;

import java.util.List;
import java.util.function.Consumer;

import business.absracts.CustomerService;
import dataAccess.absracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	
	}

	@Override
	public void checkCustomer(Customer customer) {
		if(!customer.getEmail().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,6}$")	
				&& customer.getName().length()>=2
				&& customer.getLastName().length()>=2
				&& customer.getPassword().length()>=6
				&& customer.getEmail()!=""
				&& customer.getPassword()!=""
				){
					
			System.out.println("Kayit bilgileri dogrulandi. Linke tiklayiniz:"+customer.getEmail());
		}
		else {
			System.out.println("Kayit bilgileri hatali"+customer.getEmail());
			return;
		}
		this.customerDao.singUp(customer);
		
		
	}

	@Override
	public List<Consumer> getAll() {
		
		return null;
	}

	@Override
	public void checkCustomerSinngIn(Customer customer) {
		if(customer.getEmail()=="demirsadik1905@gmail.com"
				&&customer.getPassword()=="253253")
		this.customerDao.singIn(customer);
		else{
			System.out.println("Bu gmail daha once kullanilmiþtir.");
		}
		
	}

	@Override
	public void checkCustomerEmail(Customer customer, Customer customer2) {
		if(customer.getEmail()==customer2.getEmail()) {
			System.out.println("Bu E-posta daha önce kullanýlmýþ.");
		}
		
	}

	
	

}
