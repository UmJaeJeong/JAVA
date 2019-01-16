package sec_verify02;

import java.util.Objects;

public class Monitor {
	private String model;
	private int inch;
	private int price;
	
	public Monitor(String model, int inch, int price){
		this.model = model;
		this.inch = inch;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.model, this.inch, this.price);
	}
}
