package sec_verify04;

public class LaserPrinter extends Printer{

	static final int amountOfTonerToPrint = 10;
	private int amountOfToner;
	
	public LaserPrinter(String modelName, String manufacturer, int type, int numberOfPaper, int amountOfToner) {
		super(modelName, manufacturer, type, numberOfPaper);
		this.amountOfToner = amountOfToner;
	}
	
	public int getAmountOfToner() {
		return this.amountOfToner;
	}

	@Override
	public boolean print() {
		if (amountOfToner <= 0) 
		{
			System.out.println("토너가 부족합니다.");
			return false;
		}
		if (numberOfPaper <= 0) 
		{
			System.out.println("인쇄 용지가 부족합니다.");
			return false;
		}
		System.out.println("레이저 프린터 출력");
		amountOfToner -= amountOfTonerToPrint; 
		numberOfPaper--;   					  
		numberOfPrinted++; 					 
		return true;
		
	}
	
	

}
