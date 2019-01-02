package sec_verify02;

public class MountainBikeExample {

	public static void main(String[] args) {
		
		MountainBike mb1 = new MountainBike(2121,"Scott");
		mb1.gear = 30;
		mb1.frame = "카본";
		mb1.money = "8천만";
		MountainBike mb2 = new MountainBike(2122,"Giant");
		mb2.gear = 27;
		mb2.frame = "알루미늄";
		mb2.money = "30만";
		MountainBike mb3 = new MountainBike(2123,"Lespo");
		mb3.gear = 18;
		mb3.frame = "철";
		mb3.money = "5만";
		
		mb1.prtInof();
		System.out.println();
		mb2.prtInof();
		System.out.println();

		mb3.prtInof();

	}

}
