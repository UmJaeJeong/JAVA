package sec_verify16;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student("신은혁", 96));
		treeSet.add(new Student("김주성", 86));
		treeSet.add(new Student("김동주", 68));
		treeSet.add(new Student("이대호", 100));
		treeSet.add(new Student("김호주", 59));
		treeSet.add(new Student("이주희", 77));
		
		Iterator<Student> it = treeSet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("학생 이름 : "+s.getName()+" , 점수 : "+s.getScore());
		}
		Student s = treeSet.last();
		System.out.println("최고점수 : "+s.getScore()+" , 학생이름  : "+s.getName());
	}

}
