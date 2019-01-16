package sec_verify02;

public class Student implements Comparable<Student> 
{
	String hakbun;
	String name;
	
	
	Student(String hakbun, String name) 
	{
		this.hakbun =hakbun;
		this.name = name;
	}
	
	@Override	
	public int compareTo(Student o) 
	{
		//String의 compareTo()는 문자코드를 비교하여 -1, 0 , 1을 리턴함.
		//if(hakbun.compareTo(o.hakbun))
		
		return this.hakbun.compareTo(o.hakbun);		
	}
}
