package my.eCommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.eCommerce.dto.ProductDto;
import my.eCommerce.model.CartItem;
import my.eCommerce.service.CartItemService;
import my.eCommerce.serviceImpl.CartItemServiceImpl;
import my.eCommerce.serviceImpl.ProductCategoryServiceImpl;
import my.eCommerce.serviceImpl.ProductServiceImpl;

@Controller
public class ShoppingCartController {
	
	@Autowired
	CartItemServiceImpl cartItemServiceImpl;
	
	@Autowired
	ProductServiceImpl productServiceImpl;

	@GetMapping("/cart")
	public String getCartItems(Model model){
		model.addAttribute("listItems", cartItemServiceImpl.listCartItems());
		return "cartItems";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cart/{productId}")
	public String addToCart(@PathVariable(value = "productId") Long productId, Model model) {
		Optional<ProductDto> productOptional = productServiceImpl.getProduct(productId);
		ProductDto product = productOptional.get();
		cartItemServiceImpl.addItem(product);
		return "redirect:/categories/products";
	}
	
	@RequestMapping(method = RequestMethod.GET ,value = "/cart/delete/{cartId}")
	public String deleteItem(@PathVariable(value = "cartId") Integer cartId) {
		cartItemServiceImpl.deleteItem(cartId);
		return "redirect:/cart";
	}

}
