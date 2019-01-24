package sec03_map.exam02_userdefine_hashmap;

import java.util.Objects;

public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name =name;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		//Student��ü�� sno�� name�� ������ equals�� true�� �����Ѵ�.
		if(obj instanceof Student) {
			Student student  = (Student)obj;
			return this.sno==student.sno && this.name.equals(student.name);
		}
		return false;
	}
	
	//1��° ���(���� ���� ��)
	@Override
	public int hashCode() {
		return Objects.hash(this.sno,this.name);
	}
	
	//2���� ��� (���� ȣȯ���� ���ַ� �Ѵٸ� �� ����� ����)
//	@Override
//	public int hashCode() {
//		return sno+name.hashCode();
//	}

	
}
