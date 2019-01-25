package sec05.exam06_treemap_comparable;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//Person이라는 사용자 정의 클래스를 저장하는 treeSet을 생성
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//Person클래스가 COmparable인터페이스를 구현하였기 떄문에,
		//Age에 따라서 오름차순으로 정렬이 되어있다
		treeSet.add(new Person("신은혁",9));
		treeSet.add(new Person("홍길동",35));
		treeSet.add(new Person("손연재",19));
		treeSet.add(new Person("김기수",19));
		treeSet.add(new Person("박연수",25));
		treeSet.add(new Person("손은정",21));
		treeSet.add(new Person("손민수",29));
		treeSet.add(new Person("김춘자",51));
		treeSet.add(new Person("박길후",61));
		treeSet.add(new Person("박길후",61));

		
		//오름차숭이 정렬이 된 것을 아래와 같이 확인할수 이싿.
		//(반복자를 얻어서 한번 출력해보라)
		//그런, 같은 나이라면, 중복 저장 되지 않는다.
		System.out.println("총 객체수: "+treeSet.size());
		for(Person person : treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("이름 : "+str+"  나이 : "+age);
		}
		System.out.println("총 객체 수 : "+treeSet.size());
		//반복자를 통한 출력
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println("이름 : "+p.getName()+"  나이 : "+p.getAge());
		}
		
		//내림차순
		System.out.println();
		System.out.println("내림차순 정렬");
		NavigableSet<Person> desending = treeSet.descendingSet();
		Iterator<Person> descit = desending.iterator();
		while(descit.hasNext()) {
			Person p = descit.next();
			System.out.println("이름 : "+p.getName()+"  나이 : "+p.getAge());
		}

	}

}
