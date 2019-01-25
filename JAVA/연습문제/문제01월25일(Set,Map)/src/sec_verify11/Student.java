package sec_verify11;

import java.util.Objects;

public class Student {
	private int studentNum;
	private String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.hashCode()==obj.hashCode())?true:false;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
