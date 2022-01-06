package my.eCommerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.eCommerce.dto.ProductCategoryDto;

import my.eCommerce.service.ProductCategoryService;

@Controller

public class ProductCategoryController {

	@Autowired
	ProductCategoryService productCategoryService;

//	@GetMapping("/categories")
//	public ResponseEntity<Object> getAllCategories() {
//		return new ResponseEntity<>(productCategoryService.getAllCategories(), HttpStatus.OK);
//	}
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("something","this is something");
		return "home";
	}

	@GetMapping("/categories")
	public String getAllCategories(Model model) {
		model.addAttribute("listCategories", productCategoryService.getAllCategories());
		return "category";
	}

	@GetMapping("/categories/{id}")
	public Optional<ProductCategoryDto> getCategoryById(@PathVariable Long id) {
		return productCategoryService.getCategory(id);
	}

	@GetMapping("/newCategoryForm")
	public String showNewCategoryForm(Model model) {
		// create model attribute to bind form data
		ProductCategoryDto productCategoryDto = new ProductCategoryDto();
		model.addAttribute("category", productCategoryDto);
		return "new_category";
	}

//	@PostMapping("/categories/add")
//	public void addCategory(@RequestBody ProductCategoryDto productCategoryDto) {
//		productCategoryService.addCategory(productCategoryDto);
//	}

	@PostMapping("/categories/add")
	public String addCategory(@ModelAttribute("category") ProductCategoryDto productCategoryDto) {
		productCategoryService.addCategory(productCategoryDto);
		return "redirect:/eCommerce/categories";
	}

//	@RequestMapping(method = RequestMethod.PUT, value = "/categories/update/{id}")
//	public void update(@PathVariable Long id, @RequestBody ProductCategoryDto productCategoryDto) {
//		productCategoryDto.setId(id);
//		productCategoryService.updateCategory(productCategoryDto);
//	}

	@GetMapping("/formForUpdateCategory/{id}")
	public String showUpdateForm(@PathVariable(value = "id") Long id, Model model) {
		// get category from service
		Optional<ProductCategoryDto> cat = productCategoryService.getCategory(id);
		ProductCategoryDto category = cat.get();
		model.addAttribute("category", category);
		return "update_category";
	}

//	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/delete/{id}")
//	public void delete(@PathVariable Long id) {
//		productCategoryService.deleteCategory(id);
//	}

	@GetMapping("/deleteCategory/{id}")
	public String deleteCategory(@PathVariable(value = "id") Long id) {
		productCategoryService.deleteCategory(id);
		return "redirect:/eCommerce/categories";
	}

}
