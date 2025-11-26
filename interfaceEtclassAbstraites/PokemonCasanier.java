

public class PokemonCasanier extends PokemonTerrestre {
    private final double nbHeuresTele;

    public PokemonCasanier(String nom, double poids, int nbPattes, double taille, double nbHeuresTele) {
        super(nom, poids, nbPattes, taille);
        this.nbHeuresTele = nbHeuresTele;
    }

    @Override
    public String toString() {
        String prefix = super.toString();
        return prefix + "je regarde la télé " + nbHeuresTele + " heures par jour";
    }
}
