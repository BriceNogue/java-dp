package org.sebsy.factory;

import org.sebsy.factory.enums.TypeElement;
import org.sebsy.factory.enums.Unite;

public class ElementFactory {

    public static Element createElement(TypeElement type, String nom, double valeur, Unite unite) {
        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            default:
                throw new IllegalArgumentException("Type d'élément inconnu : " + type);
        }
    }
}
