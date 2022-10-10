
public class WaterTankCapacity {

	public static void main(String[] args) {
		int currentTankCap = 9;
		int numOfBuckets = 0;
		while (currentTankCap < 120) {
			if (currentTankCap >= 90) {
				System.out.println("Max capacity reached");
				break;
			}
			currentTankCap += 10;
			numOfBuckets++;

			System.out.println(
					"Current Tank Capacity is " + currentTankCap + " litres after " + numOfBuckets + " buckets");

		}

	}

}