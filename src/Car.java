
public class Car {
	private int carPrice;

	void carNames() {
		System.out.println("BMW");
		System.out.println("Audi");
		System.out.println("Mercedes");
	}

	int getCarPrices(String carName) {
		int carPrice = 0;
		if (carName == "BMW") {
			carPrice += 80000;
		} else if (carName == "Audi") {
			carPrice += 70000;
		} else if (carName == "Mercedes") {
			carPrice += 90000;
		}
		return carPrice;
	}

	int setCarPrices(String carName, int newPrice) {
		int carPrice = 0;
		if (carName == "BMW") {
			this.carPrice = newPrice;
		} else if (carName == "Audi") {
			this.carPrice = newPrice;
		} else if (carName == "Mercedes") {
			this.carPrice = newPrice;
		}
		return carPrice;
	}

}
