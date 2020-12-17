package a;

public class LigneProduit {
    private int quantite;
    private Produit produit;

    public LigneProduit(int quantite, Produit produit) {
        this.quantite = quantite;
        this.produit = produit;
    }

    public double getTotalHT() {
        double total = produit.getPrixHT() * quantite;
        return total;
    }

    public double getTotalTTC() {
        double total = produit.calculePrixTTC() * quantite;
        return total;
    }

    public double setqte() {
        this.quantite = quantite;
    }

    public double getPrixHT() {
        return prixHT;
    }
}