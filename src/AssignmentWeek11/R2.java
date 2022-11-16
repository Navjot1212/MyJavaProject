package AssignmentWeek11;

public class R2 extends Rocket {
	int rocketCost = 120;
	int rocketWeight = 18000;
	int maxWeight = 29000;

	R2() {
		// capacity maxWeight - rocketWeight
		super(11000);
	}

	@Override
	public boolean launch() {
		return false;
	}

	@Override
	public boolean land() {
		return false;
	}

}
