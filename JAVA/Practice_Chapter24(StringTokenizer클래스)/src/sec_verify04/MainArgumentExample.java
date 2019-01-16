package sec_verify04;

import java.util.*;
public class MainArgumentExample
{
	public static void main (String[] args) 
	{
		if(args.length == 0) {
			System.out.println("����� ���ڰ� �����ϴ�.");
			return;
		}
		String str = args[0];
		System.out.println("����� ���ڰ� : " + str);
		
		StringTokenizer st = new StringTokenizer(args[0], "&"); // &���� ���ڿ� �и�
		int n = st.countTokens();
		
		for(int i=0; i<n; i++) {
			String token = st.nextToken();
			StringTokenizer subSt = new StringTokenizer(token, "="); // ���� ���ڿ��� =���� �и�
			int m = subSt.countTokens();
			for(int j=0; j<m; j++) {
				System.out.print(subSt.nextToken()+"   ");
			}
			System.out.println();
		}
	}
}
