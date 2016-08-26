package br.local.dns.jdbc.modelo;

import java.util.Calendar;

public class Contato {

	private Long id;
	private String name;
	private String email;
	private String address;
	private Calendar birthDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}
	public void setId(Long id) {
		this.id = id;
		
	}
	
	
}
