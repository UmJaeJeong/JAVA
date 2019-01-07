package sec05_exam_Polymorphism_Array;

public class Buyer {
	int money = 1000;	//�����ݾ�
	int bonusPoint = 0;	//���ʽ�����
	
	Product[] item = new Product[10];
	int i=0;
	
	//�Ű����� Product p�� ������ ��Ȯ�� �����ϴ� ���� �ſ� �߿�!(������ ����)
	//Product�� �ƴ϶� Product�� ��ӹ޴� � Ŭ������ �� �Ű������� ���ü� �ִ�.
	public void buy(Product p) {
		if(this.money <p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			this.money = 0;
			return;
		}
		
	//���� ������ ������ ��ǰ�� ������ �A��.
	this.money -=p.price;
	//��ǰ�� ���ʽ� ������ �߰��Ѵ�.
	this.bonusPoint += p.bonusPoint;
	this.item[i++] = p; //��ǰ�� Product[] item�� �����Ѵ�.
	System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	//������ ��ǰ�� ���� ������ ����ؼ� �����ش�
	public void summary() {
		int sum  = 0;			//������ ��ǰ�� �����հ�
		String itemList = "";	//������ ��ǰ���
		
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.length;i++) {
			if(item[i] == null)
				break;
			sum+=this.item[i].price;
			
			if(i==9)
				itemList += this.item[i];
			else
				itemList += this.item[i]+",";

		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��"+itemList+"�Դϴ�.");
	}
}	
