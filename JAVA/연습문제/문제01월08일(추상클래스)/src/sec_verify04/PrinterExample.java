package sec_verify04;

public class PrinterExample {

	public static void main(String[] args) {
		InkjetPrinter ip  = new InkjetPrinter("SCX-6x45","삼성전자",1,2,10);
		LaserPrinter lp = new LaserPrinter("Officejet V40","HP",2,4,5);
		
		for(int i=0; i<5; i++) 
		{
			System.out.println();
			lp.print();
			
			System.out.println("제조사: " + lp.getManufacturer());
			System.out.println("모델명: " + lp.getModelName());
			
			System.out.print("레이저프린터>>");
			System.out.print("인쇄용지:" + lp.getNumberOfPaper());
			System.out.print(" 출력매수:" + lp.numberOfPrinted);
			System.out.println(" 토너잔량:" + lp.getAmountOfToner());
			
			System.out.println();
			
			ip.print();			
			System.out.println("제조사: " + ip.getManufacturer());
			System.out.println("모델명: " + ip.getModelName());
			
			System.out.print("잉크젯프린터>>");
			System.out.print("인쇄용지:" + ip.getNumberOfPaper());
			System.out.print(" 출력매수:" + ip.numberOfPrinted);
			System.out.println(" 잉크잔량:" + ip.getAmountOfInk());
		}
	}

}
