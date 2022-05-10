package character;

import attack.Attack;

public class Enemy extends Character{
	private static Attack[] DATABASE;
	private Attack[] attacks;

	public Enemy(int health, int protection, int stamina) {
		super(health, protection, stamina);
		
	}
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
