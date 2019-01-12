package sec_verify06;

public class Anonymous {
	int bicycleSpeed;
	int carSpeed;
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("=================================\r\n" + 
					"자전거가 달립니다.");
			System.out.println("자전거의 스피드가 음수일리가 있나요?");
			for(int i=0; i<10;i++) {
				speedup();
			}
		}
		@Override
		public void speedup() {
			Anonymous.this.bicycleSpeed+=10;
			if(Anonymous.this.bicycleSpeed==100) 
				System.out.println("자전거가 100 Km 라니 미쳤군요!");
			else
			System.out.println("자전거의 스피드 : "+Anonymous.this.bicycleSpeed+"Km입니다.");
			
		}
	};
	
	public void passengerCar() {
		Vehicle field = new Vehicle() {
			@Override
			public void run() {
				System.out.println("==================================\r\n" + 
						"승용차가 달립니다.\r\n" + 
						"자동차의 스피드가 음수일리가 있나요?");
				System.out.println("승용차가 달립니다.");
				for(int i=0; i<6;i++) {
					speedup();
				}
			}
			@Override
			public void speedup() {
				Anonymous.this.carSpeed++;
				
				System.out.println("차의 현재 기어 : "+Anonymous.this.carSpeed+" 단 입니다.");
				
			}
		};
		field.run();
	}
	
	public void airPlan(Vehicle v) {
		v.run();
	}
}
