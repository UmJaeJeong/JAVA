package sec_verify07;

public class Button {
	OnClickListener listener;
	
	interface OnClickListener{
		public void OnClick();
	}
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;

	}
	
	public void touch() {
		this.listener.OnClick();
	}
}
