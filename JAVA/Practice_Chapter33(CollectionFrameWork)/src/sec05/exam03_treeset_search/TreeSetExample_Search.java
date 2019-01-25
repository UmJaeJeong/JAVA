package sec05.exam03_treeset_search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Search {

	public static void main(String[] args) {
		//String을 저장하는 treeSet을 만듬
		TreeSet<String> treeSet = new TreeSet<>();
		//알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		/*treeSet.add("가라");
		treeSet.add("나가");
		treeSet.add("다시는");
		treeSet.add("라");
		treeSet.add("마");
		treeSet.add("바");
		treeSet.add("사");*/
		
		// 여기서 헷갈릴수있는데 c~f사이라는 것은 시작이 c부터 해서 긑이
		// f부분이 f를 넘ㅇ어서면 안된다는 것을 의미한다.
		// 다시말해 f를 허용하니 forever 즉, orever때문에 forever가 출력이 되진
		// 않는 것을 알도록 하자. 한글 역시 마찬가지다.
		System.out.println("[c~f] 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true,"f",true);
		for(String str : rangeSet){
			System.out.println(str+" ");
		}
		
		/*System.out.println("[가~라] 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("가", true,"라",true);
		for(String str : rangeSet){
			System.out.println(str+" ");
		}*/



	}

}
