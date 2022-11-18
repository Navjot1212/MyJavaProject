package AssignmentWeek11;

public class R2 extends Rocket {
	private int rocketCost = 120;
	private int rocketWeight = 18000;
	private int maxWeight = 29000;

	R2() {
		// capacity = maxWeight - rocketWeight
		super(11000,120,"R2");
	}

	@Override
	public boolean launch() {
		int random = (int) (Math.random() * 100) + 1;
		if(random >(4*(currentCap/(maxWeight-rocketWeight)))) {
		return true;
	}
		return false;
	}

	@Override
	public boolean land() {
		int random = (int) (Math.random() * 100) + 1;
		if(random >(8*(currentCap/(maxWeight-rocketWeight)))) {
		return true;
	}
		return false;
	}

}
