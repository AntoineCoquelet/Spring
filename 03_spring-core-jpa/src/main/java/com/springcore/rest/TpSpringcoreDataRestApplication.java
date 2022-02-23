package com.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springcore.rest.dao.DaoInterface;
import com.springcore.rest.model.Site;


@SpringBootApplication
public class TpSpringcoreDataRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TpSpringcoreDataRestApplication.class, args);
	}
	
	@Autowired
	private DaoInterface repository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----- Test TP SpringCore JPA -----");
		
		repository.save(new Site("Mont Saint Michel", "Normandie", "Patrimoine"));
		repository.save(new Site("Les Abers", "Bretagne", "Patrimoines"));
		repository.save(new Site("Chateau de Concarneau", "Bretagne", "Patrimoine"));
		repository.save(new Site("La Foret de Broceliande", "Bretagne", "Naturel"));
		repository.save(new Site("Chateau de Megalithes de Carnac", "Bretagne", "Naturel"));
		repository.save(new Site("Presqu'Ile de Quiberon", "Bretagne", "Naturel"));
	}
}
