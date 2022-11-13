package assignmentWeek10;

import java.util.*;

public class VacationBookingMain {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String cruiseName;
			String hotelName;
			User navjot = new User();
			System.out.println("Welcome to Vacation booking\nPlease sign up to use the services");
			navjot.signUp();
			navjot.logIn();
			String selection;
			String confirmation;
			do {
				do {
					System.out.println("Please enter the service you want to book\nHotel\nCruise ");
					selection = sc.next();
					if (selection.equalsIgnoreCase("Cruise")) {
						Cruise cruise;
						do {
							System.out.println(
									"We offer 4 different packages as displayed below. Please enter the cruise that you want to select \nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise ");
							cruiseName = sc.next();
							if (cruiseName.equalsIgnoreCase("ScenicCruise")) {
								cruise = new ScenicCruise();
								cruise.getCruiseBill();
							} else if (cruiseName.equalsIgnoreCase("SunsetCruise")) {
								cruise = new SunsetCruise();
								cruise.getCruiseBill();
							} else if (cruiseName.equalsIgnoreCase("MysteryCruise")) {
								cruise = new MysteryCruise();
								cruise.getCruiseBill();
							} else if (cruiseName.equalsIgnoreCase("DicoveryCruise")) {
								cruise = new DiscoveryCruise();
								cruise.getCruiseBill();
							} else {
								System.out.println("Invalid Selection!");
							}
						} while (!(cruiseName.equalsIgnoreCase("ScenicCruise")
								|| cruiseName.equalsIgnoreCase("SunsetCruise")
								|| cruiseName.equalsIgnoreCase("DiscoveryCruise")
								|| cruiseName.equalsIgnoreCase("MysteryCruise")));
					} else if (selection.equalsIgnoreCase("Hotel")) {
						do {
							System.out.println(
									"We offer 2 different suites as displayed below. Please enter the suite that you want to select \nDeluxe Suite\nFamily Suite");
							hotelName = sc.next();
							Hotel hotel;
							if (hotelName.equalsIgnoreCase("DeluxeSuite")) {
								hotel = new DeluxeSuite();
								hotel.getHotelBill();
							} else if (hotelName.equalsIgnoreCase("FamilySuite")) {
								hotel = new FamilySuite();
								hotel.getHotelBill();
							} else {
								System.out.println("Inavalid Selection!");
							}
						} while (!(hotelName.equalsIgnoreCase("DeluxeSuite")
								|| hotelName.equalsIgnoreCase("FamilySuite")));
					}
				} while (!(selection.equalsIgnoreCase("Cruise") || selection.equalsIgnoreCase("Hotel")));
				System.out.println(
						"Do you want to book another Hotel Room or Cruise ?\nPress Y for another selection or any other key to exit");
				confirmation = sc.next();
			} while (confirmation.equalsIgnoreCase("Y"));
			navjot.updateInformation();
		} catch (InputMismatchException ex) {
			System.out.println("Inavlid Input!");
		}
	}
}
