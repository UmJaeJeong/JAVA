package sec_verify01;

public class Outter {
	class Inner{
		public  Inner() {
			System.out.println("외부클래스 Outer의 인스턴스를 생성한 후, 인스턴스멤버클래스(Inner)의 인스턴스를 생성하여 출력한값 : 100");
		}
	}
}
