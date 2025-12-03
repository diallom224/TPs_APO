package bataille;

public class TestJoueur {
	public static void main(String[] args){
		// ma class test joueur 

		Joueur joueur;
		joueur = new Joueur("Alice");
        Carte carteAleatoire;
        carteAleatoire = new Carte();

		// creation de carte aleatoiure 
		joueur.prendre(carteAleatoire);
        System.out.println("Carte donnée au joueur " + joueur.getNom() + " : " + carteAleatoire.getNom());

        
        try {
            Carte joue = joueur.jouer();
            System.out.println("Carte jouée : " + joue.getNom());
        } catch (JoueurException e) {
            System.out.println("Erreur inattendue : " + e.getMessage());
        }

        // Essai de rejouer sans carte (deuxième fois) -- doit déclencher et capturer l'exception
        try {
            Carte joue = joueur.jouer();
            System.out.println("Carte jouée : " + joue.getNom());
        } catch (JoueurException e) {
            System.out.println("Deuxième tentative : exception capturée -> " + e.getMessage());
        }
	}
}	