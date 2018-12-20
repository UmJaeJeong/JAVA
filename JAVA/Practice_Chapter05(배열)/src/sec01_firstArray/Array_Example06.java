package sec01_firstArray;

public class Array_Example06 {

	public static void main(String[] args) {
		
		char[] abc = new char[] {'A','B','C','D'};
		char[] num = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);//char[] 안에 값을 그대로 출력
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		
		//JAVA.lang.System클래서 API참조
		//abc : 원본배열, 0: 배열의 0번째 인덱스, result : 타겟배열,
		//0 : 타겟배열의 인덱스, abc.length : 4만큼복사)
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num.toString());
		
		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);


	}

}
