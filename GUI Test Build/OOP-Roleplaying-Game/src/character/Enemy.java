package character;

import attack.Attack;
import attack.Attack.Target;
import attack.Attack.Type;

import java.util.Random;

public class Enemy extends Character{
	private static Attack[] DATABASE = {new Attack(20,"Reaping chest hair", Type.HEAVY, Target.PROTECTION),
			new Attack(50,"fist to the forehead", Type.HEAVY, Target.PROTECTION),
			new Attack(40,"fist to the cheek", Type.HEAVY, Target.PROTECTION),
			new Attack(35,"UpperCut", Type.HEAVY, Target.PROTECTION),
			new Attack(80,"kick in the groin", Type.HEAVY, Target.PROTECTION),

			new Attack(50,"knife attack", Type.HEAVY, Target.HEALTH),
			new Attack(70,"pistol shooting", Type.HEAVY, Target.HEALTH),
			new Attack(90,"machine gun shooting", Type.HEAVY, Target.HEALTH),
			new Attack(25,"breaking a leg", Type.HEAVY, Target.HEALTH),
			new Attack(40,"cutting one hand with a chainsaw", Type.HEAVY, Target.HEALTH),

			new Attack(50,"Crushing with a car", Type.HEAVY, Target.STAMINA),
			new Attack(20,"Crushing with a horse ", Type.HEAVY, Target.STAMINA),
			new Attack(40,"Poisoning", Type.HEAVY, Target.STAMINA),
			new Attack(70,"Shooting from an arrow", Type.HEAVY, Target.STAMINA),
			new Attack(20,"Very strong push", Type.HEAVY, Target.STAMINA),


			new Attack(10,"Mumble rapping", Type.LIGHT, Target.STAMINA),
			new Attack(15,"Putting on Armenian Rabiz Music ", Type.LIGHT, Target.STAMINA),
			new Attack(5,"Pushing", Type.LIGHT, Target.STAMINA),
			new Attack(10,"frightening with a gun", Type.LIGHT, Target.STAMINA),
			new Attack(10,"hit the knees from behind", Type.LIGHT, Target.STAMINA),

			new Attack(15,"small cut with a knife", Type.LIGHT, Target.HEALTH),
			new Attack(10,"shooting one knee", Type.LIGHT, Target.HEALTH),
			new Attack(15,"hitting the head with a stick", Type.LIGHT, Target.HEALTH),
			new Attack(3,"hitting the head with a finger", Type.LIGHT, Target.HEALTH),
			new Attack(10,"pencil attack in Style of John Wick", Type.LIGHT, Target.HEALTH),

			new Attack(10,"Usual Slap", Type.LIGHT, Target.PROTECTION),
			new Attack(10,"Hitting the opponents legs", Type.LIGHT, Target.PROTECTION),
			new Attack(5,"Getting the opponent undressed by singing the song 'Undressed'", Type.LIGHT, Target.PROTECTION),
			new Attack(5,"baby hit", Type.LIGHT, Target.PROTECTION),
			new Attack(15,"throwing a stone to the opponent ", Type.LIGHT, Target.PROTECTION),

			new Attack(25,"Slap in style of Will Smith", Type.SPECIAL, Target.PROTECTION, Target.STAMINA),
			new Attack(10,"Cutting Opponents hair", Type.SPECIAL, Target.PROTECTION, Target.HEALTH),
			new Attack(100,"Five point Heart Exploding Technique", Type.SPECIAL, Target.PROTECTION, Target.HEALTH, Target.STAMINA),


			new Attack(-30,"Drinking Hay-Cola", Type.SUPPLY, Target.PROTECTION),
			new Attack(-50,"Using first aid kit", Type.SUPPLY, Target.HEALTH),
			new Attack(-40,"gypsum healing", Type.SUPPLY, Target.STAMINA),


	} ;
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
	public Attack setAttack() {
		int a = 0;

		Random ran = new Random();
		a = ran.nextInt(100);
		int b = ran.nextInt(DATABASE.length);
		if(a < 70) {
			while(! DATABASE[b].isLight())
				b = ran.nextInt(DATABASE.length);
			return DATABASE[b];
		}
		else {
			while(! DATABASE[b].isHeavy())
				b = ran.nextInt(DATABASE.length);
			return DATABASE[b];
		}

	}
	@Override
	public String toString(){
		return getHealth()+ " " + getProtection() + " " + getStamina();
	}
	public static void main(String[] args){

	}
}
