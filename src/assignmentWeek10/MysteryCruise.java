package assignmentWeek10;

public class MysteryCruise extends Cruise{
	final String CruiseName = "Scenic Cruise";
    final double adultsCruisePrice = 39.99;
	final double childrenCruisePrice = 9.99;
	final int numOfDays = 4;
	final double casinoPrice = 20;
	
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
	double addOns() {
		System.out.println(
				CruiseName + " offers casino services for $" + casinoPrice + " per person\nDo you want to add casino services?");
		String wantCasino = sc.nextLine();
		if (wantCasino.equalsIgnoreCase("Yes")) {
			return casinoPrice;
		} else {
			return 0;
		}
	}
}
