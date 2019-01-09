package sec02_exam_ParserExample;

public class ParserManager {
	/*
	 * main()�� static�̹Ƿ� static���� �����ؾ��Ѵ�.
	 * �ƿ﷯ ����Ÿ���� �������̽� Ÿ���̶�� ���� �� �������̽���
	 * ������ Ŭ���Ž��� ���ؼ� �ν��Ͻ��� ��ȯ�ϰڴٴ� �ǹ��̴�.
	 * 
	 */
	
	public static Parserable getParser(String type) {
		//String�� equals�� �� ���Ѵ�.
		//��ü�� �񱳴� �⺻������ �ּҺ��̴�.
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			//�������̽� �ʵ��� ������
			Parserable p = new HTMLParser();
			return p ;
			//return new HTMLPArser();
		}
		
	}
}
