public class StringToCharArray {

	public static void main(String[] args) {

	String name = "Navjot";
	String front = name.substring(0, (name.length()/2));
	String back = name.substring(name.length()/2);
	System.out.println(back+front);
	char[] a = new char[front.length()];
	for (int i = 0;i<front.length();i++) {
	a[i]+= front.charAt((front.length()-1)-i);
	}	
	System.out.println(a);
	}
}