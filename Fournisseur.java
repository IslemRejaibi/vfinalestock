package org.example.demo;
public class Fournisseur {
    private int id_fournisseur;
    private String nom, contact, adresse;

    public Fournisseur(int id_fournisseur, String nom, String contact, String adresse) {
        this.id_fournisseur = id_fournisseur;
        this.nom = nom;
        this.contact = contact;
        this.adresse = adresse;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public String getNom() {
        return nom;
    }

    public String getContact() {
        return contact;
    }

    public String getAdresse() {
        return adresse;
    }
}
