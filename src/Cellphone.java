
public class Cellphone {
	int planBill = 0;
	int phoneBill = 0;
	int storage = 0;
	String colour = "";

	void Brand(String bName) {
		if (bName.equalsIgnoreCase("Apple")) {
			System.out.println("Models available\nIphone 14 Mini\nIphone 14\nIphone 14 Pro\nIphone 14 Pro Max\n");
		} else if (bName.equalsIgnoreCase("Samsung")) {
			System.out.println("Models available\nS22\nS22+\nS22 Ultra\nS22 FE\n");
		} else {
			System.out.println("Invalid entry please try again");
		}
	}

	int SetStorage(int mem) {
		this.storage = mem;
		if (mem == 128) {
			System.out.println("No extra charges");
		} else if (mem == 256) {
			System.out.println("$5 extra charges");
			phoneBill += 5;
		} else if (mem == 512) {
			System.out.println("$10 extra charges");
			phoneBill += 10;
		} else {
			System.out.println("Invalid selection");
		}
		return phoneBill;
	}

	void SetColour(String color) {
		this.colour = color;
	}

	int Model(String model) {
		switch (model) {
		case "S22":
			System.out.println("You have selected Samsung S22\nBase price $25/month\n");
			phoneBill += 25;
			break;
		case "S22+":
			System.out.println("You have selected Samsung S22+\nBase price $35/month\n");
			phoneBill += 35;
			break;
		case "S22Ultra":
			System.out.println("You have selected Samsung S22 Ultra\nBase price $55/month\n");
			phoneBill += 55;
			break;
		case "S22FE":
			System.out.println("You have selected Samsung S22 F\nBase price $20/month\n");
			phoneBill += 20;
			break;
		case "Iphone14":
			System.out.println("You have selected Apple Iphone 14\nBase price $30/month\n");
			phoneBill += 30;
			break;
		case "Iphone14Pro":
			System.out.println("You have selected Apple Iphone 14 Pro\nBase price $40/month\n");
			phoneBill += 40;
			break;
		case "Iphone14ProMax":
			System.out.println("You have selected Apple Iphone 14 Pro Max\nBase price $65/month\n");
			phoneBill += 65;
			break;
		case "Iphone14Mini":
			System.out.println("You have selected Apple Iphone 14 Mini\nBase price $25/month\n");
			phoneBill += 25;
			break;
		default:
			System.out.println("Invalid entry please try again\n");
			break;
		}
		return phoneBill;
	}

	void Specs() {
		System.out.println("\nSpecs\nColour " + colour + "\nRAM 8GB\nStorage " + storage
				+ " GB\nCellular 5G\nCamera 50 MP\nBattery 3700 mAh\n");
	}

	int Plan(String serviceProvider) {
		switch (serviceProvider) {
		case "Bell":
			System.out.println("You have selected Bell service provider\nPrice : $80/month\n");
			planBill += 80;
			break;
		case "Rogers":
			System.out.println("You have selected Rogers service provider\nPrice : $70/month\n");
			planBill += 70;
			break;
		case "Telus":
			System.out.println("You have selected Telus service provider\nPrice : $75/month\n");
			planBill += 75;
			break;
		default:
			System.out.println("Invalid entry please try again\n");
			break;
		}
		return planBill;
	}
}
