package assignmentWeek10;

public class DiscoveryCruise extends Cruise {
	private String CruiseName = "Scenic Cruise";
	private double adultsCruisePrice = 45.99;
	private double childrenCruisePrice = 12.99;
	private int numOfDays = 2;
	private double adventureGamesPrice = 45;

	void getCruiseDetails() {
		System.out.println(
				"The cruise that you have selected is " + CruiseName + " which is a " + numOfDays + " day cruise ");
		System.out.println("Price for Adults above 12 years old age : $" + adultsCruisePrice
				+ " per day\nPrice for kids above 5 years old age: $" + childrenCruisePrice
				+ " per day \nChildren of age 5 and below can cruise free!!\n");
	}

	double getAdultPrice() {
		return adultsCruisePrice;
	}

	double getChildrenPrice() {
		return childrenCruisePrice;
	}

	int getNumOfDays() {
		return numOfDays;
	}

	String getSpecialFeature() {
		return "Adventure Games";
	}

	double getAddOnPrice() {
		return adventureGamesPrice;
	}
}
