package sec1_verify06;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService mem  = new MemberService();
		mem.id = "hong";
		mem.passwoard = "1234";
		
		mem.login("hong", "1234");
		mem.logout("hong");
		mem.login("mlml","1234");
	}

}
