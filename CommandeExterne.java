package org.example.demo;

import java.time.LocalDate;

public class CommandeExterne {
    private int idCommande;
    private int idFournisseur;
    private String nomFournisseur; // For display purposes
    private LocalDate dateCommande;
    private String statut; // "En attente", "Validée", "Annulée"
    private String description;

    public CommandeExterne(int idCommande, int idFournisseur, String nomFournisseur,
                           LocalDate dateCommande, String statut, String description) {
        this.idCommande = idCommande;
        this.idFournisseur = idFournisseur;
        this.nomFournisseur = nomFournisseur;
        this.dateCommande = dateCommande;
        this.statut = statut;
        this.description = description;
    }

    // Constructor without ID for new orders
    public CommandeExterne(int idFournisseur, String nomFournisseur,
                           LocalDate dateCommande, String statut, String description) {
        this.idFournisseur = idFournisseur;
        this.nomFournisseur = nomFournisseur;
        this.dateCommande = dateCommande;
        this.statut = statut;
        this.description = description;
    }

    // Getters
    public int getIdCommande() {
        return idCommande;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public String getStatut() {
        return statut;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

