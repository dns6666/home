package br.local.dns.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class AlteraContatoLogic implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res){
		long id = Long.parseLong(req.getParameter("id"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataNascimento = req.getParameter("dataNascimento");
				
		Contato contato = new Contato();
		contato.setId(id);
		contato.setName(nome);
		contato.setAddress(endereco);
		data = new SimpleDateFormat().parse(dataNascimento);
		
		contato.setBirthDate(data);
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);
		
		return "mvc?logica=ListaContatosLogic";
	}

}
