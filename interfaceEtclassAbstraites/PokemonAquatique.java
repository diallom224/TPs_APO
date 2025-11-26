
public abstract class PokemonAquatique extends Pokemon {
    private final int  nbNageoires;

    protected PokemonAquatique(String nom, double poids, int nbNageoires) {
        super(nom, poids);
        this.nbNageoires = nbNageoires;
    }

    protected int getNbNageoires() { return nbNageoires; }

    @Override
    public String toString() {
        String prefix = super.toString();
        return prefix + "ma vitesse est de " + getVitesse() + " km/h, et j'ai " + nbNageoires + " nageoires.";
    }
}
