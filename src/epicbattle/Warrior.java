package epicbattle;

import java.util.Random;

public class Warrior {
	private int id;
	private String name;
	private int health;
	private int damage;
	Random rnd=new Random();
	
	public Warrior(int id, String name,int health,  int damage) {
		this.id = id;
		this.name = name;	
		this.damage = damage;
		this.health=health;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
		 
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getId() {
		return id;
	}
	public int attack(Warrior warrior) {
		int damageWarrior=rnd.nextInt(50)+25;
		System.out.println(this.getName()+" => "+warrior.getName()+" e "+damageWarrior+" ile saldırdı");
		 int newHealth = warrior.getHealth() - damageWarrior;
	
		
		    if (newHealth <= 0) {
		        newHealth = 0;
		    
		 }
		    warrior.setHealth(newHealth);
	 
		    return newHealth;
		 
	}

}
