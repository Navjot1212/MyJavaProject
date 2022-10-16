import java.util.Scanner;

public class MilkShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockCheck sCheck = new StockCheck();
		System.out.println("Do we have milk?");
		boolean milk = sc.nextBoolean();
		sCheck.SetMilkStock(milk);
		boolean milkAvailability = sCheck.isMilkAvailable();
		if (milkAvailability == true) {
			System.out.println("Milk is Available");
		} else {
			System.out.println("Milk is not Available");
		}
	}

}
