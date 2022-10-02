
public class PracticeDebugMode {

	public static void main(String[] args) {
		/*Ontario license authority checks for two things to issue a license, first is
		 * the age of person and the current level (G1 or G2 or G) . Assume different
		 * values for these two values and write code which will print, whether license
		 * will be issued to the person or not and if the license is issued, which type
		 * of license the person will get i.e. whether he will get a G1 or G2 or G.
		 */
		int age = 22;
		String currentLevel = "G";
		if (age>=16) {
			if(currentLevel == "No License") {
			    System.out.println("You will get G1 license");
			}
			else if(currentLevel == "G1") {
		        System.out.println("You will get G2 license");
			}
			else if(currentLevel== "G2" ) {
				System.out.println("You will get G license");
			}
			else if(currentLevel== "G" ) {
				System.out.println("You have the highest level of license");
			}
		    }
			else {
				System.out.println("Your age is not eligible");
			}
		
		
		
	}
}
