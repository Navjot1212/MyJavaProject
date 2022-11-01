package AssignmentWeek9;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Among_Us {

	public static void main(String[] args) throws FileNotFoundException {
		// Instantiating Game class
		Game game = new Game();
		// Instantiating Scanner class
		Scanner sc = new Scanner(System.in);
		// Invoking greeting method from game class
		game.greeting();
		System.out.println("Welcome to Among Us Game!");
		String playAgain = "";
		do {
			// Invoking setup method to read file data
			game.setup();
			// Invoking play method to play game
			game.play();
			// Asking player to replay game
			System.out.println("Do you want to play again ?\nPress y to play again or any other key to exit ");
			playAgain = sc.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));
	}
}