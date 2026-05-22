package factory;

import org.junit.Test;
import org.sebsy.factory.Element;
import org.sebsy.factory.ElementFactory;
import org.sebsy.factory.Ingredient;
import org.sebsy.factory.Additif;
import org.sebsy.factory.Allergene;
import org.sebsy.factory.enums.TypeElement;
import org.sebsy.factory.enums.Unite;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FactoryTest {
    @Test
    public void testCreateIngredient() {
        Element el = ElementFactory.createElement(TypeElement.INGREDIENT, "Sucre", 10.5, Unite.MILLI_GRAMMES);

        assertTrue("Est une instance d'Ingredient", el instanceof Ingredient);
        assertEquals("Sucre", el.getNom());
    }

    @Test
    public void testCreateAdditif() {
        Element el = ElementFactory.createElement(TypeElement.ADDITIF, "E322", 500, Unite.MICRO_GRAMMES);

        assertTrue("Est une instance d'Additif", el instanceof Additif);
        assertEquals(Unite.MICRO_GRAMMES, el.getUnite());
    }

    @Test
    public void testCreateAllergene() {
        Element el = ElementFactory.createElement(TypeElement.ALLERGENE, "Gluten", 5, Unite.MILLI_GRAMMES);

        assertTrue("Est une instance d'Allergene", el instanceof Allergene);
    }
}
