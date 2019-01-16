package sec04_array_search;

public class Member implements Comparable<Member> {
	
	String name;
		
	public Member(String name) {
		this.name = name;
	}
	
	@Override	
	public int compareTo(Member o) {
		//String의 compareTo()는 문자코드를 비교하여 -1, 0 , 1을 리턴함.
		return name.compareTo(o.name);		
	}
}
