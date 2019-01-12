package sec_verify04;

public class NestedAccessExample {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}

}
