package mx.com.anzen.corebank.exceptions;

public class LoginValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * the default constructor
	 * @param message the messge to set
	 */
	public  LoginValidationException (String message){
		super(message);
	}
}
