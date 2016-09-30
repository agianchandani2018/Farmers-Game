/**
* <description of project>
* @author Ami Gianchandani
* 
*/

import java.util.Scanner;
public class FarmersGame
{
	//global scope
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	
	//false = bank0
	//true = bank1

	public static void main(String[] args)
	{
	
	welcome();
	
	displayGameStatus();
	
	game();
		
	animalTransport(animal);	
	
	}
	
	public static void welcome()
	{
		System.out.println("* Farmer's Game");
		System.out.println("* The sheep will eat the cabbage, the wolf will eat the sheep.");
		System.out.println("* Only the human can operate the boat.");
		System.out.println("* Do not leave predator alone with prey");
		System.out.println("* Get everyone across the river safely");
		//print out everyone on bank0	
		
	}	
		
	public static void displayGameStatus()
	{
		String bank0 = "    ";
		String bank1 = "    ";
		
		if(!cabb)
			bank0 += "C    ";
		else
			bank1 += "C    ";	
			
		if(!sheep)
			bank0 += "S    ";
		else
			bank1 += "S    ";
			
			
		if(!wolf)
			bank0 += "W    ";
		else
			bank1 += "W    ";	
			
		if(!human)
			bank0 += "H    ";
		else
			bank1 += "H    ";
			
			
		System.out.println("  ");
		System.out.println(bank0);
		System.out.println("__________________________");
		System.out.println("\n \n \n");
		System.out.println("__________________________");
		System.out.println(bank1);
		
	}
	
	
	
	/**
	* <description>
	*
	*
	*/
	
	public static void game()
	{
		Scanner kb = new Scanner(System.in); //getting user input
		
		System.out.print("Who do you want to move to the other side?: ");
		String animal = kb.nextLine(); 
		//want to change to char
		
		
		
		
		
	}
	
	public static boolean animalTransport(animal)
	{
		boolean animal = true;
	
	}
	
	
}	