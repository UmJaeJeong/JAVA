package sec_verify06;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dp = new DmbCellPhone("�ڹ���","����",10);
		dp.powerOn();
		dp.bell();
		dp.hangUp();
		dp.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dp.sendVoice("��~ �� �ݰ����ϴ�.");
		dp.powerOff();
		dp.turnonDmb();
		dp.ChangeChannelDmb(12);
		dp.turnOffDmb();
	}

}
