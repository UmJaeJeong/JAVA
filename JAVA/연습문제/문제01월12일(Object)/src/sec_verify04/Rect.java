package sec_verify04;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int x, int y) {
		this.width = x;
		this.height = y;
	}
	
	public boolean equals(Rect r) {
		if(this.width*this.height == r.width*r.height) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {		// TODO Auto-generated method stub
		return "x : "+this.width+"이며, y :"+this.height+"이다";
	}
}
