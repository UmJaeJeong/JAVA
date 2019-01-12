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
						"비행기가 이륙합니다.");
				for(int i=0; i<10;i++) {
					speedup();
				}
			}
			@Override
			public void speedup() {
				
				System.out.println("비행기의 현재 스피드 : "+airspeed+"Km입니다.");
				airspeed+=100;
				
			}
		});
		
		System.out.println("=================================");
	}

}
