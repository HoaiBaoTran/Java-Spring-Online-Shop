package tdtu.edu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tdtu.edu.com.service.ShoppingCartService;
import tdtu.edu.com.model.CartItem;
@Controller
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	
	@GetMapping("/cart")
	public String showShoppingCart(Model model)
	{
		List<CartItem> cartItemList = shoppingCartService.getAllCartItems();
		model.addAttribute("cartItemList", cartItemList);
		
		return "shopping_cart";
	}
	
	
}
