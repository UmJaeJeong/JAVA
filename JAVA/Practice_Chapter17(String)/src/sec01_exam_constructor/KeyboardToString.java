package sec01_exam_constructor;

import java.io.IOException;
import java.util.Arrays;

public class KeyboardToString {
	// JVM���� ���ܸ� ����
	public static void main(String[] args) {
		byte[] bytes = new byte[100];// �⺻�� 0���� ����
		System.out.print("�Է� : ");
		// Ű����� �Է¹޴´�.(�Է¹޴� ����Ʈ���� ����)
		int readByteNo;

		try {
			readByteNo = System.in.read(bytes);

			String str = new String(bytes, 0, readByteNo - 2);
			// byte[] b = str.getBytes("UTF-8");
			byte[] b = str.getBytes("EUC-KR"); //�⺻������ EUC-KR�� �Ǿ��ִ� 
			System.out.println("Stringrkqt : "+str);
			System.out.println("byte[] �� :"+Arrays.toString(b));
			System.out.println("�Է¹��� ����Ʈ ��"+readByteNo);
		} catch (IOException e) {
			
		}

	}

}
