package my.eCommerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("product")
	private ProductDto productDto;
	@JsonProperty("customer")
	private CustomerDto customerDto;

}
