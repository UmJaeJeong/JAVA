package sec_verify05;

public class StudentAnonymous {
	Student field = new Student("문수빈") {
		 
		@Override
		public void wake() {
			System.out.println("필드(멤버변수)의 초기값으로 생성된 자식객체");
			super.wake();
			System.out.println("6시에 일어납니다.");
			goSchool();
		}
		
		public void goSchool() {
			System.out.println(this.name+"이 등교합니다.");
		}
	};
	
	void method1() {
		Student field = new Student("배한규") {
			 
			@Override
			public void wake() {
				System.out.println("로컬변수의 초기값으로 생성된 자식 객체");
				super.wake();
				System.out.println("9시에 일어납니다.");
				goMoving();
			}
			
			public void goMoving() {
				System.out.println(this.name+"가 영화를 보러 갑니다.");
			}
		};
		field.wake();
	}
	
	void method2(Student student) {
		student.wake();
		
	}
}
