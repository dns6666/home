package br.local.dns.jdbc.modelo;

import java.util.Calendar;

public class Funcionario {
	String id;
	String nome;
	String cargo;
	String endereco;
	String telefone;
	Calendar dataNascimento;

	/**
	 * @return the cargo
	 */
	public final String getCargo() {
		return cargo;
	}

	/**
	 * @return the dataNascimento
	 */
	public final Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @return the endereco
	 */
	public final String getEndereco() {
		return endereco;
	}

	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @return the nome
	 */
	public final String getNome() {
		return nome;
	}

	/**
	 * @return the telefone
	 */
	public final String getTelefone() {
		return telefone;
	}

	/**
	 * @param cargo
	 *            the cargo to set
	 */
	public final void setCargo(final String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public final void setDataNascimento(final Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public final void setEndereco(final String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public final void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public final void setTelefone(final String telefone) {
		this.telefone = telefone;
	}

}
