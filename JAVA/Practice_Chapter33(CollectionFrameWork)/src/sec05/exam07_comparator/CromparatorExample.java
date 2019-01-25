package sec05.exam07_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CromparatorExample {

	public static void main(String[] args) {
		// Fruit 사용자정의 클래스를 저장할 TreeSet을 생성함. 단, 정려을 위해 Comparator<>를
		// 제공해준다.
		TreeSet<Fruit> treeSet = new TreeSet<>(new AscendingComparator());
		
		//익명구현객체 사용가능
		/*TreeSet<Fruit> treeSet1 = new TreeSet<>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				
				if(o1.getPrice()<o2.getPrice()) {
					return -1;
				}else if(o1.getPrice() == o2.getPrice()) {
					return 0;
				}
				return 1;
			}
		});*/

		// treeSet에 Fruit객체를 추가한다.
		// 여기서 Fruit클래스에 Comparable<>인터페이스를 구현하지 않거나, Comparator<>를
		// 제공하지 않으면 ClassCastException이 발생한다.
		// try {
		treeSet.add(new Fruit("포도", 6500));
		treeSet.add(new Fruit("딸기", 4200));
		treeSet.add(new Fruit("복숭아", 3500));
		treeSet.add(new Fruit("바나나", 3400));
		treeSet.add(new Fruit("자두", 2500));
		treeSet.add(new Fruit("호박", 1000));
		// }catch(Exception e) {
		// System.out.println("정렬기준없음");
		// e.getMessage();
		// }
		System.out.println("총 객체수 : " + treeSet.size());
		// 반복자를 얻는다.
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			Fruit f = it.next();
			System.out.println(f.getName() + " : " + f.getPrice());
		}

	}

}
