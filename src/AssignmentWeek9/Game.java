package AssignmentWeek9;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Game {
	private String guess;
	private String wrongLetters = "";
	private int wrongGuesses;
	private String data;
	private String maskedData;
	Scanner sc = new Scanner(System.in);

	void greeting() {
		SimpleDateFormat simpleformat = new SimpleDateFormat("k");
		String strHour = simpleformat.format(new Date());
		int hour = Integer.parseInt(strHour);
		if (hour > 6 && hour < 12) {
			System.out.println("****************\n**Good Morning**\n****************");
		} else if (hour > 12 && hour < 17) {
			System.out.println("******************\n**Good Afternoon**\n******************");
		} else if (hour > 17 && hour < 21) {
			System.out.println("****************\n**Good Evening**\n****************");
		} else {
			System.out.println("**************\n**Good Night**\n**************");
		}
	}

	void setup() throws FileNotFoundException {
		File myFile = new File("C:\\Users\\navjo\\eclipse-workspace\\HelloWorld.txt");
		Scanner read = new Scanner(myFile);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int counter = 0;
		while (read.hasNextLine()) {
			map.put(counter, read.nextLine());
			counter++;
		}
		read.close();
		int random = (int) Math.floor(Math.random() * (map.size()));
		data = map.get(random);
		maskedData = data;
		for (int i = 0; i < maskedData.length(); i++) {
			maskedData = maskedData.replace(maskedData.charAt(i), '_');
		}
	}

	void play() {
		do {
			System.out.println("You are Guessing " + maskedData);
			guess = sc.next();
			char[] guessArray = guess.toCharArray();
			for (int i = 0; i < data.length(); i++) {
				if (data.charAt(i) == guessArray[0]) {
					maskedData = maskedData.substring(0, i) + guessArray[0] + maskedData.substring(i + 1);
				}
			}
			if (!data.contains(guess)) {
				wrongLetters += guess + " ";
				wrongGuesses++;
				System.out.println("You have guessed (" + wrongGuesses + ") wrong letters: " + wrongLetters);
			}

		} while (!maskedData.equals(data) && wrongGuesses <= 4);
		wrongGuesses = 0;
		wrongLetters = "";
		if (maskedData.equals(data)) {
			System.out.println("Congratulations you won!\nYou successfully guessed " + maskedData);
		} else {
			System.out.println("Ooops !\nYou failed to guess \"" + data + "\"");
		}
	}

}