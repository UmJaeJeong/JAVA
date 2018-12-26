package sec02_exam;

public class ReferenceParamEx {
	public static void main(String[] agrs) {
		/*
		 * int[] arr = new int[]{1,2};
		 * SYstem.out.println(arr[1]);
		 * arr_change(arr);
		 * System.out.println(arr[1]);
		 */
		
		Data d = new Data();
		d.x = 10;
		//주소를 넘겨줌. ex)사계가 어딨냐? 라는 형태
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);

		
	}
	//참조형 매개변수
	static void change(Data d) {
		d.x= 1000;
		System.out.println("change() : x = "+d.x);
	}
}
