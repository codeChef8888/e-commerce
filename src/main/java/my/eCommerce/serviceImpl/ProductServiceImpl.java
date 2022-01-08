package my.eCommerce.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.eCommerce.controller.mapper.ProductMapper;

import my.eCommerce.dto.ProductDto;

import my.eCommerce.model.Product;
import my.eCommerce.model.ProductCategory;

import my.eCommerce.repo.ProductRepository;

import my.eCommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Inject
	ProductMapper mapper;

	@Override
	public Object getProducts() {
		return mapper.productListToDto(productRepository.getAllProductItem());
	}

	public Object getAllProducts(Long id) {
		List<Product> products = new ArrayList<>();
		productRepository.findByProductCategoryId(id).forEach(products::add);
		return mapper.productListToDto(products);
	}

//	public Optional<ProductDto> getProduct(long id, long cid) {
//
//		Optional<Product> p = productRepository.findById(id);
//		Product product = p.get();
//		if (p.get().getProductCategory().getId() == cid) {
//			return mapper.toProductOptional(product);
//		} else {
//			return null;
//		}
//
//	}

	public Optional<ProductDto> getProduct(Long id) {
		Optional<Product> productOptional = productRepository.findById(id);
		Product product = null;
		if (productOptional.isPresent()) {
			product = productOptional.get();
		} else {
			throw new RuntimeException("Product doesn't exist for:" + id);
		}
		return mapper.toProductOptional(product);
	}

	public void addProduct(ProductDto productDto) {
		Product product;
		product = mapper.DtoToProduct(productDto);
		product.setProductCategory(new ProductCategory(productDto.getProductCategoryDto().getId(), ""));
		productRepository.save(product);
	}

	public void deleteProduct(Long id) {

		productRepository.deleteById(id);
	}



}
