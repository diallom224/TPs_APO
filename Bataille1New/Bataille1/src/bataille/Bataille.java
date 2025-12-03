package bataille;

public class Bataille {
    private Joueur joueurGauche;
    private Joueur joueurDroite;
    private Carte carteGauche;
    private Carte carteDroite;

    // Constructeur : crée deux joueurs avec leurs noms
    public Bataille(String nomGauche, String nomDroite) {
        this.joueurGauche = new Joueur(nomGauche);
        this.joueurDroite = new Joueur(nomDroite);
        this.carteGauche = null;
        this.carteDroite = null;
    }

    // Distribue une carte aléatoire à chaque joueur
    public void distribue() {
        Carte c1 = new Carte();
        Carte c2 = new Carte();

        // On s'assure que les deux cartes ne sont pas identiques
        while (c1.getNom().equals(c2.getNom())) {
            c2 = new Carte();
        }

        joueurGauche.prendre(c1);
        joueurDroite.prendre(c2);
    }

    // Chaque joueur joue sa carte
    public void jouerUnTour() throws JoueurException {
        this.carteGauche = joueurGauche.jouer();
        this.carteDroite = joueurDroite.jouer();
    }

    // Détermine le gagnant du tour
    public Joueur gagnant() {
        if (carteGauche == null || carteDroite == null) {
            return null; // pas de cartes jouées
        }

        int valeurGauche = carteGauche.getValeur().ordinal();
        int valeurDroite = carteDroite.getValeur().ordinal();

        if (valeurGauche > valeurDroite) {
            return joueurGauche;
        } else if (valeurDroite > valeurGauche) {
            return joueurDroite;
        } else {
            return null; // égalité → bataille
        }
    }

    // Affiche le tour
    public void afficheTour() {
        System.out.println("Le joueur " + joueurGauche.getNom() + " a joué un(e) " + carteGauche.getNom());
        System.out.println("Le joueur " + joueurDroite.getNom() + " a joué un(e) " + carteDroite.getNom());
    }
}
