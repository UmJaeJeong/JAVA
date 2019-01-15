package sec_verify06;

public class RandomGraphExample {
	static int[] number = new int[100];
	static int[] counter = new int[10];
	public static void main(String[] args) {	
		for(int i=0; i<100;i++) {
			number[i] = (int)(Math.random()*10);
		}
		System.out.printf(printGraph('#',0));
		
	}
	public static String printGraph(char ch, int value) {
		String ret ="";
		for(int i=0; i<100;i++) {
			counter[number[i]]++;
		}
		
		for(int i=0; i<10;i++) {
			ret+=i+"ÀÇ °³¼ö :";
			for(int j=0;j<counter[i];j++) {
				ret+=ch;
			}
			ret+=" "+ counter[i]+"%n";

		}
		return ret;
	}

}
