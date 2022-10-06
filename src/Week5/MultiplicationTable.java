package Week5;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num = 9;
		int count = 1;
		int result;
		while (count <= 10) {
			result = num * count;
			System.out.println(num + " x " + count + " = " + result);
			count++;
		}

	}

}
