package sec_verify01;

public class WrapperExample {

	public static void main(String[] args) {
		int i=10;
		Integer intObject = i;
		
		System.out.println("i�� �ڵ� �ڽ���  intObject�� �� :  "+intObject);
		
		System.out.println("intObject�� i�� �ڵ���ڽ��� �� : "+intObject.valueOf(i+10));
	}

}
