package pokemon_reto5_4;

public class PokemonFuego extends Pokemon {

//	Los Pokemon Fuego, son muy eficaces contra los Pokemon Planta y les sacuden mejor. Cuando un Pokemon Fuego ataca a un Pokemon Planta, 
//	a éste se le reducen 2 * FuerzaDeAtaque puntos de la vida . Sin embargo son muy poco eficaces cuando se enfrentan a un Pokemon Agua o a uno Fuego. 
//	En estos casos, al Pokemon atacado sólo se les deduce 0.5* FuerzaDeAtaque. 
//	A los Pokemon normales les dan la caña normal (deducción de FuerzaDeAtaque puntos)
//	

	/**
	 * @param nombre
	 * @param healthPoints
	 * @param fuerzaDeAtaque
	 */
	public PokemonFuego(String nombre, int healthPoints, int fuerzaDeAtaque) {
		super(nombre, healthPoints, fuerzaDeAtaque);

	}

	public void atacar(Pokemon pokemon) {

		if (pokemon instanceof PokemonPlanta) {

			this.setFuerzaDeAtaque(getFuerzaDeAtaque() * 2);
			System.out.println(this.getNombre()+" le hace un ataque a "+pokemon.getNombre()+" de :"+this.getFuerzaDeAtaque());
			pokemon.setHealthPoints(pokemon.getHealthPoints() - this.getFuerzaDeAtaque());
		}

		if ((pokemon instanceof PokemonAgua) || ((pokemon instanceof PokemonFuego))) {
			this.setFuerzaDeAtaque(getFuerzaDeAtaque() / 2);
			System.out.println(this.getNombre()+" le hace un ataque a "+pokemon.getNombre()+" de :"+this.getFuerzaDeAtaque());
			pokemon.setHealthPoints(pokemon.getHealthPoints() - this.getFuerzaDeAtaque());
		}

		else {
			System.out.println(this.getNombre()+" le hace un ataque a "+pokemon.getNombre()+" de :"+this.getFuerzaDeAtaque());
			pokemon.setHealthPoints(pokemon.getHealthPoints() - this.getFuerzaDeAtaque());
		}
		
		System.out.println("La vida de de :"+pokemon.getNombre()+" es de "+pokemon.getHealthPoints()+" puntos de vida");
	}

}
