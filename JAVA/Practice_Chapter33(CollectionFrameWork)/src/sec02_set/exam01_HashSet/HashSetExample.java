package sec02_set.exam01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//Set�迭�� �ߺ� ������ �ȵȴ�. �ƿ﷯ �ε����� ������ �ȵȴ�.
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		int size = set.size();
		
		//����� 4�̴�. ������? set�� ���Ͼ� ���� �߰����� �ʴ´�.
		System.out.println("�� ��ü�� : "+size);
		
		//�ݺ��ڸ� set�� ���ؼ� ��´�.
		Iterator<String> iterator = set.iterator();
		//�����ð� �ִ���? ������ true, ������ false�� ����
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		size = set.size();
		
		System.out.println();
		System.out.println("�� ��ü�� : "+size);
		
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��ü�� �����ϴ�");
		}else {
			System.out.println("��ü�� �����մϴ�.");
		}
	}

}
