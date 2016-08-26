package br.local.dns.jdbc.test;

import java.util.Calendar;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class TestaInsere {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setName("Daniel");
		contato.setEmail("dns6666@gmail.com");
		contato.setAddress("Rua Salem Bechara, 435 apto 71");
		contato.setBirthDate(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravando!");
	}
}
