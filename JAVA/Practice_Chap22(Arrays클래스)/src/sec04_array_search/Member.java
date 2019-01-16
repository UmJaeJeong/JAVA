package sec04_array_search;

public class Member implements Comparable<Member> {
	
	String name;
		
	public Member(String name) {
		this.name = name;
	}
	
	@Override	
	public int compareTo(Member o) {
		//String�� compareTo()�� �����ڵ带 ���Ͽ� -1, 0 , 1�� ������.
		return name.compareTo(o.name);		
	}
}
