package sec03_array_sort;

//사용자 정의 클래스는 정렬을 하기 위해서 반드시 
//Comparable인터페이스를 구현해야 한다.
//미구현시 ClassCastException이 발생한다.
public class Member implements Comparable<Member> {
	
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
    @Override	
	public int compareTo(Member o) {
		//String의 compareTo()는 문자코드를 비교하여 음수,
    	//0 , 양수를 리턴함.
		return name.compareTo(o.name);		
	}
}
