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
		return cartItemRepository.findAll();
	}

	public void addItem(ProductDto productDto) {
		Product product = productMapper.DtoToProduct(productDto);
       CartItem item = new CartItem();
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



}
