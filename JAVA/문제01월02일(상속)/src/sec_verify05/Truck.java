package sec_verify05;

public class Truck extends Car{
	int capacity;
	
	public int getCapacity() {
		return this.capacity;
	}
	
	@Override
	public String toString() {
		return "Ʈ�� �ӵ��� "+super.speed+"km, ������ "+super.color+"���緮�� "+this.capacity+"�� �Դϴ�.";
	}
}
