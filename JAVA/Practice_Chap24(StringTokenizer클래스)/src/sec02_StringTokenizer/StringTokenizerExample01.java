package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample01 {
	
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//방법1: 전체 토큰 수를 얻어 for문으로 루핑(잘 안쓴다.)
		//문자열이 반드시 하나로 구분자로 되어 있어야 한다.
		StringTokenizer st = new StringTokenizer(text, "/"); 
		int countTokens = st.countTokens();
		System.out.println("현재토큰수 : " + countTokens );
		
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(i + "번째 토큰 : " + token);
		}		
		System.out.println();
		
		//방법2: 남아 있는 토큰를 확인하고 while문으로 루핑
		//(통상적으로 for문을 사용하지 않고 하기 방법을 많이 사용한다.)
		st = new StringTokenizer(text, "/");
		//가져올 토큰이 있느냐?
		while(st.hasMoreTokens()) {
			
			int count = st.countTokens();
			//남은 토큰수 출력
			System.out.println("현재 토큰수 : " + count);  
			String token = st.nextToken(); //가져와라
			System.out.println("가져온 토큰 값 : " + token);   
		}
	}
}
