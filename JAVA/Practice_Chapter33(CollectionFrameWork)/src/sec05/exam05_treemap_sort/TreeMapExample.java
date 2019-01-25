package sec05.exam05_treemap_sort;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		//Ű�� Integer ������ StringŸ���� ���
		TreeMap<Integer, String> scores = new TreeMap<>();
		//map��ü 5���� �������� ����������,treemap�� ����Ʈ���� ���ؼ� �ڵ� ������ �ȴ�.
		//scores.put(87,"ȫ�浿");	�̷��� �ۼ��ص� �Ǵ� �� �˰� �ִ�.
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		//Ű�� ������ ���������� �Ѵ�. ������ ���Ͻÿ��� ���������� �� Map.Entry��ü�� �����Ѵ�.
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		//�������� �� descendingMap�� entrySet�� ��� Set�� �����Ѵ�.
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		
		//�������� �� Map.Entry��ü�� �ϳ��� ����Ѵ�.
		System.out.println("---���� ���� ---");
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : "+value+" - "+"��: "+str);
		}
		System.out.println();
		//�������� �Ǿ��ִ� Map�÷����� �ٽ� ������������ �����ϸ� ������ ���������� �ȴ�.
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		//�������� �� ascendingMap�� entrySet�� ��� set�� ����
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		//�������� �� Map.Entry��ü�� �ϳ��� ����� ����.
		System.out.println("---���� ����---");
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : "+value+" - "+"��: "+str);
		}
		System.out.println();
		//�Ʒ��κ��� Ű�� ������ �ݺ��ڷ� ����� �غ��Ҵ�. ���� ���������̴�.
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("Ű : "+value+" - �� : "+str);
		}
		
		

	}

}
