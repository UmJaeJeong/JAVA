package sec01_exam;

//�Ӽ� 2���� ����� �ϳ��� ���� Ŭ������ �������
//�ϳ��� Java���Ͽ� ���������� public ������ �Ѱ����߸� �Ѵ�.
//����������
/*
 * 1. private  : ���� Ŭ������������ ���� ����
 * 2. protected : ���� ��Ű��, �ٸ��uŰ�� �ڼ�Ŭ���������� ���ٰ���
 * 3. default : ���� ��Ű��, �ٸ� ��Ű�� ���ٰ���
 * 4. public : � Ŭ������ �� ���� ����
 */

public class Student {

	//�������(�ʵ�)
	String name = "��â��";
	int age = 28;
	
	@Override
	public String toString() {
		return "�̸� : "+this.name+", ���� : "+ this.age;
	}
}
