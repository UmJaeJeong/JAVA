package sec_verify05;

public class CircleExample {

	public static void main(String[] args) {
		 Circle[] c =new Circle[] {
				 new Circle(1,2,10), new Circle(5,6,10)
		 };
		 
		 int i=1;
		 for(Circle a : c) {
			 System.out.println("원"+i+" "+a);
			 i++;
		 }
		 
		 if(c[0].equals(c[1])) {
			 System.out.println("원 1과 원 2는 같은 원입니다.");
		 }else {
			 System.out.println("원 1과 원 2는 다른 원입니다.");

		 }
	}

}
