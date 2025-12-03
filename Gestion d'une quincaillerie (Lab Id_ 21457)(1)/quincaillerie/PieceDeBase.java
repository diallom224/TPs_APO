package quincaillerie;

public class PieceDeBase extends Piece {
    protected double prix;
    protected int dureeGarantie;
    protected int dureeFabrication;
    
    public PieceDeBase(String nom, String reference, double prix, int dureeGarantie, int dureeFabrication) {
        super(nom, reference);
        if (prix < 0) prix = 0;
        if (dureeGarantie < 0) dureeGarantie = 0;
        if (dureeFabrication < 0) dureeFabrication = 0;
        this.prix = prix;
        this.dureeGarantie = dureeGarantie;
        this.dureeFabrication = dureeFabrication;
        setReference(reference);
    }
    
    @Override
    protected void setReference(String reference) {
        if(reference.length() != 6){
            this.reference = "00"+reference;
        }
    }
    

    @Override
    public void affiche() {
        System.out.println("nom : " + nom);
        System.out.println("reference : " + reference);
        System.out.println("prix : " + prix + " euros");
        System.out.println("garantie :" + dureeGarantie + " mois");
        System.out.println("duree de fabrication : " + dureeFabrication + " jour(s)");
        System.out.println();
    }

    
    @Override
    public double prix() {
        return prix;
    }
    
    @Override
    public int dureeGarantie() {
        return dureeGarantie;
    }
    
    @Override
    public int dureeGarantieDeBase() {
        return dureeGarantie;
    }
    
    @Override
    public int dureeFabrication() {
        return dureeFabrication;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getReference() {
        return reference;
    }
}