package sec05.exam07_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CromparatorExample {

	public static void main(String[] args) {
		// Fruit ��������� Ŭ������ ������ TreeSet�� ������. ��, ������ ���� Comparator<>��
		// �������ش�.
		TreeSet<Fruit> treeSet = new TreeSet<>(new AscendingComparator());
		
		//�͸�����ü ��밡��
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

		// treeSet�� Fruit��ü�� �߰��Ѵ�.
		// ���⼭ FruitŬ������ Comparable<>�������̽��� �������� �ʰų�, Comparator<>��
		// �������� ������ ClassCastException�� �߻��Ѵ�.
		// try {
		treeSet.add(new Fruit("����", 6500));
		treeSet.add(new Fruit("����", 4200));
		treeSet.add(new Fruit("������", 3500));
		treeSet.add(new Fruit("�ٳ���", 3400));
		treeSet.add(new Fruit("�ڵ�", 2500));
		treeSet.add(new Fruit("ȣ��", 1000));
		// }catch(Exception e) {
		// System.out.println("���ı��ؾ���");
		// e.getMessage();
		// }
		System.out.println("�� ��ü�� : " + treeSet.size());
		// �ݺ��ڸ� ��´�.
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			Fruit f = it.next();
			System.out.println(f.getName() + " : " + f.getPrice());
		}

	}

}
