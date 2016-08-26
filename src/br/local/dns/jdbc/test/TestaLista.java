package br.local.dns.jdbc.test;

import java.text.SimpleDateFormat;
import java.util.List;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class TestaLista {
	public static void main(final String[] args) {

		final ContatoDao dao = new ContatoDao();
		final List<Contato> contatos = dao.getLista();

		for (final Contato contato : contatos) {
			System.out.println("Nome: " + contato.getName());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getAddress());
			System.out.println("Data de Nascimento: " + contato.getBirthDate().getTime() + "\n");

			final SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Data de Nascimento: " + simple.format(contato.getBirthDate().getTime()));

		}
	}
}