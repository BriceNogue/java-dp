package org.sebsy.builder.beans;

import javax.persistence.Id;

public class Allergene {
    @Id
    private String id;
    private String nom;
    private double qteMilligrammes;

    public Allergene() {
    }

    public Allergene(String nom, double qteMilligrammes) {
        this.nom = nom;
        this.qteMilligrammes = qteMilligrammes;
    }

    public Allergene(String id, String nom, double qteMilligrammes) {
        this.id = id;
        this.nom = nom;
        this.qteMilligrammes = qteMilligrammes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQteMilligrammes() {
        return qteMilligrammes;
    }

    public void setQteMilligrammes(double qteMilligrammes) {
        this.qteMilligrammes = qteMilligrammes;
    }
}
