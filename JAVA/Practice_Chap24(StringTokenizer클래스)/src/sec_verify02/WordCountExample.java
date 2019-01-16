package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int i=0;
		System.out.println("문장을 입력하세요. 입력하신 문장은 한 공백으로 분리되어 출력됩니다.");
		System.out.println("종료를 원하시면 exit를 입력하시면 됩니다.");
		
		
		while(true) 
		{
			System.out.print("\n입력 : ");
			String s = scanner.nextLine();
		
			if(s.equals("exit")) 
			{
				System.out.println("종료합니다...");	
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("낱말의 개수는 " + st.countTokens());
			
			while(st.hasMoreTokens())
			{
				
				System.out.println("분리된 [" + i + "]번째 낱말 : " + st.nextToken());
				i++;
			}			
		}
		scanner.close();
	}
}


