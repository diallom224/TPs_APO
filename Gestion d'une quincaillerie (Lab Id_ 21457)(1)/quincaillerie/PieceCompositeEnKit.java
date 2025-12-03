package quincaillerie;

public class PieceCompositeEnKit extends PieceComposite {
    
    protected int dureeMontage;
    
    public PieceCompositeEnKit(String nom, String reference, int dureeMontage) {
        super(nom, reference);
        this.dureeMontage = dureeMontage;
    }
    
    @Override
    protected void setReference(String reference) {
        this.reference = "00" + reference;
    }
    
    @Override
    public double prix() {
        double total = 0;
        for (Piece p : liste) {
            total += p.prix(); 
        }
        return total;
    }
    
    @Override
    public int dureeGarantieDeBase() {
        if (liste.isEmpty()) {
            return 0;
        }
        int minGarantie = Integer.MAX_VALUE;
        for (Piece p : liste) {
            int dg = p.dureeGarantieDeBase();
            if (dg < minGarantie) {
                minGarantie = dg;
            }
        }
        return minGarantie;
    }
    
    @Override
    public int dureeGarantie() {
        return dureeGarantieDeBase() / 2;
    }
    
    @Override
    public int dureeFabrication() {
        int maxDuree = 0;
        for (Piece p : liste) {
            int df = p.dureeFabrication();
            if (df > maxDuree) {
                maxDuree = df;
            }
        }
        return maxDuree;
    }
    
    @Override
    public void affiche() {
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
        System.out.println("durée de montage particulier : " + dureeMontage + " mn");
        System.out.println("composants :");
        for (Piece p : liste) {
            System.out.println("   " + p.toString());
        }
    }
}