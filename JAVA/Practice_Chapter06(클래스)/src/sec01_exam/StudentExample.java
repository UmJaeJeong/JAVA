package sec01_exam;


public class StudentExample {
	
	public static void main(String[] args) {
		//student1�̶�� ��������(����)�� StudentŬ������ ��ü heap������ �����ǰ�,
		//�� �ּҰ� �����
		Student student1 = new Student();
		
		System.out.println(student1);
		System.out.println(student1.name);
		
		//����������� ��������(������)�� �ٲ�
		student1.name = "�̿���";
		student1.age = 55;
		
		System.out.println(student1.age);
		System.out.println(student1.name);
		System.out.println(student1);
	}
	
	
	
}
