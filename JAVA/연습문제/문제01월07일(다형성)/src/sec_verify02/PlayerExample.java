package sec_verify02;

public class PlayerExample {

	public static void main(String[] args) {
		Striker[] st = new Striker[]{
				new Striker("�̵���",36,20,60,70),
				new Striker("�޽�",28,10,97,98)
		};
		
		for(int i=0; i<2;i++) {
			System.out.println("������ FW������ �Ұ��մϴ�.");
			System.out.println("�� �� :"+st[i].getName());
			System.out.println("�� �� :"+st[i].getAge());
			System.out.println("�� ��ȣ :"+st[i].getBackNumber());
			System.out.println("���ǵ� :"+st[i].getSpd());
			System.out.println("��ȿ ���� :"+st[i].getShoot());
			System.out.println();
		}
		
		MidFielder md = new MidFielder("������",34,7,85,85);
		System.out.println("�̵��ʴ� ������ �Ұ��մϴ�.");
		System.out.println("�� �� :"+md.getName());
		System.out.println("�� �� :"+md.getAge());
		System.out.println("�� ��ȣ :"+md.getBackNumber());
		System.out.println("���ǵ� :"+md.getSpd());
		System.out.println("��ȿ ���� :"+md.getPass());

		System.out.println();

		Defender def = new Defender("�迵��",31,33,80,99);
		System.out.println("����� ������ �Ұ��մϴ�.");
		System.out.println("�� �� :"+def.getName());
		System.out.println("�� �� :"+def.getAge());
		System.out.println("�� ��ȣ :"+def.getBackNumber());
		System.out.println("���ǵ� :"+def.getSpd());
		System.out.println("��ȿ ���� :"+def.getDef());
		System.out.println();

		Goalkeeper go = new Goalkeeper("�̿���",40,25,45,99);
		System.out.println("��Ű�� ������ �Ұ��մϴ�.");
		System.out.println("�� �� :"+go.getName());
		System.out.println("�� �� :"+go.getAge());
		System.out.println("�� ��ȣ :"+go.getBackNumber());
		System.out.println("���ǵ� :"+go.getSpd());
		System.out.println("��ȿ ���� :"+go.getSave());
		
	}

}
