package org.example.demo;



public class Service {
    private int idservice;
    private String nom;
    private String contact;
    private String responsable;
    private String type;
    public Service(int idservice,String nom,String type,String contact,String responsable){
        this.idservice=idservice;
        this.contact=contact;
        this.responsable=responsable;
        this.nom=nom;
        this.type=type;
    }
    public int getIdservice() {
        return idservice;
    }

    public String getNom() {
        return nom;
    }

    public String getContact() {
        return contact;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getType() {
        return type;
    }

}
