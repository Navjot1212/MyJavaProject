public class Cellphone {
	int planBill = 0;
	int phoneBill = 0;
	private String storage = "";
	private String colour = "";

	void Brand(String bName) {
		if (bName.equalsIgnoreCase("Apple")) {
			System.out.println("Models available\nIphone 14 Mini\nIphone 14\nIphone 14 Pro\nIphone 14 Pro Max\n");
		} else if (bName.equalsIgnoreCase("Samsung")) {
			System.out.println("Models available\nS22\nS22+\nS22 Ultra\nS22 FE\n");
		} 
	}

	int Model(String model) {
		switch (model) {
		case "S22":
			System.out.println("You have selected Samsung S22\nBase price $25/month\n");
			phoneBill += 25;
			break;
		case "S22 +":
			System.out.println("You have selected Samsung S22+\nBase price $35/month\n");
			phoneBill += 35;
			break;
		case "S22 Ultra":
			System.out.println("You have selected Samsung S22 Ultra\nBase price $55/month\n");
			phoneBill += 55;
			break;
		case "S22 FE":
			System.out.println("You have selected Samsung S22 F\nBase price $20/month\n");
			phoneBill += 20;
			break;
		case "Iphone 14":
			System.out.println("You have selected Apple Iphone 14\nBase price $30/month\n");
			phoneBill += 30;
			break;
		case "Iphone 14 Pro":
			System.out.println("You have selected Apple Iphone 14 Pro\nBase price $40/month\n");
			phoneBill += 40;
			break;
		case "Iphone 14 Pro Max":
			System.out.println("You have selected Apple Iphone 14 Pro Max\nBase price $65/month\n");
			phoneBill += 65;
			break;
		case "Iphone 14 Mini":
			System.out.println("You have selected Apple Iphone 14 Mini\nBase price $25/month\n");
			phoneBill += 25;
			break;
		default:
			System.out.println(model + " model is not available\n");
			break;
		}
		return phoneBill;
	}

	int SetStorage(String mem) {
		if (mem.equalsIgnoreCase("128 GB")) {
			storage = mem;
			System.out.println("No extra charges");
		} else if (mem.equalsIgnoreCase("256 GB")) {
			storage = mem;
			System.out.println("$5 extra charges");
			phoneBill += 5;
		} else if (mem.equalsIgnoreCase("512 GB")) {
			storage = mem;
			System.out.println("$10 extra charges");
			phoneBill += 10;
		}
		return phoneBill;
	}

	void SetColour(String color) {
		if (color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White") || color.equalsIgnoreCase("Silver")) {
			System.out.println(color+" colour selected");
			colour = color;
		} 
	}

	void Specs(String brand) {
		if (brand.equalsIgnoreCase("Apple")) {
			System.out.println("\nSpecs\nColour " + colour + "\nRAM 8GB\nStorage " + storage
					+ "\nCellular 5G\nCamera 55 MP\nBattery 4000 mAh\n");
		} else {
			System.out.println("\nSpecs\nColour " + colour + "\nRAM 6GB\nStorage " + storage
					+ "\nCellular 5G\nCamera 50 MP\nBattery 3700 mAh\n");
		}
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
			System.out.println(serviceProvider + " service provider is not available\n");
			break;
		}
		return planBill;
	}
}
