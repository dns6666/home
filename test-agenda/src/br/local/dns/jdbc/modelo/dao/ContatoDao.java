package br.local.dns.jdbc.modelo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.local.dns.jdbc.ConnectionFactory;
import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.exeption.DaoException;

public class ContatoDao {

    private final Connection connection;

    public ContatoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(final Contato contato) {
        final String sql = "insert into contatos" + "(nome, email, endereco, dataNascimento)" + "values (?,?,?,?)";

        try {
            final PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getName());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getAddress());
            stmt.setDate(4, new Date(contato.getBirthDate().getTimeInMillis()));

            stmt.execute();
            stmt.close();
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(final Contato contato) {
        final String sql = ("update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id = ?");

        try {
            final PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, contato.getName());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getAddress());
            stmt.setDate(4, new Date(contato.getBirthDate().getTimeInMillis()));
            stmt.setLong(5, contato.getId());
            stmt.execute();
            stmt.close();
        } catch (final SQLException e) {
            throw new DaoException(e);
        }
    }

    public List<Contato> getLista() {
        try {
            final List<Contato> contatos = new ArrayList<Contato>();
            final PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
            final ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                final Contato contato = new Contato();
                contato.setId(rs.getLong("Id"));
                contato.setName(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setAddress(rs.getString("endereco"));

                final Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                contato.setBirthDate(data);

                contatos.add(contato);

            }
            rs.close();
            stmt.close();
            return contatos;
        } catch (final SQLException e) {
            throw new DaoException(e);
        }
    }

    public List<Contato> getListaPosicao(final Long i) {
        try {
            final List<Contato> contatos = new ArrayList<>();
            final PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where id = ?");
            stmt.setLong(1, i);
            final ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                final Contato contato = new Contato();
                contato.setId(rs.getLong("id"));
                contato.setName(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setAddress(rs.getString("endereco"));

                final Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                contato.setBirthDate(data);

                contatos.add(contato);

            }
            rs.close();
            stmt.close();
            return contatos;
        } catch (final SQLException e) {
            throw new DaoException(e);
        }
    }

    public void remove(final Contato contato) {
        try {
            final PreparedStatement stmt = connection.prepareStatement("delete from contatos where id = ?");
            stmt.setLong(1, contato.getId());
            stmt.execute();
            stmt.close();
        } catch (final SQLException e) {
            throw new DaoException(e);
        }
    };
}
