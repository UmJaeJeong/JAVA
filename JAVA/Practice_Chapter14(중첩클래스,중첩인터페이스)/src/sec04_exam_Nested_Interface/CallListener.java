package sec04_exam_Nested_Interface;

public class CallListener implements Button.onClickListener {
	//ButtonŬ������ ��ø�������̽��� OnClickListener�� �߻�޼��带 �������Ѵ�.
	@Override
	public void OnClick() {
		System.out.println("���콺 Ŭ�� ��");
	};
}
