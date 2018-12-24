package sec01_exam;

public class FieldInitValueExample{

	public static void main(String[] args) {
		FieldInitValue field = new FieldInitValue();
		
		
		System.out.println("기본형 변수");
		System.out.println("byteField: ");
		System.out.println("shortField: "+field.byteField);
		System.out.println("intField: "+field.intField);
		System.out.println("longField: "+field.longField);
		System.out.println("longField: "+field.booleanField);

		//char타입은 값이 없다.
		System.out.println("charField: "+field.charField);
		System.out.println("floatField: "+field.floatField);
		System.out.println("doubleField: "+field.doubleField);
		System.out.println();
		System.out.println("참조형 변수");
		System.out.println("arrField: "+field.arrField);
		System.out.println("referenceField: "+field.referenceField);
		
		/*
		 * 인스턴스 변수를 출력을 하면, 인스턴스의 주소가 출력됨
		 * Object를 상속받기 때문에 출력문에 참조변수만 넣으면 곧 object클래스의
		 * toString()자동 호출됨. 하지만, 지금은 오버라이딩(재정의)한 toStirng()가 호출된다.
		 * 
		 */
		System.out.println("Class referenceValiable : "+field.toString());









		
	}
	
	
	

}
