package my.eCommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import my.eCommerce.controller.mapper.ProductMapper;

import my.eCommerce.dto.ProductCategoryDto;
import my.eCommerce.dto.ProductDto;

import my.eCommerce.service.ProductCategoryService;
import my.eCommerce.service.ProductService;

@Controller
@RequestMapping("/eCommerce")
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	ProductCategoryService categoryService;

	@Inject
	ProductMapper mapper;

//	@GetMapping("/categories/{categoryId}/products")
//	public ResponseEntity<Object> getAllProducts(@PathVariable Long categoryId) {
//		return new ResponseEntity<Object>(productService.getAllProducts(categoryId), HttpStatus.OK);
//	}

	@GetMapping("/categories/products")
	public String getAllProducts(Model model) {
		model.addAttribute("listProducts", productService.getProducts());
		return "product";
	}

	@GetMapping("/listCategoryProducts/{categoryId}")
	public String getAllProducts(@PathVariable(value = "categoryId") Long categoryId, Model model) {
		model.addAttribute("listProducts", productService.getAllProducts(categoryId));
		return "product";
	}

//	@GetMapping("/categories/{categoryId}/products/{productId}")
//	public Optional<ProductDto> getProductById(@PathVariable Long productId, @PathVariable Long categoryId) {
//		return productService.getProduct(productId, categoryId);
//	}

//	@PostMapping("/categories/{categoryId}/products/add")
//	public void addProduct(@RequestBody ProductDto productDto, @PathVariable Long categoryId) {
//		productDto.setProductCategoryDto(new ProductCategoryDto(categoryId, ""));
//		System.out.println(productDto.toString());
//		productService.addProduct(productDto);
//	}

	@GetMapping("/formAddProduct/{categoryId}")
	public String showAddProductForm(@PathVariable(value = "categoryId") Long categoryId, Model model) {

		ProductDto product = new ProductDto();
		product.setProductCategoryDto(new ProductCategoryDto(categoryId, ""));
		model.addAttribute("product", product);
		return "new_product";
	}

	@GetMapping("/formNewProduct")
	public String newProductForm(Model model) {
		model.addAttribute("product", new ProductDto());
		List<ProductCategoryDto> productCategoryDto = new ArrayList<>();
		productCategoryDto = categoryService.getAll();
		model.addAttribute("productCategoryDto", categoryService.getAll());

		for (ProductCategoryDto productCategory : productCategoryDto) {
			System.out.println(productCategory.getId());
			System.out.println(productCategory.getCategoryName());
		}
		return "new_product";
	}

//	@RequestMapping(method = RequestMethod.PUT, value = "/categories/{categoryId}/products/{productId}")
//	public void updateProduct(@RequestBody ProductDto productDto, @PathVariable Long categoryId,
//			@PathVariable Long productId) {
//		productDto.setId(productId);
//		productDto.setProductCategoryDto(new ProductCategoryDto(categoryId, ""));
//		productService.updateProduct(productDto);
//	}

	@GetMapping("/formForUpdateProduct/{productId}")
	public String showUpdateForm(@PathVariable(value = "productId") Long productId, Model model) {
		// get category from service

		Optional<ProductDto> productOptional = productService.getProduct(productId);
		ProductDto product = productOptional.get();
		model.addAttribute("product", product);
		return "update_product";
	}

	@PostMapping("/categories/products/add")
	public String addProduct(@ModelAttribute("product") ProductDto productDto) {
		productService.addProduct(productDto);
		return "redirect:/eCommerce/categories/products";
	}

//	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/{categoryId}/products/{productId}")
//	public void deleteProduct(@PathVariable Long productId) {
//		productService.deleteProduct(productId);
//	}

	@GetMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable(value = "productId") Long productId) {
		productService.deleteProduct(productId);
		return "redirect:/eCommerce/categories";
	}
}