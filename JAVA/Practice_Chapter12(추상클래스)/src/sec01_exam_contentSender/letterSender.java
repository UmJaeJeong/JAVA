package sec01_exam_contentSender;

public class letterSender extends ContentSender{

	String content;
	//������
	public letterSender(String title, String nm, String content) {
		super(title, nm);
		this.content = content;
	}
	
	//����Ŭ������ �߻�޼����� sendMsg() ��ӹ޾� �������̵� �Ѵ�.
	@Override
	public void sendMsg(String recipient) {
		System.out.println("���� = "+this.title);
		System.out.println("�̸� = "+this.nm);
		System.out.println("���� = "+this.content);
		System.out.println("�޴»�� = "+recipient);

	}
	
}
