package tdtu.edu.com.service;

import java.util.List;

import tdtu.edu.com.model.Category;

public interface CategoryService {
	
	List<Category> getAllCategories();
	Category addCategory(Category category);
	
}
