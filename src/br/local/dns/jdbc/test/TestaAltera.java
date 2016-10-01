package br.local.dns.jdbc.test;

import java.util.Calendar;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class TestaAltera {
	public static void main(final String[] args) {
		final ContatoDao dao = new ContatoDao();
		final Contato contato = new Contato();
		contato.setId((long) 1);
		contato.setName("Daniel Alterar 2");
		contato.setAddress("Rua teste, 123488");
		contato.setEmail("dns_alterar@test.tstest");
		contato.setBirthDate(Calendar.getInstance());
		dao.altera(contato);
		System.out.println("Alterando...");
	}
}
