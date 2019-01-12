package sec_verify03;

public class Inner {
	//InstanceInner 
	class InstanceInner{
		static final int CONST =100;
		int iv = 100;
	}
	
	static class StaticInner{
		final static int CONS = 200;
		static int cv = 300;
		int iv = 200;
	}
	
	public void myMethod() {
		class LocalInner{
			int iv= 300;
		}
		LocalInner li = new LocalInner();
		System.out.println("myMethod()를 호출후 LocalInner클래스 생성후 멤버변수 값 출력 : "+li.iv);
		System.out.println("myMethod()를 호출후 final static변수 값 출력 : "+StaticInner.CONS);
	}
}
