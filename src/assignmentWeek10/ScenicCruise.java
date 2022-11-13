package assignmentWeek10;

public class ScenicCruise extends Cruise {
	ScenicCruise() {
		super(43.99, 12.99, 3, 50, "Spa", "Scenic Cruise");
		System.out.println("The cruise that you have selected is Scenic Cruise which is a 3 day cruise ");
		System.out.println(
				"Price for Adults above 12 years old age : $43.99 per day\nPrice for kids above 5 years old age: $12.99 per day \nChildren of age 5 and below can cruise free!!\n");
	}

}
