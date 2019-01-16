package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Audio,Monitor> p1 = new Product<>();
		p1.setA(new Audio("Sony","최상",4));
		p1.setM(new Monitor("삼성",17));
		System.out.println("내 오디오는 "+p1.getA().getBrand()+" 제조사이며, 음질은 "+p1.getA().getQuality()+" 이며,"+p1.getA().getChannel()+"채널이다.");
		System.out.println("모니터의 상세");
		System.out.println("브랜드 : "+p1.getM().getCompany());
		System.out.println("인치   : "+p1.getM().getInch());
		System.out.println("가격   : 350000");
	
	}

}
