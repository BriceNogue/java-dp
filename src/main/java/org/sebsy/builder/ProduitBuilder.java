package org.sebsy.builder;

import org.sebsy.builder.beans.*;

public class ProduitBuilder {
    private Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public ProduitBuilder avecNomEtGrade(String nom, String grade) {
        produit.setNom(nom);
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder avecCategorie(String nomCategorie) {
        Categorie categorie = new Categorie(nomCategorie);

        produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder avecMarque(String nomMarque) {
        Marque marque = new Marque(nomMarque);

        produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder ajouterIngredient(String nom, double qte) {
        produit.getIngredients().add(new Ingredient(nom, qte));
        return this;
    }

    public ProduitBuilder ajouterAdditif(String nom, double qte) {
        produit.getAdditifs().add(new Additif(nom, qte));
        return this;
    }

    public ProduitBuilder ajouterAllergene(String nom, double qte) {
        produit.getAllergenes().add(new Allergene(nom, qte));
        return this;
    }

    public Produit build() {
        return this.produit;
    }
}
