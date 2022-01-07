package my.eCommerce.model;

import lombok.Data;

@Data
public class PayloadRespone {
private String token;
private Long amount;
private String mobile;

}
