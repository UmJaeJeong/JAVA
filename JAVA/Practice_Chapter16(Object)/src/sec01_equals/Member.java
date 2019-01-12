package sec01_equals;

public class Member {
	String id;

	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	//매개변수로 Object가 이싿. 이의미는? 최상위 클래스인 Object형으로 다형성을통해 모든 데이터를 받는다
	@Override
	public boolean equals(Object obj) {
		//타입변환을 확인하기 위한 instanceof연산자
		System.out.println("equals() 호출");
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			
			if(this.id.equals(obj)) {
				return true;
			}
		}
		
		return false;
	}
	

}
