package tdtu.edu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tdtu.edu.com.model.Category;
import tdtu.edu.com.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public String listCategories(Model model)
	{
		List<Category> categoryList = categoryService.getAllCategories();
		model.addAttribute("categoryList", categoryList);
		return "categories";
	}
	
	@GetMapping("/categories/new")
	public String showCategoryNewForm(Model model)
	{
		model.addAttribute("category", new Category());
		
		return "category_form";
	}
	
	@PostMapping("/categories/new")
	public String addNewCategory(@ModelAttribute("category")Category category)
	{
		categoryService.addCategory(category);
		return "redirect:/categories";
	}
}
