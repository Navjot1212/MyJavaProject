package assignmentWeek10;

public class Hotel extends User {
	private String suiteName;
	private String wantExtraMeal;
	private double suitePrice;
	private double childrenLunchBill;
	private double adultLunchBill;
	private int stayDays;
	private int numOfAdults;
	private int numOfChildren;

	Hotel(double suitePrice, String suiteName) {
		this.suitePrice = suitePrice;
		this.suiteName = suiteName;
	}

	private void checkIn() {
		System.out.println("Enter number of Adults :");
		numOfAdults = sc.nextInt();
		System.out.println("Enter number of Children :");
		numOfChildren = sc.nextInt();
		if (suiteName.equalsIgnoreCase("Family Suite")) {
			if (numOfAdults > 4 || numOfChildren > 4) {
				suitePrice = suitePrice*2;
				System.out.println("You will be charged for two Family suites");
			}
		} else {
			if (numOfAdults > 2 || numOfChildren > 2) {
				suitePrice = suitePrice*2;
				System.out.println("You will be charged for two Deluxe suites");
			}
		}
	}

	private void extraMeal() {
		System.out.println(
				"All rooms come with free breakfast.\nDo you want to add lunch in your room as well at a discounted pre-booking\nrate of $25/ adult and $5/ child Yes/No ?");
		wantExtraMeal = sc.next();
		System.out.println("Enter the number of days of stay :");
		stayDays = sc.nextInt();
		if (wantExtraMeal.equalsIgnoreCase("Yes")) {
			childrenLunchBill = (5 * numOfChildren * stayDays);
			adultLunchBill = (25 * numOfAdults * stayDays);
		}
	}

	void getHotelBill() {
		checkIn();
		extraMeal();
		double suiteBill = suitePrice * stayDays;
		double bill = suiteBill + childrenLunchBill + adultLunchBill;
		double hst = bill * 0.18;
		double finalBill = bill + hst;
		System.out.println("The total amount you will be charged is");
		System.out.printf(suiteName + "   		 	@	%d nights	: $ %.2f \n", stayDays, suiteBill);
		System.out.printf("Lunch Pre-Booked Special Rate Adults @ %d                : $ %.2f \n", numOfAdults,
				adultLunchBill);
		System.out.printf("Lunch Pre-Booked Special Rate Children above 5 @ %d      : $ %.2f \n", numOfChildren,
				childrenLunchBill);
		System.out.printf("Total Price						: $ %.2f \n", bill);
		System.out.printf("HST	@ 18%%			                	: $ %.2f \n", hst);
		System.out.printf("Final Price						: $ %.2f \n", finalBill);

	}
}
