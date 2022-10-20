
public class CruiseCompanyMethod {
	String CruiseName;
	double adultsCruisePrice;
	double childrenCruisePrice;
	int numOfDays;
	double adultsBuffetBill;
	double childrenBuffetBill;
	double childrenCruiseBill;
	double adultsCruiseBill;

	CruiseCompanyMethod(String cName, double adltCrsPrice, double chldrnCrsPrice, int numDays) {
		CruiseName = cName;
		adultsCruisePrice = adltCrsPrice;
		childrenCruisePrice = chldrnCrsPrice;
		numOfDays = numDays;
	}
	double getAdultCruiseBill(int numOfAdults) {
			adultsCruiseBill = (numOfAdults * adultsCruisePrice * numOfDays);
		return adultsCruiseBill;
	}
	double getChildrenCruiseBill(int numOfChildren) {
			childrenCruiseBill = (numOfChildren * childrenCruisePrice * numOfDays);
		return childrenCruiseBill;
	}
	double getAdultBuffetBill(int numOfAdults, boolean isBuffetBooked) {
		if (isBuffetBooked) {
			adultsBuffetBill = (numOfAdults * 20.99 * numOfDays);
		}
		return adultsBuffetBill;
	}

	double getChildrenBuffetBill(int numOfChildren, boolean isBuffetBooked) {
		if (isBuffetBooked) {
			childrenBuffetBill = (numOfChildren * 4.99 * numOfDays);
		}
		return childrenBuffetBill;
	}
}