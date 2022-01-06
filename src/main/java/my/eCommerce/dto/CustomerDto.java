package my.eCommerce.dto;

import java.util.Date;

import lombok.Data;
@Data
public class CustomerDto {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private String phoneNumber;
	private Date createdTime;	
	
	
}
