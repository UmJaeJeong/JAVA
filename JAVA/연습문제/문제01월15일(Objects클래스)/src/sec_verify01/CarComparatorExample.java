package sec_verify01;

import java.util.Comparator;
import java.util.Objects;

class Car {
	String model;
	int door;

	public Car(String model, int door) {
		this.model = model;
		this.door = door;
	}
}

class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		if (c1.model.compareTo(c2.model)<0) {
			return -1;
		}else if(c1.model.compareTo(c2.model)==0)
		return 0;
		else
			return 1;
	}
}

public class CarComparatorExample {

	public static void main(String[] args) {

		Car c1 = new Car("SM5-신형", 4);
		Car c2 = new Car("SM7-신형", 4);
		Car c3 = new Car("SM5-신형", 4);
		CarComparator com = new CarComparator();
		
		System.out.println("비교시 Objects.compare를 이용합니다.");
		if(com.compare(c1,c2) == 0) {
			System.out.println("c1과 c2는 같은 차종입니다.");
		}else {
			System.out.println("c1과 c2는 다른 차종입니다.");

		}
		c2 = c3;
		if(com.compare(c1,c2) == 0) {
			System.out.println("c1과 c2는 같은 차종입니다.");
		}else {
			System.out.println("c1과 c2는 다른 차종입니다.");

		}
		
	}

}
