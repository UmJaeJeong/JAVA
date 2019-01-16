package sec_verify01;

public class ContainerExample {
	
	public static void main(String[] arges) {
		Container<String> c1 = new Container<>();
		c1.setT("홍길동");
		System.out.println("<T>타입파라메터에 <String>으로 객체 생성 후 저장값 : "+c1.getT());
		
		Container<Integer> c2 = new Container<>();
		c2.setT(150);
		System.out.println("<T>타입파라메터에 <Integer>으로 객체 생성 후 저장값 : "+c2.getT());
		

	}

}
