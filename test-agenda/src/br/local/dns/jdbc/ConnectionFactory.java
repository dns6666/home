package br.local.dns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.local.dns.jdbc.modelo.dao.exeption.DaoException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "dns@1234");
		} catch (final SQLException e) {
			throw new DaoException(e);
		}
	}
}
