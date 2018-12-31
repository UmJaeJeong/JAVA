package sec06_exam_singleton;

public class Singleton {
	//������������ ������ ���� ���� private�� �ٿ��� �ܺο����� new�� ���� �ν��Ͻ� �����Ұ���
	//static�� Ŭ���� ������ �ö󰡴ϱ�, ���� �ܺο��� new�����ڸ� ���ؼ� ���� ���ص� ��.
	private static Singleton singleton = new Singleton();
	
	//Singleton�� �⺻ ��������. ���� private ���������ڶ� �ܺο��� ���� ����.
	//�����Ϸ��� �⺻ �����ڰ� �����ÿ���, �ڵ������� �˾Ƽ� �⺻�����ڸ� ��������.
	private Singleton(){}
	
	//static�޼����� getInstance�� singleton�� �ּҸ� ������.
	public static Singleton getInstance() {
		//return this.singleton; �������� : this�� new�� �����ؼ� ���⋚���� static�޼��忡�� ���θ� 
		return singleton;
	}
}
