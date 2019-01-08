package sec_verify03;

public class SpotsCarExample {

	public static void main(String[] args) {
		Car car = new Car();
		SportsCar scar = new SportsCar();
		
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");
		scar.speedUp();
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");
		scar.speedUp();
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");
		scar.speedUp();
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");
		scar.speedDown();
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");
		scar.speedDown();
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");
		scar.speedDown();
		car.stop();
		scar.stop();
		System.out.println("현재 스포츠카의 속도는 "+scar.getSpeed()+"Km입니다.");


	}
	

}
