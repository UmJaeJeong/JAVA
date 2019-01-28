package sec_verify05;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class Score {
	ArrayList<Student> record = new ArrayList<>();
	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;
	
	public void add(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		record.add(new Student(name,studentNo,koreanScore,mathScore,englishScore));
	}
	
	int getSubjectTotal() {
		for(int i=0; i<record.size();i++) {
			koreanTotal+=record.get(i).koreanScore;
			mathTotal+=record.get(i).mathScore;
			englishTotal+=record.get(i).englishScore;
		}
		return koreanTotal+mathTotal+englishTotal;
	}
	
	public void displayList() {
		System.out.println(Student.format("�̸�", 4, Student.LEFT) + Student.format("��ȣ", 4, Student.RIGHT)+Student.format("����", 6, Student.CENTER)+
				Student.format("����", 6, Student.CENTER)+Student.format("����", 6, Student.CENTER)+Student.format("����",18,Student.CENTER)+
				"\n======================================");
		for(Student st : record) {
			System.out.println(st.toString());		
		}
		System.out.println("======================================");
		getSubjectTotal();
		System.out.println(Student.format(record.size()+"�� ���� :", 10, Student.CENTER)+Student.format(Integer.toString(this.koreanTotal), 6, Student.RIGHT)
		+Student.format(Integer.toString(this.mathTotal), 6, Student.RIGHT)+Student.format(Integer.toString(this.englishTotal), 6, Student.RIGHT)
		+Student.format(Integer.toString(getSubjectTotal()), 8, Student.RIGHT));
	}
}
