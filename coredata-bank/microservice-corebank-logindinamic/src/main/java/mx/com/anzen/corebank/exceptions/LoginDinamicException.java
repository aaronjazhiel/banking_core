package mx.com.anzen.corebank.exceptions;

public class LoginDinamicException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * the default constructor
	 * @param message the messge to set
	 */
	public  LoginDinamicException (String message){
		super(message);
	}
}
