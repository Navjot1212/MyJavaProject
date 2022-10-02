
public class AndOrExample {

	public static void main(String[] args) {
		boolean isShopOpen = true;
		boolean isBusAvailable = false;
		boolean isUberAvailable = true;
		boolean haveMoney = true;
		if (isShopOpen && (isBusAvailable || isUberAvailable) && haveMoney) {
			System.out.println("John is going for shopping");
		} else {
			System.out.println("John cannot go for shopping");
		}
	}

}
