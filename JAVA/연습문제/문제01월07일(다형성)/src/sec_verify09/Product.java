package sec_verify09;

public class Product {
	private int productID;
	private String description;
	private String maker;
	private int price;
	
	public Product(int productID, String description, String maker, int price) {
		this.productID= productID;
		this.description = description;
		this.maker = maker;
		this.price = price;			
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void showInfo() {
		System.out.println("상품ID>>"+this.getProductID());
		System.out.println("상품 설명>>"+this.getDescription());
		System.out.println("가격>>"+this.getPrice()+"원");
	}
	
}
