package my.eCommerce.controller.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import my.eCommerce.dto.ProductCategoryDto;
import my.eCommerce.model.ProductCategory;

@Component
@Mapper(uses = ProductMapper.class, componentModel = "spring")
public interface ProductCategoryMapper {

	List<ProductCategoryDto> productCategoryListToDto(List<ProductCategory> category);

	default Optional<ProductCategoryDto> toCategoryOptional(ProductCategory category) {
		return Optional.ofNullable(productCategoryToDto(category));
	}

	ProductCategoryDto productCategoryToDto(ProductCategory category);

	ProductCategory DtoToProductCategory(ProductCategoryDto productCategoryDto);
}
