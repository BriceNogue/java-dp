package org.sebsy.builder.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marque {
    @Id
    private String id;
    private String nom;

    public Marque() {
    }

    public Marque(String nom) {
        this.nom = nom;
    }

    public Marque(String id, String nom) {
        this.id = id;
        this.nom = nom;
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
}
