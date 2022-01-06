package my.eCommerce.dto;

import lombok.Data;
import my.eCommerce.model.Customer;

@Data
public class CartItemDto {

	private Integer id;
	private ProductDto productDto;
	private CustomerDto customerDto;

}
