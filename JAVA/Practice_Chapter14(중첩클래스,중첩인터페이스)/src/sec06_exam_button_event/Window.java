package sec06_exam_button_event;

public class Window {
	// �ʵ�
	Button btn1 = new Button();
	Button btn2 = new Button();

	// �ʵ��� �ʱⰪ���� �͸�����ü�� �����ϰ� �ִ�.
	Button.onClickListener listener=new Button.onClickListener(){
		@Override public void OnClick(){
			System.out.println("���α׷� ��ġ�� ����˴ϴ�.");
		}
	};

	public Window() {
		//ButtonŬ������ �ν��Ͻ��� setOnClickListenerȣ���ϸ鼭 ���� ������ �Ű����� �ѱ��.
		btn1.setOnClickListener(listener);
		
		btn2.setOnClickListener(new Button.onClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("������ �����մϴ�.");
				
			}
		});
	}

}
