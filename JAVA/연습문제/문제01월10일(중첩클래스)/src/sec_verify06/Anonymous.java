package sec_verify06;

public class Anonymous {
	int bicycleSpeed;
	int carSpeed;
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("=================================\r\n" + 
					"�����Ű� �޸��ϴ�.");
			System.out.println("�������� ���ǵ尡 �����ϸ��� �ֳ���?");
			for(int i=0; i<10;i++) {
				speedup();
			}
		}
		@Override
		public void speedup() {
			Anonymous.this.bicycleSpeed+=10;
			if(Anonymous.this.bicycleSpeed==100) 
				System.out.println("�����Ű� 100 Km ��� ���Ʊ���!");
			else
			System.out.println("�������� ���ǵ� : "+Anonymous.this.bicycleSpeed+"Km�Դϴ�.");
			
		}
	};
	
	public void passengerCar() {
		Vehicle field = new Vehicle() {
			@Override
			public void run() {
				System.out.println("==================================\r\n" + 
						"�¿����� �޸��ϴ�.\r\n" + 
						"�ڵ����� ���ǵ尡 �����ϸ��� �ֳ���?");
				System.out.println("�¿����� �޸��ϴ�.");
				for(int i=0; i<6;i++) {
					speedup();
				}
			}
			@Override
			public void speedup() {
				Anonymous.this.carSpeed++;
				
				System.out.println("���� ���� ��� : "+Anonymous.this.carSpeed+" �� �Դϴ�.");
				
			}
		};
		field.run();
	}
	
	public void airPlan(Vehicle v) {
		v.run();
	}
}
