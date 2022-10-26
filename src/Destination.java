
public class Destination {
	String destinationName;
	private double destinationFare;

	public Destination(String destinationName, double destinationFare) {
		this.destinationName = destinationName;
		this.destinationFare = destinationFare;
	}

	void getDestinationFare() {
		System.out.println(destinationName+" Fare is "+destinationFare);
	}
	
}
