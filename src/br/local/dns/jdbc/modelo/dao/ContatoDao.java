package br.local.dns.jdbc.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import br.local.dns.jdbc.ConnectionFactory;
import br.local.dns.jdbc.modelo.Contato;

public class ContatoDao {
	
	private Connection connection;
	
	public ContatoDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato){
		String sql = "insert into contatos" +
					"(nome, email, endereco, dataNascimento)" +
					"values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getName());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getAddress());
			stmt.setDate(4, new Date(contato.getBirthDate().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List
}
