package AssignmentWeek11;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		int r1Cost = 0;
		int r2Cost = 0;
		Simulation simulation = new Simulation();
		r1Cost = simulation.runSimulation(simulation.loadU1(simulation.loadItems()));
		r2Cost = simulation.runSimulation(simulation.loadU2(simulation.loadItems()));
		System.out.println("Total cost for R1 fleet: $" + r1Cost + " Million");
		System.out.println("Total cost for R2 fleet: $" + r2Cost + " Million");
	}
}
