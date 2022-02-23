package com.springcore.entity;

import com.springcore.interfaces.Artisan;
import com.springcore.interfaces.Decouper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menuisier implements Artisan {

    // Attributs
    private String nom;
    private String prenom;
    private int age;
    private boolean liberale;
    private Decouper dependance;

    // Constructors
    public Menuisier() {}

    public Menuisier(String nom, String prenom, int age, boolean liberale) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.liberale = liberale;
    }

    @Autowired
    public Menuisier(@Qualifier("decoupeMenuiserie") Decouper service) {
        this.dependance = service;
    }

    // Getters & Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLiberale() {
        return liberale;
    }

    public void setLiberale(boolean liberale) {
        this.liberale = liberale;
    }

    // Methods

    public void artisanInfos(){
        System.out.println("J'utilise les properties du fichier beans.xml et de artisan.properties");
        System.out.println("nom: " + nom + " prenom: " + prenom + " age: " + age + " liberale: " + liberale);
    }

    @Override
    public void getDevis() {
        System.out.println("Je fais un devis de menuiserie.");
    }

    public String getDecouper() {
        return dependance.getDecouper();
    }
}
