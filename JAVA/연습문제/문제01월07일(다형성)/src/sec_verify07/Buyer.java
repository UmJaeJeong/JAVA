package sec_verify07;

public class Buyer {
	int money =1000;
	int bonusPoint = 0;
	Product[] item =new Product[10];
	int i=0;
	
	public void buy(Product p) {
		if(this.money>=p.price) {
			item[i++] = p;
			this.money-=p.price;
			this.bonusPoint += p.bonusPoint;
			System.out.println(p+"�� �����ϼ̽��ϴ�.");
		}else {
			System.out.println(p+"�� �ܾ��� �����Ͽ� ��� �����ϴ�.");
		}
	}
	
	public void summary() {
		int sum = 0;
		String str = "";
		for(int k=0; k<i;k++) {
			if(item[k]!=null) {
				sum+= item[k].price;
				if(k!=i-1) {
					str +=item[k]+", ";
				}else {
					str +=item[k];

				}
			}
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum);
		System.out.println("�����Ͻ� ��ǰ�� "+str+"�Դϴ�.");

	}
}
