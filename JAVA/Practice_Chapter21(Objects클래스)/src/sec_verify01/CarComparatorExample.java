package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("SM5-����",4);
		Car c2 = new Car("SM7-����",4);
		Car c3 = new Car("SM5-����",4);
		
		CarComparator cc = new CarComparator();
		
		int result = Objects.compare(c1, c3, cc);
		
		if(result == -1)
			System.out.println("c1�� c3�� �ٸ� �����Դϴ�.");
		else if(result == 0)
			System.out.println("c1�� c3�� ���� �����Դϴ�.");
		else
			System.out.println("c1�� c3�� �ٸ� �����Դϴ�.");
		
		
		result = Objects.compare(c1, c2, cc);
		
		if(result == -1)
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");
		else if(result == 0)
			System.out.println("c1�� c2�� ���� �����Դϴ�.");
		else
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");
	}
}
