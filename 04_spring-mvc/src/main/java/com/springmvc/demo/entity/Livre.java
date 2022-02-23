package com.springmvc.demo.entity;

import java.util.Arrays;

public class Livre {
	
	private String titre;
	private String auteur;
	private String prix;
	private String editeur;
	private String edition;
	private String[] genre;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String[] getGenre() {
		return genre;
	}
	public void setGenre(String[] genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", editeur=" + editeur + ", edition="
				+ edition + ", genre=" + Arrays.toString(genre) + "]";
	}
	
	
	
}
