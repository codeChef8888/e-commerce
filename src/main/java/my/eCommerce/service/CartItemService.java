package my.eCommerce.service;

import my.eCommerce.dto.ProductDto;
import my.eCommerce.exception.ProductAlreadyAddedException;


public interface CartItemService {

	
	public Object listCartItems();
	
	public void addItem(ProductDto productDto) throws ProductAlreadyAddedException;
	
	public void deleteItem(Integer id);
	
	public void clearCartItem();
	
	public void updateOrder(String token);
	
}
