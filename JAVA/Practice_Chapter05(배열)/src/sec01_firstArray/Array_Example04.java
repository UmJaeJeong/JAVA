package sec01_firstArray;

public class Array_Example04 {

	public static void main(String[] args) {
		// String �� Ŭ�����̱� ������ String�迭�� 2�����迭�� �����ϴ�.
		//String[] names = {"Kim","Park","Yi"};
		String[] names = new String[3];//�⺻�� null
		names[0] = new String("�迬��");
		names[1] = new String("�տ���");
		names[2] = new String ("����");
		
		for(int i=0; i<names.length;i++) {
			System.out.println("names["+i+"]"+names[i]);
		}
		
		String tmp = names[2];//�迭 names�� ����° ��Ҹ�  tmp�� ����
		System.out.println("tmp :"+tmp);
		
		names[0] = "Yu";//�迭 names�� ù ��° ��Ҹ� "Yu"�� ����
		
		for(int i =0; i<names.length;i++) {
			System.out.println("names["+i+"]"+names[i]);

		}
		

	}

}
