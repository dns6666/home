package br.local.dns.jdbc.modelo;

import java.util.Calendar;

public class Contato {

	private Long id;
	private String name;
	private String email;
	private String address;
	private Calendar birthDate;

	public String getAddress() {
		return address;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public void setBirthDate(final Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
