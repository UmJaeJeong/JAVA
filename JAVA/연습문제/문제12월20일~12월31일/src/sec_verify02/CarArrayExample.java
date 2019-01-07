package sec_verify02;

public class CarArrayExample {

	public static void main(String[] args) {
		Car[] cArr = new Car[5];
		for(int i=0; i<5;i++) {
			cArr[i] = new Car();
			System.out.println("cArr["+i+"]인스턴스 생성");
		}
		
		for(int i=0; i<5;i++) {
			System.out.println("cArr["+i+"] = "+i);
		}
	}

}
