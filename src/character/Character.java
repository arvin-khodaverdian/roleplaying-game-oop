package character;

public abstract class Character {
	private int health;
	private int protection;
	private int stamina;
	
	
	
	public Character(int health2, int protection2, int stamina2) {
		health = health2;
		protection = protection2;
		stamina = stamina2;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getProtection() {
		return protection;
	}
	public void setProtection(int protection) {
		this.protection = protection;
	}
	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	


	
	
}
