package sec_verify03;

public class GoodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods good  = new Goods();
		good.setName("Nikon");
		good.setPrice(400000);
		good.setNumberOfStock(30);
		good.setSold(50);
		System.out.println("상품 이름: "+good.getName());
		System.out.println("상품 가격: "+good.getPrice());
		System.out.println("재고 수량: "+good.getNumberOfStock());
		System.out.println("팔린 수량: "+good.getSold());
		
		
		
		
	}

}
