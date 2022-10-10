import java.util.Scanner;

public class PizzaShopV2 {

	public static void main(String[] args) {
		int bill = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("********************************************************");
		System.out.println("***                                                  ***");
		System.out.println("***              Welcome to Pizza Shop               ***");
		System.out.println("***                                                  ***");
		System.out.println("********************************************************");
		System.out.println("How many pizzas do you want?\nEnter Number :");
		int pizzaQuantity = myScanner.nextInt();
		for (int i = 1; i <= pizzaQuantity; i++) {
			System.out.println("Please enter size of pizza number " + i + "\nEnter Small, Medium or Large");
			String pizzaSize = myScanner.next();
			System.out.println("Do you want to add pepperoni ?\nChoose Y or N");
			String addPepperoni = myScanner.next();
			System.out.println("Do you want to add extra cheese ?\nChoose Y or N");
			String addExtraCheese = myScanner.next();
			switch (pizzaSize) {
			case "Small":
				bill += 15;
				if (addPepperoni.equalsIgnoreCase("Y")) {
					bill += 2;
				}
				if (addExtraCheese.equalsIgnoreCase("Y")) {
					bill += 1;
				}
				break;
			case "Medium":
				bill += 20;
				if (addPepperoni.equalsIgnoreCase("Y")) {
					bill += 3;
				}
				if (addExtraCheese.equalsIgnoreCase("Y")) {
					bill += 1;
				}
				break;
			case "Large":
				bill += 25;
				if (addPepperoni.equalsIgnoreCase("Y")) {
					bill += 3;
				}
				if (addExtraCheese.equalsIgnoreCase("Y")) {
					bill += 1;
				}
				break;

			default:
				System.out.println("Only Small, Medium and Large pizza sizes are avaliable");
				break;
			}
			if (i == 1) {
				System.out.println("You current bill for " + i + " pizza is $" + bill + "\n\n");
			} else {
				System.out.println("You current bill for " + i + " pizzas is $" + bill + "\n\n");
			}
			System.out.println("Please enter tip amount");
			int tip = myScanner.nextInt();
			bill += tip;
		}
		System.out.println("You final bill is $" + bill);
	}
}
