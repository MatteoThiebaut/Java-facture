package a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestProduitAvecTVA {
    /**
     * Rigorous Test.
     */
    @Test

    void produitsAvecTVA() {

        // ARRANGE

        TypeProduit TVA = new TypeProduit(5.5, 0);
        int prixHT = 100;
        Produit p = new Produit(1, "produit", prixHT, TVA);

        // AGIS

        double res = p.calculePrixTTC();

        // ASSERT

        assertEquals(105.5, res, "Devrait renvoyer le prix TTC ");
    }
}
