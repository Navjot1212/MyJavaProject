import java.util.Scanner;

public class LearningArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nameList = { "Navjot", "Kuldeep", "Daman", "Kuldeep","Navjot", "Jattan", "Kuldeep", "Sahib" };
		int num = 0;
		System.out.println("what name do you want to search ?");
		String name = sc.nextLine();
		for (int i = 0; i <= nameList.length - 1; i++) {
			if (nameList[i].equals(name)) {
				num++;
			}
		}
		System.out.println(num + " results found");
	}

}
