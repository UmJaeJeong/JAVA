package sec_verify03;

public class AddressPersonExample {

	public static void main(String[] args) {
		AddressPerson ap = new AddressPerson();
		ap.insert(new Person("������", 10, "010-3268-1022"));
		ap.insert(new Person("�迬��", 25, "010-9985-4572"));
		ap.insert(new Person("���ڹ�", 60, "010-1785-4477"));
		ap.insert(new Person("��⸮", 58, "010-8507-5255"));
		ap.insert(new Person("���ڹ�", 75, "010-2235-5678"));
		
		System.out.println("�����ͺ��̽��� �����Ǿ����ϴ�!");
		System.out.println();
		ap.insert(new Person("���ڹ�", 60, "010-1785-4477"));
		ap.print();
		
		ap.delete("������");
		ap.delete("�տ���");
		ap.print();
		ap.update("���ڹ�", new Person("���ڹ�",39,"010-5587-8897"));
		ap.print();
	
	}

}
