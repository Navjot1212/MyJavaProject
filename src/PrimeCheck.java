

public class PrimeCheck {

	public static void main(String[] args) {
		// Check if the number is prime or not
		int num = 69;
		int factors = 0;
		if (num <= 1) {
			System.out.println("Number is neither a prime number nor a composite number");
		} else {
			for (int counter = 1; counter <= num; counter++) {
				if (num % counter == 0) {
					factors++;
				}
			}
			if (factors == 2) {
				System.out.println("Number " + num + " is prime number");

			} else {
				System.out.println("Number " + num + " is composite number");
			}
		}

	}
}
