package AssignmentWeek9;

//Importing java library classes
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Game {
	// Declaring private variables
	private String guess;
	private String wrongLetters = "";
	private int wrongGuesses;
	private String name;
	private String maskedName;
	private int score;
	Scanner sc = new Scanner(System.in);

	void greeting() {
		// Greeting method to greet player according to real time
		SimpleDateFormat simpleformat = new SimpleDateFormat("k");
		String strHour = simpleformat.format(new Date());
		int hour = Integer.parseInt(strHour);
		if (hour >= 6 && hour < 12) {
			System.out.println("****************\n**Good Morning**\n****************");
		} else if (hour >= 12 && hour < 17) {
			System.out.println("******************\n**Good Afternoon**\n******************");
		} else {
			System.out.println("****************\n**Good Evening**\n****************");
		}
	}

	void setup() throws FileNotFoundException {
		// Instantiating File class to import file
		File myFile = new File("C:\\Users\\navjo\\eclipse-workspace\\NameList.txt");
		// Instantiating Scanner class to read from file
		Scanner read = new Scanner(myFile);
		// Instantiating HashMap class
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int counter = 0;
		// Allocating File names with integer values(pairing values with keys)
		while (read.hasNextLine()) {
			map.put(counter, read.nextLine());
			counter++;
		}
		read.close();
		// Creating random number from 0 to file size
		int random = (int) Math.floor(Math.random() * (map.size()));
		// Getting random name from file
		name = map.get(random);
		// Masking that random name
		maskedName = name;
		maskedName = maskedName.replaceAll("\\w", "_");
	}

	void play() {
		do {
			// Displaying player random name to guess
			System.out.println("You are Guessing " + maskedName + " 🚹 " + maskedName.length() + " letters name");
			do {
				System.out.println("👇 Guess a letter");
				guess = sc.next();
				if (guess.length() > 1) {
					System.out.println("Please enter one character at a time☝");
				}
			} while (guess.length() > 1);
			// UnMasking guessed letter
			for (int i = 0; i < name.length(); i++) {
				String revealedChar = "" + name.charAt(i);
				if (guess.equalsIgnoreCase(revealedChar)) {
					maskedName = maskedName.substring(0, i) + revealedChar + maskedName.substring(i + 1);
				}
			}
			// Displaying wrong guesses
			if (!name.contains(guess.toLowerCase()) && !(name.contains(guess.toUpperCase()))) {
				wrongLetters += guess + " ";
				wrongGuesses++;
				System.out.println("You have guessed (" + wrongGuesses + ") wrong letters: " + wrongLetters);
				switch (wrongGuesses) {
				case 1: {
					System.out.println("Hey its ok! Only one wrong guess. You can do it!😁");
				}
					break;
				case 2: {
					System.out.println("You might be in trouble buddy! Its two wrong guesses already 😞 ");
				}
					break;
				case 3: {
					System.out.println("Do you even know spellings of your own name ?🧐");
				}
					break;
				case 4: {
					System.out.println("Just give up already buddy. Its not for you!🤬");
				}
					break;
				default: {
					System.out.println("I doubted you from the start 🤣");
				}
					break;
				}
			} else {
				System.out.println("You have guessed (" + wrongGuesses + ") wrong letters: " + wrongLetters);
			}
			// Repeating game until player wins or loses
		} while (!maskedName.equals(name) && wrongGuesses <= 4);
		// Resetting number of wrong guesses and wrong letters
		wrongGuesses = 0;
		wrongLetters = "";
		// Displaying result and Score
		if (maskedName.equals(name)) {
			System.out.println(
					"\n🎉🎉Congratulations you won!🏆🏆\n👏👏You successfully guessed \"" + maskedName + "\" 👏👏");
			score += 10;
			System.out.println("🎖Your Score : " + score);

		} else {
			System.out.println("Ooops ❗\nYou failed to guess \"" + name + "\" 👎");
			System.out.println("🎖Your Score : " + score);
		}
	}
}