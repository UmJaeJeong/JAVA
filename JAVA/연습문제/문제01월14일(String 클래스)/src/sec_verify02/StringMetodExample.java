package sec_verify02;

public class StringMetodExample {

	public static void main(String[] args) {
		String a = new String("    java,");
		String b = new String("program,fighting      ");
		
		System.out.println("문자열 a와 문자열 b를 연결한 결과 :"+a+b);
		String c = a+b;
		System.out.println("문자열 a의 공백을 제거한 결과 :"+c.trim());
		System.out.println("문자열 a의 a를 1로 대치한 결과 :"+c.replace("a", "1"));
		String[] arr = c.trim().split(",");
		for(int i=0; i<arr.length;i++) {
			System.out.println("분리된 "+i+"번 문자열:"+arr[i]);
		}
		c =c.trim();
		c = c.replace("a", "1");
		int idx = c.indexOf("v");
		System.out.println("문자열 a의 substring한 결과  :"+c.substring(idx+1));
		c = c.substring(idx+1);
		System.out.println("문자열 a의 2번째 문자를 char c에 대입한 결과 :"+c.charAt(2));
	}

}
