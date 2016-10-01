package br.local.dns.jdbc.test;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class TestaRemove {
	public static void main(final String[] args) {
		final ContatoDao dao = new ContatoDao();

		final Contato contato = new Contato();
		contato.setId((long) 1);
		dao.remove(contato);
		System.out.println("Removendo.....");
	}

}
