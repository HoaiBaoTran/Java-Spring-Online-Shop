package tdtu.edu.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tdtu.edu.com.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByBrand(String brandName);
}
