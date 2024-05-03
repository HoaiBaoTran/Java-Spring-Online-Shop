package tdtu.edu.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import tdtu.edu.com.model.Customer;
import tdtu.edu.com.service.impl.CustomCustomerDetails;

public class CustomCustomerDetailsService implements UserDetailsService {
	
	@Autowired
	private CustomerService customerService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Customer customer = customerService.getCustomerByEmail(email);
		if(customer == null)
		{
			throw new UsernameNotFoundException("Customer not found");
		}
		return new CustomCustomerDetails(customer);
	}

}
