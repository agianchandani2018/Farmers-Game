/**
* <This is the farmers game that interacts with the user. It lets them choose which animals go to the other side without dying>
* @author Ami Gianchandani
* @date September 30, 2016
*
*/

import java.util.Scanner;
public class FarmersGame
{
	//global scope
	//default is false 
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
	}
	
	/**
	* <This is a welcome message that explains the game>
	*
	*/	
	
	public static void welcome()
	{
		System.out.println("* Farmer's Game");
		System.out.println("* The sheep will eat the cabbage, the wolf will eat the sheep.");
		System.out.println("* Only the human can operate the boat.");
		System.out.println("* Do not leave predator alone with prey");
		System.out.println("* Get everyone across the river safely");
		//print out everyone on bank0	
		
	}	
	
	/**
	* <This method displays the two banks with the status of the animals. 
	* < Displays after every move
	*
	*/	
	
		
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
	* <Asks the user which item they want to move to the other side>
	* <Executes the user's move and calls the method to make sure the animals are alive>
	*
	*/
	
	public static void game()
	{
		Scanner kb = new Scanner(System.in); //getting user input
		
		while (!(cabb && sheep && wolf && human) && alive())
		{
		
			System.out.print("Who do you want to move to the other side?: ");
			String animal = kb.nextLine(); 
			//want to change to char
		
			if (animal.equals("C") && human == cabb)
			{
				cabb = !cabb;
				human = !human;	
			}	
		
			if (animal.equals("S") && human == sheep)
			{	
				sheep = !sheep;
				human = !human;
			}
		
			if (animal.equals("W") && human == wolf)
			{	
				wolf = !wolf;
				human = !human;
			}	
			
			if (animal.equals("H"))
				human = !human;
				
			if (alive() && cabb == true && sheep == true && wolf == true && human == true)
				System.out.print("YOU WIN!!");
							
			displayGameStatus();
		
		}
	
		
	}

	
	/**
	* <This method checks to make sure everyone is alive after each move>
	*
	*/	
	
	public static boolean alive()
	{
		if ((wolf == sheep) && human != wolf && wolf != cabb)	
		{	
			System.out.println("You lose. The Wolf ate the Sheep"); 
			return false;	
		}
		
		if ((cabb == sheep) && human != cabb && wolf != cabb)
		{	
			System.out.println("You lose. The Sheep ate the cabbage");
			return false;
		}
		
		else
			return true;
	}


// 	public static void youWin()
// 	{
// 			
// 		System.out.print("____    ____  ______    __    __     ____    __    ____  __  .__   __.");
// 		System.out.print("\   \  /   / /  __  \  |  |  |  |    \   \  /  \  /   / |  | |  \ |  |");
// 		System.out.print(" \   \/   / |  |  |  | |  |  |  |     \   \/    \/   /  |  | |   \|  |"); 
// 		System.out.print("  \_    _/  |  |  |  | |  |  |  |      \            /   |  | |  . `  |"); 
// 		System.out.print(" 	  |  |    |  `--'  | |  `--'  |       \    /\    /    |  | |  |\   |"); 
// 		System.out.print("	  |__|     \______/   \______/         \__/  \__/     |__| |__| \__|");
// 
// 	}
// 	
// 	
	
	
}	