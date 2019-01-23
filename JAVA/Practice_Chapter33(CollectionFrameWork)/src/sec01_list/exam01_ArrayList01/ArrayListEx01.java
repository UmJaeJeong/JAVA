package sec01_list.exam01_ArrayList01;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		/*
		 *ArrayList�� ���� ���׸�Ÿ���̴�. �׷��� warning�� ���.
		 *���� ���ְ� �ʹٸ� Quick Access���� Error�� �Է��ϰ� Preference��
		 *���� Generics�ǿ� �ִ� ���� ��� ignore�� �ٲٸ� �ȴ�.
		 */
		ArrayList list = new ArrayList();	//�⺻������ 10���� ���� ������ 
		
		System.out.println("�� ũ�� : "+ list.size());
		list.add("111");	//boolean add(Object o) -- �ǳ� �ε����� �߰��Ѵ�.
		list.add("222");
		list.add("333");
		list.add("222");
		
		//add(new Integer(333)); JDK 1.5���� �߰��� �ڵ��ڽ̱�� �̿�(����Ŭ����)
		list.add(333);
		
		System.out.println("�� ũ�� : "+list.size());
		System.out.println("ArrayList �ּ� : "+list.hashCode());
		System.out.println("ArrayList�� �ִ� �� :"+list.toString());
		
		//0��° �ε����� ���� ���� ������ ������ ������ �ڷ� �з����� �ȴ�.
		list.add(0,"333");
		System.out.println("ArrayList �ּ� : "+list.hashCode());
		System.out.println("ArrayList�� �ִ� �� :"+list.toString());
		
		
		//�տ��� ���� �˻��Ͽ� "333"�� �����Ѵ�.(����� �� �Ѱ��� ����)
		//boolean remove(Object o)
		list.remove("333");
		System.out.println("ArrayList �ּ� : "+list.hashCode());
		System.out.println("ArrayList�� �ִ� �� :"+list.toString());
		
		System.out.println(list.remove("333"));
		//indexOf()�� ����� -1�̶�� ���� ArrayList�� "333"�� ���ٴ� ���̴�.
		System.out.println("ArrayList�� �ִ� �� : "+list.toString());
		System.out.println("index = "+list.indexOf(333));

		System.out.println("ArrayList�� �ִ� �� :"+list.toString());

		//ArrayList�� �� �ε����� �� ����(set(index,Object))�̿�
		for(int i=0; i<list.size();i++) {
			list.set(i, i+"");
		}
		
		//ArrayList�� �� �ε����� �� ���(get(index)�� �̿�)
		System.out.print("{");
		for(int i=0; i<list.size();i++) {
			if(i==list.size()-1) 
				System.out.print(list.get(i));
			else
				System.out.print(list.get(i)+",");
		}
		System.out.println("}");
		//ArrayList�� �� �ε����� �� ���� remove(index)�̿�
		/*
		 * for(int i=0; i<list.size();i++){
		 * 	list.remove(i);
		 * }
		 */
		
		//System.out.println(list);
		/*
		 * �� ������ �������� �ұ��ϰ� 1,3�� ���� �ִ�. ���ϱ�?
		 * 0�� �����Ҷ��� i�� 0�̴� �翬�� ������ �ȴ�. ������ 0�� �������� �� �ڿ� ������ 
		 * �� ������ ����� �ð��̴�. �׷� ���� ���� �����ҷ��� ���� i���� 1�̴�. �Ͽ� 1�� ��������
		 * �ʰ� 2�� �����ϴ� ���̴�. �׸����� �׷����� �� ���ذ� �� ���̴�.
		 * ���ذ� �Ǿ����� ArrayList�� �ε����� �ڿ������� ������ �Ͽ� 
		 * ����� ������ ���� �˼��� �ִ�.
		 */
		System.out.println(list);
		
		//�Ʒ��� ���� ������ �ϸ� ArrayIndexOutofBoundsException�� �߻��Ѵ�. ���ϱ�?
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		//list.clear();
		System.out.println(list);
	}

}
