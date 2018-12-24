package sec03_exam;

public class Time {
/*
 * 접근 제어자(Access Modifier)의 종류
 * private : 같은 클래스내에서만 접근 가능함
 * protected : 같은 패키지, 자손클래서에서만 접근 가능함.
 * default : 같은 패키지에서만 접근 가능함
 * public : 누구나 다 접근 가능함.
 */
	//멤버 변수 (접근제어자 private 외부로부터 값을 숨김)
	private int hour;
	private int minute;
	private float second;
	
	public void setHour(int hour) {
		if(hour<0|| hour>23) {
			System.out.println("시간을 잘못 입력하였섭니다.");
			return;
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0|| minute>59) {
			System.out.println("분을 잘못 입력하였섭니다.");
			return;
		}
		this.minute = minute;
	}
	
	public void setSecond(float second) {
		if(second<0|| second>59) {
			System.out.println("초를 잘못 입력하였섭니다.");
			return;
		}
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}

	public float getSecond() {
		return second;
	}
	
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		String str = this.getHour()+":" +this.getMinute()+": "+this.getSecond()+"초입니다.";
			return str;
		}
	
}
