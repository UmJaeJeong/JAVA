package sec_verify09;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Test");
		File[] f = file.listFiles();
		

		for (int i = 0; i < f.length; i++) {
			if (f[i].exists()) {
				if (f[i].delete())
					System.out.println(f[i] + "�� ���� �Ͽ����ϴ�.");
				else
					System.out.println("���ϻ��� ����");
			} else {
				System.out.println("������ ������ �����ϴ�.");
			}
		}
	}

}
