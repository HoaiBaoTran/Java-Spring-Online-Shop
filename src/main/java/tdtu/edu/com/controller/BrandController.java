package tdtu.edu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tdtu.edu.com.model.Brand;
import tdtu.edu.com.model.Category;
import tdtu.edu.com.service.BrandService;
import tdtu.edu.com.service.CategoryService;

@Controller
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/brands/new")
	public String showNewBrandForm(Model model)
	{
		List<Category> categoryList = categoryService.getAllCategories();
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("brand", new Brand());
		return "brand_form";
	}
	
	@PostMapping("/brands/new")
	public String addNewBrand(@ModelAttribute("brand")Brand brand)
	{
		brandService.addBrand(brand);
		return "redirect:/brands";
	}
	
	@GetMapping("/brands")
	public String listBrands(Model model)
	{
		List<Brand> brandList = brandService.getAllBrands();
		model.addAttribute("brandList", brandList);
		return "brands";
	}
	
	@GetMapping("/brands/edit/{id}")
	public String showEditBrandForm(@PathVariable int id, Model model)
	{
		Brand brand = brandService.getBrandById(id);
		List<Category> categoryList = categoryService.getAllCategories();

		model.addAttribute("categoryList", categoryList);
		model.addAttribute("brand", brand);
		return "brand_form";
	}
}
