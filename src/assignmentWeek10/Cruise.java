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

	Cruise(double adultCruisePrice, double childrenCruisePrice, int numOfDays, double addOnPrice, String specialFeature,
			String cruiseName) {
		this.adultCruisePrice = adultCruisePrice;
		this.childrenCruisePrice = childrenCruisePrice;
		this.numOfDays = numOfDays;
		this.addOnPrice = addOnPrice;
		this.specialFeature = specialFeature;
		this.cruiseName = cruiseName;
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
