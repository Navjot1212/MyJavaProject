import java.util.InputMismatchException;
import java.util.Scanner;

public class CellphoneShop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Cellphone myPh = new Cellphone();
			System.out.println("Please select the Brand\nApple\nSamsung ");
			String brand = sc.nextLine();
			myPh.Brand(brand.replaceAll(" ", ""));
			System.out.println("Please select the model");
			String model = sc.nextLine();
			int phBill = myPh.Model(model.replaceAll(" ", ""));
			System.out.println("Please select the colour\nBlack\nWhite\nSilver");
			String colour = sc.nextLine();	
			myPh.SetColour(colour.replaceAll(" ", ""));
			System.out.println("Please select the storage\n128 GB\n256 GB\n512 GB");
			String storage = sc.nextLine();
			phBill = myPh.SetStorage(storage.replaceAll(" ", ""));
			myPh.Specs();
			System.out.println("Please select the service provider\nRogers\nTelus\nBell ");
			String plan = sc.nextLine();
			int planBill = myPh.Plan(plan.replaceAll(" ", ""));
			System.out.println("You have Selected " + brand + " " + model + " with " + plan + " Plan. ");
			System.out.println("Your Monthly Phone Tab will be : $ " + phBill);
			System.out.println("Your Monthly Plan will be   : $ " + planBill);
			System.out.println("Total Monthly Amount	  : $ " + (phBill + planBill));
		} catch (InputMismatchException ex) {
			System.out.println("Invalid Input");
		}
	}
}
