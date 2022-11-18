package AssignmentWeek11;

public interface Spaceship {

	boolean launch();
	boolean land();
	boolean canCarry(Item item);
	boolean carry(Item item);
}
