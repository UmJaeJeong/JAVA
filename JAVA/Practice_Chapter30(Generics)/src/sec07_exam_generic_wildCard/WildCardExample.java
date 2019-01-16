package sec07_exam_generic_wildCard;

import java.util.Arrays;

public class WildCardExample {

	//Coures<T>�� ���׸�Ÿ������ ����� �κп� ?�� ����. ��� ��ü�� ���� ����� ����.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() +"������ : "+Arrays.toString(course.getStudent()));
	}
	//Course<T>�� ���׸�Ÿ������ ����� �κп� ? extends Student�� ����, Student�̰ų�
	//Student�� �ڼ�Ŭ������ ��ü�� �� ���ִ�.
	public static void registerCourseStudent(Course<? extends Student> couse) {
		System.out.println(couse.getName() +"������ : "+Arrays.toString(couse.getStudent()));

	}
	//Course<T>�� ���׸�Ÿ������ ����� �κп� ? super Student�� ����, Student�̰ų�
	//Worker�� ����Ŭ������ ��ü�� �ü� �ִ�.
	public static void registerCourseWorker(Course<? super Student> couse) {
		System.out.println(couse.getName() +"������ : "+Arrays.toString(couse.getStudent()));

		
	}
	public static void main(String[] args) {
		//���� �����ϱ� ���� ������� Ŭ�������� ��Ӱ������� �׷�����
		//�׷� ���ذ� ��������.
		registerCourse(new Course<Person>("�Ϲ��� ����",5));
		registerCourse(new Course<Student>("�л� ����",5));
		registerCourse(new Course<Worker>("�ٷ��� ����",5));
		registerCourse(new Course<HighStudent>("����л� ����",5));
		System.out.println();
		//registerCourseStudent(new Course<Person>("�Ϲ��� ����",5));
		registerCourseStudent(new Course<Student>("�л� ����",5));
		//registerCourseStudent(new Course<Worker>("�ٷ��� ����",5));
		registerCourseStudent(new Course<HighStudent>("����л� ����",5));
		System.out.println();
		registerCourseWorker(new Course<Person>("�Ϲ��� ����",5));
		registerCourseWorker(new Course<Student>("�л� ����",5));
		//registerCourseWorker(new Course<Worker>("�ٷ��� ����",5));
		//registerCourseWorker(new Course<HighStudent>("����л� ����",5));
		
		
		System.out.println();
		System.out.println("���� ������ �߰�");
		
		//2. ���� Course�����ؼ� Ȯ���ϴ� ����
		Course<Person> personCourse =new Course<>("�Ϲ��� ����",4);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("����л�"));
		
		Course<Worker> WorkerCourse =new Course<>("������ ����",3);
		WorkerCourse.add(new Worker("��ƿ����"));
		WorkerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse =new Course<>("�л� ����",5);
		studentCourse.add(new Student("�����"));
		studentCourse.add(new Student("������"));
		studentCourse.add(new Student("����ȣ"));
		studentCourse.add(new Student("��â��"));
		studentCourse.add(new Student("������"));
		
		Course<HighStudent> HighStudentCourse =new Course<>("����л� ����",5);
		HighStudentCourse.add(new HighStudent("�ŵ�ȣ"));
		HighStudentCourse.add(new HighStudent("��⸮"));
		HighStudentCourse.add(new HighStudent("�ſ��"));
	
		
		registerCourse(personCourse);
		registerCourse(studentCourse);
		registerCourse(HighStudentCourse);
		registerCourse(WorkerCourse);
		System.out.println();
		//registerCourseStudent(personCourse);		//������ ���� ��?
		registerCourseStudent(studentCourse);
		registerCourseStudent(HighStudentCourse);
		//registerCourseStudent(WorkerCourse);		//������ ���� ��?
		System.out.println();
		registerCourseWorker(personCourse);
		registerCourseWorker(studentCourse);
		//registerCourseWorker(HighStudentCourse);	//������ ���� ��?
		//registerCourseWorker(WorkerCourse);		//������ ���� ��?
	

	}

}
