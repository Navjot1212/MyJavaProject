package Week5;

public class WaterTankCapacity {

	public static void main(String[] args) {
		/*
		 * There is a water tank of capacity 100 litres. Water is filled into it using
		 * bucket which have capacity of 10 litres. Write a program which fills the tank
		 * to its capacity using these buckets. Also include a mechanism in your program
		 * to stop the tank from over flowing.
		 */
		int currentTankCap = 0;
		int bucketCap = 10;
		int numOfBucket = 1;
		while (currentTankCap <= 110) {
			currentTankCap += bucketCap;
			if (numOfBucket == 1) {
				System.out.println("Water Tank filled " + currentTankCap + " litres after " + numOfBucket + " bucket");
			} else
				System.out.println("Water Tank filled " + currentTankCap + " litres after " + numOfBucket + " buckets");
			numOfBucket++;
			if (currentTankCap == 100) {
				System.out.println("Water tank reached maximum capacity of "+currentTankCap+" litres");
				break;
			}
		}
	}

}
