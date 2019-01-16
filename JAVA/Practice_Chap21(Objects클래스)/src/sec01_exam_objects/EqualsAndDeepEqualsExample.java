package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	
	public static void main(String[] args) {		
		
		Integer o1 = new Integer(1000);  		
		Integer o2 = new Integer(1000);
		
		//o1.equals(o2) --> Object�� equals�� �������̵� �Ǿ� �ִ�.
		//Wrapper��ü���� ���� equals()�� �������̵� �Ǿ� �ִ�.
		System.out.println(o1.equals(o2));
		
		//���� ���� ������ �Ǵ� ��ü�� �񱳰� �Ǵ� ��ü�� �и��س��� �����̴�.
		//�׷��� �Ǹ� �������� ���鿡�� ����� ������ ���̴�.
		
		//Object�� equals�� �����ѵ� ���⼭�� �񱳴�� �ٺ��� Integer���� �������.
		System.out.println(Objects.equals(o1, o2));  
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));		
		//Object�� equals�� �����ѵ� ���⼭�� �񱳴�� �ٺ��� Integer���� �������.
		System.out.println(Objects.deepEquals(o1, o2)+"\n");
		
		Integer[] arr1 = { new Integer(1), new Integer(2) }; 
		Integer[] arr2 = { 1, 2 }; //2���� Ŭ������ ����Ǿ� �ִ� ����
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}
}
