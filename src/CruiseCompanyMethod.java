
public class CruiseCompanyMethod {
	private String CruiseName;
	private double adultsCruisePrice;
	private double childrenCruisePrice;
	private int numOfDays;
	private double adultsBuffetBill;
	private double childrenBuffetBill;
	private double childrenCruiseBill;
	private double adultsCruiseBill;

	CruiseCompanyMethod(String cName, double adltCrsPrice, double chldrnCrsPrice, int numDays) {
		CruiseName = cName;
		adultsCruisePrice = adltCrsPrice;
		childrenCruisePrice = chldrnCrsPrice;
		numOfDays = numDays;
	}

	String getCruiseName (){
		return CruiseName;
	}
	void getCruiseDetails() {
		System.out.println(
				"The cruise that you have selected is " + CruiseName + " which is a " + numOfDays + " day cruise ");
		System.out.println("Price for Adults above 12 years old age : $" + adultsCruisePrice
				+ " per day\nPrice for kids above 5 years old age: $" + childrenCruisePrice
				+ " per day \nChildren of age 5 and below can cruise free!!\n");
	}

	void getAdultCruiseBill(int numOfAdults) {
		adultsCruiseBill = (numOfAdults * adultsCruisePrice * numOfDays);
		System.out.printf(CruiseName + " Adults 		 	@	%d	: $ %.2f \n", numOfAdults, adultsCruiseBill);
	}

	void getChildrenCruiseBill(int numOfChildren) {
		childrenCruiseBill = (numOfChildren * childrenCruisePrice * numOfDays);
		System.out.printf(CruiseName + " Children above 5  	@	%d	: $ %.2f \n", numOfChildren, childrenCruiseBill);
	}

	void getAdultBuffetBill(int numOfAdults, boolean isBuffetBooked) {
		if (isBuffetBooked) {
			adultsBuffetBill = (numOfAdults * 20.99 * numOfDays);
			System.out.printf("Buffet Special Price Adults		@	%d	: $ %.2f \n", numOfAdults, adultsBuffetBill);
		}
	}

	void getChildrenBuffetBill(int numOfChildren, boolean isBuffetBooked) {
		if (isBuffetBooked) {
			childrenBuffetBill = (numOfChildren * 4.99 * numOfDays);
			System.out.printf("Buffet Special Price Children above 5  @ 	%d	: $ %.2f \n", numOfChildren,
					childrenBuffetBill);
		}
	}

	void getBill() {
		double bill = adultsBuffetBill + childrenBuffetBill + childrenCruiseBill + adultsCruiseBill;
		System.out.printf("Total Price						: $ %.2f \n", bill);
		double hst = bill * 0.15;
		System.out.printf("HST	@ 15%%			                	: $ %.2f \n", hst);
		double finalBill = bill + hst;
		System.out.printf("Final Price						: $ %.2f \n", finalBill);
	}
}