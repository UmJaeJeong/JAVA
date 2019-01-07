package sec;

public class first_array_problem10 {

	public static void main(String[] args) {
		
		int[] code = new int[] {22,57,11,32,91,68,70};
		for(int i=0; i<code.length;i++) {
			System.out.println("code["+i+"] = "+code[i]);

		}
		System.out.println();
		for(int i=0; i<code.length;i++) {
			System.out.println("code["+i+"] = "+code[code.length-1-i]);
		}
		
		
		
	}

}
