package sec_verify02;

import java.util.Arrays;

public class SortSearchExample 
{
	public static void main(String[] args) 
	{
		Student m1 = new Student("775697","홍길동");
		Student m2 = new Student("557685","박동수");
		Student m3 = new Student("120445","김민수");
		Student m4 = new Student("995267","신동욱");
		Student m5 = new Student("441235","김건모");
		
		Student[] members = new Student[] { m1, m2, m3, m4, m5 };
		
		//사용자 정의 클래스를 sort하기 위해서는 Comparable<>인터페이스를 구현해야 된다.
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) 
		{
			
			System.out.print("학번[" + i + "] = " + members[i].hakbun + "\t" );
			
			System.out.println("이름[" +i + "] = " + members[i].name);
		}
		
		int index = Arrays.binarySearch(members, m2);
		System.out.println("박동수 학생은 " + index + "번째 방에 있습니다.");
				
		
		/*for(Member m : members) 
		{
			System.out.println(m.name);
		}*/
	}
}
