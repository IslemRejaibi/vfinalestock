package org.example.demo;

import java.time.LocalDate;

public class Article {
    private String ref;  // Changé de int à String
    private int qte, qteMin;
    private String nom, categorie, local;
    private LocalDate date;
    private String type;  // Nouveau champ pour le type (consommable ou durable)

    public Article(String ref, String nom, String categorie, int qte, String local, int qteMin, LocalDate date, String type) {
        this.ref = ref;
        this.qte = qte;
        this.qteMin = qteMin;
        this.nom = nom;
        this.categorie = categorie;
        this.local = local;
        this.date = date;
        this.type = type;  // Initialisation du type
    }

    public String getRef() {
        return ref;
    }

    public int getQte() {
        return qte;
    }

    public int getQteMin() {
        return qteMin;
    }

    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getLocal() {
        return local;
    }

    public LocalDate getDate() {
        return date;
    }

    // Getter et Setter pour le type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
