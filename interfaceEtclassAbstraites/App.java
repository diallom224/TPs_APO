public class App {
	public static void main(String[] args){
		System.out.println("Construction de pokemonSportif : ");
		PokemonSportif pokemonSportif = new PokemonSportif("booba",12,4,1.70,90);
		System.out.println(pokemonSportif.toString());


		System.out.println("Construction de pokemonCasanier: ");
		PokemonCasanier pokemoncasanier = new PokemonCasanier("baba",9,4,1.40,120);
		System.out.println(pokemoncasanier.toString());


		System.out.println("Construction de PokemonCroisiere : ");
		PokemonCroisiere pokemonCroisiere = new PokemonCroisiere("keneki ken",21,2);

		// ma liste des pokemon:
		System.out.println("Ma collection de pokemon :  ");
		CollectionPokemon collection = new CollectionPokemon();
		collection.ajouterPokemon(pokemonSportif);
		collection.ajouterPokemon(pokemoncasanier);
		collection.ajouterPokemon(pokemonCroisiere);
		

		for (Pokemon p : collection) {
    		System.out.println(p);
		}

	}	
}
