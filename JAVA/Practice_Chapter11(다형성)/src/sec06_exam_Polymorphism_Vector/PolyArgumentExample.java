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
		
		//Iterator 반복자
		//=> item 근본이 Vector임 
		/*Iterator it = b.item.iterator();
		while(it.hasNext()) { //it.hasNext() 가져올게 있니? 반환값이 boolean 있다면
			Product p = (Product)it.next();	 //있다면 가져와라 
			System.out.println(p);
		}*/
		
		System.out.println("현재 벡터의 Product객체의 수 : "+b.item.size());
		//b.buy(apple); //에러가 난다 그 이유는?
		b.summary();
		System.out.println();
		b.refund(computer);
		b.refund(audio);
		b.summary();
		System.out.println("현재 벡터의 Product객체의 수 : "+b.item.size());

	}

}
