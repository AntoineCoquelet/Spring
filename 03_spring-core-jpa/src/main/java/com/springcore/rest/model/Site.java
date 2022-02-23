package com.springcore.rest.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Site {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nom;
	@Column
	private String location;
	@Column
	private String type;
	
	// CONSTRUCTOR
	public Site() {}

	public Site(String nom, String location, String type){
		this.nom = nom;
		this.location = location;
		this.type = type;
		
	}

	// METHODS
	@Override
	public String toString() {
		return "Site [id=" + id + ", nom=" + nom + ", location=" + location + ", type=" + type + "]";
	}
	
	
	



	
	
	
	
	
	
	
	

}
