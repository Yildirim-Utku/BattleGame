package epicbattle;

import java.util.Random;

public class Witch extends Warrior {

	 public Witch(int id, String name, int health, int damage) {
	        super(id, name,800, damage);
	        rnd= new Random();
	}
     @Override
     public int attack(Warrior warrior) {
         int damageDealt=50;
         int randomDamage=rnd.nextInt(40);
         int totalDamage=damageDealt+randomDamage;
         if (getHealth() <= 100) {
             totalDamage*=3;
             System.out.println(getName() + " , " + warrior.getName() + " 'i " + totalDamage + " ile zehirledi!");
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
