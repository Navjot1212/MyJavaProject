import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cellphone myPh = new Cellphone();
		System.out.println("Please select the Brand\nApple\nSamsung ");
		String brand = sc.next();
		myPh.Brand(brand);
		System.out.println("Please select the model");
		String model = sc.next();
		int phBill = myPh.Model(model);
		System.out.println("Please select the colour\nBlack\nWhite\nGold\nSilver");
		String colour = sc.next();
		myPh.SetColour(colour);
		System.out.println("Please select the storage\n128GB\n256GB\n512GB");
		int storage = sc.nextInt();
		phBill = myPh.SetStorage(storage);
		myPh.Specs();
		System.out.println("Please select the service provider\nRogers\nTelus\nBell ");
		String plan = sc.next();
		int planBill = myPh.Plan(plan);
		System.out.println("You have Selected " + brand + " " + model + " with " + plan + " Plan. ");
		System.out.println("Your Monthly Phone Tab will be : $ " + phBill);
		System.out.println("Your Monthly Plan will be   : $ " + planBill);
		System.out.println("Total Monthly Amount	  : $ " + (phBill + planBill));
	}

}
