package com.formation.demosecurityjwt.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 968769174662806672L;

	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
