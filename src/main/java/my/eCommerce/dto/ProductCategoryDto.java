package my.eCommerce.dto;

import java.util.Set;

public class ProductCategoryDto {
	private Long id;
	private String categoryName;
	private Set<ProductDto> productsDto;

	public ProductCategoryDto() {

	}

	public ProductCategoryDto(Long id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<ProductDto> getProductsDto() {
		return productsDto;
	}

	public void setProductsDto(Set<ProductDto> productsDto) {
		this.productsDto = productsDto;
	}

}
