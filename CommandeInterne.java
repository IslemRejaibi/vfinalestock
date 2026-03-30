package org.example.demo;

import java.time.LocalDate;

public class CommandeInterne {
    private int idCommande;
    private int idService;
    private String nomService; // For display purposes
    private LocalDate dateCommande;
    private String statut; // "En attente", "Validée", "Annulée"
    private String description;

    public CommandeInterne(int idCommande, int idService, String nomService,
                           LocalDate dateCommande, String statut, String description) {
        this.idCommande = idCommande;
        this.idService = idService;
        this.nomService = nomService;
        this.dateCommande = dateCommande;
        this.statut = statut;
        this.description = description;
    }

    // Constructor without ID for new orders
    public CommandeInterne(int idService, String nomService,
                           LocalDate dateCommande, String statut, String description) {
        this.idService = idService;
        this.nomService = nomService;
        this.dateCommande = dateCommande;
        this.statut = statut;
        this.description = description;
    }

    // Getters
    public int getIdCommande() {
        return idCommande;
    }

    public int getIdService() {
        return idService;
    }

    public String getNomService() {
        return nomService;
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
