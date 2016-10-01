package br.local.dns.jdbc.test;

import java.util.Calendar;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class TestaInsere {
	public static void main(final String[] args) {

		final Contato contato = new Contato();
		contato.setName("Julia Almeida");
		contato.setEmail("julia@julia.com.br");
		contato.setAddress("Rua Salem Bechara, 435 apto 71");
		contato.setBirthDate(Calendar.getInstance());

		final ContatoDao dao = new ContatoDao();

		dao.adiciona(contato);

		System.out.println("Gravando!");
	}
}
