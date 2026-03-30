package org.example.demo;

import java.time.LocalDate;

public class InventaireItem {
    private String refArticle;
    private String nomArticle;
    private String categorieArticle;
    private String service;
    private String local;
    private int quantite;
    private LocalDate dateAffectation;

    public InventaireItem(String refArticle, String nomArticle, String categorieArticle,
                          String service, String local, int quantite, LocalDate dateAffectation) {
        this.refArticle = refArticle;
        this.nomArticle = nomArticle;
        this.categorieArticle = categorieArticle;
        this.service = service;
        this.local = local;
        this.quantite = quantite;
        this.dateAffectation = dateAffectation;
    }

    // Getters et setters
    public String getRefArticle() {
        return refArticle;
    }

    public void setRefArticle(String refArticle) {
        this.refArticle = refArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getCategorieArticle() {
        return categorieArticle;
    }

    public void setCategorieArticle(String categorieArticle) {
        this.categorieArticle = categorieArticle;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public LocalDate getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(LocalDate dateAffectation) {
        this.dateAffectation = dateAffectation;
    }
}


