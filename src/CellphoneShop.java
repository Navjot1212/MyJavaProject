import java.util.Scanner;

public class CellphoneShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cellphone myPh = new Cellphone();
		System.out.println("Please select the Brand\nApple\nSamsung ");
		String brand = sc.nextLine();
		while (!(brand.equals("Apple")) && (!(brand.equals("Samsung")))) {
			System.out.println(brand + " products are not available\n");
			System.out.println("Please select the Brand\nApple\nSamsung ");
			brand = sc.nextLine();
			if (brand.equals("Apple") || brand.equals("Samsung")) {
				break;
			}
		}
		myPh.Brand(brand);
		System.out.println("Please select the model");
		String model = sc.nextLine();
		while (!(model.equals("S22")) && !(model.equals("S22 +")) && !(model.equals("S22 FE"))
				&& !(model.equals("S22 Ultra")) && !(model.equals("S22 FE")) && !(model.equals("Iphone 14"))
				&& !(model.equals("Iphone 14 Mini")) && !(model.equals("Iphone 14 Pro"))
				&& !(model.equals("Iphone 14 Pro Max"))) {
			System.out.println(model + " model is not available\n");

			if (brand.equalsIgnoreCase("Apple")) {
				System.out.println("Models available\nIphone 14 Mini\nIphone 14\nIphone 14 Pro\nIphone 14 Pro Max\n");
			} else if (brand.equalsIgnoreCase("Samsung")) {
				System.out.println("Models available\nS22\nS22+\nS22 Ultra\nS22 FE\n");
			}
			System.out.println("Please select the model");
			model = sc.nextLine();
			if ((model.equals("S22")) || (model.equals("S22 +")) || (model.equals("S22 FE"))
					|| (model.equals("S22 Ultra")) || !(model.equals("S22 FE")) || (model.equals("Iphone 14"))
					|| (model.equals("Iphone 14 Mini")) || (model.equals("Iphone 14 Pro"))
					|| (model.equals("Iphone 14 Pro Max"))) {
				break;
			}
		}
		int phBill = myPh.Model(model);
		System.out.println("Please select the colour\nBlack\nWhite\nSilver");
		String colour = sc.nextLine();
		while (!(colour.equals("Black")) && !(colour.equals("White")) && !(colour.equals("Silver"))) {
			System.out.println(colour + " colour is not available\n");
			System.out.println("Please select the colour\nBlack\nWhite\nSilver");
			colour = sc.nextLine();
			if ((colour.equals("Black")) || (colour.equals("White")) || (colour.equals("Silver"))) {
				break;
			}
		}
		myPh.SetColour(colour);
		System.out.println("Please select the storage\n128 GB\n256 GB\n512 GB");
		String storage = sc.nextLine();
		while (!(storage.equals("128 GB")) && !(storage.equals("256 GB")) && !(storage.equals("512 GB"))) {
			System.out.println(storage + " variant is not available");
			System.out.println("Please select the storage\n128 GB\n256 GB\n512 GB");
			storage = sc.nextLine();
			if ((storage.equals("128 GB")) || (storage.equals("256 GB")) || (storage.equals("512 GB"))) {
				break;
			}
		}
		phBill = myPh.SetStorage(storage);
		myPh.Specs(brand);
		System.out.println("Please select the service provider\nRogers\nTelus\nBell ");
		String plan = sc.nextLine();
		while (!(plan.equals("Bell")) && !(plan.equals("Rogers")) && !(plan.equals("Telus"))) {
			System.out.println(plan + " service provider is not available\n");
			System.out.println("Please select the service provider\nRogers\nTelus\nBell ");
			plan = sc.nextLine();
			if ((plan.equals("Bell")) || (plan.equals("Rogers")) || (plan.equals("Telus"))) {
				break;
			}
		}
		int planBill = myPh.Plan(plan);
		System.out.println("You have Selected " + brand + " " + model + " with " + plan + " Plan. ");
		System.out.println("Your Monthly Phone Tab will be : $ " + phBill);
		System.out.println("Your Monthly Plan will be   : $ " + planBill);
		System.out.println("Total Monthly Amount	  : $ " + (phBill + planBill));

	}
}
