package sec1_verify01;

public class MyMathMethodExample {

	public static void main(String[] args) {
		System.out.println("Ŭ����(static)�޼��� add    	       ȣ��  "+MyMathMethod.add(200,100));
		System.out.println("Ŭ����(static)�޼��� subtract    	 ȣ��  "+MyMathMethod.subtract(200,100));
		System.out.println("Ŭ����(static)�޼��� multiply    ȣ��  "+MyMathMethod.multiply(200,100));
		System.out.printf("Ŭ����(static)�޼��� divide       ȣ��  %.1f%n",(float)MyMathMethod.divide(200,100));
		MyMathMethod m = new MyMathMethod();
		m.a =200L;
		m.b =100L;
		
		System.out.println("Ŭ����(static)�޼��� add    	       ȣ��  "+m.add());
		System.out.println("Ŭ����(static)�޼��� subtract    ȣ��  "+m.subtract());
		System.out.println("Ŭ����(static)�޼��� multiply    ȣ��  "+m.multiply());
		System.out.printf("Ŭ����(static)�޼��� divide       ȣ��   %.1f%n",(float)m.divide());
		
	}

}
