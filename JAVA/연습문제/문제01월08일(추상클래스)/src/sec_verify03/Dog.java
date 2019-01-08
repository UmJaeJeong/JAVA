package sec_verify03;

public class Dog extends Animal{

	@Override
	public void sound() {
		super.breathe();
		System.out.println("포유류인 강아지가 소리를 냅니다. 멍멍!");
	}

}
