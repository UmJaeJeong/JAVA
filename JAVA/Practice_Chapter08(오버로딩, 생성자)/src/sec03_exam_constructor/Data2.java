package sec03_exam_constructor;

public class Data2 {
	int value;
	
	//기본생성자
	//public Data2(){}
	
	//매개변수가 있는 생성자. 생성자가 1개라도 존재한다면, 컴파일ㄹ러는 기본생성자를
	//추가해주지 아니한다.
	
	public Data2(int x) {
		this.value = x;
	}
	
}
