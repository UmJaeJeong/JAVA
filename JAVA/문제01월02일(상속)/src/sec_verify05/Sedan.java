package sec_verify05;

public class Sedan extends Car{
	int seatNum;
	
	public int getSeatNum() {
		return this.seatNum;
	}
	@Override
	public String toString() {
		return "�¿��� �ӵ��� :"+super.speed+"km, ������ "+super.color+" �¼����� "+this.seatNum+"�� �Դϴ�.";
	}
}
