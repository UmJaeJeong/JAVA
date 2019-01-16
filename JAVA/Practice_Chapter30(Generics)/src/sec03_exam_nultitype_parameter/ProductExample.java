package sec03_exam_nultitype_parameter;

public class ProductExample {

	public static void main(String[] args) {
		//Product<Tv, String> product1 = new Product<Tv, String>();	//JDK 1.6까지
		//밀티 타입파라메터도 아래와 같이 가능하다.(파라메터의 갯수는 unlimited하다.)_
		Product<Tv,String> pro1 = new Product<>();//JDK 1.7이후
		
		pro1.setT(new Tv(2016,06));
		pro1.setM("LG OLED 스마트 티비");
		Tv tv = pro1.getT();
		String st = pro1.getM();
		System.out.println("내 티비는"+tv.getYear()+"년"+tv.getMonth()+"월 출시된"+st+"이다.");
		
		System.out.println();
		Product<Car, String> pro2 = new Product<>();
		pro2.setT(new Car("삼성",2010,05));
		pro2.setM("뉴 SM5신형");
		
		Car car = pro2.getT();
		String str2 = pro2.getM();
		
		//System.out.println(str1);
		System.out.println("내 애마는 "+car.getYear()+"년"+car.getMonth()+"월 출시된"+car.getBrand()+"의"+str2+"이다.");
	}

}
