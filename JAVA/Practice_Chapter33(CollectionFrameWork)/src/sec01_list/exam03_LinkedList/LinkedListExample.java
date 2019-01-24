package sec01_list.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		DecimalFormat df = new DecimalFormat("#,###");
		long startTime;	//���۰�
		long endTime;	//���ᰪ
		
		//startTime = System.nanoTime();	//10�� ���? -9�� �ϸ�(-3)->����ũ��(-6)->����(-9)
		startTime = System.currentTimeMillis();	//10�� ���?
		for(int i=0; i<100000;i++) {
			//ArryList�� 0��° �ε����� ��������� i�� ���Խ�Ų��.
			//StringŬ������ valueOf�� �����޼��带 ȣ���Ͽ� ���� Stringȭ ��Ŵ
			list1.add(0,String.valueOf(i));	//add�� �ε����� �߰��Ͽ��⿡ ������ �ȴ� �׷��Ƿ� �迭���簡 �Ͼ��.
		}
		
		//endTime = System.nanoTime();
		endTime = System.currentTimeMillis();	//�� �и� ����ũ�� ���� 
		System.out.println("ArryList�ɸ��ð�: "+df.format((endTime-startTime))+" ms");
		
		//startTime = System.nanoTime();
		startTime = System.currentTimeMillis();
		for(int i=0; i<100000;i++) {
			list2.add(0,String.valueOf(i));	//add�� �ε����� �߰��Ͽ��⿡ ������ �ȴ� �׷��Ƿ� �迭���簡 �Ͼ��.
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList�ɸ��ð�: "+df.format((endTime-startTime))+" ms");
		
		//��������� �������� �߰� �� ���������� ArrayList���� LinkedList��
		//�ξ� ���� ������ �����Ѵ�.
	}
}
