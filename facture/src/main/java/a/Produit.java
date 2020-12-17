package a;

public class Produit {
    private int code;
    private String libelle;
    private int prixHT;
    private double prixTTC;
    private TypeProduit typeProduit;

    public Produit(int code, String libelle, int prixHT, TypeProduit typeProduit) {
        this.code = code;
        this.libelle = libelle;
        this.prixHT = prixHT;
        this.typeProduit = typeProduit;
    }

    public double getPrixTTC() {
        return prixTTC;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public double calculePrixTTC() {
        return prixTTC = (1 + typeProduit.getTVA() / 100) * prixHT;
    }

}
