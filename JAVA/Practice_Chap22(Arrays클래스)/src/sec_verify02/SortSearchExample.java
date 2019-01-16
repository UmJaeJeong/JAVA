package sec_verify02;

import java.util.Arrays;

public class SortSearchExample 
{
	public static void main(String[] args) 
	{
		Student m1 = new Student("775697","ȫ�浿");
		Student m2 = new Student("557685","�ڵ���");
		Student m3 = new Student("120445","��μ�");
		Student m4 = new Student("995267","�ŵ���");
		Student m5 = new Student("441235","��Ǹ�");
		
		Student[] members = new Student[] { m1, m2, m3, m4, m5 };
		
		//����� ���� Ŭ������ sort�ϱ� ���ؼ��� Comparable<>�������̽��� �����ؾ� �ȴ�.
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) 
		{
			
			System.out.print("�й�[" + i + "] = " + members[i].hakbun + "\t" );
			
			System.out.println("�̸�[" +i + "] = " + members[i].name);
		}
		
		int index = Arrays.binarySearch(members, m2);
		System.out.println("�ڵ��� �л��� " + index + "��° �濡 �ֽ��ϴ�.");
				
		
		/*for(Member m : members) 
		{
			System.out.println(m.name);
		}*/
	}
}
