package tdtu.edu.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdtu.edu.com.model.Brand;
import tdtu.edu.com.repository.BrandRepository;
import tdtu.edu.com.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand addBrand(Brand brand) 
	{
		return brandRepository.save(brand);
	}

	@Override
	public List<Brand> getAllBrands() {
		return brandRepository.findAll();
	}

	@Override
	public Brand getBrandById(int id) {
		return brandRepository.findById(id).get();
	}
	
}
