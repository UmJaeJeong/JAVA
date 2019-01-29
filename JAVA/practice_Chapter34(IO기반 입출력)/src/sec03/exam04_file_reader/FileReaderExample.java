package sec03.exam04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	// ���࿡ XXXStream�� �پ��� �׷��� byte���
	// XXXReader or XXXWriter �پ��� �ϸ� char����̴�.
	public static void main(String[] args) throws Exception {
		// FileReader�� ���� ������ �б� ������ , �ؽ�Ʈ�� �ƴ�
		// �׸�, �����, ���� ���� �ğ��� ���� �� ������ �˵��� ����.
		FileReader fr = new FileReader(
				"D:\\JAVA\\Practice_Chapter34(IO ��� �����)\\src\\sec03\\exam03_file_reader\\FileReaderExample.java");
		int readCharNo;
		char[] cbuf = new char[10000];
		int i = 0;
		// ���ڿ��� ������ ���ڹ迭�� �����ϰ� ���� ���ڹ���Ʈ ���� �����Ѵ�.
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			i++;
		}
		System.out.write(13);
		System.out.println("���μ� : " + i);
		fr.close();
	}

}
