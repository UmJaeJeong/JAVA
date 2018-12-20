package sec01_firstArray;

public class Array_Example06 {

	public static void main(String[] args) {
		
		char[] abc = new char[] {'A','B','C','D'};
		char[] num = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);//char[] �ȿ� ���� �״�� ���
		System.out.println(num);
		
		//�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length+num.length];
		
		//JAVA.lang.SystemŬ���� API����
		//abc : �����迭, 0: �迭�� 0��° �ε���, result : Ÿ�ٹ迭,
		//0 : Ÿ�ٹ迭�� �ε���, abc.length : 4��ŭ����)
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//�迭 abc�� �迭 num�� ù ��° ��ġ���� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num.toString());
		
		//number�� �ε���6 ��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);


	}

}
