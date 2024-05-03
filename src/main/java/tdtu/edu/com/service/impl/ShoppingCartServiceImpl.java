package tdtu.edu.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdtu.edu.com.model.CartItem;
import tdtu.edu.com.repository.ShoppingCartRepository;
import tdtu.edu.com.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	@Override
	public CartItem addCartItem(CartItem cartItem) {
		return shoppingCartRepository.save(cartItem); 
	}

	@Override
	public List<CartItem> getAllCartItems() {
		return shoppingCartRepository.findAll();
	}

}
