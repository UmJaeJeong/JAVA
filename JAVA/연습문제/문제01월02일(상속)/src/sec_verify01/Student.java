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
		return "학번 : "+this.s_num+"\n"+"이름 : "+super.toString();
	}
	
	
}
