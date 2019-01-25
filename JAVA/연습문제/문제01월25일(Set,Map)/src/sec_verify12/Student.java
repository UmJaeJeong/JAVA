package sec_verify12;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	
	public float getAverage() {
		float ret = 0.0f;
		ret = getTotal()/(float)3;
		return ret;
	}
	
	@Override
	public String toString() {
		return "�̸� : "+this.name+", "+this.ban+"��,"+this.no+"��, ���� : "+this.kor+"��, ���� : "+this.eng
				+"��, ���� : "+this.eng+"��, ���� : "+getTotal()+", ��� :"+this.getAverage();
	}
}
