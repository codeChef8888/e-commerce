package my.eCommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import my.eCommerce.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Integer>{

	@Modifying
	@Query( value = "TRUNCATE TABLE cart_items", 
			  nativeQuery = true)
	public void clearCart();
}
