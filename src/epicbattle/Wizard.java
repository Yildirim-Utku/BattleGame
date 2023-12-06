package epicbattle;

import java.util.Random;

public class Wizard extends Warrior {
	private Random random;

	 public Wizard(int id, String name, int health, int damage) {
	        super(id, name,600, damage);
	        random = new Random(); 
	}
	   
       
       @Override
       public int attack(Warrior warrior) {
           int damageDealt=50;
           int randomDamage=random.nextInt(40);
           int totalDamage=damageDealt+randomDamage;
           if (getHealth() <= 100) {
               totalDamage*=4;
               System.out.println(getName() + "	Kara büyü ile " + warrior.getName() + " karakterine " + totalDamage + " hasar verdi!");
           } else {
               damageDealt = getDamage();
               System.out.println(getName() + " => " + warrior.getName() + " karakterine " + totalDamage + " hasar verdi.");
           }
           warrior.setHealth(warrior.getHealth() - totalDamage);
           
           if (warrior.getHealth()<=0) {
        	   warrior.setHealth(0);
           }

           return warrior.getHealth();
       }
   
		 
		 
	 }


