
public class CRSMethod {
	int score = 0;
	int terminator = 0;

	int educationLevel(String level) {
		if (level.equalsIgnoreCase("a")) {
			score += 25;
		} else if (level.equalsIgnoreCase("b")) {
			score += 23;
		} else if (level.equalsIgnoreCase("c")) {
			score += 22;
		} else if (level.equalsIgnoreCase("d")) {
			score += 21;
		} else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		System.out.println("Current score : " + score);
		return score;
	}

	int experience(int exp) {
		if (exp == 4 || exp == 5) {
			score += 13;
		} else if (exp >= 6) {
			score += 15;
		} else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		System.out.println("Current score : " + score);
		return score;
	}

	int age(int age) {
		if (age >= 18 && age <= 35) {
			score += 12;
		} else if (age >= 36 && age <= 47) {
			score += 11;
			for (int i = 36; i < age; i++) {
				score--;
			}
		} else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		System.out.println("Current score : " + score);
		return score;
	}

	int ieltsScore(double l, double s, double r, double w) {
		if (l == 7.5) {
			score += 5;
		} else if (l >= 8 && l <= 9) {
			score += 6;
		}else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		if (s == 7.5) {
			score += 5;
		} else if (s >= 8 && s <= 9) {
			score += 6;
		}else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		if (r == 7.5) {
			score += 5;
		} else if (r >= 8 && r <= 9) {
			score += 6;
		}else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		if (w == 7.5) {
			score += 5;
		} else if (w >= 8 && w <= 9) {
			score += 6;
		}else {
			System.out.println("No points added/Invalid entry");
			System.exit(terminator);
		}
		System.out.println("Current score : " + score);
		return score;
	}

	int adaptability(String relative, String study, String work) {
		if (relative.equalsIgnoreCase("y")) {
			score += 5;
		}else {
			System.out.println("No points added");
		}
		if (study.equalsIgnoreCase("y")) {
			score += 5;
		}else {
			System.out.println("No points added");
		}
		if (work.equalsIgnoreCase("y")) {
			score += 10;
		}else {
			System.out.println("No points added");
		}
		System.out.println("Current score : " + score);
		return score;
	}

}
