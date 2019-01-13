package sec_verify01;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return this.studentNum;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(this.studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if (st.studentNum.equals(this.studentNum)) {
			System.out.print(st.studentNum + "번 학생의 점수 : ");
			return true;
		}

		return false;
	}
}
