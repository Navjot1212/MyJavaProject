package assignmentWeek10;

public class ScenicCruise extends Cruise{
	final String CruiseName = "Scenic Cruise";
    final double adultsCruisePrice = 43.99;
	final double childrenCruisePrice = 12.99;
	final int numOfDays = 3;
	
	
	void getCruiseDetails() {
		System.out.println(
				"The cruise that you have selected is " + CruiseName + " which is a " + numOfDays + " day cruise ");
		System.out.println("Price for Adults above 12 years old age : $" + adultsCruisePrice
				+ " per day\nPrice for kids above 5 years old age: $" + childrenCruisePrice
				+ " per day \nChildren of age 5 and below can cruise free!!\n");
	}
}
