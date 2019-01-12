package sec02_exam_try_catch_finally;

public class TryCatchExample01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(4/0);
			System.out.println(3);
			
		}catch(Exception e){
			System.out.println(5);
		}finally {
			System.out.println(6);
		}		

	}

}
