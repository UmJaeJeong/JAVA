package sec_verify13;

public class ShopServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		
		//����� ���� Ŭ������ Object�� equals()ȣ�� --> ������
		if(obj1.equals(obj2)) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
				System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}

	
}
