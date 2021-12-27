package my.eCommerce.dto;

public class ProductDto {

	private long id;
	private String productName;
	private Double price;
	private String description;
	private Boolean availability;
	private String pictureUrl;
	private ProductCategoryDto productCategoryDto;

	public ProductDto() {

	}

	public ProductDto(String productName, Double price, String description, Boolean availability, String pictureUrl,
			long productCategoryDtoId) {
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.availability = availability;
		this.pictureUrl = pictureUrl;
		this.productCategoryDto = new ProductCategoryDto(productCategoryDtoId, "");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public ProductCategoryDto getProductCategoryDto() {
		return productCategoryDto;
	}

	public void setProductCategoryDto(ProductCategoryDto productCategoryDto) {
		this.productCategoryDto = productCategoryDto;
	}

	@Override
	public String toString() {
		return "ProductDto [productName=" + productName + ", price=" + price + ", description=" + description
				+ ", availability=" + availability + ", pictureUrl=" + pictureUrl + ", productCategoryDto="
				+ productCategoryDto.getId() + "]";
	}

}
