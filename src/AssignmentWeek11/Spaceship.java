package AssignmentWeek11;

import java.io.FileNotFoundException;

public interface Spaceship {

	boolean launch();
	boolean land();
	boolean canCarry(Item item)throws FileNotFoundException;
	boolean carry(Item item)throws FileNotFoundException;
}
