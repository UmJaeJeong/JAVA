package sec_verify04_1;

public class IncreaseNumberExample {

	public static void main(String[] args) {
		Number number = new Number();
		IncreaseNumberThread it = new IncreaseNumberThread(number);
		IncreaseNumberThread it1 = new IncreaseNumberThread(number);
		IncreaseNumberThread it2 = new IncreaseNumberThread(number);
		it.setName("FirstThread");
		it.start();
		
		it1.setName("SecondThread");
		it1.start();

		it2.setName("ThirdThread");
		
		it2.start();

		
		
	}

}
