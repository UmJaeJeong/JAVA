package sec07_exam_thread_sysnchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		//������ü ����
		Calculator cal = new Calculator();
		
		//���� ������ �ذ�Ǿ���. �ܼ��� ������ �Ǵ� �޼��� �տ�
		//sychronized�����ڸ� �ٿ������ν� ��ü ����� �Ͼ
		//�������� ��Ȯ���� �����ش�.
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
	}

}
