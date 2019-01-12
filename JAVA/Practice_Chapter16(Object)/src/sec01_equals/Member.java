package sec01_equals;

public class Member {
	String id;

	// ������
	public Member(String id) {
		this.id = id;
	}
	
	//�Ű������� Object�� �̚�. ���ǹ̴�? �ֻ��� Ŭ������ Object������ ������������ ��� �����͸� �޴´�
	@Override
	public boolean equals(Object obj) {
		//Ÿ�Ժ�ȯ�� Ȯ���ϱ� ���� instanceof������
		System.out.println("equals() ȣ��");
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			
			if(this.id.equals(obj)) {
				return true;
			}
		}
		
		return false;
	}
	

}
