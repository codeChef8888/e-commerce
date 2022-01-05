package my.eCommerce.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import my.eCommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findByProductCategoryId(Long id);

}
