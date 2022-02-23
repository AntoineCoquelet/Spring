package com.springcore.entity;

import com.springcore.interfaces.Artisan;
import com.springcore.interfaces.Decouper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Imprimeur implements Artisan {

    // Attributs
    @Value("${imprimeur.nom}")
    private String nom;
    @Value("${imprimeur.prenom}")
    private String prenom;
    @Value("${imprimeur.age}")
    private int age;
    @Value("${imprimeur.liberale}")
    private boolean liberale;

    private Decouper dependance;

    // Constructors
    public Imprimeur() {}

    public Imprimeur(String nom, String prenom, int age, boolean liberale) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.liberale = liberale;
    }

    @Autowired
    public Imprimeur(@Qualifier("decoupeImprimerie") Decouper service) {
        this.dependance = service;
    }

    // Methods
    @Override
    public void artisanInfos() {
        System.out.println("J'utilise les annotations");
        System.out.println("nom: " + nom + " prenom: " + prenom + " age: " + age + " liberale: " + liberale);
    }

    @Override
    public void getDevis() {
        System.out.println("Je fais un devis d'impression.");
    }

    public String getDecouper () {
        return dependance.getDecouper();
    }
}
