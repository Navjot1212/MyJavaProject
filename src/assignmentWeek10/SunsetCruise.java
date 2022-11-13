package assignmentWeek10;

public class SunsetCruise extends Cruise {
	SunsetCruise() {
		super(52.99, 15.99, 1, 45, "Candle Light Dinner", "Sunset Cruise");
		System.out.println("The cruise that you have selected is Sunset Cruise which is a 1 day cruise ");
		System.out.println(
				"Price for Adults above 12 years old age : $52.99 per day\nPrice for kids above 5 years old age: $15.99 per day \nChildren of age 5 and below can cruise free!!\n");
	}
}
