package tdtu.edu.com.service;

import java.util.List;

import tdtu.edu.com.model.CartItem;

public interface ShoppingCartService {
	
	CartItem addCartItem(CartItem cartItem);
	List<CartItem> getAllCartItems();
}
