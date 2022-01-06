package my.eCommerce.controller;




import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import my.eCommerce.model.PayloadRespone;
import my.eCommerce.model.PaymentRespone;

@RestController
@CrossOrigin
public class PaymentController {

	@PostMapping("/paymentDemo")
	public ResponseEntity<Object> verifyPayment(PaymentRespone pay) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Authorization", 
	    	      "test_secret_key_0921c69f5a5544de80b05fe745c1f93d");
	    
		PayloadRespone payload=new PayloadRespone();
		payload.setToken(pay.getToken());
		payload.setAmount(pay.getAmount());
		
		System.out.print(pay);
		
		return new ResponseEntity<>(payload,responseHeaders,HttpStatus.OK);
		
	}
}
