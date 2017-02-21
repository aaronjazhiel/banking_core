package mx.com.anzen.corebank.exceptions;

public class LogoutException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * the default constructor
	 * @param message the messge to set
	 */
	public  LogoutException (String message){
		super(message);
	}
}
