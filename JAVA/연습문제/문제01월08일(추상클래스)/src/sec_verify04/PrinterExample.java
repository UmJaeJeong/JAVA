package sec_verify04;

public class PrinterExample {

	public static void main(String[] args) {
		InkjetPrinter ip  = new InkjetPrinter("SCX-6x45","�Ｚ����",1,2,10);
		LaserPrinter lp = new LaserPrinter("Officejet V40","HP",2,4,5);
		
		for(int i=0; i<5; i++) 
		{
			System.out.println();
			lp.print();
			
			System.out.println("������: " + lp.getManufacturer());
			System.out.println("�𵨸�: " + lp.getModelName());
			
			System.out.print("������������>>");
			System.out.print("�μ����:" + lp.getNumberOfPaper());
			System.out.print(" ��¸ż�:" + lp.numberOfPrinted);
			System.out.println(" ����ܷ�:" + lp.getAmountOfToner());
			
			System.out.println();
			
			ip.print();			
			System.out.println("������: " + ip.getManufacturer());
			System.out.println("�𵨸�: " + ip.getModelName());
			
			System.out.print("��ũ��������>>");
			System.out.print("�μ����:" + ip.getNumberOfPaper());
			System.out.print(" ��¸ż�:" + ip.numberOfPrinted);
			System.out.println(" ��ũ�ܷ�:" + ip.getAmountOfInk());
		}
	}

}
