package pokemon_reto5_4;

public class Pokemon {

//	Se crea una clase Pokemon, que va a contener los Pokemon normales con
//
//	los atributos:
//
//	Nombre del Pokemon: String
//	HealthPoints : int . Contiene los puntos de vida del Pokemon
//	FuerzaDeAtaque: int . La fuerza con la que un Pokemon ataca a otro Pokemon
//	los métodos:
//
//	Un constructor
//	getters
//	isDead() . Devuelve un boolean para indicar si un Pokemon está muerto (HealthPoints==0) o no
//	atacar(Pokemon) que permite al objeto Pokemon atacar a otro Pokemon pasado por parámetro. 
//	Esto reduce FuerzaDeAtaque puntos de la vida del Pokemon atacado.
//	toString()

	private String nombre;
	private int healthPoints;
	private int fuerzaDeAtaque;

	/**
	 * @param nombre
	 * @param healthPoints
	 * @param fuerzaDeAtaque
	 */
	public Pokemon(String nombre, int healthPoints, int fuerzaDeAtaque) {
		super();
		this.nombre = nombre;
		this.healthPoints = healthPoints;
		this.fuerzaDeAtaque = fuerzaDeAtaque;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el healthPoints
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * @param healthPoints el healthPoints a establecer
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	/**
	 * @return el fuerzaDeAtaque
	 */
	public int getFuerzaDeAtaque() {
		return fuerzaDeAtaque;
	}

	/**
	 * @param fuerzaDeAtaque el fuerzaDeAtaque a establecer
	 */
	public void setFuerzaDeAtaque(int fuerzaDeAtaque) {
		this.fuerzaDeAtaque = fuerzaDeAtaque;
	}
//	isDead() . Devuelve un boolean para indicar si un Pokemon está muerto (HealthPoints==0) o no.
//	atacar(Pokemon) que permite al objeto Pokemon atacar a otro Pokemon pasado por parámetro. 
//	Esto reduce FuerzaDeAtaque puntos de la vida del Pokemon atacado.

	public boolean isDead() {

		if (this.healthPoints <= 0) {

			return true;
		} else {
			return false;
		}
	}

	public void atacar(Pokemon pokemon) {
		System.out.println(
				this.getNombre() + " le hace un ataque a " + pokemon.getNombre() + " de :" + this.getFuerzaDeAtaque());

		pokemon.setHealthPoints(pokemon.getHealthPoints() - this.getFuerzaDeAtaque());

		System.out.println(
				"La vida de de :" + pokemon.getNombre() + " es de " + pokemon.getHealthPoints() + " puntos de vida");

	}

	@Override
	public String toString() {
		return "Pokemon [Nombre =" + getNombre() + ", HealthPoints =" + getHealthPoints() + ", FuerzaDeAtaque ="
				+ getFuerzaDeAtaque() + "]";
	}

}
