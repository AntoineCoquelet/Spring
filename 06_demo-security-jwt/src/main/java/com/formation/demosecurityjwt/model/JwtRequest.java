package com.formation.demosecurityjwt.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = -2085759017887359781L;
	
	private String username;
	private String password;
	
	// Besoin du contructeur par defaut pour le parsing en JSON
	public JwtRequest() {}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	
	// Getters et Setters

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}