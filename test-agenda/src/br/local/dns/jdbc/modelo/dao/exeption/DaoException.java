package br.local.dns.jdbc.modelo.dao.exeption;

import java.sql.SQLException;

public class DaoException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DaoException(final SQLException exep) {
		System.out.println(exep);
	}
}
