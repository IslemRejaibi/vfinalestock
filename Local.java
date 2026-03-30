package org.example.demo;
public class Local {
    private int id;
    private String nom;
    private String type;

    public Local(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }

    // IMPORTANT : les getters (obligatoires pour PropertyValueFactory)
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }
}