package sec1_verify01;

public class MyMathMethodExample {

	public static void main(String[] args) {
		System.out.println("클래스(static)메서드 add    	       호출  "+MyMathMethod.add(200,100));
		System.out.println("클래스(static)메서드 subtract    	 호출  "+MyMathMethod.subtract(200,100));
		System.out.println("클래스(static)메서드 multiply    호출  "+MyMathMethod.multiply(200,100));
		System.out.printf("클래스(static)메서드 divide       호출  %.1f%n",(float)MyMathMethod.divide(200,100));
		MyMathMethod m = new MyMathMethod();
		m.a =200L;
		m.b =100L;
		
		System.out.println("클래스(static)메서드 add    	       호출  "+m.add());
		System.out.println("클래스(static)메서드 subtract    호출  "+m.subtract());
		System.out.println("클래스(static)메서드 multiply    호출  "+m.multiply());
		System.out.printf("클래스(static)메서드 divide       호출   %.1f%n",(float)m.divide());
		
	}

}
