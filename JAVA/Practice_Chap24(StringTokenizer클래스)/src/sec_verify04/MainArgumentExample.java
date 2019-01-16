package sec_verify04;

import java.util.*;
public class MainArgumentExample
{
	public static void main (String[] args) 
	{
		if(args.length == 0) {
			System.out.println("명령행 인자가 없습니다.");
			return;
		}
		String str = args[0];
		System.out.println("명령행 인자값 : " + str);
		
		StringTokenizer st = new StringTokenizer(args[0], "&"); // &으로 문자열 분리
		int n = st.countTokens();
		
		for(int i=0; i<n; i++) {
			String token = st.nextToken();
			StringTokenizer subSt = new StringTokenizer(token, "="); // 서브 문자열은 =으로 분리
			int m = subSt.countTokens();
			for(int j=0; j<m; j++) {
				System.out.print(subSt.nextToken()+"   ");
			}
			System.out.println();
		}
	}
}
