package sec_verify02;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner inner = new Outter.Inner();
		System.out.println("외부클래스를 생성하지 않고, 정적멤버클래스(Inner)의 정적 멤버 CV값 : "+Outter.Inner.cv);
		System.out.println("외부클래스를 생성하고, 정적멤버클래스(Inner)의 인스턴스 멤버 IV값 : "+ inner.iv);
	}

}
