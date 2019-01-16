package sec_verify03;

import java.util.*;
public class LongWordCountExample
{
	public static void main (String[] args) 
	{
		Scanner sin = new Scanner(System.in);
		String str;
		
		System.out.println("���� �� �ܾ ���ϴ� ���α׷��Դϴ�.(���� : Ctrl+Z) ");
		System.out.println("���ڿ��� �Է��ϼ��� : ");
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
					// ù �ܾ��̰ų� ���� �ܾ ���ݱ��� ���� �� �ܾ�� �� ���
					if (longestWord == null || token.length() > longestWord.length()) 
						longestWord = token;
				}
			}
		}
		 // ctrl-z �Է� �� �߻��ϴ� ����
		catch (NoSuchElementException e) 
		{	// ���� �ܾ� ���� ���
			System.out.println("���� �� �ܾ�� " + longestWord); 
		}
		sin.close();
	}
}
