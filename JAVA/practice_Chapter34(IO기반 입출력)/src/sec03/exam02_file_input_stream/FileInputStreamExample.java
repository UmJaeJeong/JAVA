package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception{
		//FileInputStream("D:\\JAVA\\Practice_Chapter34(IO ��� �����)\\src\\sec03\\exam02_file_input_stream);
		//\�� �̽������� ���ڱ� ������ �Ʒ��� ���� /�� �ٲ��ش�.
		//���� �ҽ��ڵ带 �ֿܼ� ����غ��� ���α׷��̴�.
		FileInputStream fis = new FileInputStream("D:\\JAVA\\Practice_Chapter34(IO ��� �����)\\src\\sec03\\exam02_file_input_stream\\FileInputStreamExample.java");
		
		int data;
		int i=0;
		//�� ����Ʈ�� �д´�.
		while((data = fis.read())!=-1) {
			System.out.write(data);
			//�ܼ� ���System.out.print()���, �ѱ��� 2����Ʈ�̱� ������
			//������. �׷��� ������ ����Ʈ �迭�� �ϴ°��� ���� �ϴ�.
			//System.out.print((char)data);
			i++;
			
		}
		System.out.println("���� �� :"+i);
		fis.close();
		
		
		
	}

}
