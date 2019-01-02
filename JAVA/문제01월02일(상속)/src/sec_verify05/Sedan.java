package sec_verify05;

public class Sedan extends Car{
	int seatNum;
	
	public int getSeatNum() {
		return this.seatNum;
	}
	@Override
	public String toString() {
		return "승용차 속도는 :"+super.speed+"km, 색깔은 "+super.color+" 좌석수는 "+this.seatNum+"개 입니다.";
	}
}
