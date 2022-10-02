
public class ForLoop {

	public static void main(String[] args) {
		int navjotCapacity = 5;
		for (int counter = 1; counter < 10; counter++) {
			System.out.println("Number of drinks consumed " + counter);
			System.out.println("Number of drinks left to reach capacity " + (navjotCapacity - counter));
			if (counter == navjotCapacity) {
				System.out.println("Max capacity reached");
				break;
			}
		}
	}
}
