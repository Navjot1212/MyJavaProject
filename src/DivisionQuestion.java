
public class DivisionQuestion {

	public static void main(String[] args) {
		int num = 1;
		while (num <= 100) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println("Numbers divisible by 5 and 3 are " + num);
			num++;
		}
	}
}
