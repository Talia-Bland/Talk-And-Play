import java.util.*;
import java.lang.*;
/*Recreation of my Python program called Greetings_user.py
	The program with ask a few questions about the user and then ask if they would like to play a game.
	If they choose to play a game they will be given a selection, which is so far only guess the number,
	and an other java file with the game guess the number will open for the user to play*/

public class Talk_And_Play {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Java version of the Greetings_User Program I did in Python!");
		System.out.println("");
		//Asks for users name
		System.out.println("What's your name?: ");
		String userName = keyboard.nextLine();
		System.out.println("Nice to meet you " + userName + "!");
		System.out.println("---------------------------------------------");//separator

		//Asks about user's favorite food
		System.out.println("What's your favorite food?: ");
		String favFood = keyboard.nextLine();
		System.out.println("MMmm, " + favFood + "!");
		System.out.println("---------------------------------------------");//separator

		//Asks for users favorite song and a few lyrics
		System.out.println("What's your favorite song?: ");
		String favSong = keyboard.nextLine();
		System.out.println(favSong + "? Not Sure I know that one. Can you give me a lyric? Maybe I'll remember then: ");
		String songLyrics = keyboard.nextLine();
		System.out.println(songLyrics + "... OH, That " + favSong + "! Now I remember! You've got some good music taste, " + userName +".");
		System.out.println("---------------------------------------------");//separator

		//Asks if user wants to play a game
		System.out.println("Would you like to play a game, " + userName + "? (Yes-1 No-2): ");
		int playing = keyboard.nextInt();
		boolean playGames;
		if (playing == 1){
			playGames = true;
			System.out.println("Yay!");
		}
		else{
			playGames = false;
			System.out.println("Oh, okay..");
		}
		System.out.println("---------------------------------------------");//separator

		//while loop until user no long wishes to play a game
		String menu = "1. Guess the number \n2. Hungry Games\n3. Exit\n";
		while(playGames == true){
			System.out.println("Okay, what should we play?...");
			System.out.print(menu);
			int game = keyboard.nextInt();
			if (game == 1){
				//still working on it...
			}
			else if (game == 2){
				System.out.print("Will soon open Hungry Games(WIP)");
			}
			else{
				playGames = false;
			}

		}
		System.out.println("Thanks for running my program, " + userName + ".");

	}

}
