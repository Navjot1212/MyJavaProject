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
			boolean attempt;
			int attemptCount = 3;
			int num = 0;
			System.out.println("Welcome to Cruise Booking.");
			System.out.println("Enter your email address.");
			String email = sc.nextLine();
			System.out.println("Enter your full name");
			String name = sc.nextLine();
			System.out.println("Enter your phone number");
			String phNum = sc.nextLine();
			System.out.println("Enter new password");
			String password = sc.nextLine();
			User user = new User(email, name, phNum, password);
			do {
				System.out.println("Enter your UserName.");
				String userName = sc.nextLine();
				System.out.println("Enter your password");
				password = sc.nextLine();
				attempt = user.logIn(userName, password);
				if (!attempt) {
					System.out.println("Attempts left " + (attemptCount - 1));
				}
				attemptCount--;
				if ((attemptCount == 0)&&!attempt) {
					System.out.println("Max attempts reached");
					System.exit(0);
				}
			} while (!attempt && !(attemptCount == 0));
			do {
				System.out.println(
						"We offer 4 different packages as displayed below. Please enter the cruise that you want to select \nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise ");
				cruiseName = sc.nextLine();
				if (cruiseName.equalsIgnoreCase("Scenic Cruise") || cruiseName.equalsIgnoreCase("Sunset Cruise")
						|| cruiseName.equalsIgnoreCase("Discovery Cruise")
						|| cruiseName.equalsIgnoreCase("Mystery Cruise")) {
					for (int i = 0; i < fleet.length; i++) {
						if (fleet[i].getCruiseName().equalsIgnoreCase(cruiseName)) {
							fleet[i].getCruiseDetails();
							num = i;
							break;
						}
					}
				} else {
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
			for (int i = 0; i < numOfChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1) + ":");
				int childAge = sc.nextInt();
				if (childAge <= 5) {
					numOfChildren--;
				} else if (childAge > 12) {
					System.out.println("Entered child age " + childAge
							+ " is more than 12 years so it will be considered as an adult");
					numOfAdults++;
					System.out.println("Updated number of adults is :" + numOfAdults);
					numOfChildren--;
				}
			}
			System.out.println(
					"\nAll our cruises have food service on board.\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults\nAnd 4.99 per day for kids?");
			String buffet = sc.nextLine();
			boolean isBuffetBooked = false;
			if (buffet.equalsIgnoreCase("Yes") || buffet.equalsIgnoreCase("Y")) {
				isBuffetBooked = true;
			}
			System.out.println("\nYour Package includes: ");
			fleet[num].getAdultCruiseBill(numOfAdults);
			fleet[num].getChildrenCruiseBill(numOfChildren);
			fleet[num].getAdultBuffetBill(numOfAdults, isBuffetBooked);
			fleet[num].getChildrenBuffetBill(numOfChildren, isBuffetBooked);
			fleet[num].getBill();
			System.out.println(
					"Do you want to update your personal information. Press Y to change. Press any other alphabet to exit. ");
			String acInfoUpdate = sc.nextLine();
			if (acInfoUpdate.equalsIgnoreCase("Y")) {
				System.out.println(
						"Please enter the information you want to change. \n1. Password\n2. Phone number\n3. Email ");
				int selection = sc.nextInt();
				attemptCount = 3;
				if (selection == 1) {
					do {
						attempt = user.updatePassword();
						if (!attempt) {
							System.out.println("Attempts left " + (attemptCount - 1));
						}
						attemptCount--;
						if ((attemptCount == 0)&&!attempt) {
							System.out.println("Max attempts reached");
							System.exit(0);
						}
					} while (!attempt && !(attemptCount == 0));
				} else if (selection == 2) {
					do {
						attempt = user.updatePhoneNumber();
						if (!attempt) {
							System.out.println("Attempts left " + (attemptCount - 1));
						}
						attemptCount--;
						if ((attemptCount == 0)&&!attempt) {
							System.out.println("Max attempts reached");
							System.exit(0);
						}
					} while (!attempt && !(attemptCount == 0));
				} else if (selection == 3) {
					do {
						attempt = user.updateEmail();
						if (!attempt) {
							System.out.println("Attempts left " + (attemptCount - 1));
						}
						attemptCount--;
						if ((attemptCount == 0)&&!attempt) {
							System.out.println("Max attempts reached");
							System.exit(0);
						}
					} while (!attempt && !(attemptCount == 0));
				} else {
					System.out.println("Invalid selection");
					System.exit(0);
				}
			} else {
				System.out.println("Thank you for using the service!");
			}

		} catch (InputMismatchException ex) {
			System.out.println("Invalid input");
		}
	}

}
