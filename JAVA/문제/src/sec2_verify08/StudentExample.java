package sec2_verify08;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("�����",1,11,100,100,18);
		System.out.println("�̸�:"+st.name);
		System.out.println("����:"+st.getTotal());
		System.out.printf("���:%.1f",st.getAverage());

	}

}
