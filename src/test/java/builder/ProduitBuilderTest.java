package builder;

import org.junit.Test;
import junit.framework.TestCase;
import org.sebsy.builder.ProduitBuilder;
import org.sebsy.builder.beans.Produit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ProduitBuilderTest {
    @Test
    public void testBuildNominal() {
        Produit p = new ProduitBuilder()
                .avecNomEtGrade("Pâte à tartiner", "A")
                .avecCategorie("Epicerie sucrée")
                .avecMarque("MarqueRepère")
                .ajouterIngredient("Sucre", 50.0)
                .ajouterAllergene("Noisettes", 10.0)
                .ajouterAdditif("E322", 1.0)
                .build();

        assertNotNull(p);
        assertEquals("Pâte à tartiner", p.getNom());
        assertEquals("MarqueRepère", p.getMarque().getNom());
        assertEquals(1, p.getIngredients().size());
    }
}
