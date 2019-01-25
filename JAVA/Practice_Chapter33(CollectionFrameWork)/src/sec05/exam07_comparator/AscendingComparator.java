package sec05.exam07_comparator;

import java.util.Comparator;

//Fruit��ü�� ������� �ϴ� ����(������)�� �����Ͽ� treeSet�� �����ڿ� �������ָ�
//Comparable�� �������� �ʾƵ� ������ ����������.
public class AscendingComparator implements Comparator<Fruit>{
	//���� �������������̳�, �̰� ���ϰ��� �ٲٸ� ���������� �ȴ�.
	//���� ������ ������ �ȴ�.
	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}else if(o1.getPrice() == o2.getPrice()) {
			return 0;
		}
		return 1;
	}
}
