package br.local.dns.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.local.dns.jdbc.modelo.dao.ContatoDao;

public class ListaContatosLogic implements Logica {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
//		List<Contato> contatos = ;
		req.setAttribute("contatos", new ContatoDao().getLista());
		return "/WEB-INF/jsp/lista-contatos.jsp";
	}
}
