package sec04_exam_throw;

public class ThrowExample03 {
	
	public static void main(String[] args){
		String file1 = creatFile("test.txt");
		String file2 = creatFile("");
		
		System.out.println(file1+" ������ ���������� �����Ǿ����ϴ�.");
		System.out.println(file2+" ������ ���������� �����Ǿ����ϴ�.");
	}
	
	public static String creatFile(String fileName) {
		
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		}catch(Exception e) {
			//fileName�� �� ������ ���, ���� �̸���  '�������.txt'�� �Ѵ�.
			fileName = "�������";
		}
		return fileName;
	}
	
}
