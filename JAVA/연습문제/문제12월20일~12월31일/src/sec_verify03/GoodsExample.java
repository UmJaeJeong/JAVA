package sec_verify03;

public class GoodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods good  = new Goods();
		good.setName("Nikon");
		good.setPrice(400000);
		good.setNumberOfStock(30);
		good.setSold(50);
		System.out.println("��ǰ �̸�: "+good.getName());
		System.out.println("��ǰ ����: "+good.getPrice());
		System.out.println("��� ����: "+good.getNumberOfStock());
		System.out.println("�ȸ� ����: "+good.getSold());
		
		
		
		
	}

}
