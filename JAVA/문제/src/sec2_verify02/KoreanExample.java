package sec2_verify02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean[] ko  = new Korean[2];
		ko[0] = new Korean("���ѹα�","����",178,26,"�뱸������");
		ko[1]= new Korean("USA","�����",172,29,"��� ����");
		int i=0; 
		for(Korean k : ko) {
			if(i==0) {
				System.out.println("ù ��° ���� �������Դϴ�.");
				i++;
			}else {
				System.out.println("�� ��° ���� �������Դϴ�.");

			}
			System.out.println("����    :"+k.nation);
			System.out.println("�̸�    :"+k.name);
			System.out.println("Ű      :"+k.height);
			System.out.println("Ư¡    :"+k.character);
		}
	}

}
