package attack;

public class Attack {
	private int damage;
	private String name;
	public enum Type {LIGHT, HEAVY, SPECIAL};
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
	public Attack(int damage, String name, Type type) {
		this.damage = damage;
		this.name = name;
		this.type = type;
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
		
	/** toString() gives the data of our object in one line (Might be used when we try to view the stats of the attack on the interface) */
	public String toString() {
			return "The attack " + name + " of type " + type + " deals " + damage + " damage."; 			
		
	}
	
	/** removes the object after it is used */
	public void remove() {
		if(initialized) {
			name = null;
			damage = 0;
			type = null;
			
		}
			
	}

	

	
}
