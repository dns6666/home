package br.local.dns.jdbc.test;

import java.util.Calendar;

import br.local.dns.jdbc.modelo.Funcionario;
import br.local.dns.jdbc.modelo.dao.FuncionarioDao;

public class TestaIncluirFuncionario {
	public static void main(final String[] args) {
		final FuncionarioDao dao = new FuncionarioDao();
		final Funcionario funcionario = new Funcionario();

		funcionario.setNome(null);
		funcionario.setCargo("Testador de testes");
		funcionario.setEndereco("Rua dos Testes sem teste, 123");
		funcionario.setTelefone("123252635");
		funcionario.setDataNascimento(Calendar.getInstance());

		if (dao.adiciona(funcionario))
			System.out.println("Funcionario adicionado!!");
		else {
			System.out.println("ERRO");
		}

	}
}
