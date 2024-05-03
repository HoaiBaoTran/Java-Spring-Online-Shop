package tdtu.edu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tdtu.edu.com.model.Brand;
import tdtu.edu.com.model.Product;
import tdtu.edu.com.service.BrandService;
import tdtu.edu.com.service.CategoryService;
import tdtu.edu.com.service.ProductService;

@Controller
public class AppController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	BrandService brandService;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/admin")
	public String viewHomePage()
	{
		return "admin";
	}
	
	@GetMapping("/shop")
	public String viewShop(Model model)
	{
		List<Product> productList = productService.getAllProducts();
		model.addAttribute("productList", productList);
		
		List<Brand> brandList = brandService.getAllBrands();
		model.addAttribute("brandList", brandList);
		
		return "shop";
	}
	
	@GetMapping("/shop/{brandName}")
	public String viewShopByBrand(@PathVariable String brandName ,Model model)
	{
		List<Product> productList = productService.getProductByBrand(brandName);
		model.addAttribute("productList", productList);
		
		List<Brand> brandList = brandService.getAllBrands();
		model.addAttribute("brandList", brandList);
		
		return "shop";
	}
	
	@GetMapping("/checkout")
	public String checkOut()
	{
		return "checkout";
	}
}
