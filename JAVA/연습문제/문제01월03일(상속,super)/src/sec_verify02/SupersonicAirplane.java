package sec_verify02;

public class SupersonicAirplane extends Airplane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	int flyMode;
	
	@Override
	public void fly() {
		if(flyMode == 2)
			System.out.println("�����Ӻ����մϴ�.");
		else if(flyMode ==1)
			System.out.println("�Ϲݺ����մϴ�.");
	}
	
}
