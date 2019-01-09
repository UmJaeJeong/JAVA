package sec_verify07;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}

}
