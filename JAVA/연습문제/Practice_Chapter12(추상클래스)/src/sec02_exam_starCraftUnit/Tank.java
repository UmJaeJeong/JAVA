package sec02_exam_starCraftUnit;

public class Tank extends Unit{
	String str="��ũ";
	//������
	public Tank() {}
	
	//Tank�� Move�ϴ� �Ϳ� �°Բ� ������
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("��ũ�� ��ġ : "+this.x+", "+this.y+"�� "+this.str+"��/�� ����ϴ�.");
	}
	
	public void sizeMode() {
		this.str = "���� ��� : ���� ��� ��ȯ";
		System.out.println(this.str);
	}
}
