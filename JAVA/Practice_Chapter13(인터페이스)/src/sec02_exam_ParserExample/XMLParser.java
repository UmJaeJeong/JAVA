package sec02_exam_ParserExample;

//Parser : �м��ϴ»��
public class XMLParser implements Parserable{
	@Override
	public void parse(String fileName) {
		//���� �м��۾��� �����ϴ� �ڵ带 ���´�
		System.out.println(fileName+"-HTML ���� �м� �Ϸ�!");
	}
}
