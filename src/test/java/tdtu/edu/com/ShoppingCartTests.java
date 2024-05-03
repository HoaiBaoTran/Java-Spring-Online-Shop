package tdtu.edu.com;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import tdtu.edu.com.model.CartItem;
import tdtu.edu.com.model.Customer;
import tdtu.edu.com.model.Product;
import tdtu.edu.com.repository.ShoppingCartRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ShoppingCartTests {

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
//	@Test
//	public void testAddOneCartItem()
//	{
//		Product product = entityManager.find(Product.class, 3);
//		Customer customer = entityManager.find(Customer.class, 2);
//		
//		CartItem cartItem = new CartItem();
//		cartItem.setProduct(product);
//		cartItem.setQuantity(1);
//		cartItem.setCustomer(customer);
//	
//		
//		CartItem savedCartItem = shoppingCartRepository.save(cartItem);
//		assert(savedCartItem.getId() > 0);
//	}
	
//	@Test
//	public void deleteAllCartItem()
//	{
//		shoppingCartRepository.deleteAll();
//		assert(shoppingCartRepository.findAll().size() == 0);
//	}
	
//	@Test
//	public void deleteCartItemById()
//	{
//		shoppingCartRepository.deleteById(14);
//		assert(shoppingCartRepository.findAll().size() == 2);
//	}
	

}
