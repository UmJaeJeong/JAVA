package sec_verify05;

public class Truck extends Car{
	int capacity;
	
	public int getCapacity() {
		return this.capacity;
	}
	
	@Override
	public String toString() {
		return "트럭 속도는 "+super.speed+"km, 색깔은 "+super.color+"적재량은 "+this.capacity+"톤 입니다.";
	}
}
