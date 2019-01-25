package sec05.exam06_treemap_comparable;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//Person�̶�� ����� ���� Ŭ������ �����ϴ� treeSet�� ����
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//PersonŬ������ COmparable�������̽��� �����Ͽ��� ������,
		//Age�� ���� ������������ ������ �Ǿ��ִ�
		treeSet.add(new Person("������",9));
		treeSet.add(new Person("ȫ�浿",35));
		treeSet.add(new Person("�տ���",19));
		treeSet.add(new Person("����",19));
		treeSet.add(new Person("�ڿ���",25));
		treeSet.add(new Person("������",21));
		treeSet.add(new Person("�չμ�",29));
		treeSet.add(new Person("������",51));
		treeSet.add(new Person("�ڱ���",61));
		treeSet.add(new Person("�ڱ���",61));

		
		//���������� ������ �� ���� �Ʒ��� ���� Ȯ���Ҽ� �̚�.
		//(�ݺ��ڸ� �� �ѹ� ����غ���)
		//�׷�, ���� ���̶��, �ߺ� ���� ���� �ʴ´�.
		System.out.println("�� ��ü��: "+treeSet.size());
		for(Person person : treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("�̸� : "+str+"  ���� : "+age);
		}
		System.out.println("�� ��ü �� : "+treeSet.size());
		//�ݺ��ڸ� ���� ���
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println("�̸� : "+p.getName()+"  ���� : "+p.getAge());
		}
		
		//��������
		System.out.println();
		System.out.println("�������� ����");
		NavigableSet<Person> desending = treeSet.descendingSet();
		Iterator<Person> descit = desending.iterator();
		while(descit.hasNext()) {
			Person p = descit.next();
			System.out.println("�̸� : "+p.getName()+"  ���� : "+p.getAge());
		}

	}

}
