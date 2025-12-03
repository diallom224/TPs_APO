package bataille;


public enum Couleur {
    // TODO
    PIQUE("pique"),
    COEUR("coeur"),
    CARREAU("carreau"),
    TREFLE("trefle");

    Couleur (String nom){
    	this.nom = nom;
    }

    String nom;

    public String getNom(){

    	return nom;

    }
}
