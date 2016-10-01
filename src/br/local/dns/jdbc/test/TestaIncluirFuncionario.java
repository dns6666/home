package br.local.dns.jdbc.test;

import java.util.Calendar;

import br.local.dns.jdbc.modelo.Funcionario;
import br.local.dns.jdbc.modelo.dao.FuncionarioDao;

public class TestaIncluirFuncionario {
	public static void main(final String[] args) {
		final FuncionarioDao dao = new FuncionarioDao();
		final Funcionario funcionario = new Funcionario();

		funcionario.setNome("Fulano de Tal");
		funcionario.setCargo("Testador");
		funcionario.setEndereco("Rua dos Testes, 123");
		funcionario.setTelefone("12312345");
		funcionario.setDataNascimento(Calendar.getInstance());

		dao.adiciona(funcionario);
		System.out.println("Funcionario adicionado!!");

	}
}
