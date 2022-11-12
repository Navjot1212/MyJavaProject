package assignmentWeek10;

import java.util.*;

public class VacationBookingMain {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Cruise cruise = new Cruise();
			Hotel hotel = new Hotel();
			User navjot = new User();
			System.out.println("Welcome to Vacation booking\nPlease sign up to use the services");
			navjot.signUp();
			navjot.logIn();
			String selection;
			String confirmation;
			do {
				do {
					System.out.println("Please enter the service you want to book\nHotel\nCruise ");
					selection = sc.nextLine();
					if (selection.equalsIgnoreCase("Cruise")) {
						cruise.getCruiseBill();
					} else if (selection.equalsIgnoreCase("Hotel")) {
						hotel.getHotelBill();
					} else {
						System.out.println("Invalid Selection!");
					}
				} while (!(selection.equalsIgnoreCase("Cruise") || selection.equalsIgnoreCase("Hotel")));
				System.out.println(
						"Do you want to book another Hotel Room or Cruise ?\nPress Y for another selection or any other key to exit");
				confirmation = sc.nextLine();
			} while (confirmation.equalsIgnoreCase("Y"));
		} catch (InputMismatchException ex) {
			System.out.println("Inavlid Input!");
		}
	}
}
