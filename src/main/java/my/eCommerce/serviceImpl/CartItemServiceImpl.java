package my.eCommerce.serviceImpl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import my.eCommerce.controller.mapper.ProductMapper;
import my.eCommerce.dto.ProductDto;
import my.eCommerce.model.CartItem;
import my.eCommerce.model.Product;
import my.eCommerce.repo.CartItemRepository;
import my.eCommerce.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	CartItemRepository cartItemRepository;
	


	@Inject
	ProductMapper productMapper;

	@Override
	public Object listCartItems() {
		return cartItemRepository.getAllCartItems();
	}

	public void addItem(ProductDto productDto) {
		
		Product product = productMapper.DtoToProduct(productDto);
       CartItem item = new CartItem();
      
       System.out.println("this is the product "+product);
       
       cartItemRepository.updateAvailablityStatus(product.getId());
      
       System.out.println("this the product status"+product.getStatus());
      
      	item.setProduct(product);
		cartItemRepository.save(item);
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
