package AssignmentWeek11;

public class R1 extends Rocket {
	private int rocketCost = 100;
	private int rocketWeight = 10000;
	private int maxWeight = 18000;

	R1() {
		// capacity maxWeight - rocketWeight
		super(8000,100,"R1");
	}

	@Override
	public boolean launch() {
		
		int random = (int) (Math.random() * 100) + 1;
		if(random >(5*(currentCap/(maxWeight-rocketWeight)))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean land() {
		int random = (int) (Math.random() * 100) + 1;
		if(random > (1*(currentCap/(maxWeight-rocketWeight)))) {
			return true;
		}
		return false;
	}

}
