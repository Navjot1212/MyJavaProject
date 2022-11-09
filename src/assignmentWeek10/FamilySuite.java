package assignmentWeek10;

public class FamilySuite extends Hotel {
	private String suiteName = "Family Suite";
	private int maxAdults = 4;
	private int maxChildren = 4;
	private double pricePerDay = 230;

	void getHotelDetails() {
		System.out.println(
				"The Suite that you have selected is " + suiteName + " which is $" + pricePerDay + " per day ");
		System.out.println(suiteName + " can accomodate " + maxAdults + " Adults above 12 years old age " + maxChildren
				+ " kids above 5 years old age\n");
	}

	double getPrice() {
		return pricePerDay;
	}
}
