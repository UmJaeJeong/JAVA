package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int i=0;
		System.out.println("������ �Է��ϼ���. �Է��Ͻ� ������ �� �������� �и��Ǿ� ��µ˴ϴ�.");
		System.out.println("���Ḧ ���Ͻø� exit�� �Է��Ͻø� �˴ϴ�.");
		
		
		while(true) 
		{
			System.out.print("\n�Է� : ");
			String s = scanner.nextLine();
		
			if(s.equals("exit")) 
			{
				System.out.println("�����մϴ�...");	
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("������ ������ " + st.countTokens());
			
			while(st.hasMoreTokens())
			{
				
				System.out.println("�и��� [" + i + "]��° ���� : " + st.nextToken());
				i++;
			}			
		}
		scanner.close();
	}
}


