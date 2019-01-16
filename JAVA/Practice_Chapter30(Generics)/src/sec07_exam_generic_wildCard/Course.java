package sec07_exam_generic_wildCard;

public class Course<T> {
	//���� Course 
	private String name;
	private T[] student;
	
	//������
	public Course(String name, int capacity) {
		this.name = name;
		//�̰� �ȵȴ�. ���� TŸ���� ���� �ȵǾ��´� �迭�� ���� ����� �ֳ���? ������ ������
		//this.student = student; = new T[capacity];
		//�� �κ� ���� ���� ������ �ؾ� ��. �̷��ڵ� ���� ������
		this.student = (T[])(new Object[capacity]);
	}
	//������

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudent() {
		return student;
	}

	public void setStudent(T[] student) {
		this.student = student;
	}
	
	//�������� �߰� ������
	public void add(T t) {
		//����ִ� ������ �������� �߰� �ϱ� ���� �ڵ�
		for(int i=0; i<this.student.length;i++) {
			if(student[i]==null) {
				student[i] = t;
				break;
			}
		}
	}
}
