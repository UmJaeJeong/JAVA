package sec_verify05;

public class FruitBasket {
	
	
	static<K, V> Fruit<K, V> basketing(Fruit f1, Fruit f2){
		boolean check =f1.getK().equals(f2.getK());
		if(check) {
			System.out.println("Fruit�ٱ��Ͽ� ������ ���׿�.");
			return f1;
		}else
		{
			System.out.println("Fruit�ٱ��Ͽ� �� ������ ���׿�.");
			return f2;
		}
	}
}
