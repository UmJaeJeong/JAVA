package sec01_list.exam01_ArrayList01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		//asList()는 컬렉션이 아니라 배열형싣으로 된 컬렉션을 리턴한다.
		List<String> list1 = Arrays.asList("홍길동","이준호","김기리"); //Arrays안에 있는데 List타입으로 바뀔수 이싿.
		
		//아래와 같은 객체 추가, 삭제를 하면 java.lang.UnsupprotedOperationException이 발생한다.
		//list1.add("aaaa");
		//list1.remove(0);
		
		for(String str : list1)
			System.out.println(str);
		
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(100,200,300);
		Integer[] arr = (Integer[])list2.toArray();
		for(int value : arr) {
			System.out.println(value);
		}
		
		//자동 언박싱
		for(int value : list2)
			System.out.println(value);
		
		
	}

}
