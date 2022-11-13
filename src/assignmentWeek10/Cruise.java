package assignmentWeek10;

public class Cruise extends User {
	private String cruiseName;
	protected String specialFeature;
	protected double adultCruisePrice;
	protected double childrenCruisePrice;
	private double adultBuffetBill;
	private double childrenBuffetBill;
	protected int numOfDays;
	private int numOfAdults;
	private int numOfChildren;
	protected double addOnPrice;

	private void selectCruise() {

			do {

				System.out.println(
						"We offer 4 different packages as displayed below. Please enter the cruise that you want to select \nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise ");
				cruiseName = sc.nextLine();
				if (cruiseName.equalsIgnoreCase("Scenic Cruise")) {
					ScenicCruise scenicCruise = new ScenicCruise();
					scenicCruise.getCruiseDetails();
					adultCruisePrice = scenicCruise.getAdultPrice();
					childrenCruisePrice = scenicCruise.getChildrenPrice();
					numOfDays = scenicCruise.getNumOfDays();
					addOnPrice = scenicCruise.getAddOnPrice();
					specialFeature = scenicCruise.getSpecialFeature();
				} else if (cruiseName.equalsIgnoreCase("Sunset Cruise")) {
					SunsetCruise sunsetCruise = new SunsetCruise();
					sunsetCruise.getCruiseDetails();
					adultCruisePrice = sunsetCruise.getAdultPrice();
					childrenCruisePrice = sunsetCruise.getChildrenPrice();
					numOfDays = sunsetCruise.getNumOfDays();
					addOnPrice = sunsetCruise.getAddOnPrice();
					specialFeature = sunsetCruise.getSpecialFeature();
				} else if (cruiseName.equalsIgnoreCase("Mystery Cruise")) {
					MysteryCruise mysteryCruise = new MysteryCruise();
					mysteryCruise.getCruiseDetails();
					adultCruisePrice = mysteryCruise.getAdultPrice();
					childrenCruisePrice = mysteryCruise.getChildrenPrice();
					numOfDays = mysteryCruise.getNumOfDays();
					addOnPrice = mysteryCruise.getAddOnPrice();
					specialFeature = mysteryCruise.getSpecialFeature();
				} else if (cruiseName.equalsIgnoreCase("Dicovery Cruise")) {
					DiscoveryCruise discoveryCruise = new DiscoveryCruise();
					discoveryCruise.getCruiseDetails();
					adultCruisePrice = discoveryCruise.getAdultPrice();
					childrenCruisePrice = discoveryCruise.getChildrenPrice();
					numOfDays = discoveryCruise.getNumOfDays();
					addOnPrice = discoveryCruise.getAddOnPrice();
					specialFeature = discoveryCruise.getSpecialFeature();
				} else {
					System.out.println("Invalid Selection!");
				}
		} while (!(cruiseName.equalsIgnoreCase("Scenic Cruise") || cruiseName.equalsIgnoreCase("Sunset Cruise")
				|| cruiseName.equalsIgnoreCase("Discovery Cruise") || cruiseName.equalsIgnoreCase("Mystery Cruise")));
	}

	private void boarding() {
		System.out.println("Enter number of Adults :");
		numOfAdults = sc.nextInt();
		System.out.println("Enter number of Children :");
		numOfChildren = sc.nextInt();
	}

	private void wantBuffet() {
		System.out.println(
				"\nAll our cruises have food service on board.\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults\nAnd 4.99 per day for kids Yes/No?");
		String wantBuffet = sc.next();
		if (wantBuffet.equalsIgnoreCase("Yes")) {
			adultBuffetBill = (numOfAdults * 20.99 * numOfDays);
			childrenBuffetBill = (numOfChildren * 4.99 * numOfDays);
		}
	}

	private void wantaddOns() {
		System.out.println(
				"\nDo you want to pre-book for " + specialFeature + " at " + addOnPrice + " per day/per day Yes/No?");
		String wantAddOns = sc.next();
		if (wantAddOns.equalsIgnoreCase("Yes")) {
			addOnPrice = (numOfAdults * addOnPrice * numOfDays) + (numOfChildren * addOnPrice * numOfDays);

		}
	}

	void getCruiseBill() {

		selectCruise();
		boarding();
		wantBuffet();
		wantaddOns();
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
		System.out.printf(cruiseName + " AddOns		       	  @ 	 %d	: $ %.2f \n", (numOfAdults + numOfChildren),
				addOnPrice);
		System.out.printf("Total Price						: $ %.2f \n", bill);
		System.out.printf("HST	@ 18%%			                	: $ %.2f \n", hst);
		System.out.printf("Final Price						: $ %.2f \n", finalBill);

	}
}
