package sec_verify06;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous am =new Anonymous();
		am.field.run();
		am.passengerCar();
		am.airPlan(new Vehicle() {
			int airspeed;
			@Override
			public void run() {
				System.out.println("=================================\r\n" + 
						"����Ⱑ �̷��մϴ�.");
				for(int i=0; i<10;i++) {
					speedup();
				}
			}
			@Override
			public void speedup() {
				
				System.out.println("������� ���� ���ǵ� : "+airspeed+"Km�Դϴ�.");
				airspeed+=100;
				
			}
		});
		
		System.out.println("=================================");
	}

}
