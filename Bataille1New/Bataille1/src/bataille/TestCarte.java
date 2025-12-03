package bataille;

public class TestCarte {
    public static void main(String[] args) {
        // TODO
    	Carte carte = new Carte(Couleur.COEUR, Valeur.DAME);
    	System.out.println("carte1 : "+ carte.getNom());

    	for(int i=0; i<10; i++){
    		Carte cartehasard = new Carte();
    		System.out.println("carte"+(i+1)+" : " + cartehasard.getNom());
    	}

    }
}