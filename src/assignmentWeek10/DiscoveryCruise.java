package assignmentWeek10;

public class DiscoveryCruise extends Cruise{
	final String CruiseName = "Scenic Cruise";
    final double adultsCruisePrice = 45.99;
	final double childrenCruisePrice = 12.99;
	final int numOfDays = 2;
	final double adventureGamesPrice = 45;
	
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
				CruiseName + " offers casino services for $" + adventureGamesPrice + " per person\nDo you want to add casino services?");
		String wantadventureGames = sc.nextLine();
		if (wantadventureGames.equalsIgnoreCase("Yes")) {
			return adventureGamesPrice;
		} else {
			return 0;
		}
	}
}
