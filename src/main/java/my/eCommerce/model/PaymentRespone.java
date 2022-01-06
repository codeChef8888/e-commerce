package my.eCommerce.model;

import lombok.Data;

@Data
public class PaymentRespone {
private Long amount;
private String idx;
private String mobile;
private String product_identity;
private String product_name;
private String product_url;
private String token;
private String widget_id;
}
