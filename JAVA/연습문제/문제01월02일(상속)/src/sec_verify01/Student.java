package sec_verify01;

public class Student extends Person{

	private String s_num;
	
	public Student(String P_name, String s_num){
		super(P_name);
		this.s_num = s_num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�й� : "+this.s_num+"\n"+"�̸� : "+super.toString();
	}
	
	
}
