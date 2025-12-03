package quincaillerie;

import java.util.ArrayList;

public class Catalogue {
    protected ArrayList<Piece> liste;
    
    public Catalogue() {
        liste = new ArrayList<>();
    }
    
    private boolean estPresente(Piece piece) {
        return liste.contains(piece);
    }
    
    public void ajoute(Piece p) {
        if (!estPresente(p)) {
            liste.add(p);
        }
    }
    
    public void affiche() {
        System.out.println("Catalogue :");
        for (Piece p : liste) {
            p.affiche();
            System.out.println("------------");
        }
    }
}