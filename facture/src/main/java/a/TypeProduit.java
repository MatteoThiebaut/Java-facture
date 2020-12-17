package a;

public class TypeProduit {
    private double tva;
    private int type;

    public TypeProduit(double tva, int type) {
        this.tva = tva;
        this.type = type;
    }

    public double getTVA() {
        return tva;
    }

    public void setPrixTTC(int tva) {
        this.tva = tva;
    }
}