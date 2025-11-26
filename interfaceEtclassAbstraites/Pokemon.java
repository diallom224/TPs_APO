

public abstract class Pokemon {
    private final String nom;
    private final double poids;

    protected Pokemon(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    protected String getNom() { return nom; }
    protected double getPoids() { return poids; }

    public abstract double getVitesse();

    @Override
    public String toString() {
        return "Je suis le Pokemon " + getNom() + ", mon poids est de " + getPoids() + " kg, ";
    }
}
