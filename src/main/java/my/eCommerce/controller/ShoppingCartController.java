package my.eCommerce.controller;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import my.eCommerce.dto.ProductDto;

import my.eCommerce.model.PaymentRespone;

import my.eCommerce.serviceImpl.CartItemServiceImpl;

import my.eCommerce.serviceImpl.ProductServiceImpl;

@Controller
@CrossOrigin
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
	

	@Transactional
	@RequestMapping(method = RequestMethod.GET, value = "/cart/{productId}")
	public String addToCart(@PathVariable(value = "productId") Long productId, Model model) {
		
		Optional<ProductDto> productOptional = productServiceImpl.getProduct(productId);
		ProductDto product = productOptional.get();
		
		cartItemServiceImpl.addItem(product);
		return "redirect:/categories/products";
	}
	
	@Transactional
	@PutMapping("/cart/updateOrder")
	public String updateOrder(PaymentRespone resp) {
		System.out.println("this is the update table :" +resp);
		cartItemServiceImpl.updateOrder(resp.getMobile());
		return "redirect:/categories/products";
		
	}
	
	@Transactional
	@PutMapping("/cart/copyOrder")
	public String copyOrder() {

		return "redirect:/categories/products";
		
	}
	
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE ,value = "/cart/delete")
	public String deleteCartItem() {
		System.out.println("Emptied the Cart");

		cartItemServiceImpl.clearCartItem();
		return "redirect:/categories/products";
		
	}
	
	@RequestMapping(method = RequestMethod.GET ,value = "/cart/delete/{cartId}")
	public String deleteItem(@PathVariable(value = "cartId") Integer cartId) {
		cartItemServiceImpl.deleteItem(cartId);
		return "redirect:/cart";
	}
	
	


}
