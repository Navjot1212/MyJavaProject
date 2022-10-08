
public class ChocolateBox {

	public static void main(String[] args) {
// Write a program that will keep adding 5 chocolates to a box which already has
// 27 chocolates and add a mechanism that number of chocolates should never go
// above 63
		int boxQuantity = 27;
		while (boxQuantity <= 63) {
			System.out.println("5 chocolates added into box and total is " + boxQuantity);
			boxQuantity += 5;
		}
	}

}
