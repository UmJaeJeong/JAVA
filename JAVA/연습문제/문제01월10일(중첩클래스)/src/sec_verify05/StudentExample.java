package sec_verify05;

public class StudentExample {

	public static void main(String[] args) {
		StudentAnonymous sa = new StudentAnonymous();
		
		System.out.println("====================");
		sa.field.wake();
		System.out.println("====================");
		sa.method1();
		System.out.println("====================");
		
		sa.method2(new Student("김연아") {
			@Override
			public void wake() {
				System.out.println("매개변수의 매개값으로 익명자손객체를 생성");
				super.wake();
				System.out.println("가 4시에 일어납니다.");
				Study();
			}
			public void Study() {
				System.out.println(this.name+"가 공부합니다.");
			}
		});
		System.out.println("====================");

		
	}

}
