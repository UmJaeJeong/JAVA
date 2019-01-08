package sec_verify09;

import java.util.Scanner;
import java.util.Vector;

public class ProductExample {
	static int productID = 0;
	static int numberOfProduct = 0;
	static Vector<Product> v = new Vector<Product>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0 ;
		while(x !=3) {
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>>");
			x = sc.nextInt();
			switch(x) {
			case 1://��ǰ �߰�
				System.out.println("��ǰ ���� å(1), ����CD(2), ȸȭå(3)>>");
				int choice = sc.nextInt();
				addProduct(choice);
				break;
				
			case 2: //����ǰ ��ȸ
				for(Product p : v) p.showInfo();
				break;
				
			case 3://������
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
				default:
					System.out.println("�߸� �����Ͽ����ϴ�.");
			}
			
		}
		sc.close();
	}
	
	public static void addProduct(int type) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ ����>>");
		String des = sc.nextLine();
		System.out.print("������>>");
		String maker = sc.nextLine();
		//sc.nextInt();
		System.out.print("����>>");
		int price = sc.nextInt();
		
		switch(type) {
		case 1://å
			System.out.print("����ǥ�ص�����ȣ>>");
			int ISBN1 = sc.nextInt();
			System.out.print("å ����>>");
			String title1 = sc.nextLine();
			sc.nextLine();
			System.out.print("����>>");
			String author1  = sc.nextLine();

			System.out.print("���>>");
			String lang = sc.nextLine();
			v.add(new ConversationBook(++productID,des,maker,price,ISBN1,title1,author1,lang));
			break;

		case 2://����
			System.out.print("�ٹ� ����>>");
			String albumTitle = sc.nextLine();
			sc.nextLine();
			System.out.print("����>>");
			String artist  = sc.nextLine();	
			v.add(new CompactDisc(++productID,des,maker,price,albumTitle,artist));
			break;
			
		case 3://ȸȭå
			System.out.print("å ����>>");
			String title = sc.nextLine();
			sc.nextLine();
			System.out.print("����>>");
			String author  = sc.nextLine();
			System.out.print("����ǥ�ص�����ȣ(ex.0001)0001");
			int ISBN = sc.nextInt();
			v.add(new Book(++productID,des,maker,price,ISBN,title,author));
			break;
		}
	}

}
