package sec05_exam_Polymorphism_Array;

public class Tv extends Product{
	
	//조상클래스의 생성자 Product(int price)를 호출
	public Tv() {
		super(300);
	}
	
	
	@Override
	public String toString() {
		return "Tv";
	}
	
	
}
