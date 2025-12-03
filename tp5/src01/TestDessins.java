public class TestDessins {
	 public static void main(String[] args) {
        DessinateurFigures fig = new DessinateurFigures();
        System.out.println("(a) - Dessin d'un carré de 5x7: ");
        fig.rectangle(5, 7);
        System.out.println("(b) - Dessin d'un triangle gauche de 8: ");
        fig.triangleGauche(8);
        System.out.println("(c) - Dessin d'un triangle droite de 7: ");
        fig.triangleDroite(7);
        System.out.println("(d) - Dessin d'un triangle isocelle de 6: ");
        fig.triangleIso(6);
        
    }
}