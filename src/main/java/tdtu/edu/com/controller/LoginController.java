package tdtu.edu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tdtu.edu.com.model.Customer;
import tdtu.edu.com.service.CustomerService;

@Controller
public class LoginController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/login")
	public String showLoginPage()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegisterPage(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "register";
	}
	
	@PostMapping("/process_register")
	public String processRegister(@ModelAttribute("customer") Customer customer)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(customer.getPassword());
		customer.setPassword(encodedPassword);
		
		customerService.addCustomer(customer);
		
		return "register_success";
	}
	
	@GetMapping("list_customers")
	public String viewCustomersList(Model model)
	{
		List<Customer> customerList = customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);
		
		return "customers";
	}
}
