package sec2_verify04;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ��ǰ�� �Է� �����ðڽ��ϱ�?");
		int num=sc.nextInt();
		Goods[] gd = new Goods[num];
		for(int i=0; i<num;i++) {
			gd[i] = new Goods("",0,0,0);
		}
		
		
		for(int i=0; i<num;i++) {
		
			String y;
			System.out.print((i+1)+"��° ��ǰ �̸�:");
			y = sc.next();
			gd[i].setName(y);
			System.out.print((i+1)+"��° ��ǰ ����:");
			int x = sc.nextInt();
			gd[i].setPrice(x);
			System.out.print((i+1)+"��° ��ǰ ���:");
			int xx = sc.nextInt();
			gd[i].setNumberOfStock(xx);
			System.out.print((i+1)+"��° ��ǰ ����:");
			int xxx = sc.nextInt();
			gd[i].setSold(xxx);
		}
		System.out.println("�Է��Ͻ� ��ǰ�� �̸�, ����, ���, �ȸ����� �� ��Ȳ�Դϴ�.");
		for(Goods g : gd)
			System.out.println(g.toString());

	}

}
