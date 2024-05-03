package tdtu.edu.com.service;

import java.util.List;

import tdtu.edu.com.model.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();
	Customer getCustomerById(int id);
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer getCustomerByEmail(String email);
	void deleteCustomerById(int id);
}
