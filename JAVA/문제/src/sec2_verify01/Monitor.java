package sec2_verify01;

public class Monitor {
	String company;
	int inch;
	int price;
	
	Monitor(){
		this("LG",23,500000);
	}
	
	Monitor(String company, int inch, int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
}
