
# BattleGame

This program is a battle game between a player and a monster.

While the monster and the player have health above zero, the program repeatedly asks the user for a command (attack, quit, or a name of a spell). If the user command was "attack", the program calculates the damage based on success rate. If both players’ current health is still above zero, their name and current health is displayed on the screen. The players can also cast spells by inputting the name of spells the user wish to use. The program terminates if the user command is a "quit".

Here is an example of the program.

	Name:  Odin Health:  30.00
	Attack:  10.00
	Number of Wins:  8
	Name:  Fenrir Health:  30.00
	Attack:  12.00 
	Number of Wins:  12 

	Spells:
	Name:  fireball Damage:  5.0-10.0 Chance:  50.0%
	Name:  icestorm Damage:  1.0-7.0 Chance:  90.0%
	Name:  meteorstrike Damage:  10.0-10.0 Chance:  5.0% 



	Enter a command: 
	fireball

	Odin tried to cast fireball, but they failed
	Fenrir attacks for 9.84 damage!

	Odin takes 9.84 damage!
	Name:  Odin Health:  20.16 



	Enter a command: 
	ICESTORM

	Odin casted icestorm for damage of 6.50
	Fenrir takes 6.50 damage!
	Name:  Fenrir Health:  23.50 

	Fenrir attacks for 10.18 damage!
	Odin takes 10.18 damage!
	Name:  Odin Health:  9.98 



	Enter a command: 
	badbreath

	Odin tried to cast badbreath, but they don’t know that spell
	Fenrir attacks for 10.09 damage!
	Odin takes 10.09 damage!
	Odin was knocked out! 

	Name:  Odin Health:  0.00 

	Oh no!  You lost!
	Fenrir has won:  13 times
