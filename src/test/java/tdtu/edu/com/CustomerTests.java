package tdtu.edu.com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import tdtu.edu.com.model.Customer;
import tdtu.edu.com.repository.CustomerRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CustomerTests {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testPasswordEncoder()
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String password1 = "hoaibao";
		String encodedPassword1 = encoder.encode(password1);
		
		String password2 = "luffy";
		String encodedPassword2 = encoder.encode(password2);
		
		String password3 = "zoro";
		String encodedPassword3 = encoder.encode(password3);
		
		String password4 = "thisisalex";
		String encodedPassword4 = encoder.encode(password4);
		
		System.out.println(encodedPassword1);
		System.out.println(encodedPassword2);
		System.out.println(encodedPassword3);
		System.out.println(encodedPassword4);
	}
	
//	@Test
//	public void testAddCustomer()
//	{
//		Customer customer = new Customer("admin", "admin", "admin@gmail.com", "admin");
//		Customer customer1 = new Customer("Hoai Bao", "Tran", "hoaibao@gmail.com", "hoaibao");
//		customerRepository.save(customer1);
//		
//	}
	
//	@Test
//	public void testDeleteCustomer()
//	{
//		customerRepository.deleteAll();
//	}
	
//	@Test
//	public void updateCustomer()
//	{
//		Customer existingCustomer = customerRepository.findById(1).get();
//		existingCustomer.setFirstName("admin");
//		existingCustomer.setLastName("admin");
//		customerRepository.save(existingCustomer);
		
//		Customer existingCustomer2 = customerRepository.findById(2).get();
//		existingCustomer2.setFirstName("Hoai Bao");
//		existingCustomer2.setLastName("Tran");
//		customerRepository.save(existingCustomer2);
		
//		Customer existingCustomer3 = customerRepository.findById(3).get();
//		existingCustomer3.setEmail("luffy@gmail.com");
//		existingCustomer3.setFirstName("Luffy");
//		existingCustomer3.setLastName("Moneky");
//		existingCustomer3.setPassword("luffy");
//		customerRepository.save(existingCustomer3);
		
//		Customer existingCustomer4 = customerRepository.findById(4).get();
//		existingCustomer4.setEmail("zoro@gmail.com");
//		existingCustomer4.setFirstName("Zoro");
//		existingCustomer4.setLastName("Roronoa");
//		existingCustomer4.setPassword("zoro");
//		customerRepository.save(existingCustomer4);
//	}
	
//	@Test
//	public void testFindCustomerByEmail()
//	{
//		String email = "alexander@gmail.com";
//		Customer customer = customerRepository.findByEmail(email);
//		assert(customer.getId() == 5);
//	}
}
