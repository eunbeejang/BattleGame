// Student Name: Jang, Eunbee
// Student Number: 260658722


import java.util.ArrayList;
import java.util.Random;

public class Character {

	
	private String name;
	private double attack;
	private double maxHealth;
	private double currentHealth;
	private int numWin;
	private static ArrayList<Spell> spells;

	
	// The constructor
	public Character(String name, double attack, double maxHealth, int numWin){
		this.name = name;
		this.attack = attack;
		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;
		this.numWin = numWin;	
	}
	
	
	// Calculates how much attack damage one character does in a battle
	// Character's attack value * random value between 0.3(inclusive) and 0.7(exclusive) 
	public double calcAttack(){
		Random randomNum = new Random();
		double random = 0;
		double min = 0.3;
		double max = 0.7;
		double range = max - min;
		
		double attackValue = 0;
		random = randomNum.nextDouble();
		attackValue = min + (random * (range));
		attackValue = attack * attackValue;
		
		return attackValue;
	}
	
	
	// Subtracts the damage value from the current health of a player
	public void takeDamage(double attack){
		this.currentHealth = this.currentHealth - attack;
	}
	
	
	// Increases win number whenever a player wins a game
	public void increaseWins(){
		this.numWin += 1;
	}
	
	
	public void setSpells(ArrayList<Spell> spells){
	    this.spells = spells;
	}
	
	
	// When a spell is casted, the method checks whether the player called out the right spell to use
	public double castSpell(String spellName){
		double damage = 0;
		boolean checker = true;

		for(int i = 0; i < this.spells.size(); i++){	
			System.out.println();
			// if the player calls out the right spell
			if(this.spells.get(i).getName().equalsIgnoreCase(spellName)){
				damage = this.spells.get(i).getDamage();
				// this damages the counter-player with given damage value
				if(damage > 0){
					System.out.println(name + " casted " + spellName + " for damage of " + damage);
					checker = true;
					break;
				// otherwise, the player fails to cast the spell on the enemy
				} else {
					System.out.println(name + " tried to cast " + spellName + ", but they failed.");
					checker = true;
					break;
				}
		// if the player calls the wrong spell, do not damage the enemy		
			} else{
				checker = false;
			}
		} if (!checker){
			System.out.println(name + " tried to cast " + spellName + ", but they don't know that spell.");
		}
		return damage;
	}
	
	
	// Returns and prints out a String consisting of the character's name and current health
	public String toString(){
		return "Name of the player : " + name + "\n" + " [Health : " + currentHealth + "] \n [Attack Value : " + attack + "] \n [Number of Wins : " + numWin +"] \n";  
	}
	
	
	// The getter methods
	public Double getCurrentHealth() {
		return this.currentHealth;
	}
	
	public Double getMaxHealth() {
		return this.maxHealth;
	}
	
	public int getNumWin() {
		return this.numWin;
	}
	
	public Double getAttack() {
		return this.attack;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
