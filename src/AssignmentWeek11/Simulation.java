package AssignmentWeek11;

import java.io.*;
import java.util.*;

public class Simulation {
	int numOfRockets;

	ArrayList loadItems() throws FileNotFoundException {
		File myFile = new File("C:\\Users\\navjo\\OneDrive\\Desktop\\phase-1.txt\\");
		Scanner read = new Scanner(myFile);
		ArrayList<Item> itemList = new ArrayList<Item>();
		while (read.hasNextLine()) {
			Item item = new Item();
			String line = read.nextLine();
			String name = line.substring(0, line.indexOf("="));
			int weight = Integer.parseInt(line.substring(line.indexOf("=") + 1));
			item.setName(name);
			item.setWeight(weight);
			itemList.add(item);
		}
		read.close();
		return itemList;
	}

	ArrayList loadU1(ArrayList itemList) {
		ArrayList<Rocket> R1List = new ArrayList<Rocket>();
		Rocket rocket = new R1();
		Item item;
		for (int i = 0; i < itemList.size(); i++) {
			item = (Item) itemList.get(i);
			if (rocket.canCarry(item)) {
				rocket.carry(item);
				System.out.println(i+" R1 "+item.getName()+" "+rocket.currentCap);
//				itemList.remove(i);
			} 
		}
		return R1List;
	}

	ArrayList loadU2(ArrayList itemList) {
		ArrayList<Rocket> R2List = new ArrayList<Rocket>();
		Rocket rocket = new R2();
		Item item;
		for (int i = 0; i < itemList.size(); i++) {
			item = (Item) itemList.get(i);
			if (rocket.canCarry(item)) {
				rocket.carry(item);
				System.out.println(i+" R2 "+item.getName()+" "+rocket.currentCap);
//				itemList.remove(i);
			} 
		}
		return R2List;
	}

	void runSimulation(ArrayList rocketList) {
		Rocket rocket;
		for (int i = 0; i < rocketList.size(); i++) {
			rocket = (Rocket) rocketList.get(i);
		}
	}

}
