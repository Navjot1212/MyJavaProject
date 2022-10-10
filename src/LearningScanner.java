import java.util.Scanner;

public class LearningScanner {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number 1");
		num1 = sc.nextInt();
		System.out.println("Please Enter number 2");
		num2 = sc.nextInt();
		System.out.println("Please Enter number 3");
		num3 = sc.nextInt();
		num4 = num1 + num2 +num3;
		System.out.println("Addition of three numbers is "+num4);
		System.out.println("Please Enter your Name");
		name = sc.next();
		System.out.println("Name : "+name);

	}

}
