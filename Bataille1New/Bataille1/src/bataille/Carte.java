package bataille;

import java.text.Normalizer;
import java.util.regex.Pattern;

import java.util.Random;
/**
 * Classe Carte.
 *
 * 0- Attributs:
 * 		se repporter au diagramme UML de classes  pour le nom et le type des attributs
 *
 * 1- Constructeurs:
 * 
 * Unconstructeur sans paramètre de la classe carte choisit une couleur au hasard parmi
 * les couleurs possibles et une valeur au hasard parmi les valeurs possibles.
 * Note: pour choisir une valeur >= 0 et < 1 , vous pouvez utiliser la méthode Math.random()
 * Note: pour connaître toutes les valeur possibles d'une énumeration Enum, vous pouvez utiliser
 * Enum[] valeursPossiblesDeEnum = Enum.values();
 *
 * Unconstructeur qui prend 2 paramètres, affecte les références passées en paramètre sans les copier.
 *
 *  2- méthode toString
 *  Renvoie une chaîne de caractère sous la forme: "As de trèfle" ou "Roi de coeur".
 *
 *  3- méthode egale
 *  Renvoie vrai si la carte courante et la carte passée en paramètre ont la
 *  même couleur et la même valeur. renvoie faux sinon.
 *
 *  4- méthode getFichierImage
 *  Renvoie une chaîne de caractères coforme aux noms des fichiers des images dans le répertoire "images".
 *  Attention, la chaîne de caractères est sans accents et avec l'extension.
 *
 * @author cfouard
 * @author Ph. Genoud
 */
public class Carte {

    // A COMPLETER

	/**
	 * Ne PAS modifier cette méthode. Vous pouvez l'utiliser dans l'exercice 8
	 * 
	 * Supprime tous les accents et caractères diacritiques (les accents, cédilles, trémas, etc.)
	 * d'une chaîne de caractères.
	 * 
	 * @param s la chaîne à traiter
	 * 
	 * @return une chaîne sans accents ni caractères diacritiques. Par exemple :
	 * 
	 *         - sansAccent("trèfle") renverra "trefle"
	 * 
	 *         - sans accent("valet-de-cœur") renverra "valet-de-coeur"
	 */

	Couleur couleur;
	Valeur valeur;

	Carte(Couleur couleur, Valeur valeur){
		this.couleur = couleur;
		this.valeur = valeur;
	}

	Carte(){
		Couleur[] couleurPossibles = Couleur.values();
		Valeur[] valeurPossibles = Valeur.values();

		int indexcouleur = (int)( Math.random()*couleurPossibles.length);
		int indexvaleur = (int)( Math.random()*valeurPossibles.length);

		this.couleur = couleurPossibles[indexcouleur];
		this.valeur = valeurPossibles[indexvaleur];
	}

	String getNom(){

		return valeur.getNom()+" de "+ couleur.getNom();

	}

	boolean egale(Carte autre){

		return this.couleur == autre.couleur && this.valeur == autre.valeur;	
	}


	String sansAccent(String s) {
		// décompose les caractères accentués en leur caractère de base +
		// leur marque diacritique séparée (forme NFD = Normalization Form Decomposed).
		// Par exemple : "è" devient "e" + "◌̀" (caractère de base + accent grave séparé)
		String strTemp = Normalizer.normalize(s, Normalizer.Form.NFD);
		// utilise une expression régulière (pattern) pour identifier et supprimer tous les
		// caractères de la catégorie Unicode "Combining Diacritical Marks" (les accents, 
		// cédilles, trémas, etc.).
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(strTemp).replaceAll("");
	}
}
