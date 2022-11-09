package assignmentWeek10;

public class Cruise extends User {
	String cruiseName;
	String wantBuffet;
	double adultCruisePrice;
	double childrenCruisePrice;
	double addOnPrice;
	double adultBuffetBill;
	double childrenBuffetBill;
	int numOfDays;
	int numOfAdults;
	int numOfChildren;

	void selectCruise() {
		String cruiseName;
		do {

			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select \nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise ");
			cruiseName = sc.nextLine();
			this.cruiseName = cruiseName;
			if (cruiseName.equalsIgnoreCase("Scenic Cruise")) {
				ScenicCruise scenicCruise = new ScenicCruise();
				scenicCruise.getCruiseDetails();
				adultCruisePrice = scenicCruise.getAdultPrice();
				childrenCruisePrice = scenicCruise.getChildrenPrice();
				numOfDays = scenicCruise.getNumOfDays();
				addOnPrice = scenicCruise.addOns();
			} else if (cruiseName.equalsIgnoreCase("Sunset Cruise")) {
				SunsetCruise sunsetCruise = new SunsetCruise();
				sunsetCruise.getCruiseDetails();
				adultCruisePrice = sunsetCruise.getAdultPrice();
				childrenCruisePrice = sunsetCruise.getChildrenPrice();
				numOfDays = sunsetCruise.getNumOfDays();
				addOnPrice = sunsetCruise.addOns();
			} else if (cruiseName.equalsIgnoreCase("Mystery Cruise")) {
				MysteryCruise mysteryCruise = new MysteryCruise();
				mysteryCruise.getCruiseDetails();
				adultCruisePrice = mysteryCruise.getAdultPrice();
				childrenCruisePrice = mysteryCruise.getChildrenPrice();
				numOfDays = mysteryCruise.getNumOfDays();
				addOnPrice = mysteryCruise.addOns();
			} else if (cruiseName.equalsIgnoreCase("Dicovery Cruise")) {
				DiscoveryCruise discoveryCruise = new DiscoveryCruise();
				discoveryCruise.getCruiseDetails();
				adultCruisePrice = discoveryCruise.getAdultPrice();
				childrenCruisePrice = discoveryCruise.getChildrenPrice();
				numOfDays = discoveryCruise.getNumOfDays();
				addOnPrice = discoveryCruise.addOns();
			} else {
				System.out.println("Invalid Selection!");
			}
		} while (!(cruiseName.equalsIgnoreCase("Scenic Cruise") || cruiseName.equalsIgnoreCase("Sunset Cruise")
				|| cruiseName.equalsIgnoreCase("Discovery Cruise") || cruiseName.equalsIgnoreCase("Mystery Cruise")));
	}
	
	void boarding() {
		System.out.println("Enter number of Adults :");
		numOfAdults = sc.nextInt();
		System.out.println("Enter number of Children :");
		numOfChildren = sc.nextInt();
	}
	void wantBuffet() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child ?");
		wantBuffet = sc.nextLine();
		if (wantBuffet.equalsIgnoreCase("Yes")) {
			adultBuffetBill = (numOfAdults * 20.99 * numOfDays);
			childrenBuffetBill = (numOfChildren * 4.99 * numOfDays);
		}	
	}

	void getCruiseBill() {
		double cruiseAdultBill = numOfAdults * adultCruisePrice * numOfDays;
		double cruiseChildrenBill = numOfChildren * childrenCruisePrice * numOfDays;
		double bill = cruiseAdultBill + cruiseChildrenBill + adultBuffetBill + childrenBuffetBill + addOnPrice;
		double hst = bill * 0.18;
		double finalBill = bill + hst;
		System.out.printf(cruiseName + " Adults 		 	@	%d	: $ %.2f \n", numOfAdults, cruiseAdultBill);
		System.out.printf(cruiseName + " Children above 5  	@	%d	: $ %.2f \n", numOfChildren, cruiseChildrenBill);
		System.out.printf("Buffet Special Price Adults		@	%d	: $ %.2f \n", numOfAdults, adultBuffetBill);
		System.out.printf("Buffet Special Price Children above 5  @ 	%d	: $ %.2f \n", numOfChildren,
				childrenBuffetBill);
		System.out.printf("Total Price						: $ %.2f \n", bill);
		System.out.printf("HST	@ 15%%			                	: $ %.2f \n", hst);
		System.out.printf("Final Price						: $ %.2f \n", finalBill);

	}
}
