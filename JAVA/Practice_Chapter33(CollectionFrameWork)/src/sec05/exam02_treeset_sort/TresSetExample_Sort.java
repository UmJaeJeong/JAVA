package sec05.exam02_treeset_sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TresSetExample_Sort {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		//저장될떄는 무작위로 저장되지만, 컬렉션에 들어갈떄는 이진트리의 구조를
		//가지게 됨을 잊지말자
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		for(Integer score : scores)
			System.out.println(score+" ");
		System.out.print("\n객체 수 : "+scores.size());
		System.out.println();
		//TreeSet의 descendingSet()는 내림차순으로 정렬된 객체들이 NavigableSet에 저장된다.
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("내림차순 결과");
		for(Integer score : descendingSet) {
			System.out.println(score+" ");
		}
		System.out.print("\n객체 수 : "+scores.size());
		System.out.println();
		
		//다시 descendingSet()을 호출함으로써 올림차순으로 바꿀수도 있다.
		//pollLast(), pollFirst()메서드를 이용해도 된다.
		//(프로그래머가 상황에 맞게끔 선택하면 된다)
		

		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		System.out.println("올림차순 결과");
		for(Integer score : ascendingSet) {
			System.out.print(score+" ");
		}
		System.out.println("\n객체 수 : "+scores.size());
		System.out.println();
		
	}

}
