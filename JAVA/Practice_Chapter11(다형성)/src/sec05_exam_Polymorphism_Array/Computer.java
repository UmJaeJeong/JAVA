package sec05_exam_Polymorphism_Array;

public class Computer extends Product{
	
	//����Ŭ������ ������ Product(int price)�� ȣ��
	public Computer() {
		super(300);
		
	}
	
	
	@Override
	public String toString() {
		return "Computer";
	}
	
	
}
