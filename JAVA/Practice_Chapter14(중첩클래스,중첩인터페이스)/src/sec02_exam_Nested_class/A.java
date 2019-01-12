package sec02_exam_Nested_class;

public class A {
	//생성자
	public A() {
		System.out.println("A객체가 생성됨");
		B b = new B();
		b.a = 20;
		b.method1();
	}
	
	class B{
		int a = 10;
		//static int b = 20; //static은 선언 될수없다.
		public B() {
			System.out.println("B객체가 생성됨");
		}
		void method1() {
			System.out.println("B클래스의 멤버 메서드 method1이 호출됨");
		}
		//static void method() {}
	}
	
	//정적멤버클래스인 C
	static class C{
		public C(){
			System.out.println("C객체가 생성됨");
		}
		
		int b = 10;
		static int c = 20;
		
		void method2() {
			System.out.println("static C클래스의 멤버메서드 method2이 호출됨");
		}
		
		static void method3() {
			System.out.println("static C클래스의 static멤버메서드 method3이 호출됨");
		}
		
	}
	
	void method() {
		//로컬클래스인 D(로컬클래스에는 절대 static이 못온다.
		class D{
			public D() {
				System.out.println("D객체가 생성됨");
			}
			
			int e = 30;
			//static int f = 30;
			void localmethod() {
				System.out.println("로컬클래스인 D클래스의 멤버메서드 method이 호출됨");
				System.out.println(e);
			}
		}
		
		//로컬클래스는 메서드 내부에서만 생성하고 사용할수 있다.
		D d = new D();
		d.e = 50;
		d.localmethod();
	}
}
