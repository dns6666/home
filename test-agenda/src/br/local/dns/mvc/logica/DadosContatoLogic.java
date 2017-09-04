package br.local.dns.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class DadosContatoLogic implements Logica{
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res){
		long id = Long.parseLong(req.getParameter("id"));
		req.setAttribute("contato", new ContatoDao().getListaPosicao(id));
		
		return "/WEB-INF/jsp/altera-contato.jsp";

	}
}
