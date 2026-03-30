package org.example.demo;

public class LigneInventaire {
    private int idLigne;
    private int idInventaire;
    private int refArticle;
    private String nomArticle; // For display purposes
    private int quantiteTheorique;
    private int quantiteReelle;
    private String commentaire;

    public LigneInventaire(int idLigne, int idInventaire, int refArticle,
                           String nomArticle, int quantiteTheorique,
                           int quantiteReelle, String commentaire) {
        this.idLigne = idLigne;
        this.idInventaire = idInventaire;
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.quantiteTheorique = quantiteTheorique;
        this.quantiteReelle = quantiteReelle;
        this.commentaire = commentaire;
    }

    // Constructor without ID for new inventory items
    public LigneInventaire(int idInventaire, int refArticle, String nomArticle,
                           int quantiteTheorique, int quantiteReelle, String commentaire) {
        this.idInventaire = idInventaire;
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.quantiteTheorique = quantiteTheorique;
        this.quantiteReelle = quantiteReelle;
        this.commentaire = commentaire;
    }

    // Getters
    public int getIdLigne() {
        return idLigne;
    }

    public int getIdInventaire() {
        return idInventaire;
    }

    public int getRefArticle() {
        return refArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public int getQuantiteTheorique() {
        return quantiteTheorique;
    }

    public int getQuantiteReelle() {
        return quantiteReelle;
    }

    public String getCommentaire() {
        return commentaire;
    }

    // Setters
    public void setQuantiteReelle(int quantiteReelle) {
        this.quantiteReelle = quantiteReelle;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
