package sec_verify13;

public class ShopServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		
		//사용자 정의 클래스의 Object의 equals()호출 --> 번지비교
		if(obj1.equals(obj2)) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
				System.out.println("다른 Singleton 객체입니다.");
		}
	}

	
}
