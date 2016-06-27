package by.traning.task8.exception;

public class ConnectionPoolException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnectionPoolException(String message, Exception ex) {
		super(message, ex);
	}

	public ConnectionPoolException(String message) {
		super(message);
	}
}
