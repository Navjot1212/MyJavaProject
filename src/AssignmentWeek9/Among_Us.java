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
		// Displaying rules
		System.out.println("🎮 Welcome to Among Us Game! 🎮");
		System.out.println("📄 Goal 👇\nGuess the name of student");
		System.out.println("📄 Rules 👇\n➡ You cannot enter✍ more than one letter at a time ☝");
		System.out.println("➡ Each letter you guess💭 will be visible🔓 at its position");
		System.out.println("➡ Each correct guess💭 will make it more obvious🤷 to guess ");
		System.out.println("➡ 5 wrong answers and Game Over!");
		System.out.println("Good Luck 🫡");
		String playAgain = "";
		do {
			// Invoking setup method to read file data
			game.setup();
			// Invoking play method to play game
			game.play();
			// Asking player to replay game
			System.out.println("Do you want to play again ?🍿\nPress y to play again or any other key to exit ");
			playAgain = sc.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));
	}
}