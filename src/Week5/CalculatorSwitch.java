package Week5;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// Calculator application which uses switch case
		int num1 = 6;
		int num2 = 4;
		String operator = "*";
		switch (operator) {
		case "+":
			System.out.println("Addition of two numbers is " + (num1 + num2));

			break;
		case "-":
			System.out.println("Subtraction of two numbers is " + (num1 - num2));

			break;
		case "*":
			System.out.println("Multiplication of two numbers is " + (num1 * num2));

			break;
		case "/":
			System.out.println("Division of two numbers is " + (num1 / num2));

			break;
		case "%":
			System.out.println("Modulus of two numbers is " + (num1 % num2));

			break;

		default:
			System.out.println("Invalid Arithmetic operation\nPlease enter valid Arithmetic operation");
			break;
		}
	}

}
