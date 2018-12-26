package sec1_verify06;

public class MemberService {
	String id;
	String passwoard;
	boolean login(String id, String password) {
		boolean check = false;
		if(this.id.equals(id) && this.passwoard.equals(password)) {
			check = true;
			System.out.println(id+"이 로그인 되었습니다.");

		}	
		else {
			check = false;
			System.out.println("ID를 확인해주세요");
		}
		
		return check;
	}
	
	void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");

	}
}
