package sec_verify05;

public class Driver {
	
	public void drive(Vehicle v) {
		if(v instanceof Vehicle) {
			System.out.println("����Ŭ���� Ÿ�Կ� ����Ǵ� �ڼ�Ŭ�������� run�޼��带 ȣ���մϴ�");
		}
		v.run();
		
	}
}
