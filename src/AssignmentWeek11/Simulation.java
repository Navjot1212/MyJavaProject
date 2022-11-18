package AssignmentWeek11;

import java.io.*;
import java.util.*;

public class Simulation {

	ArrayList<Item> loadItems() throws FileNotFoundException {
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

	ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {
		ArrayList<Rocket> R1List = new ArrayList<Rocket>();
		Item item;
		while (itemList.size() > 0) {
			R1 r1 = new R1();
			for (int i = 0; i < itemList.size(); i++) {
				item = itemList.get(i);
				if (r1.canCarry(item)) {
					r1.carry(item);
					itemList.remove(i);
				}
			}
			R1List.add(r1);
		}
		return R1List;
	}

	ArrayList<Rocket> loadU2(ArrayList<Item> itemList) {
		ArrayList<Rocket> R2List = new ArrayList<Rocket>();
		Item item;
		while (itemList.size() > 0) {
			R2 r2 = new R2();
			for (int i = 0; i < itemList.size(); i++) {
				item = itemList.get(i);
				if (r2.canCarry(item)) {
					r2.carry(item);
					itemList.remove(i);
				}
			}
			R2List.add(r2);
		}
		return R2List;
	}

	int runSimulation(ArrayList<Rocket> rocketList) throws InterruptedException {
		int numOfRockets = 0;
		Rocket rocket = null;
		for (int i = 0; i < rocketList.size(); i++) {
			rocket = (Rocket) rocketList.get(i);
			/***************Launch Design*******************/
			Thread.sleep(150);
			System.out.print("3...");
			Thread.sleep(150);
			System.out.print(" 2.. ");
			Thread.sleep(150);
			System.out.print(" 1.  ");
			Thread.sleep(150);
			System.out.println(" \uD83D\uDE80");
			/*************************************************/
			if (rocket.launch() && rocket.land()) {
				System.out.println(rocket.rName + " fleet rocket number " + (i + 1) + " Landed succesfully");
				numOfRockets++;
			} else {
				numOfRockets++;
				System.out.println(rocket.rName + " fleet rocket number " + (i + 1) + " Exploded");
				System.out.println("Relaunching " + rocket.rName + " fleet rocket number " + (i + 1));
				if (rocket.launch() && rocket.land()) {
					System.out.println(
							"Relaunched " + rocket.rName + " fleet rocket number " + (i + 1) + " Landed succesfully");
					numOfRockets++;
				} else {
					System.out.println(
							"Relaunched " + rocket.rName + " fleet rocket number " + (i + 1) + " Exploded again");
					numOfRockets++;
				}
			}
		}
		return (numOfRockets * rocket.rocketCost);
	}

}
