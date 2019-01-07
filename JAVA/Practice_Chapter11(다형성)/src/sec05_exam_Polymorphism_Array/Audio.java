package sec05_exam_Polymorphism_Array;

public class Audio extends Product{
	
	//조상클래스의 생성자 Product(int price)를 호출
	public Audio() {
		super(50);
		
	}
	
	
	@Override
	public String toString() {
		return "Audio";
	}
	
	
}
