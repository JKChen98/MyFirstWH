package nuc.edu.cn.cx.exception;

public class LoginException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LoginException() {
		super();
	}

	public LoginException(String message) {
		super(message);
	}
}
