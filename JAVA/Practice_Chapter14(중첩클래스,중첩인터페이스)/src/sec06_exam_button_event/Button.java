package sec06_exam_button_event;

public class Button {
	
	//��ø�������̽�
	interface onClickListener{
		void OnClick();
	}
	
	//�������̽� ������������
	onClickListener listener;
	
	//setter-- �Ű������� �������̽� Ÿ���� ����Ǿ��ٸ� �����ǹ��ΰ�?
	void setOnClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	//touch()�޼��尡 ȣ��Ǹ鼭 ��ø�������̽��� ������ ��ü��
	//OnClick()[�޼��尡 ȣ���
	void touch() {
		listener.OnClick();
	}
	
}
