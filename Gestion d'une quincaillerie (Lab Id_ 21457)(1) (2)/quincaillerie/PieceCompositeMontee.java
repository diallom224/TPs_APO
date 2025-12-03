package quincaillerie;

import java.util.ArrayList;

public class PieceCompositeMontee extends PieceComposite {
    
    protected int dureeMontage;   
    protected double prixMontage; 
    
    public int getDureeMontage() {
        return dureeMontage;
    }
 
    public PieceCompositeMontee(String nom, String reference, int dureeMontage, double prixMontage) {
        super(nom, reference);
        this.dureeMontage = dureeMontage;
        this.prixMontage = prixMontage;
        this.liste = new ArrayList<>();
    }
    
    @Override
    protected void setReference(String reference) {
        this.reference = "00" + reference;
    }
    
    @Override
    public void affiche() {
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
        System.out.println("durée de montage atelier : " + dureeMontage + " jour(s)");
        System.out.println("prix du montage : " + prixMontage + " euros");
        System.out.println("composants :");
        for (Piece p : liste) {
            System.out.println("   " + p.toString());
        }
    }
    
    @Override
    public double prix() {
        double total = prixMontage;
        for (Piece p : liste) {
            total += p.prix();
        }
        return total;
    }
    
    @Override
    public int dureeGarantie() {
        return dureeGarantieDeBase() + 6;
    }
    
    @Override
    public int dureeGarantieDeBase() {
        if (liste.isEmpty()) {
            return 0;
        }
        int minGarantie = Integer.MAX_VALUE;
        for (Piece p : liste) {
            int g = p.dureeGarantieDeBase();
            if (g < minGarantie) {
                minGarantie = g;
            }
        }
        return minGarantie;
    }
    
    @Override
    public int dureeFabrication() {
        int maxFabrication = 0;
        for (Piece p : liste) {
            int d = p.dureeFabrication();
            if (d > maxFabrication) {
                maxFabrication = d;
            }
        }
        return maxFabrication + dureeMontage;
    }
    @Override
    public void ajoute(Piece p) {
        liste.add(p);
    }
}