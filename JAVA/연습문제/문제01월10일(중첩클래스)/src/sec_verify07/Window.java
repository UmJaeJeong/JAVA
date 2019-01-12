package sec_verify07;


public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void OnClick() {
			System.out.println("Button1 ���� : ��ȭ�� �̴ϴ�.");
			
		}
	};
	
	public Window() {
		btn1.setOnClickListener(listener);
		
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("Button2 ���� : �޽����� �����ϴ�.");
				
			}
		});
	}
	
	
}
