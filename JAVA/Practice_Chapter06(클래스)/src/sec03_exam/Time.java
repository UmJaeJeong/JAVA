package sec03_exam;

public class Time {
/*
 * ���� ������(Access Modifier)�� ����
 * private : ���� Ŭ������������ ���� ������
 * protected : ���� ��Ű��, �ڼ�Ŭ���������� ���� ������.
 * default : ���� ��Ű�������� ���� ������
 * public : ������ �� ���� ������.
 */
	//��� ���� (���������� private �ܺηκ��� ���� ����)
	private int hour;
	private int minute;
	private float second;
	
	public void setHour(int hour) {
		if(hour<0|| hour>23) {
			System.out.println("�ð��� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0|| minute>59) {
			System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		this.minute = minute;
	}
	
	public void setSecond(float second) {
		if(second<0|| second>59) {
			System.out.println("�ʸ� �߸� �Է��Ͽ����ϴ�.");
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
		String str = this.getHour()+":" +this.getMinute()+": "+this.getSecond()+"���Դϴ�.";
			return str;
		}
	
}
