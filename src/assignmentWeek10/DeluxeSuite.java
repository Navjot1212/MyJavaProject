package assignmentWeek10;

public class DeluxeSuite extends Hotel {
	final String suiteName = "Deluxe Suite";
	final int maxAdults = 2;
	final int maxChildren = 2;
	final double pricePerDay = 180;

	void getHotelDetails() {
		System.out.println(
				"The Suite that you have selected is " + suiteName + " which is $" + pricePerDay + " per day ");
		System.out.println(suiteName + " can accomodate " + maxAdults + " Adults above 12 years old age " + maxChildren
				+ " kids above 5 years old age ");
		
	}
	double getPrice() {
		return pricePerDay;
	}

}
