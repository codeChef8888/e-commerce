package my.eCommerce.service;

import java.util.List;
import java.util.Optional;


import my.eCommerce.dto.ProductCategoryDto;

public interface ProductCategoryService {

	public Object getAllCategories();

	public List<ProductCategoryDto> getAll();

	public Optional<ProductCategoryDto> getCategory(Long id);

	public void addCategory(ProductCategoryDto productCategoryDto);

	public void deleteCategory(Long id);

//	public void updateCategory(ProductCategoryDto productCategoryDto);
}
