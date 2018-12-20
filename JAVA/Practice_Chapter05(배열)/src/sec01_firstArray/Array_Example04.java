package sec01_firstArray;

public class Array_Example04 {

	public static void main(String[] args) {
		// String 은 클래스이기 때문에 String배열은 2차원배열과 동일하다.
		//String[] names = {"Kim","Park","Yi"};
		String[] names = new String[3];//기본값 null
		names[0] = new String("김연아");
		names[1] = new String("손연재");
		names[2] = new String ("김사랑");
		
		for(int i=0; i<names.length;i++) {
			System.out.println("names["+i+"]"+names[i]);
		}
		
		String tmp = names[2];//배열 names의 세번째 요소를  tmp에 저장
		System.out.println("tmp :"+tmp);
		
		names[0] = "Yu";//배열 names의 첫 번째 요소를 "Yu"로 변경
		
		for(int i =0; i<names.length;i++) {
			System.out.println("names["+i+"]"+names[i]);

		}
		

	}

}
