package sec02_exam;

import java.util.Arrays;

public class ReferenceParamArrayMethod {

	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum="+sumArr(arr));
	}
	
	
	//�迭�� ��� ��Ҹ� ���
	static void printArr(int[] arr) {
		/*System.out.println("[");
		 * ���� for��
		 * for(int i: arr)
		 * System.out.println(i+",");
		 * System.out.println("]");
		 */
		System.out.println(Arrays.toString(arr));
	}
	
	
	//�迭�� ��� ����� ���� ��ȯ
	static int sumArr(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		}
	
	
	//�迭 �������� ����
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				//��������
				if(arr[j]>arr[j+1]) {
					int temp  = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
}
