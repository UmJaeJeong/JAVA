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
		System.out.println("myMethod()�� ȣ���� LocalInnerŬ���� ������ ������� �� ��� : "+li.iv);
		System.out.println("myMethod()�� ȣ���� final static���� �� ��� : "+StaticInner.CONS);
	}
}
