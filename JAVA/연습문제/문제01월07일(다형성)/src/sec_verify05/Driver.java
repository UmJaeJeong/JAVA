package sec_verify05;

public class Driver {
	
	public void drive(Vehicle v) {
		if(v instanceof Vehicle) {
			System.out.println("조상클래스 타입에 적용되는 자손클래스들의 run메서드를 호출합니다");
		}
		v.run();
		
	}
}
