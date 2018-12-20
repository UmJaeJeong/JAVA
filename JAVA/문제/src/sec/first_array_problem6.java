package sec;

public class first_array_problem6 {

	public static void main(String[] args) {
		
		for(int i=0; i<8;i++) {
			System.out.print("a["+i+"] :  " );
			for(int j=0; j<(int)((Math.random()*8)+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
	}

}
