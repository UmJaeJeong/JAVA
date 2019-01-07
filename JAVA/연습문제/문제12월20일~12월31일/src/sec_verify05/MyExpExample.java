package sec_verify05;

public class MyExpExample {
	public static void main(String[] args) {
		MyExp[] exp = new MyExp[2];
		for(int i=0; i<2;i++) exp[i] = new MyExp();
		exp[0].setBase(2);
		exp[1].setBase(3);
		exp[0].setExp(3);
		exp[1].setExp(4);
		
		for(MyExp ex : exp) {
			System.out.println(ex);
		}
		
	}
	
}
