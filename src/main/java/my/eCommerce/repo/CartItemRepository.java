package my.eCommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import my.eCommerce.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Integer>{

}
