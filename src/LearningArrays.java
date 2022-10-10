
public class LearningArrays {

	public static void main(String[] args) {
		String[] nameList = { "Navjot", "Kuldeep", "Daman", "Sahib", "Jattan" };
		int[] numList = { 12, 13, 14, 15, 16 };
		System.out.println("My name is " + nameList[0] + " and age is " + (numList[0] + numList[1]));
		for (String name : nameList) {
			System.out.println("Name is " + name);
		}
	}

}
