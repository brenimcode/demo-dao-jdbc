package db;

public class DbIntegrityException extends RuntimeException{
	/**
	 * Classe para tratar erro de integridade referencial
	 */
	private static final long serialVersionUID = 1L;
	
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
