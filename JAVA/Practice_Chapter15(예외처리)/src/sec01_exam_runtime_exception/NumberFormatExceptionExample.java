package sec01_exam_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		try {
		int value1 = Integer.parseInt(data1);
		//NumberFormatException 발생 이유?
		int value2 = Integer.parseInt(data2);
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		}catch(Exception e){
			System.out.println("예외 발생");
			//e.printStackTrace();
		}

	}

}
