package my.eCommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import my.eCommerce.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Integer>{

	@Modifying(clearAutomatically = true)
	@Query( value = "TRUNCATE TABLE cart_items", 
			  nativeQuery = true)
	public void clearCart();
	
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE cart_items c SET c.customer_mobile = :token ", nativeQuery = true)
	public void updateCart(@Param("token") String token);
	
	
}
