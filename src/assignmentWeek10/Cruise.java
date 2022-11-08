package assignmentWeek10;

public class Cruise extends User {
	void chooseCruise() {
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select \nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise ");
		String cruiseName = sc.nextLine();
		if (cruiseName.equalsIgnoreCase("Scenic Cruise")) {
		ScenicCruise scenicCruise = new ScenicCruise();
		scenicCruise.getCruiseDetails();
		}else if(cruiseName.equalsIgnoreCase("Sunset Cruise")){
		SunsetCruise sunsetCruise = new SunsetCruise();
		sunsetCruise.getCruiseDetails();
		}else if(cruiseName.equalsIgnoreCase("Mystery Cruise")) {
		MysteryCruise mysteryCruise = new MysteryCruise();
		mysteryCruise.getCruiseDetails();
		}else {
		DiscoveryCruise discoveryCruise = new DiscoveryCruise();
		discoveryCruise.getCruiseDetails();
		}
	}
}
