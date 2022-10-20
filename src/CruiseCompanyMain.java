import java.util.InputMismatchException;
import java.util.Scanner;

public class CruiseCompanyMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CruiseCompanyMethod scenicCruise = new CruiseCompanyMethod("Scenic Cruise", 43.99, 12.99, 3);
			CruiseCompanyMethod sunsetCruise = new CruiseCompanyMethod("Sunset Cruise", 52.99, 15.99, 1);
			CruiseCompanyMethod discoveryCruise = new CruiseCompanyMethod("Discovery Cruise", 39.99, 9.99, 4);
			CruiseCompanyMethod mysteryCruise = new CruiseCompanyMethod("Mystery Cruise", 45.99, 12.99, 2);
			CruiseCompanyMethod[] fleet = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
			String confirmation;
			String cruiseName;
			int num = 0;
			do {
				System.out.println(
						"We offer 4 different packages as displayed below. Please enter the cruise that you want to select \nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise ");
				cruiseName = sc.nextLine();
				if (cruiseName.equalsIgnoreCase("Scenic Cruise")||cruiseName.equalsIgnoreCase("Sunset Cruise")||cruiseName.equalsIgnoreCase("Discovery Cruise")||cruiseName.equalsIgnoreCase("Mystery Cruise")) {
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i].CruiseName.equalsIgnoreCase(cruiseName)) {
						System.out.println("The cruise that you have selected is " + fleet[i].CruiseName
								+ " which is a " + fleet[i].numOfDays + " day cruise ");
						System.out.println("Price for Adults above 12 years old age : $" + fleet[i].adultsCruisePrice
								+ " per day\nPrice for kids above 5 years old age: $" + fleet[i].childrenCruisePrice
								+ " per day \nChildren of age 5 and below can cruise free!!\n");
						num = i;
						break;
					}
				}
				}else {
					System.out.println("Invalid selection");
					System.exit(0);
				}
				System.out.println("Please press Y to confirm selection\nOr press any other key to change selection .");
				confirmation = sc.nextLine();
			} while (!confirmation.equalsIgnoreCase("Y"));
			System.out.println("\nLet's add passengers");
			System.out.println("Enter the number of adults :");
			int numOfAdults = sc.nextInt();
			System.out.println("Enter the number of children :");
			int numOfChildren = sc.nextInt();
			int counter = numOfChildren;
			while (counter > 0) {
				System.out.println("Enter the age of child :");
				int childAge = sc.nextInt();
				if (childAge <= 5) {
					numOfChildren--;
				}else if(childAge > 12) {
					numOfAdults++;
					numOfChildren--;
				}
				counter--;
			}
			System.out.println(
					"\nAll our cruises have food service on board.\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults\nAnd 4.99 per day for kids?");
			String buffet = sc.next();
			boolean isBuffetBooked = false;
			if (buffet.equalsIgnoreCase("Yes") || buffet.equalsIgnoreCase("Y")) {
				isBuffetBooked = true;
			}
			System.out.println("\nYour Package includes: ");
			double adltCruiseBill = fleet[num].getAdultCruiseBill(numOfAdults);
			System.out.printf(fleet[num].CruiseName + " Adults 		 	@	%d	: $ %.2f \n", numOfAdults,
					adltCruiseBill);
			double chldrnCruiseBill = fleet[num].getChildrenCruiseBill(numOfChildren);
			System.out.printf(fleet[num].CruiseName + " Children above 5  	@	%d	: $ %.2f \n", numOfChildren,
					chldrnCruiseBill);
			double adltBftBill = fleet[num].getAdultBuffetBill(numOfAdults, isBuffetBooked);
			System.out.printf("Buffet Special Price Adults		@	%d	: $ %.2f \n", numOfAdults, adltBftBill);
			double chldBftBill = fleet[num].getChildrenBuffetBill(numOfChildren, isBuffetBooked);
			System.out.printf("Buffet Special Price Children above 5  @ 	%d	: $ %.2f \n", numOfChildren,
					chldBftBill);
			double bill = adltCruiseBill + chldrnCruiseBill + adltBftBill + chldBftBill;
			System.out.printf("Total Price						: $ %.2f \n", bill);
			double hst = bill * 0.15;
			System.out.printf("HST	@ 15%%			                	: $ %.2f \n", hst);
			double finalBill = bill + hst;
			System.out.printf("Final Price						: $ %.2f \n", finalBill);
		}catch (InputMismatchException ex) {
			System.out.println("Invalid input");
		}
	}

}
