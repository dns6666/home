package br.local.dns.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.local.dns.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(final String[] args) throws SQLException {
		final Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta");
		connection.close();
	}
}
