package a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestProduitSansTVA {
    /**
     * Rigorous Test.
     */
    @Test

    void produitsansTVA() {

        // ARRANGE

        TypeProduit pasDeTVA = new TypeProduit(0, 1);
        int prixHT = 100;
        Produit p = new Produit(1, "produit", prixHT, pasDeTVA);

        // AGIS

        double res = p.calculePrixTTC();

        // ASSERT

        assertEquals(prixHT, res, "Devrait renvoyer le prix HT ");
    }
}
