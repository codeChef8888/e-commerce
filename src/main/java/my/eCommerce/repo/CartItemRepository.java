package my.eCommerce.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import my.eCommerce.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Integer>{
	
	public Optional<CartItem> findByProductId(Long id); 

	@Query(value = "select  distinct c.id, c.product_id,c.customer_id,c.quantity,c.customer_mobile from cart_items c "
			+ " inner join products p on c.product_id=p.id where p.status=0" , nativeQuery = true)
	public List<CartItem> getAllCartItems();
	
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE cart_items c INNER JOIN products p ON c.product_id=p.id SET p.status=0 WHERE p.id= :id", nativeQuery = true)
	public void updateAvailablityStatus(@Param("id") Long id);
	
	@Modifying(clearAutomatically = true)
	@Query( value = "TRUNCATE TABLE cart_items", 
			  nativeQuery = true)
	public void clearCart();
	
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE cart_items c INNER JOIN products p ON c.product_id=p.id SET c.customer_mobile = :token, p.status = 1 ", nativeQuery = true)
	public void updateCart(@Param("token") String token);
	
	
}
