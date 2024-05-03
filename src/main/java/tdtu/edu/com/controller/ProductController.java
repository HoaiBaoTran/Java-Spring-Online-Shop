package tdtu.edu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tdtu.edu.com.model.Category;
import tdtu.edu.com.model.Product;
import tdtu.edu.com.service.CategoryService;
import tdtu.edu.com.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired	
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/products/new")
	public String showNewProductForm(Model model)
	{
		List<Category> categoryList = categoryService.getAllCategories();
		model.addAttribute("product", new Product());
		model.addAttribute("categoryList", categoryList);
		return "product_form";
	}
	
	@PostMapping("/products/new")
	public String addNewProduct(@ModelAttribute("product")Product product)
	{
		productService.addProduct(product);
		return "redirect:/products";
	}

	@GetMapping("/products")
	public String listProducts(Model model)
	{
		List<Product> productList = productService.getAllProducts();
		model.addAttribute("productList", productList);
		return "products";
	}
	
	@GetMapping("/products/edit/{id}")
	public String showEditProductForm(@PathVariable int id, Model model)
	{
		Product product = productService.getProductById(id);
		List<Category> categoryList = categoryService.getAllCategories();

		model.addAttribute("categoryList", categoryList);
		model.addAttribute("product", product);
		return "product_form";
	}
	
	@GetMapping("/products/delete/{id}")
	public String deleteProduct(@PathVariable int id, Model model)
	{
		productService.deleteProductById(id);
		return "redirect:/products";
	}
}
