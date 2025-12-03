package bataille;

public class Joueur {

    // TODO
	String nom;
	Carte carte;


	// le constructeur avec le para mettre 
	Joueur(String nom){
		this.nom = nom;
		this.carte = null;
	}

	// la methode qui initialise la carte prise par le joueur .
	void prendre(Carte carte){
		this.carte = carte;
	}

	Carte jouer() throws JoueurException {
        if (carte == null) {
        	// le cas ou le joueur aurrais plus de carte en main 
            throw new JoueurException("opération invalide, le joueur n'a plus de carte");
        }
        Carte c = carte;
        carte = null; // le joueur n'a plus de carte après l'avoir jouée
        return c;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }
}