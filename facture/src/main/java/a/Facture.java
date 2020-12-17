package a;

import java.util.Date;
import java.util.ArrayList;

public class Facture {
    private double montantTTC;
    private double montantHT;
    private ArrayList<Produit> produits = new ArrayList<Produit>();
    private int id;
    private Date date;

    private void facture(ArrayList<Produit> produit, int id, Date date) {
        this.produits = produits;
        this.id = id;
        this.date = date;

    }

    public void AjouterProduit(Produit produit) {
        produits.add(produit);
        (for i = 0 ; i<produits.size(); i++) {
            if(produit==produits.get(i).getProduit())
                produit.setqte(produit.getqte+qte)
                else
                produit.add(new LigneProduit())
    }

    public void RetirerProduit(ArrayList<Produit> produit) {
        produits.remove(produit);
    }
    }
}