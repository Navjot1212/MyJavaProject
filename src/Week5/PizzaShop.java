package Week5;

public class PizzaShop {

	public static void main(String[] args) {
		/*
		 * Assume an order and work out the final bill.
		 * 
		 * Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large
		 * Pizza: $25
		 * 
		 * For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni
		 * for Medium or Large Pizza: +$3
		 * 
		 * Extra cheese for any size pizza: + $1
		 * 
		 * For eg: If the Pizza is medium, pepperoni with extra cheese the program
		 * should calculate the final bill as 20+3+1 = $24 and print as
		 * 
		 * “Your final bill is $24”
		 */
		boolean smallPizza = false;
		boolean addPepperoniSmallPizza = false;
		boolean extraCheeseSmallPizza = false;

		boolean mediumPizza = true;
		boolean addPepperoniMediumpizza = true;
		boolean extraCheeseMediumPizza = true;

		boolean largePizza = false;
		boolean addPepperoniLargepizza = false;
		boolean extraCheeseLargePizza = false;
		int bill = 0;
		if (smallPizza == true) {
			bill += 15;
			if (addPepperoniSmallPizza == true) {
				bill += 2;
			}
			if (extraCheeseSmallPizza == true) {
				bill += 1;
			}
		}

		if (mediumPizza == true) {
			bill += 20;
			if (addPepperoniMediumpizza == true) {
				bill += 3;
			}
			if (extraCheeseMediumPizza == true) {
				bill += 1;
			}

		}
		if (largePizza == true) {
			bill += 25;
			if (addPepperoniLargepizza == true) {
				bill += 3;
			}
			if (extraCheeseLargePizza == true) {
				bill += 1;
			}

		}
		System.out.println("You final bill is $" + bill);
	}

}
