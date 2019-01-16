package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("SM5-신형",4);
		Car c2 = new Car("SM7-신형",4);
		Car c3 = new Car("SM5-신형",4);
		
		CarComparator cc = new CarComparator();
		
		int result = Objects.compare(c1, c3, cc);
		
		if(result == -1)
			System.out.println("c1과 c3는 다른 차종입니다.");
		else if(result == 0)
			System.out.println("c1과 c3는 같은 차종입니다.");
		else
			System.out.println("c1과 c3는 다른 차종입니다.");
		
		
		result = Objects.compare(c1, c2, cc);
		
		if(result == -1)
			System.out.println("c1과 c2는 다른 차종입니다.");
		else if(result == 0)
			System.out.println("c1과 c2는 같은 차종입니다.");
		else
			System.out.println("c1과 c2는 다른 차종입니다.");
	}
}
