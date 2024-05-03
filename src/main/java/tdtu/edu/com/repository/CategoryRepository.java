package tdtu.edu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tdtu.edu.com.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
