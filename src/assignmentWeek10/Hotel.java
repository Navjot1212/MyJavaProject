package assignmentWeek10;

public class Hotel extends User {
	String hotelName;
	String wantExtraMeal;
	double suitePrice;
	double childrenLunchBill;
	double adultLunchBill;
	int stayDays;
	int numOfAdults;
	int numOfChildren;

	void selectHotel() {
		String hotelName;
		do {

			System.out.println(
					"We offer 2 different suites as displayed below. Please enter the suite that you want to select \nDeluxe Suite\nFamily Suite");
			hotelName = sc.nextLine();
			this.hotelName = hotelName;
			if (hotelName.equalsIgnoreCase("Deluxe Suite")) {
				DeluxeSuite deluxeSuite = new DeluxeSuite();
				deluxeSuite.getHotelDetails();
				suitePrice = deluxeSuite.getPrice();
			} else if (hotelName.equalsIgnoreCase("Family Suite")) {
				FamilySuite familySuite = new FamilySuite();
				familySuite.getHotelDetails();
				suitePrice = familySuite.getPrice();
			} else {
				System.out.println("Inavalid Selection!");
			}
		} while (!(hotelName.equalsIgnoreCase("Deluxe Suite") || hotelName.equalsIgnoreCase("Family Suite")));
	}

	void checkIn() {
		System.out.println("Enter number of Adults :");
		numOfAdults = sc.nextInt();
		System.out.println("Enter number of Children :");
		numOfChildren = sc.nextInt();
	}
	
	void extraMeal() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child ?");
		wantExtraMeal = sc.nextLine();
		System.out.println("Enter the number of days of stay :");
		stayDays = sc.nextInt();
		if (wantExtraMeal.equalsIgnoreCase("Yes")) {
			childrenLunchBill = (5 * numOfChildren *stayDays);
			adultLunchBill = (25 * numOfAdults *stayDays);
		}	
	}

	void getHotelBill() {
		double suiteBill = suitePrice * stayDays;
		double bill = suiteBill + childrenLunchBill + adultLunchBill;
		double hst = bill * 0.18;
		double finalBill = bill + hst;
		System.out.println("The total amount you will be charged is");
		System.out.printf(hotelName + "   		 	@	%d nights	: $ %.2f \n",stayDays , suiteBill);
		 System.out.printf("Lunch Pre-Booked Special Rate Adults @ %d                : $ %.2f \n", numOfAdults, adultLunchBill);
		 System.out.printf("Lunch Pre-Booked Special Rate Children above 5 @ %d      : $ %.2f \n", numOfChildren, childrenLunchBill);
		System.out.printf("Total Price						: $ %.2f \n", bill);
		System.out.printf("HST	@ 15%%			                	: $ %.2f \n", hst);
		System.out.printf("Final Price						: $ %.2f \n", finalBill);

	}
}
