package my.eCommerce.service;

import java.util.Optional;

import my.eCommerce.dto.ProductDto;

public interface ProductService {

	public Object getProducts();

	public Object getAllProducts(Long id);

	public Optional<ProductDto> getProduct(Long id);

//	public Optional<ProductDto> getProduct(long id, long cid);

	public void addProduct(ProductDto productDto);

	public void deleteProduct(Long id);
}
