import java.util.Scanner;

public class Methods {
	static void paisaDouble(int i) {
		System.out.println("After 25 Days your money will be " + i * 2);
		System.out.println("After 50 Days your money will be " + i * 4);
	}

	public static void main(String[] args) {
		System.out.println("25 DIN ME PAISA DOUBLE");
		System.out.println("How much do you have?");
		Scanner getVal = new Scanner(System.in);
		String paisa = getVal.nextLine();
		int a = Integer.parseInt(paisa);
		paisaDouble(a);
	}

}
