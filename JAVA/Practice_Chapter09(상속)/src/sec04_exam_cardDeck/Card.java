package sec04_exam_cardDeck;

public class Card {
	//������ ���ƾ� �� ���� ��, ����������
	static final int KIND_MAX = 4;//ī�幫�� ��
	static final int NUM_MAX = 13;//���̺� ī���
	
	//���̸� ����� ����
	static final int SPADE = 4;//ī�幫�� ��
	static final int DIAMOND = 3;//ī�幫�� ��
	static final int HEART = 2;//ī�幫�� ��
	static final int CLOVER = 1;//ī�幫�� ��
	
	
	//�������
	int kind;
	int number;
	
	//������
	public Card() {
	
		this(SPADE,1);//�ٸ� ������ ȣ��
	}
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	
	@Override
	public String toString() {
		System.out.println("toString ȣ��");
		String kind="";
		String number="";
		
		//���̼���
		switch(this.kind){
		case 4:
			kind = "�����̵�";
			break;
		case 3:
			kind = "���̾Ƹ��";
			break;
		case 2:
			kind = "��Ʈ";
			break;
		case 1:
			kind = "Ŭ�ι�";
			break;
		}
		
		//���ڼ���
		switch(this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default : 	
			number = Integer.toString(this.number);
		}
		
		return "���̴�"+kind+", ���ڴ�"+number;
	}

}
