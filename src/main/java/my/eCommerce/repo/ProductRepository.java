package my.eCommerce.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import my.eCommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query(value ="select * from products",nativeQuery= true)
	public List<Product> getAllProductItem();
	
	public List<Product> findByProductCategoryId(Long id);

}
