

public class PokemonCroisiere extends PokemonAquatique {

    public PokemonCroisiere(String nom, double poids, int nbNageoires) {
        super(nom, poids, nbNageoires);
    }

    @Override
    public double getVitesse() {
        return (getPoids() / 25 * getNbNageoires()) / 2;
    }
}
