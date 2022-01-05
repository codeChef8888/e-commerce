package my.eCommerce.controller.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import my.eCommerce.dto.ProductCategoryDto;
import my.eCommerce.dto.ProductDto;
import my.eCommerce.model.Product;

@Component
@Mapper(uses = ProductCategoryMapper.class, componentModel = "spring")
public interface ProductMapper {
	List<ProductDto> productListToDto(List<Product> product);

	default Optional<ProductDto> toProductOptional(Product product) {
		ProductDto productDto = productToDto(product);
		productDto.setProductCategoryDto(new ProductCategoryDto(product.getProductCategory().getId(), ""));
		return Optional.ofNullable(productDto);
	}

	ProductDto productToDto(Product product);

	Product DtoToProduct(ProductDto productDto);
}
