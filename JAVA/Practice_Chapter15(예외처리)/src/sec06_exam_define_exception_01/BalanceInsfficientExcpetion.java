package sec06_exam_define_exception_01;

//����� ���� ����Ŭ����
public class BalanceInsfficientExcpetion extends Exception{
	
	//�⺻ ������
	public BalanceInsfficientExcpetion() {}
	
	//������
	public BalanceInsfficientExcpetion(String message) {
		super(message);//������ ������ ȣ��
	}

}
