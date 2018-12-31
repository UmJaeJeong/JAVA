package sec02_exam_final;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	//static final int age 에러가 뜸 불변의 정적변수 
	
	
	//final 초기화 방법
	//1. 선언과 동시에 초기화
	//2. 생성자에서 단 한번 초기화 가능
	
	//매개변수가 있는 생성자
	public Person(String ssn, String name) {
		//this는 개체 자기 자신의 주소(참조변수와 동일)
		this.ssn =ssn;
		this.name =name;
	}
}
