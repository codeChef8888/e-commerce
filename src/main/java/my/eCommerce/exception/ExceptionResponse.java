package my.eCommerce.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data	
public class ExceptionResponse {
private Date timestamp;
private String message;
private String detail;


}
