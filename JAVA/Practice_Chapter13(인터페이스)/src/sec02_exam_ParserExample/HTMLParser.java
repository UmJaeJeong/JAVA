package sec02_exam_ParserExample;

//Parser : �м��ϴ»��
public class HTMLParser implements Parserable{
	@Override
	public void parse(String fileName) {
		//���� �м��۾��� �����ϴ� �ڵ带 ���´�
		System.out.println(fileName+"-XML ���� �м� �Ϸ�!");
	}
}
