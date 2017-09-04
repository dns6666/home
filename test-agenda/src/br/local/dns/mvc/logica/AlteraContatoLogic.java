package br.local.dns.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class AlteraContatoLogic implements Logica {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res){

		
		
		return "/WEB-INF/jsp/lista-contatos.jsp";

	}

}
