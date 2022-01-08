package my.eCommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.eCommerce.controller.mapper.CartItemMapper;
import my.eCommerce.controller.mapper.ProductMapper;
import my.eCommerce.dto.ProductDto;
import my.eCommerce.model.CartItem;
import my.eCommerce.model.Product;
import my.eCommerce.repo.CartItemRepository;
import my.eCommerce.repo.ProductRepository;
import my.eCommerce.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	CartItemRepository cartItemRepository;

	@Autowired
	ProductRepository productRepository;

	@Inject
	CartItemMapper itemMapper;

	@Inject
	ProductMapper productMapper;

	@Override
	public Object listCartItems() {
		return cartItemRepository.getAllCartItems();
	}

	public void addItem(ProductDto productDto) {

		Product product = productMapper.DtoToProduct(productDto);

		Optional<CartItem> cartItem = cartItemRepository.findByProductId(product.getId());
		CartItem item = new CartItem();
		
		if (cartItem.isEmpty()) {

			
			item.setProduct(product);
			System.out.println("ma yeta xu not empty ma");
			cartItemRepository.save(item);
			cartItemRepository.updateAvailablityStatus(product.getId());
		} else {
	;
		}

		System.out.println("this is the product " + product);

		System.out.println("this the product status" + product.getStatus());

	}

	@Override
	public void deleteItem(Integer id) {
		cartItemRepository.deleteById(id);

	}

	@Override
	public void clearCartItem() {
		cartItemRepository.clearCart();

	}

	@Override
	public void updateOrder(String token) {
		System.out.println("bhitrako bhitra chirkyo");

		cartItemRepository.updateCart(token);

	}

}
