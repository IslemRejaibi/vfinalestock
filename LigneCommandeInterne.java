package org.example.demo;

public class LigneCommandeInterne {
    private int idLigne;
    private int idCommande;
    private String refArticle;
    private String nomArticle; // For display purposes
    private int quantite;
    private String localSource;

    public LigneCommandeInterne(int idLigne, int idCommande, String refArticle,
                                String nomArticle, int quantite, String localSource) {
        this.idLigne = idLigne;
        this.idCommande = idCommande;
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.quantite = quantite;
        this.localSource = localSource;
    }

    // Constructor without ID for new items
    public LigneCommandeInterne(int idCommande, String refArticle, String nomArticle,
                                int quantite, String localSource) {
        this.idCommande = idCommande;
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.quantite = quantite;
        this.localSource = localSource;
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

    public String getLocalSource() {
        return localSource;
    }

    // Setters
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setLocalSource(String localSource) {
        this.localSource = localSource;
    }
}
