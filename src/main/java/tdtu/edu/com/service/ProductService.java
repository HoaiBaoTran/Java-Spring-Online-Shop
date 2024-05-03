package tdtu.edu.com.service;

import java.util.List;

import tdtu.edu.com.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getProductByBrand(String brandName);
	Product addProduct(Product product);
	Product getProductById(int id);
	void deleteProductById(int id);
}
