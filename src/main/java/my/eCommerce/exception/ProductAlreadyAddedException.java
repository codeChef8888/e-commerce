package my.eCommerce.exception;

public class ProductAlreadyAddedException extends Exception  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductAlreadyAddedException(String msg) {
		super(msg);
	}
}
