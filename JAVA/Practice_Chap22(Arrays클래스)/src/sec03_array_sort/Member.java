package sec03_array_sort;

//����� ���� Ŭ������ ������ �ϱ� ���ؼ� �ݵ�� 
//Comparable�������̽��� �����ؾ� �Ѵ�.
//�̱����� ClassCastException�� �߻��Ѵ�.
public class Member implements Comparable<Member> {
	
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
    @Override	
	public int compareTo(Member o) {
		//String�� compareTo()�� �����ڵ带 ���Ͽ� ����,
    	//0 , ����� ������.
		return name.compareTo(o.name);		
	}
}
