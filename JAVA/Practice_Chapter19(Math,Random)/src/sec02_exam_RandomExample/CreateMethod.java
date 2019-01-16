package sec02_exam_RandomExample;

import java.util.Arrays;

public class CreateMethod {
	//���⿡�� ���� getRand, fillRand�� ���� �޼���� ���� ���� ���̴�.
	//API���� �������� ������ ���� �ڱⰡ ���� ����ϰ� �����ϸ� ����.
	//(���� ���������� ���� �޼���鵵 ����.)
	public static void main(String[] args) {
		//Random rand = new Random();
		for(int i=0; i<10;i++) {
			System.out.println(getRand(5,10)+",");
			System.out.println();
			int[] result = fillRand(new int[100], new int[] {2,3,7,5});
			System.out.println(Arrays.toString(result));
		}

	}	
		//�����ε� ��
		//arr�� from���� to������ ���� �������� �߻����� ������
		public static int[] fillRand(int[] arr, int from, int to) {
			for(int i=0; i<arr.length;i++) {
				arr[i] = getRand(from,to);
			}
			return arr;
		}
		
		//arr�� data�迭�� ������ ä���� ����
		public static int[] fillRand(int[] arr, int[] data) {
			for(int i=0; i<arr.length;i++) {
				arr[i] = data[getRand(0,data.length-1)];
			}
			return arr;
		}
		//������ ���� �������� ����
		public static int getRand(int from, int to) {
			return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
		}
	

}