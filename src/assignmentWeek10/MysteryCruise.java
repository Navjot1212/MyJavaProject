package assignmentWeek10;

public class MysteryCruise extends Cruise{
	final String CruiseName = "Scenic Cruise";
    final double adultsCruisePrice = 39.99;
	final double childrenCruisePrice = 9.99;
	final int numOfDays = 4;
	
	void getCruiseDetails() {
		System.out.println(
				"The cruise that you have selected is " + CruiseName + " which is a " + numOfDays + " day cruise ");
		System.out.println("Price for Adults above 12 years old age : $" + adultsCruisePrice
				+ " per day\nPrice for kids above 5 years old age: $" + childrenCruisePrice
				+ " per day \nChildren of age 5 and below can cruise free!!\n");
	}
}
