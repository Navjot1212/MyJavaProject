package assignmentWeek10;

public class DiscoveryCruise extends Cruise {
	DiscoveryCruise() {
		super(39.99, 9.99, 4, 50, "Adventure Games", "Discovery Cruise");
		System.out.println("The cruise that you have selected is Discovery Cruise which is a 4 day cruise ");
		System.out.println(
				"Price for Adults above 12 years old age : $39.99 per day\nPrice for kids above 5 years old age: $9.99 per day \nChildren of age 5 and below can cruise free!!\n");
	}
}
