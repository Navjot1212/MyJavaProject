package AssignmentWeek9;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Among_Us {

	public static void main(String[] args) throws FileNotFoundException {
		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		game.greeting();
		System.out.println("Welcome to Among Us Game!");
		String playAgain = "";
		do {
			game.setup();
			game.play();
			System.out.println("Do you want to play again ?\nPress y to play again or any other key to exit ");
			playAgain = sc.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));
	}
}
