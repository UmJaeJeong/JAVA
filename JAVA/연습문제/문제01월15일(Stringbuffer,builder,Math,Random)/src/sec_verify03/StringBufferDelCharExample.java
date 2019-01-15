package sec_verify03;

public class StringBufferDelCharExample {

	public static void main(String[] args) {
		System.out.println("(나는!자바를@사랑^^합니다.)"+" -> " + delCahr("(나는! 자바를@ 사랑^^합니다.)","(!@^)"));
		System.out.println("(1 2 3 4\t5)"+" -> " +delCahr("(1 2 3 4\t5)"," \t"));
	}
	
	public static String delCahr(String src, String delCh) {
		
		StringBuffer str = new StringBuffer(src.length());
		
		for(int i=0; i <src.length();i++) 
		{
			char ch = src.charAt(i);
			if(delCh.indexOf(ch)==-1) {
				str.append(ch);
			}
				
		}
		
		return str.toString();
	}
}
