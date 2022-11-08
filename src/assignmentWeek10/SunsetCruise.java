package assignmentWeek10;

public class SunsetCruise extends Cruise{
	final String CruiseName = "Sunset Cruise";
    final double adultsCruisePrice = 52.99;
	final double childrenCruisePrice = 15.99;
	final int numOfDays = 1;
	
	void getCruiseDetails() {
		System.out.println(
				"The cruise that you have selected is " + CruiseName + " which is a " + numOfDays + " day cruise ");
		System.out.println("Price for Adults above 12 years old age : $" + adultsCruisePrice
				+ " per day\nPrice for kids above 5 years old age: $" + childrenCruisePrice
				+ " per day \nChildren of age 5 and below can cruise free!!\n");
	}
}
