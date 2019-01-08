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
			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3)>>");
			x = sc.nextInt();
			switch(x) {
			case 1://상품 추가
				System.out.println("상품 종류 책(1), 음악CD(2), 회화책(3)>>");
				int choice = sc.nextInt();
				addProduct(choice);
				break;
				
			case 2: //모든상품 조회
				for(Product p : v) p.showInfo();
				break;
				
			case 3://끝내기
				System.out.println("프로그램을 종료합니다.");
				break;
				
				default:
					System.out.println("잘못 선택하였습니다.");
			}
			
		}
		sc.close();
	}
	
	public static void addProduct(int type) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 설명>>");
		String des = sc.nextLine();
		System.out.print("생산자>>");
		String maker = sc.nextLine();
		//sc.nextInt();
		System.out.print("가격>>");
		int price = sc.nextInt();
		
		switch(type) {
		case 1://책
			System.out.print("국제표준도서번호>>");
			int ISBN1 = sc.nextInt();
			System.out.print("책 제목>>");
			String title1 = sc.nextLine();
			sc.nextLine();
			System.out.print("저자>>");
			String author1  = sc.nextLine();

			System.out.print("언어>>");
			String lang = sc.nextLine();
			v.add(new ConversationBook(++productID,des,maker,price,ISBN1,title1,author1,lang));
			break;

		case 2://음악
			System.out.print("앨범 제목>>");
			String albumTitle = sc.nextLine();
			sc.nextLine();
			System.out.print("가수>>");
			String artist  = sc.nextLine();	
			v.add(new CompactDisc(++productID,des,maker,price,albumTitle,artist));
			break;
			
		case 3://회화책
			System.out.print("책 제목>>");
			String title = sc.nextLine();
			sc.nextLine();
			System.out.print("저자>>");
			String author  = sc.nextLine();
			System.out.print("국제표준도서번호(ex.0001)0001");
			int ISBN = sc.nextInt();
			v.add(new Book(++productID,des,maker,price,ISBN,title,author));
			break;
		}
	}

}
