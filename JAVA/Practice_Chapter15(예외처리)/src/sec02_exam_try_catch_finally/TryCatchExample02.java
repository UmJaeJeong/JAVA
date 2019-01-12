package sec02_exam_try_catch_finally;

public class TryCatchExample02 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);// 실행되지 않는다 이유는?
		}catch(Exception e) {
			System.out.println(5);//실행된다. 이유는?
			System.out.println("예외 발생 : "+e.toString());
		}
		System.out.println(6);
	}

}
