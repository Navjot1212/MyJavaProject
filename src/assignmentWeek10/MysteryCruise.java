package assignmentWeek10;

public class MysteryCruise extends Cruise {
	MysteryCruise() {
		super(45.99, 12.99, 2, 20, "Casino", "Mystery Cruise");
		System.out.println("The cruise that you have selected is Mystery Cruise which is a 2 day cruise ");
		System.out.println(
				"Price for Adults above 12 years old age : $45.99 per day\nPrice for kids above 5 years old age: $12.99 per day \nChildren of age 5 and below can cruise free!!\n");
	}
}
