package sec01_list.exam01_ArrayList01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		//asList()�� �÷����� �ƴ϶� �迭�������� �� �÷����� �����Ѵ�.
		List<String> list1 = Arrays.asList("ȫ�浿","����ȣ","��⸮"); //Arrays�ȿ� �ִµ� ListŸ������ �ٲ�� �̚�.
		
		//�Ʒ��� ���� ��ü �߰�, ������ �ϸ� java.lang.UnsupprotedOperationException�� �߻��Ѵ�.
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
		
		//�ڵ� ��ڽ�
		for(int value : list2)
			System.out.println(value);
		
		
	}

}
