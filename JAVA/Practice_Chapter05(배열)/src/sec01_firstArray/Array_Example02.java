package sec01_firstArray;

public class Array_Example02 extends Object{

	public static void main(String[] args) {
		int sum =0;//������ �����ϱ����� ����
		float average = 0.0f;//������ �������. ������?
		
		//����� ���ÿ� �ʱ�ȭ
		int[] score = new int[] {100,88,100,100,90};
		
		System.out.println("�迭�� ���� : "+score.length);
		
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
		}
		
		//������� flaot�� �������
		average = sum/(float)score.length;
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);

	}

}
