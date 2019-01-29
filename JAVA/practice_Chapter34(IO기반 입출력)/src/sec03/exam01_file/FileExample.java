package sec03.exam01_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception{
		File dir = new File("C:/Temp/dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		//���� PC�̱� ������ localhost�� �����ص� �����ϴ�
		
		//URI�� ���� ���� �ڿ� �ĺ���(Uniform Resource Identifier, URI)��
		//���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ּҸ� ���Ѵ�.
		//URI�� ����� ���ͳݿ��� ��Ǵ� �⺻�������μ� ���ͳ� ��������
		//(��� ���)�� �ٴ´�.
		//���� ���α׷��ֿ��� ���� ������ ������ �˵��� ����
		//��������(HTTP Ȥ�� FTP) + : + / + ȣ��Ʈ�̸� �ּ�
		
		//���� IP�ּҳ� ȣ��Ʈ�ּҰ� �;��Ѵ�.
		//File file3 = new File("file://localhost/C:/temp/file3.txt");
		//URI�� �����̶�� scheme�� �ʿ��ϴ�.
		//URIǥ����� ������ �ƴ��ϸ� IllegaArgumentException���� �߻���
		//File file3 = new File(new URI("C:/temp/file3.txt"));
		
		//dir���丮�� �����ϴ°�?
		if(dir.exists() == false) {
			//dir.mkdirs(); //�θ���丮�� �������� �ƴ��ϰ� �ڽŸ� �����Ѵ�.
			//��λ� ���� ���丮�� �� �����Ѵ�.(�����Ѵ�.) �־
			//����ϱ� ���̴�.
			dir.mkdirs();
		}
		
		if(file1.exists() == false) {
			//���� C://Temp/file1.txt��ο� Temp���丮�� ���ٸ� IOException��
			//�߻��ϹǷ� �ݵ�� ���丮 �����̳� ��θ� �� �����ؾ��Ѵ�.
			file1.createNewFile();
		}
		if(file2.exists()==false) file2.createNewFile();
		if(file3.exists()==false) file3.createNewFile();
		
		//File��ü�� �ϳ� �����.
		File temp = new File("C:/Temp");
		//Temp ���� ������丮 �� ������ ���� �迭�� �����Ͽ� ������
		File[] contents = temp.listFiles();
		System.out.println("��¥	     �ð�		����		ũ��	�̸�");
		System.out.println("------------------------------------------------------");
		
		//������¥��������¸� �����ϱ� ���� �Ʒ��� ���� SimpleDataFormat��ü�� �����Ѵ�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		//���� ���� Filep[�� ����غ���.
		for(File file : contents) {
			//������ ������ ��¥�� �Ű������� Data��ü�� �����Ͽ� SimpleDataFormat��ü��
			//format()�� �Ű�Ÿ������ �ش�.
			System.out.print(sdf.format(new Date(file.lastModified())));
			//file�� ���丮�̳�?
			if(file.isDirectory()) {
				//���丮 �̸� ���
				System.out.print("\t<DIR>\t\t"+file.getName());
			}
			//file�̸�
			else {
				//���� ũ��� �̸� ���
				System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}

	}
//DB ���� ��Ű�� : �� �з��� ��� ���� �Ѵ�  ��Ű���� �и����ش� (�и���, ������, ����? ����)
	//
}
