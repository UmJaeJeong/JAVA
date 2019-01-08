package sec_verify09;

public class Book extends Product{
	
	private int ISBN;
	private String title;
	private String author;
	
	
	public Book(int productID, String description, String maker, int price, int ISBN, String title, String author) {
		super(productID, description, maker, price);
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}


	public int getISBN() {
		return ISBN;
	}


	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("국제표준도서번호>>"+this.getISBN());
		System.out.println("책 제목>>"+this.getTitle());
		System.out.println("저자>>"+this.getAuthor());
	}
}
