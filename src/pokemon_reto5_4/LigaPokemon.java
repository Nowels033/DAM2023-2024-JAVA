package pokemon_reto5_4;

import java.util.ArrayList;
import java.util.Scanner;

public class LigaPokemon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PokemonFuego charizard = new PokemonFuego("CHARIZARD", 1000, 1000);

		PokemonPlanta marihuano = new PokemonPlanta("MARIHUANO", 100000, 100000);

		PokemonAgua psiduck = new PokemonAgua("PSIDUCK", 500, 1000);

		Pokemon monguer = new Pokemon("MONGUER", 100, 150);

		ArrayList<Pokemon> ligaPokemon = new ArrayList<>();

		ligaPokemon.add(charizard);
		ligaPokemon.add(marihuano);
		ligaPokemon.add(psiduck);
		ligaPokemon.add(monguer);

		System.out.println("-Pokemons para elegir:");
		// Mostramos los pokemon a elegir
		for (int i = 0; i < ligaPokemon.size(); i++) {
			System.out.println("-" + ligaPokemon.get(i).getNombre());
		}
		System.out.println("Introduce el Pokemon que quieras usar:");
		String pokemonElegido = sc.nextLine().toUpperCase();

		// Mostramos los pokemon para combatir
		System.out.println("Pokemons contra los que puedes Luchar!!!!!!!");
		for (int i = 0; i < ligaPokemon.size(); i++) {
			if (!pokemonElegido.equalsIgnoreCase(ligaPokemon.get(i).getNombre())) {
				System.out.println("-" + ligaPokemon.get(i).getNombre());
			}

		}
		System.out.println("Elije el Pokemon a combatir");
		String pokemonCombatir = sc.nextLine().toUpperCase();

		boolean finBatalla = false;

		for (int i = 0; i < ligaPokemon.size()&&!finBatalla; i++) {
			if (pokemonElegido.equalsIgnoreCase(ligaPokemon.get(i).getNombre())) {

				for (int j = 0; j < ligaPokemon.size(); j++) {

					if (pokemonCombatir.equalsIgnoreCase(ligaPokemon.get(j).getNombre())) {

						do {
							ligaPokemon.get(i).atacar(ligaPokemon.get(j));
							finBatalla = ligaPokemon.get(j).isDead();
							if (finBatalla) {
								System.out.println("EL ganador es " + ligaPokemon.get(i).getNombre());
								System.out.println("ERES EL GANADOR");
							}
							ligaPokemon.get(j).atacar(ligaPokemon.get(i));
							finBatalla = ligaPokemon.get(i).isDead();
							if (finBatalla) {
								System.out.println("EL ganador es " + ligaPokemon.get(j).getNombre());
								System.out.println("PERDISTE!!!!!!!!!");
							}
						} while (!finBatalla);

					}

				}

			}
		}
	}

}
