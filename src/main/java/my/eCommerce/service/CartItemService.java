package my.eCommerce.service;

import my.eCommerce.dto.ProductDto;
import my.eCommerce.model.CartItem;

public interface CartItemService {

	
	public Object listCartItems();
	
	public void addItem(ProductDto productDto);
	
	public void deleteItem(Integer id);
	
	public void clearCartItem();
	
}
