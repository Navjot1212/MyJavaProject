package assignmentWeek10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cruise cruise = new Cruise();
		Hotel hotel = new Hotel();
		User navjot = new User();
//		navjot.signUp();
//		navjot.logIn();
		String selection;
		String confirmation;
		do{
			do {
			System.out.println("Please enter the service you want to book\nHotel\nCruise ");
			selection = sc.nextLine();
			if (selection.equalsIgnoreCase("Cruise")) {
				cruise.selectCruise();
				cruise.boarding();
				cruise.wantBuffet();
				cruise.getCruiseBill();
			} else if (selection.equalsIgnoreCase("Hotel")) {
				hotel.selectHotel();
				hotel.checkIn();
				hotel.extraMeal();
				hotel.getHotelBill();
			} else {
				System.out.println("Invalid Selection!");
			}
		} while (!(selection.equalsIgnoreCase("Cruise") || selection.equalsIgnoreCase("Hotel")));
		System.out.println("Do you want to book another Hotel Room or Cruise ?\nPress Y for selection or any other key to exit");
		confirmation = sc.nextLine();
	}while(confirmation.equalsIgnoreCase("Y"));
}

}
