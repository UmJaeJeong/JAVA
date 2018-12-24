package sec01_exam;


public class StudentExample {
	
	public static void main(String[] args) {
		//student1이라는 참조변수(스택)에 Student클래스의 객체 heap영역에 생성되고,
		//그 주소가 저장됨
		Student student1 = new Student();
		
		System.out.println(student1);
		System.out.println(student1.name);
		
		//멤버변수값을 참조변수(리모컨)로 바꿈
		student1.name = "이영준";
		student1.age = 55;
		
		System.out.println(student1.age);
		System.out.println(student1.name);
		System.out.println(student1);
	}
	
	
	
}
