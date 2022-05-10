package character;

import attack.Attack;

public class Player extends Character {
	public Player(int health2, int protection2, int stamina2) {
		super(health2, protection2, stamina2);
		
	}
	private static Attack[] DATABASE;
	private Attack[] attacks;
	public Attack[] getAttacks() {
		return attacks;
	}
	public void setAttacks(Attack[] attacks) {
		this.attacks = attacks;
	}
	public static Attack[] getDATABASE() {
		return DATABASE;
	}
}
