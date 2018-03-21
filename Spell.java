
import java.util.Random;

public class Spell {

	private String name;
	private double minDamage;
	private double maxDamage;
	private double chance;
	
	
	// The constructor
	public Spell(String name, double minDamage, double maxDamage, double chance){
		if (minDamage < 0 || minDamage > maxDamage || chance < 0 || chance > 1) {
			throw new IllegalArgumentException("Wrong input");
		}
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.chance = chance;
	}

	
	// The getters
	// returns the name of the spell
	public String getName() {
		return this.name;
	}	
	// returns the damage for a spell casting
	public double getDamage() {
		
		Random randomNum = new Random();
		double random = 0;
		double min = 0.;
		double max = 1;
		double range = max - min;
		
		double spellAttack = 0;
		random = randomNum.nextDouble();
		spellAttack = min + (random * (range));
		
		if(spellAttack > chance){
			return 0;
		} else {
			return spellAttack;
		}
	}
	

	// Prints and displays the spell information
	public String toString(){
		return "Name of the spell : " + name + "\n" + " [Minimum Damage : " + minDamage + "] \n [Maximum Damage : " + maxDamage + "] \n [Success of Chance : " + chance*100 +"%]\n\n";  
	}

	
}
