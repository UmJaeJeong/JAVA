package sec_verify01;

import java.util.StringTokenizer;

public class StringTokenExample 
{
	public static void main(String[] args) 
	{
		// �����ڷ� / ���
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/"); 

		
		System.out.println("st ���������� ��ü�� ���� /���� �и��� ���");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
			
	}
}



