package sec06_exam_Polymorphism_Vector;

public class Product {
	int price;		//��ǰ�� ����
	int bonusPoint;	//��ǰ���� �� �����ϴ� ���ʽ� ����
	
	//������
	public Product(int price) {
		this.price = price;
		//���ʽ������� ��ǰ������ 10%
		this.bonusPoint = (int)(price/10.0);
	}
	
	public Product() {
		this.price = 0;
		this.bonusPoint = 0;
	}
}
