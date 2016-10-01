package br.local.dns.jdbc.modelo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.local.dns.jdbc.ConnectionFactory;
import br.local.dns.jdbc.modelo.Funcionario;
import br.local.dns.jdbc.modelo.dao.exeption.DaoException;

public class FuncionarioDao {

	Connection connection;

	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public boolean adiciona(final Funcionario funcionario) {
		final String sql = "insert into funcionarios (nome, cargo, endereco, telefone, datanascimento) values (?, ?, ?, ?, ?)";

		try {
			final PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getCargo());
			stmt.setString(3, funcionario.getEndereco());
			stmt.setString(4, funcionario.getTelefone());
			stmt.setDate(5, new Date(funcionario.getDataNascimento().getTimeInMillis()));

			stmt.execute();
			stmt.close();
			return true;
		} catch (final SQLException e) {
			throw new DaoException(e);
		}
	}
}
