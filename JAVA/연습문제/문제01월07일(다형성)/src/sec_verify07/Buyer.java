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
			System.out.println(p+"를 구입하셨습니다.");
		}else {
			System.out.println(p+"는 잔액이 부족하여 살수 없습니다.");
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
		System.out.println("구입하신 물품의 총금액은 "+sum);
		System.out.println("구입하신 제품은 "+str+"입니다.");

	}
}
