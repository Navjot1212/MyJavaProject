
public class Question5 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to check if 2 numbers are divisible by 3.
		 * 
		 * The output if both numbers are divisible will be: “Both the numbers are
		 * divisible by 3”
		 * 
		 * The output if one number is divisible will be: “<Number> is divisible by 3
		 * but <Number> is not divisible by 3”.
		 * 
		 * The output if both numbers are not divisible will be: “Both the numbers are
		 * not divisible by 3”
		 * 
		 */
		int num1 = 36;
		int num2 = 7;
		if (num1 % 3 == 0 && num2 % 3 == 0) {
			System.out.println("Both the numbers are divisible by 3");
		} else if (num1 % 3 == 0 || num2 % 3 == 0) {
			if (num1 % 3 == 0 || num2 % 3 != 0) {
				System.out.println(num1 + " is divisible by 3 but " + num2 + " is not divisible by 3");
			} else if (num1 % 3 != 0 || num2 % 3 == 0) {
				System.out.println(num1 + " is not divisible by 3 but " + num2 + " is divisible by 3");
			}

		} else if (num1 % 3 != 0 && num2 % 3 != 0) {
			System.out.println("Both the numbers are not divisible by 3");
		}

	}

}
