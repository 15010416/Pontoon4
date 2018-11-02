package Pontoon;

import java.util.Scanner;

public class playAgain {

public static void playAgain(boolean gameOver) {
	
	String choice2 = "";
	Scanner kboard = new Scanner(System.in);
	
if(gameOver==true) {
	 
	 System.out.println("Do you want to play again?");
	 
	 choice2 = kboard.nextLine();
	 
		if(choice2.equalsIgnoreCase("y")); {
			
			 Main.main(null); }
		
		{ 
			 
			 System.out.println("Thank you for playing!");
     
			 kboard.close();
		}
	  }
    }
  }
