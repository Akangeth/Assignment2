import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class RandomNumberGuesser
{
	public static void main(String[] args) 
	{
		//User Input
		 Scanner keyboard = new Scanner(System.in);
		 Scanner Char = new Scanner(System.in);

		 //Driver
		 RNG name = new RNG();
		 
		 //User Play Again
		 char userPlayAgain = 'y';
		 

		 
		 //Loop determines if user wants to play again
		 while(userPlayAgain == 'y')
		 {
			//Random Number Generator
			 Random rand = new Random();
			 int randNum = rand.nextInt(100)+1;
			 
			//Variables
			 int guess = 0;
			 int lowestGuess = 0;
			 int highestGuess = 100;
			 
			 
			 //Times Played
			 for(int timesPlayed = 1; timesPlayed < 100; timesPlayed++)
			 {
				 guess += 0;
				 highestGuess += 0;
				 lowestGuess += 0;
				 
				 System.out.println("Please enter a number for guess " +timesPlayed+ ":");
				 guess = keyboard.nextInt();		
				 
				 while(guess < lowestGuess || guess > highestGuess)
				 {
					 name.inputValidation(guess, lowestGuess, highestGuess);
					 guess = keyboard.nextInt();		
				 }
				 
				 //New Low guess
				 if(guess < randNum)
				 {
					 lowestGuess = guess;
				 }//New High Guess
				 else if (guess > randNum)
				 {
					 highestGuess = guess;
				 }
				
				 //Determines if User guessed right
				 if(guess == randNum)
				 {
					 System.out.println("Congratulations! You guessed correct!");
					 System.out.println("Would you like to play again? (y or n): ");	
					 char PlayAgainAnswer = Char.next().charAt(0);   		
					 
					 if(PlayAgainAnswer == 'y')
					 {
						 System.out.println("Okay! Have fun!");
						 timesPlayed = 300;
					 }
					 else if (PlayAgainAnswer == 'n')
					 {
						 System.exit(0);
					 }	 
				 }
				 
				 
			 }
			 

			 
//----------------------------------------------------------------------------------------------------
			 
			 
			
			 
			 
		 }
		 
		 //End Code
	}

}