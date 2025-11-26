
public abstract class PokemonTerrestre extends Pokemon {
    private final int nbPattes;
    private final  double taille;

    protected PokemonTerrestre(String nom, double poids, int nbPattes, double taille) {
        super(nom, poids);
        this.nbPattes = nbPattes;
        this.taille = taille;
    }

    @Override
    public double getVitesse() {
        return nbPattes * taille * 3;
    }

    @Override
    public String toString() {
        String prefix = super.toString();
        return prefix + "j'ai " + nbPattes + " pattes, ma taille est de " + taille + " m.";
    }
}
