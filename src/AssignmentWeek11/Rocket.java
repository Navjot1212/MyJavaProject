package AssignmentWeek11;

public class Rocket implements Spaceship {
	int currentCap;
	int maxCap;

	Rocket(int maxCap) {
		this.maxCap = maxCap;
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
		if ((item.getWeight()<=(maxCap-currentCap)) && (currentCap <= maxCap)) {
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
