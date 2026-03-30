package org.example.demo;

public class LigneCommandeExterne {
    private int idLigne;
    private int idCommande;
    private String refArticle;
    private String nomArticle; // For display purposes
    private int quantite;
    private String localDestination;

    public LigneCommandeExterne(int idLigne, int idCommande, String refArticle,
                                String nomArticle, int quantite, String localDestination) {
        this.idLigne = idLigne;
        this.idCommande = idCommande;
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.quantite = quantite;
        this.localDestination = localDestination;
    }

    // Constructor without ID for new items
    public LigneCommandeExterne(int idCommande, String refArticle, String nomArticle,
                                int quantite, String localDestination) {
        this.idCommande = idCommande;
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.quantite = quantite;
        this.localDestination = localDestination;
    }

    // Getters
    public int getIdLigne() {
        return idLigne;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public String getRefArticle() {
        return refArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getLocalDestination() {
        return localDestination;
    }

    // Setters
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setLocalDestination(String localDestination) {
        this.localDestination = localDestination;
    }
}

