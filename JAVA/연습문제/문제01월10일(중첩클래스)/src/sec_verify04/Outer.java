package sec_verify04;

public class Outer {
	int value =10;
	class Inner{
		int value = 20;
		public void method1() {
			int value = 30;
			System.out.println("method1의 value값 : "+value);
			System.out.println("Inner클래스의 value값 : "+this.value);
			System.out.println("Outer클래스의 value값 : "+Outer.this.value);
		}
	}
}
