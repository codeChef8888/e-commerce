package my.eCommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.eCommerce.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	public ProductCategory findByCategoryName(String name);
}
