
public class StringFormats {

	public static void main(String[] args) {

		String name = "Navjot Singh";
		// Print first name
		System.out.println(name.substring(0, 6));
		// Just print your last name
		System.out.println(name.substring(7));
		// Write your first and Last name and replace Last name with *
		System.out.println(name.substring(0, 6) + name.substring(7).replaceAll("\\w", "*"));
		// Find length of your name
		System.out.println(name.length());
		// Replace all a with another character in your name
		System.out.println(name.replace("a", "o"));

	}

}
