package attack;

import java.util.ArrayList;

import character.Enemy;

public class Attack {
	private int damage;
	private String name;
	public enum Type {LIGHT, HEAVY, SPECIAL, SUPPLY};
	public enum Target {HEALTH, STAMINA, PROTECTION};
	private ArrayList<Target> target;
	private Type type;
	private boolean initialized;
	private static int count = 0;
	
	/** constructors */	
	// no arg
	public Attack() {
		damage = 0;
		name = null;
		type = null;
		initialized = false;
		count++;
	}
	
	//with arg
	public Attack(int damage, String name, Type type, Target ... target) {
		this.damage = damage;
		this.name = name;
		this.type = type;
		//Array List
		for(Target element : target) {
			this.target.add(element);
		}
		initialized = false;
		count++;

	}
	
	
	/** accessors */
	public int getDamage() {
		return this.damage;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Type getType() {
		return this.type;
	}
	public boolean getState() {
		return this.initialized;
	}
	public static int getCount() {
		return count;
	}
	public ArrayList<Target> getTarget() {
		return target;
	}
	/** mutators */
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public void setState(boolean initialized) {
		this.initialized = initialized;
	}
	public void setTarget(ArrayList<Target> target) {
		for(int i = 0; i < target.size(); i++)
			this.target.add(target.get(i));
	}
		
	/** toString() gives the data of our object in one line (Might be used when we try to view the stats of the attack on the interface) */
	public String toString() {
			return "The attack " + name + " of type " + type + " deals " + damage + " damage."; 			
		
	}
	
	public void attackEnemy(Enemy enemy) {
		for(int i = 0; i < target.size(); i++) {
			if(target.get(i).equals(Target.values()[0])) {
				enemy.setHealth(enemy.getHealth() - damage);
			}
				
			else if(target.get(i).equals(Target.values()[1])) {
				enemy.setStamina(enemy.getStamina() - damage);
			}
			else {
				enemy.setProtection(enemy.getProtection() - damage);

			}
			
		}
		initialized = true;
		this.remove();
	}
	
	/** removes the object after it is used */
	public void remove() {
		if(initialized) {
			name = null;
			damage = 0;
			type = null;
			
		}
			
	}
	
	public boolean isLight() {
		if(this.type.equals(Type.LIGHT))
			return true;
		else
			return false;
	}
	public boolean isHeavy() {
		if(this.type.equals(Type.HEAVY))
			return true;
		else
			return false;
	}
	public boolean isSpecial() {
		if(this.type.equals(Type.SPECIAL))
			return true;
		else
			return false;
	}
	public boolean isSupply() {
		if(this.type.equals(Type.SUPPLY))
			return true;
		else
			return false;
	}

	

	
}
