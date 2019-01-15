package sec01_exam_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//박싱(Boxing)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = 100;//컴파일시에는 new Integer(100):으로 바뀐다.
		
		//언박싱(UnBoxing)
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4.intValue();
		
		//같은값을 출력한다.
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}

}
