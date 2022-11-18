package AssignmentWeek11;

public class Rocket implements Spaceship {
	int currentCap;
	int maxCap;
	int rocketCost;
	String rName;

	Rocket(int maxCap, int rocketCost, String rName) {
		this.maxCap = maxCap;
		this.rocketCost = rocketCost;
		this.rName = rName;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if ((item.getWeight() <= (maxCap - currentCap))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean carry(Item item) {
		if (canCarry(item)) {
			currentCap += item.getWeight();
			return true;
		}
		return false;
	}
}
