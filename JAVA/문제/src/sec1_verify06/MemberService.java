package sec1_verify06;

public class MemberService {
	String id;
	String passwoard;
	boolean login(String id, String password) {
		boolean check = false;
		if(this.id.equals(id) && this.passwoard.equals(password)) {
			check = true;
			System.out.println(id+"�� �α��� �Ǿ����ϴ�.");

		}	
		else {
			check = false;
			System.out.println("ID�� Ȯ�����ּ���");
		}
		
		return check;
	}
	
	void logout(String id) {
		System.out.println(id+"���� �α׾ƿ� �Ǿ����ϴ�.");

	}
}
