package sec2_verify04;

public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;
	Goods(String name, int price, int numberOfStock, int sold){
		this.name= name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNumberOfStock() {
		return numberOfStock;
	}
	
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	
	public int getSold() {
		return sold;
	}
	
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.price+" "+this.numberOfStock+" "+this.sold;
	}
	
}
