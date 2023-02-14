import java.util.*;
/*This program is a game where the user has to guess the number. It will ask the user for
	the max range the randomiser can choose from then what their guess is. The guess and
	randomised number will compared to see if they match and tell the user if they were
	correct or not. The user will be asked if they wish to continue pllaying or stop.
	(May add a count for the number of guesses correct out of total guesses and if they
	wish to change max number)*/

public class Guess_The_Number extends Greetings_User {
	public static void main(String[] arg){
		//needed variables
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		boolean changeMax = true;
		int mainMax = 1;//the max value
		int guess;//user num guess
		int correctNum;//randomized num

		System.out.println("=====================================");
		System.out.println("==== Welcome to Guess the Number ====");
		System.out.println("=====================================");
		System.out.println("\n\n");

		boolean playGame = true;
		while(playGame == true){
			//asks for max unless changeMax is false
			if(changeMax == true){
				System.out.println("What would you like to make to the limit number for guessing: (Example 5 or 10)");
				mainMax = keyboard.nextInt();
				changeMax = false;
			}
			else{
				System.out.println("=====================================");
				System.out.println("Okay lets try again");
			}
			
			correctNum = rand.nextInt(mainMax);//randomizes a number for the new game
			System.out.println("The limit is: " + mainMax);
			System.out.println("");
			System.out.println("What is your guess?: (0 - "+ mainMax +")");
			guess = keyboard.nextInt();
			System.out.println("");
			if(guess == correctNum){
				System.out.println("That's correct! The number was " + correctNum + "!");
			}
			else{
				System.out.println("Ah man, that's not it. The correct number was " + correctNum +"...");
			}

			System.out.println("What you like to do now?:");
			System.out.println("1. Play Again\n2. Play Again and Change Number\n3. End Game");
			int choice = keyboard.nextInt();
			if(choice == 1){
				System.out.println("");
				System.out.println("Great!");
				System.out.println("=====================================");
			}
			else if(choice == 2){
				System.out.println("");
				System.out.println("Great!");
				changeMax = true;
			}
			else if(choice == 3){
				System.out.println("");
				System.out.println("Thanks for playing!");
				playGame = false;
			}
			else{
				System.out.println("Not valid option. Please choose a number available: ");
				choice = keyboard.nextInt();
				System.out.println("");
			}
		}

}
