
public class WhileLoopPractice {

	public static void main(String[] args) {
		// parking lot capacity
		int countOfCars = 0;
		int parkingLotCapacity = 10;
		while (countOfCars <= parkingLotCapacity) {
			System.out.println("Number of lots filled " + countOfCars);
			countOfCars++;
		}
	}

}
