package sec_verify02;

public class MountainBikeExample {

	public static void main(String[] args) {
		
		MountainBike mb1 = new MountainBike(2121,"Scott");
		mb1.gear = 30;
		mb1.frame = "ī��";
		mb1.money = "8õ��";
		MountainBike mb2 = new MountainBike(2122,"Giant");
		mb2.gear = 27;
		mb2.frame = "�˷�̴�";
		mb2.money = "30��";
		MountainBike mb3 = new MountainBike(2123,"Lespo");
		mb3.gear = 18;
		mb3.frame = "ö";
		mb3.money = "5��";
		
		mb1.prtInof();
		System.out.println();
		mb2.prtInof();
		System.out.println();

		mb3.prtInof();

	}

}
