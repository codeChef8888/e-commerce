package my.eCommerce.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto {


	private Integer id;
	
	private ProductDto product;
	
	private CustomerDto customer;

}
