// Student Name: Jang, Eunbee
// Student Number: 260658722


import java.io.*;
import java.util.ArrayList;

public class FileIO {

	
	// The constructor
	public FileIO() {		
		
	}
	
	// Reads and fetches the character information(name, attack value, maximum health, number of wins) from a file
	// Then creates a player with the information pulled from the file
	public static Character readCharacter(String fileName){
		
		try{		
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			String name = br.readLine();
			double attack = Double.parseDouble(br.readLine());
			double maxHealth = Double.parseDouble(br.readLine());
			int numWin = Integer.parseInt(br.readLine());
			
			br.close();
			fr.close();
			
			Character newUser = new Character(name, attack, maxHealth, numWin);
			return newUser;
			
		} catch (FileNotFoundException e){
			throw new IllegalArgumentException("Could not find the file :" + fileName);

		} catch (IOException e){
			throw new IllegalArgumentException("Problem with the file :" + fileName);
		}
		
	}
	
	
	// Reads and fetches the spell information from a file
	// Then assigns spell values and returns the information about the spell
	public static ArrayList<Spell> readSpells(String fileName){
		ArrayList<Spell> spellInfo = new ArrayList<Spell>();
		
		try{
			FileReader fr2 = new FileReader(fileName);
			BufferedReader br2 = new BufferedReader(fr2);
			
			String currentLine = br2.readLine();
			
			// Splits the information in String as separate elements
			while(currentLine != null){
			    String[] items = currentLine.split(" ");
			    String name = items[0];
			    double minDamage = Double.parseDouble(items[1]);
			    double maxDamage = Double.parseDouble(items[2]);
			    double chance = Double.parseDouble(items[3]);
			    Spell temp = new Spell(name, minDamage, maxDamage, chance);
	
				spellInfo.add(temp);
				currentLine = br2.readLine();
			}
			
			br2.close();
			fr2.close();
			
			return spellInfo;
			
		} catch (FileNotFoundException e){
			throw new IllegalArgumentException("Could not find the file :" + fileName);

		} catch (IOException e){
			throw new IllegalArgumentException("Problem with the file :" + fileName);
		}
		
	}
	
	
	// Overwrites the new information about the character after a battle is done
	public static void writeCharacter (Character who, String fileName){
		
		try{
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(who.getName() + "\n");
			bw.write(who.getAttack() + "\n");
			bw.write(who.getMaxHealth() + "\n");
			bw.write(who.getNumWin() + "\n");
			
			bw.close();
			fw.close();
			
		} catch (IOException e){
			throw new IllegalArgumentException("Problem with the file :" + fileName);
		}

	}
		
}
	

