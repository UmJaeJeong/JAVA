package sec02_gc;

public class GcExample
{
	public static void main(String[] args) 
	{
		Employee emp;
		
		//Employee(1),Employee(2)는 결국 쓰레기 객체가 됨
		emp = new Employee(1);  
		emp = null;		
		emp = new Employee(2);		
		emp = new Employee(3);
				
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();  //finalize()가 자동 실행
	}
}
