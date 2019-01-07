package sec2_verify04;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 상품을 입력 받으시겠습니까?");
		int num=sc.nextInt();
		Goods[] gd = new Goods[num];
		for(int i=0; i<num;i++) {
			gd[i] = new Goods("",0,0,0);
		}
		
		
		for(int i=0; i<num;i++) {
		
			String y;
			System.out.print((i+1)+"번째 상품 이름:");
			y = sc.next();
			gd[i].setName(y);
			System.out.print((i+1)+"번째 상품 가격:");
			int x = sc.nextInt();
			gd[i].setPrice(x);
			System.out.print((i+1)+"번째 상품 재고:");
			int xx = sc.nextInt();
			gd[i].setNumberOfStock(xx);
			System.out.print((i+1)+"번째 상품 수량:");
			int xxx = sc.nextInt();
			gd[i].setSold(xxx);
		}
		System.out.println("입력하신 상품의 이름, 가격, 재고, 팔린수량 의 현황입니다.");
		for(Goods g : gd)
			System.out.println(g.toString());

	}

}
