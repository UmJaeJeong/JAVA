package sec04_exam_Polymorphism;

public class Computer extends Product{
	
	//조상클래스의 생성자 Product(int price)를 호출
	public Computer() {
		super(300);
		
	}
	
	
	@Override
	public String toString() {
		return "Computer";
	}
	
	
}
