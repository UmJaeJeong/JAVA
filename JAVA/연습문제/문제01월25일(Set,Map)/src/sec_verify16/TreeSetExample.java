package sec_verify16;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student("������", 96));
		treeSet.add(new Student("���ּ�", 86));
		treeSet.add(new Student("�赿��", 68));
		treeSet.add(new Student("�̴�ȣ", 100));
		treeSet.add(new Student("��ȣ��", 59));
		treeSet.add(new Student("������", 77));
		
		Iterator<Student> it = treeSet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("�л� �̸� : "+s.getName()+" , ���� : "+s.getScore());
		}
		Student s = treeSet.last();
		System.out.println("�ְ����� : "+s.getScore()+" , �л��̸�  : "+s.getName());
	}

}
