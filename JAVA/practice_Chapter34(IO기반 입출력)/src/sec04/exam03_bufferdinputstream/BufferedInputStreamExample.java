package sec04.exam03_bufferdinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception{

		long start = 0;
		long end = 0;

		// ����Ʈ ������� �ӵ��� ���̸� ���� ���� ���α׷��̴�.
		// (������ PC������ 233������ ���̰� ����. ���� PC�� ��翡 ���� ���̴� ������ ���̴�./)
		FileInputStream fis1 = new FileInputStream("D:\\JAVA\\Practice_Chapter34(IO ��� �����)\\src\\sec03\\exam03_file_output_stream\\KakaoTalk_20190106_042323052.jpg");

		System.out.println("����Ʈ ��� �б� ����");
		start = System.currentTimeMillis(); // �б��� �ð� ����
		// �׳� �б⸸�Ѵ�.
		while ((fis1.read()) != -1) {
		}
		System.out.println("����Ʈ ��� �б� ��");
		end = System.currentTimeMillis();
		System.out.println("���۸� ������� �ʾ��� ��(����Ʈ���) : " + (end - start) + "ms");
		fis1.close();
		
		System.out.println();
		//���Է� ��Ʈ�� FileInputStream���ٰ� �ӵ������ ������Ʈ���� BufferedInputSTream�� ������.
		//Ȥ�� �߸� �����Ҽ��� �ִµ�, BufferedInputStream�� ���� ��Ʈ���̱� ������ ������
		//�о�ü��� ����.
		FileInputStream fis2 = new FileInputStream("D:\\JAVA\\Practice_Chapter34(IO ��� �����)\\src\\sec03\\exam03_file_output_stream\\KakaoTalk_20190106_042323052.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		System.out.println("���� ��� �б� ����");
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		System.out.println("���۱�� �б� ��");
		end = System.currentTimeMillis();
		System.out.println("���۸� ����� ���(���۱��) : " + (end - start) + "ms");
	}

}
