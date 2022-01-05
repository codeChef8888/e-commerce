package my.eCommerce;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import my.eCommerce.repo.CartItemRepository;
import my.eCommerce.model.Product;
import my.eCommerce.model.Customer;
import my.eCommerce.model.CartItem;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ShoppingCartTests {

	@Autowired
	private CartItemRepository cartItemRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testAddOneCartItem() {
		Product product = entityManager.find(Product.class, 1);
		Customer customer = entityManager.find(Customer.class,2);
		CartItem item= new CartItem();
		item.setProduct(product);
		item.setCustomer(customer);
		CartItem savedItem = cartItemRepository.save(item);
		assertTrue(savedItem.getId() > 0);
		
	}	
	
	
}
