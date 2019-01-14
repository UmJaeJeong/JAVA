package sec_verify04;

public class StringMetodWithExample {

	public static void main(String[] args) {
		String str = "나는 자바를 공부합니다.";
		System.out.println("문자열 입력 ==> 나는 자바를 공부합니다.\r\n" + 
				"입력 문자열의 시작과 끝이 각각 '(' ')'이 아니면, '(' ')'붙여 출력합니다. ");
		System.out.print("출력 문자열 ==>");
		if(str.startsWith("나는")) {
			System.out.print("("+str);
		}
		
		if(str.endsWith(".")) {
			System.out.println(")");
		}
	}

}
