package AssignmentWeek11;

import java.io.*;
import java.util.*;

public class Simulation {
	
	void loadItems() throws FileNotFoundException {
		File myFile = new File("C:\\Users\\navjo\\OneDrive\\Desktop\\phase-1.txt\\");
		Scanner read = new Scanner(myFile);
		ArrayList<Item> itemList = new ArrayList<Item>();
		while (read.hasNextLine()) {
			Item item = new Item();
			String line = read.nextLine();
			String name = line.substring(0, line.indexOf("="));
			int weight = Integer.parseInt(line.substring(line.indexOf("=")+1)) ;
			item.setName(name);
			item.setWeight(weight);
			itemList.add(item);
		}
		read.close();
	}
	
	
}
