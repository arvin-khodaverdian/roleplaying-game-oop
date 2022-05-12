package character;

import java.util.Random;
import attack.Attack;
import attack.Attack.Target;
import attack.Attack.Type;

public class Player extends Character {
	private static Attack[] DATABASE = {new Attack(20, "Reaping chest hair", Type.HEAVY, Target.PROTECTION), };
	private Attack[] attacks;
	public static int turn = 1;
	
	
	public Player(int health2, int protection2, int stamina2) {
		super(health2, protection2, stamina2);
		for(int i = 0; i < 4; i++) {
			attacks[i] = setAttack();
		}
		

		
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
	
	public Attack setAttack() {
		int a = 0;
		
		Random ran = new Random();
		a = ran.nextInt(100);
		int b = ran.nextInt(34);
		if(a < 70) {
			while(! DATABASE[b].isLight())
				b = ran.nextInt(34);
			return DATABASE[b];
		}
		else {
			while(! DATABASE[b].isHeavy())
				b = ran.nextInt(34);
			return DATABASE[b];
		}
		
	}
}
