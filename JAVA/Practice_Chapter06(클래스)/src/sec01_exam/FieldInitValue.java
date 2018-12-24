package sec01_exam;

public class FieldInitValue{

		//멤버변수라고도 하고, 필드라고도 함.
		byte byteField;//1
		short shortField;//2
		int intField;//4
		long longField;//8
		
		boolean booleanField;//1
		char charField;//2(유니코드)1(아스키코드)
		
		float floatField;
		double doubleField;
		//참조형변수
		int[] arrField;//4
		String referenceField;//4
		
		//FieldInitValue field = new FieldInitValue();
		//System.out.println(field);
		
	
	//toStirng()의 역할은 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
	//자신의 형식대로 출력을 원할때 toString()오버라이딩을 한다.
	
	@Override//unotation -> 컴파일러한테 야! 내가 이거 재정의 해놨으니까 똑바로봐 강조함!
	public String toString() {
		// TODO Auto-generated method stub
		return "String";
	}

}
