package tdtu.edu.com.service;

import java.util.List;

import tdtu.edu.com.model.Brand;

public interface BrandService {
	List<Brand> getAllBrands();
	Brand addBrand(Brand brand);
	Brand getBrandById(int id);
}
