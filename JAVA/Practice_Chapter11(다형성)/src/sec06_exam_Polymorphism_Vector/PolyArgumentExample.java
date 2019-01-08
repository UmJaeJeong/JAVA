package sec06_exam_Polymorphism_Vector;

import java.util.Iterator;

public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Apple apple = new Apple();
		Computer computer = new Computer();
		Audio audio = new Audio();
		b.buy(computer);
		b.buy(audio);
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Tv());

		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		
		//Iterator �ݺ���
		//=> item �ٺ��� Vector�� 
		/*Iterator it = b.item.iterator();
		while(it.hasNext()) { //it.hasNext() �����ð� �ִ�? ��ȯ���� boolean �ִٸ�
			Product p = (Product)it.next();	 //�ִٸ� �����Ͷ� 
			System.out.println(p);
		}*/
		
		System.out.println("���� ������ Product��ü�� �� : "+b.item.size());
		//b.buy(apple); //������ ���� �� ������?
		b.summary();
		System.out.println();
		b.refund(computer);
		b.refund(audio);
		b.summary();
		System.out.println("���� ������ Product��ü�� �� : "+b.item.size());

	}

}
