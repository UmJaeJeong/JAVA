package sec2_verify08;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		int sum = 0;
		sum = this.kor+this.eng+this.math;
		return sum;
	}
	
	float getAverage() {
		float aver = 0.0f;
		aver = getTotal()/(float)3;
		return aver;
	}
}
