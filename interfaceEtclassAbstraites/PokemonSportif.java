

public class PokemonSportif extends PokemonTerrestre {
    protected int frequenceCardiaque;

    public PokemonSportif(String nom, double poids, int nbPattes, double taille, int frequenceCardiaque) {
        super(nom, poids, nbPattes, taille);
        this.frequenceCardiaque = frequenceCardiaque;
    }

    @Override
    public String toString() {
        String prefix = super.toString();
        return prefix + "ma fréquence cardiaque est de " + frequenceCardiaque + " pulsations à la minute";
    }
}
