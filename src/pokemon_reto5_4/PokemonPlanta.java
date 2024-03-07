package pokemon_reto5_4;

public class PokemonPlanta extends Pokemon{
//Los Pokemon Planta son súper eficaces contra los Pokemon Agua y les zurran el doble (2 * FuerzaDeAtaque).
//Sin embargo son la mitad de eficaces cuando se enfrentan a un Pokemon Planta o Fuego (0.5* FuerzaDeAtaque).
//. A los Pokemon normales les dan la caña normal (reducción de FuerzaDeAtaque puntos)
	/**
	 * @param nombre
	 * @param healthPoints
	 * @param fuerzaDeAtaque
	 */
	public PokemonPlanta(String nombre, int healthPoints, int fuerzaDeAtaque) {
		super(nombre, healthPoints, fuerzaDeAtaque);
		// TODO Esbozo de constructor generado automáticamente
	}
	public void atacar(Pokemon pokemon) {

		if (pokemon instanceof PokemonAgua) {

			this.setFuerzaDeAtaque(getFuerzaDeAtaque() * 2);
			System.out.println(this.getNombre()+" le hace un ataque a "+pokemon.getNombre()+" de :"+this.getFuerzaDeAtaque());
			pokemon.setHealthPoints(pokemon.getHealthPoints() - this.getFuerzaDeAtaque());
		}

		if ((pokemon instanceof PokemonFuego) || ((pokemon instanceof PokemonPlanta))) {
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
