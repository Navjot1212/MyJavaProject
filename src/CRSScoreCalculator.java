import java.util.InputMismatchException;
import java.util.Scanner;

public class CRSScoreCalculator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CRSMethod crsm = new CRSMethod();
			int score = 0;
			System.out.println("Enter your Education Level: ");
			System.out.println("(a) PhD");
			System.out.println("(b) Master’s Degree");
			System.out.println(
					"(c) Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration");
			System.out.println("(d)12th+ Three Years or longer Degree /Diploma");
			String edLevel = sc.next();
			score = crsm.educationLevel(edLevel);
			System.out.println("Enter your Experience in years:");
			int experience = sc.nextInt();
			score = crsm.experience(experience);
			System.out.println("Enter your age in years:");
			int age = sc.nextInt();
			score = crsm.age(age);
			System.out.println("Enter your IELTS score for Listening module:");
			double listenScore = sc.nextDouble();
			System.out.println("Enter your IELTS score for Speaking module:");
			double speakScore = sc.nextDouble();
			System.out.println("Enter your IELTS score for Reading module:");
			double readScore = sc.nextDouble();
			System.out.println("Enter your IELTS score for Writing module:");
			double writeScore = sc.nextDouble();
			score = crsm.ieltsScore(listenScore, speakScore, readScore, writeScore);
			System.out.println("If you have a relative  in Canada(Parents, Grand Parents, "
					+ "Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian"
					+ " Citizen or PR holder\n(Y/N)");
			String relative = sc.next();
			System.out.println("Have you studied in Canada for atleast 2 years\n(Y/N)");
			String study = sc.next();
			System.out.println("Have you worked in Canada for atleast 2 years at NOC 0, A, B\n(Y/N)");
			String work = sc.next();
			score = crsm.adaptability(relative, study, work);
			System.out.println("Total Points you have scored: " + score + " Points ");
			if (score >= 67) {
				System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada  ");
			} else {
				System.out.println(
						"You do not qualify to submit an Expression of Interest (EOI) to Immigration Canada  ");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");

		}
	}
}
