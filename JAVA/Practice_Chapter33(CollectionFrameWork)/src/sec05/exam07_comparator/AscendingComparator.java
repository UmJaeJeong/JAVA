package sec05.exam07_comparator;

import java.util.Comparator;

//Fruit객체를 대상으로 하는 비교자(정렬자)를 생성하여 treeSet에 생성자에 대입해주면
//Comparable를 구현하지 않아도 정렬이 가능해진다.
public class AscendingComparator implements Comparator<Fruit>{
	//여기 오름차순정렬이나, 이걸 리턴값을 바꾸면 내림차순이 된다.
	//역시 기준은 가격이 된다.
	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}else if(o1.getPrice() == o2.getPrice()) {
			return 0;
		}
		return 1;
	}
}
