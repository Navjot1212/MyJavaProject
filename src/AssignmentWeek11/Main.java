package AssignmentWeek11;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		int r1Cost = 0;
		int r2Cost = 0;
		Simulation simulation = new Simulation();
		simulation.loadU1(simulation.loadItems());
//		r1Cost = simulation.runSimulation(null);
		simulation.loadU2(simulation.loadItems());
//		r2Cost = simulation.runSimulation(null);
//		System.out.println("Total cost for R1 fleet: $"+r1Cost);
//		System.out.println("Total cost for R2 fleet: $"+r2Cost);
//		Simulation simulation = new Simulation();
//		ArrayList arraylist = simulation.loadItems();
//		for(int i = 0; i<arraylist.size();i++) {
//		Item item = (Item) arraylist.get(i);
//		System.out.println(item.getName()+" = "+item.getWeight());
//		}

	}
}
