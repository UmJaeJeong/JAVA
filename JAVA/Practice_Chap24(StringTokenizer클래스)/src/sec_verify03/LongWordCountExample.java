package sec_verify03;

import java.util.*;
public class LongWordCountExample
{
	public static void main (String[] args) 
	{
		Scanner sin = new Scanner(System.in);
		String str;
		
		System.out.println("가장 긴 단어를 구하는 프로그램입니다.(종료 : Ctrl+Z) ");
		System.out.println("문자열을 입력하세요 : ");
		String longestWord = null;
		try 
		{
			while(true) 
			{				
				str = sin.nextLine();
				StringTokenizer st = new StringTokenizer(str);
				for (int i=0; i<st.countTokens(); i++) 
				{
					String token = st.nextToken();
					// 첫 단어이거나 현재 단어가 지금까지 가장 긴 단어보다 긴 경우
					if (longestWord == null || token.length() > longestWord.length()) 
						longestWord = token;
				}
			}
		}
		 // ctrl-z 입력 시 발생하는 예외
		catch (NoSuchElementException e) 
		{	// 누적 단어 갯수 출력
			System.out.println("가장 긴 단어는 " + longestWord); 
		}
		sin.close();
	}
}
