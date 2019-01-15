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

		Car c1 = new Car("SM5-����", 4);
		Car c2 = new Car("SM7-����", 4);
		Car c3 = new Car("SM5-����", 4);
		CarComparator com = new CarComparator();
		
		System.out.println("�񱳽� Objects.compare�� �̿��մϴ�.");
		if(com.compare(c1,c2) == 0) {
			System.out.println("c1�� c2�� ���� �����Դϴ�.");
		}else {
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");

		}
		c2 = c3;
		if(com.compare(c1,c2) == 0) {
			System.out.println("c1�� c2�� ���� �����Դϴ�.");
		}else {
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");

		}
		
	}

}
