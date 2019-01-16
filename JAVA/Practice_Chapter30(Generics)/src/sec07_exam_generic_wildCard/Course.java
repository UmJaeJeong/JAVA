package sec07_exam_generic_wildCard;

public class Course<T> {
	//과정 Course 
	private String name;
	private T[] student;
	
	//생성자
	public Course(String name, int capacity) {
		this.name = name;
		//이거 안된다. 아직 T타입이 결정 안되었는대 배열을 어찌 만들수 있나요? 문법적 에러임
		//this.student = student; = new T[capacity];
		//이 부분 필이 보고 숙지를 해야 됨. 이런코드 자주 등장함
		this.student = (T[])(new Object[capacity]);
	}
	//과정명

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
	
	//수강생을 추가 시켜줌
	public void add(T t) {
		//비어있는 공간에 수강생을 추가 하기 위한 코드
		for(int i=0; i<this.student.length;i++) {
			if(student[i]==null) {
				student[i] = t;
				break;
			}
		}
	}
}
