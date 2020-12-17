package a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestProduit {
    /**
     * Rigorous Test.
     */
    @Test

    void calculeUnProduit() {

        // ARRANGE

        int prixHT = 40;
        TypeProduit type = new TypeProduit(5, 1);
        Produit produit = new Produit(666, "Coca", prixHT, type);

        // AGIS

        double res = produit.calculePrixTTC();

        // ASSERT

        assertEquals(42, res, "Devrait renvoyer le prix TTC ");
    }
}