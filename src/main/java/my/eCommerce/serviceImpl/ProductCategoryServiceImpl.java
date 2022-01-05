package my.eCommerce.serviceImpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;


import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.eCommerce.controller.mapper.ProductCategoryMapper;
import my.eCommerce.dto.ProductCategoryDto;
import my.eCommerce.model.ProductCategory;
import my.eCommerce.repo.ProductCategoryRepository;
import my.eCommerce.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Inject
	ProductCategoryMapper categoryMapper;

	public Object getAllCategories() {
		List<ProductCategory> categories = new ArrayList<>();
		productCategoryRepository.findAll().forEach(categories::add);
//		return categories;
		return categoryMapper.productCategoryListToDto(categories);

	}

	public Optional<ProductCategoryDto> getCategory(Long id) {
		Optional<ProductCategory> categoryOptional = productCategoryRepository.findById(id);
		ProductCategory category = null;
		if (categoryOptional.isPresent()) {
			category = categoryOptional.get();
		} else {
			throw new RuntimeException("Product Category doesn't exist for:" + id);
		}
		return categoryMapper.toCategoryOptional(category);
	}

	public void addCategory(ProductCategoryDto productCategoryDto) {

		productCategoryRepository.save(categoryMapper.DtoToProductCategory(productCategoryDto));
	}

	public void deleteCategory(Long id) {
		this.productCategoryRepository.deleteById(id);
	}

	@Override
	public List<ProductCategoryDto> getAll() {
		List<ProductCategory> categories = new ArrayList<>();
		productCategoryRepository.findAll().forEach(categories::add);
		return categoryMapper.productCategoryListToDto(categories);
	}

//	public void updateCategory(ProductCategoryDto productCategoryDto) {
//
//		productCategoryRepository.save(categoryMapper.DtoToProductCategory(productCategoryDto));
//	}
}
