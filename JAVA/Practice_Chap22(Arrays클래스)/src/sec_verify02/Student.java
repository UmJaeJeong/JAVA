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
		//String�� compareTo()�� �����ڵ带 ���Ͽ� -1, 0 , 1�� ������.
		//if(hakbun.compareTo(o.hakbun))
		
		return this.hakbun.compareTo(o.hakbun);		
	}
}
