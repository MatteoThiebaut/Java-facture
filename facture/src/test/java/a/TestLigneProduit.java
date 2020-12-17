package a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestLigneProduit {
    /**
     * Rigorous Test.
     */
    @Test

    void prixTotalAvecTVA() {

        // ARRANGE

        int prixHT = 100;
        TypeProduit type = new TypeProduit(5.5, 1);
        Produit p = new Produit(1, "produit", prixHT, type);
        LigneProduit ligneProduit = new LigneProduit(10, p);

        // AGIS

        double res = ligneProduit.getTotalTTC();

        // ASSERT

        assertEquals(1055, res, "Devrait renvoyer le prix TTC ");
    }

    /**
     * Rigorous Test.
     */
    @Test

    void prixTotalSansTVA() {

        // ARRANGE

        int prixHT = 100;
        TypeProduit type = new TypeProduit(0, 1);
        Produit p = new Produit(1, "produit", prixHT, type);
        LigneProduit ligneProduit = new LigneProduit(10, p);

        // AGIS

        double res = ligneProduit.getTotalHT();

        // ASSERT

        assertEquals(1000, res, "Devrait renvoyer le prix TTC ");
    }
}
