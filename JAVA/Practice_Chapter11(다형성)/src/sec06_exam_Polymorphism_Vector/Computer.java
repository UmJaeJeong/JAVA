package sec06_exam_Polymorphism_Vector;

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
