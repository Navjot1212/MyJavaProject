package Week5;

public class PizzaShopSwitch {

	public static void main(String[] args) {
		
		int bill = 0;
		String pizzaSize = "Medium";
		boolean addPepperoni = true;
		boolean addExtraCheese = true;
		switch (pizzaSize) {
		case "Small":
			bill += 15;
			if (addPepperoni == true) {
				bill += 2;
			}
			if (addExtraCheese == true) {
				bill += 1;
			}
			break;
		case "Medium":
			bill += 20;
			if (addPepperoni == true) {
				bill += 3;
			}
			if (addExtraCheese == true) {
				bill += 1;
			}
			break;
		case "Large":
			bill += 25;
			if (addPepperoni == true) {
				bill += 3;
			}
			if (addExtraCheese == true) {
				bill += 1;
			}
			break;

		default:
			System.out.println("Only Small, Medium and Large pizza sizes are avaliable");
			break;
		}
		System.out.println("You final bill is $" + bill);
	}

}