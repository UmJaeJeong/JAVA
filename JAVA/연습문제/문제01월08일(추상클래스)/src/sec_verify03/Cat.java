package sec_verify03;

public class Cat extends Animal{

	@Override
	public void sound() {
		super.breathe();
		System.out.println("포유류인 고양이가 소리를 냅니다. 야옹~~");
	}

	
}
